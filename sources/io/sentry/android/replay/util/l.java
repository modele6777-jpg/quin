package io.sentry.android.replay.util;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import defpackage.iy9;
import defpackage.j6;
import defpackage.lw7;
import defpackage.v4e;
import io.sentry.q5;
import io.sentry.z0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final iy9 a(View view) {
        if (!view.isAttachedToWindow()) {
            return new iy9(Boolean.FALSE, null);
        }
        if (view.getWindowVisibility() != 0) {
            return new iy9(Boolean.FALSE, null);
        }
        Object parent = view;
        while (parent instanceof View) {
            float transitionAlpha = Build.VERSION.SDK_INT >= 29 ? ((View) parent).getTransitionAlpha() : 1.0f;
            View view2 = (View) parent;
            if (view2.getAlpha() <= 0.0f || transitionAlpha <= 0.0f || view2.getVisibility() != 0) {
                return new iy9(Boolean.FALSE, null);
            }
            parent = view2.getParent();
        }
        Rect rect = new Rect();
        return new iy9(Boolean.valueOf(view.getGlobalVisibleRect(rect, new Point())), rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(View view, io.sentry.android.replay.viewhierarchy.g gVar, j6 j6Var, z0 z0Var, List list) {
        LayoutNode root;
        j6Var.getClass();
        z0Var.getClass();
        if (view instanceof ViewGroup) {
            lw7 lw7Var = io.sentry.android.replay.viewhierarchy.b.a;
            if (v4e.F(view.getClass().getName(), "AndroidComposeView", false)) {
                try {
                    Owner owner = view instanceof Owner ? (Owner) view : null;
                    if (owner != null && (root = owner.getRoot()) != null) {
                        io.sentry.android.replay.viewhierarchy.b.b(root, gVar, true, j6Var, z0Var);
                        return;
                    }
                } catch (Throwable th) {
                    z0Var.c(q5.ERROR, th, "Error traversing Compose tree. Most likely you're using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it's a newer\nversion, please open a github issue with the version you're using, so we can add\nsupport for it.", new Object[0]);
                    if ("true".equalsIgnoreCase(System.getProperty("io.sentry.replay.compose.fail-fast"))) {
                        throw th;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(viewGroup.getChildCount());
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    viewGroup.indexOfChild(childAt);
                    io.sentry.android.replay.viewhierarchy.g gVarI = io.sentry.config.a.i(childAt, gVar, j6Var);
                    arrayList.add(gVarI);
                    if (list != null && (gVarI instanceof io.sentry.android.replay.viewhierarchy.e) && gVarI.e) {
                        list.add(gVarI);
                    }
                    b(childAt, gVarI, j6Var, z0Var, list);
                }
            }
            gVar.g = arrayList;
        }
    }
}
