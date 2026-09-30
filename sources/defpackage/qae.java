package defpackage;

import android.view.View;
import android.view.Window;
import io.sentry.android.core.internal.util.h;
import io.sentry.android.core.o0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qae(Window window, Window.Callback callback, Runnable runnable, o0 o0Var) {
        this.a = 5;
        this.b = window;
        this.c = callback;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((psd) this.b).h((iae) this.c, (Map.Entry) this.d);
                return;
            case 1:
                e4f e4fVar = (e4f) this.b;
                y46 y46Var = (y46) this.c;
                zb0 zb0Var = (zb0) this.d;
                h8a h8aVarT = i8a.t();
                h8aVarT.i();
                ((i8a) h8aVarT.b).v(y46Var);
                e4fVar.d(h8aVarT, zb0Var);
                return;
            case 2:
                e4f e4fVar2 = (e4f) this.b;
                b1f b1fVar = (b1f) this.c;
                zb0 zb0Var2 = (zb0) this.d;
                h8a h8aVarT2 = i8a.t();
                h8aVarT2.i();
                ((i8a) h8aVarT2.b).x(b1fVar);
                e4fVar2.d(h8aVarT2, zb0Var2);
                return;
            case 3:
                e4f e4fVar3 = (e4f) this.b;
                je9 je9Var = (je9) this.c;
                zb0 zb0Var3 = (zb0) this.d;
                e4fVar3.getClass();
                h8a h8aVarT3 = i8a.t();
                h8aVarT3.i();
                ((i8a) h8aVarT3.b).w(je9Var);
                e4fVar3.d(h8aVarT3, zb0Var3);
                return;
            case 4:
                lqb lqbVar = (lqb) this.b;
                nzd nzdVar = (nzd) this.c;
                vva vvaVar = (vva) lqbVar.b;
                vvaVar.getClass();
                tag tagVar = nzdVar.a;
                String str = tagVar.a;
                ArrayList arrayList = new ArrayList();
                int i = 1;
                int i2 = 10;
                lbg lbgVar = (lbg) vvaVar.e.p(new hla(i2, new xv3(vvaVar, arrayList, str, i)));
                if (lbgVar == null) {
                    ff8.h().o(vva.l, "Didn't find WorkSpec for id " + tagVar);
                    vvaVar.d.d.execute(new xu8(i2, vvaVar, tagVar));
                    return;
                }
                synchronized (vvaVar.k) {
                    try {
                        synchronized (vvaVar.k) {
                            if (vvaVar.c(str) == null) {
                                i = 0;
                            }
                            break;
                        }
                        if (i != 0) {
                            Set set = (Set) vvaVar.h.get(str);
                            if (((nzd) set.iterator().next()).a.b == tagVar.b) {
                                set.add(nzdVar);
                                ff8.h().e(vva.l, "Work " + tagVar + " is already enqueued for processing");
                            } else {
                                vvaVar.d.d.execute(new xu8(i2, vvaVar, tagVar));
                            }
                            return;
                        }
                        if (lbgVar.t != tagVar.b) {
                            vvaVar.d.d.execute(new xu8(i2, vvaVar, tagVar));
                            return;
                        }
                        ccg ccgVar = new ccg(new hc2(vvaVar.b, vvaVar.c, vvaVar.d, vvaVar, vvaVar.e, lbgVar, arrayList));
                        sv2 sv2Var = ccgVar.d.b;
                        fg7 fg7VarD = tq.d();
                        sv2Var.getClass();
                        pa1 pa1VarY = y7h.y(i7h.I(sv2Var, fg7VarD), new zbg(ccgVar, null));
                        pa1VarY.b.b(new c0(vvaVar, pa1VarY, ccgVar, 24), vvaVar.d.d);
                        vvaVar.g.put(str, ccgVar);
                        HashSet hashSet = new HashSet();
                        hashSet.add(nzdVar);
                        vvaVar.h.put(str, hashSet);
                        ff8.h().e(vva.l, vva.class.getSimpleName() + ": processing " + tagVar);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                Window window = (Window) this.b;
                Window.Callback callback = (Window.Callback) this.c;
                Runnable runnable = (Runnable) this.d;
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView != null) {
                    window.setCallback(callback);
                    viewPeekDecorView.getViewTreeObserver().addOnDrawListener(new h(viewPeekDecorView, runnable));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ qae(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
