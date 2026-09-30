package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import defpackage.cgg;
import defpackage.ggg;
import defpackage.ns4;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.i5;
import io.sentry.q5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.f0 {
    public final SentryAndroidOptions a;
    public final ggg b = new ggg(2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.b.a("ViewHierarchy");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view, io.sentry.protocol.k0 k0Var, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComposeViewHierarchyExporter composeViewHierarchyExporter = (ComposeViewHierarchyExporter) it.next();
                composeViewHierarchyExporter.getClass();
                if (view instanceof Owner) {
                    if (composeViewHierarchyExporter.b == null) {
                        io.sentry.util.a aVar = composeViewHierarchyExporter.c;
                        aVar.b();
                        try {
                            if (composeViewHierarchyExporter.b == null) {
                                composeViewHierarchyExporter.b = new io.sentry.internal.debugmeta.c(composeViewHierarchyExporter.a, 11);
                            }
                            cgg.t(aVar, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                cgg.t(aVar, th);
                                throw th2;
                            }
                        }
                    }
                    LayoutNode root = ((Owner) view).getRoot();
                    io.sentry.internal.debugmeta.c cVar = composeViewHierarchyExporter.b;
                    cVar.getClass();
                    ComposeViewHierarchyExporter.a(cVar, k0Var, root);
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.protocol.k0 k0VarC = c(childAt);
                    arrayList.add(k0VarC);
                    a(childAt, k0VarC, list);
                }
            }
            k0Var.y = arrayList;
        }
    }

    public static io.sentry.protocol.k0 c(View view) {
        io.sentry.protocol.k0 k0Var = new io.sentry.protocol.k0();
        k0Var.b = io.sentry.config.a.k(view);
        try {
            String strP = io.sentry.config.a.p(view);
            if (strP != null) {
                k0Var.c = strP;
            }
        } catch (Throwable unused) {
        }
        k0Var.g = Double.valueOf(view.getX());
        k0Var.v = Double.valueOf(view.getY());
        k0Var.e = Double.valueOf(view.getWidth());
        k0Var.f = Double.valueOf(view.getHeight());
        k0Var.x = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            k0Var.w = "visible";
        } else if (visibility == 4) {
            k0Var.w = "invisible";
        } else if (visibility == 8) {
            k0Var.w = "gone";
        }
        return k0Var;
    }

    @Override // io.sentry.f0
    public final i5 h(i5 i5Var, io.sentry.l0 l0Var) {
        if (i5Var.g()) {
            SentryAndroidOptions sentryAndroidOptions = this.a;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return i5Var;
            }
            if (!io.sentry.util.b.k(l0Var)) {
                boolean zB = this.b.b();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!zB) {
                    WeakReference weakReference = (WeakReference) q0.b.a;
                    io.sentry.protocol.j0 j0Var = null;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    List<ComposeViewHierarchyExporter> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    io.sentry.util.thread.a threadChecker = sentryAndroidOptions.getThreadChecker();
                    io.sentry.z0 logger = sentryAndroidOptions.getLogger();
                    if (activity == null) {
                        logger.i(q5.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.i(q5.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.i(q5.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.c()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        io.sentry.protocol.j0 j0Var2 = new io.sentry.protocol.j0("android_view_system", arrayList);
                                        io.sentry.protocol.k0 k0VarC = c(viewPeekDecorView);
                                        arrayList.add(k0VarC);
                                        a(viewPeekDecorView, k0VarC, viewHierarchyExporters);
                                        j0Var = j0Var2;
                                    } else {
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        AtomicReference atomicReference = new AtomicReference(null);
                                        activity.runOnUiThread(new ns4(atomicReference, viewPeekDecorView, viewHierarchyExporters, countDownLatch, logger));
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            j0Var = (io.sentry.protocol.j0) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th) {
                                    logger.d(q5.ERROR, "Failed to process view hierarchy.", th);
                                }
                            }
                        }
                    }
                    if (j0Var != null) {
                        l0Var.e = new io.sentry.a(j0Var);
                    }
                }
            }
        }
        return i5Var;
    }

    @Override // io.sentry.f0
    public final io.sentry.protocol.f0 l(io.sentry.protocol.f0 f0Var, io.sentry.l0 l0Var) {
        return f0Var;
    }
}
