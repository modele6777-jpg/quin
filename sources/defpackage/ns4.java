package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.protocol.j0;
import io.sentry.protocol.k0;
import io.sentry.q5;
import io.sentry.z0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ns4(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, z0 z0Var) {
        this.a = 2;
        this.b = atomicReference;
        this.f = view;
        this.c = list;
        this.d = countDownLatch;
        this.e = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object dzbVar;
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.f;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                dce dceVar = (dce) obj3;
                dce dceVar2 = (dce) obj2;
                View view = (View) obj4;
                Window window = ((vb2) obj).getWindow();
                window.getClass();
                a26 a26Var = dceVar.c;
                Resources resources = view.getResources();
                resources.getClass();
                boolean zBooleanValue = ((Boolean) a26Var.d(resources)).booleanValue();
                a26 a26Var2 = dceVar2.c;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((qs4) obj5).b(dceVar, dceVar2, window, view, zBooleanValue, ((Boolean) a26Var2.d(resources2)).booleanValue());
                break;
            case 1:
                l3b l3bVar = (l3b) obj3;
                imb imbVar = (imb) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                q3b q3bVar = (q3b) obj4;
                if (((AtomicBoolean) obj5).compareAndSet(true, false) && m3b.a.get() == l3bVar) {
                    try {
                        l3bVar.b.d(q3bVar);
                        dzbVar = wef.a;
                    } catch (Throwable th) {
                        dzbVar = new dzb(th);
                    }
                    imbVar.element = !(dzbVar instanceof dzb);
                }
                countDownLatch.countDown();
                break;
            default:
                AtomicReference atomicReference = (AtomicReference) obj5;
                View view2 = (View) obj4;
                List list = (List) obj3;
                CountDownLatch countDownLatch2 = (CountDownLatch) obj2;
                z0 z0Var = (z0) obj;
                try {
                    ArrayList arrayList = new ArrayList(1);
                    j0 j0Var = new j0("android_view_system", arrayList);
                    k0 k0VarC = ViewHierarchyEventProcessor.c(view2);
                    arrayList.add(k0VarC);
                    ViewHierarchyEventProcessor.a(view2, k0VarC, list);
                    atomicReference.set(j0Var);
                    countDownLatch2.countDown();
                } catch (Throwable th2) {
                    z0Var.d(q5.ERROR, "Failed to process view hierarchy.", th2);
                }
                break;
        }
    }

    public /* synthetic */ ns4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
