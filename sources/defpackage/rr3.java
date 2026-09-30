package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rr3 implements u48 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public rr3(w48 w48Var) {
        this.a = 3;
        this.b = w48Var;
        v22 v22Var = v22.c;
        Class<?> cls = w48Var.getClass();
        t22 t22Var = (t22) v22Var.a.get(cls);
        this.c = t22Var == null ? v22Var.a(cls, null) : t22Var;
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) obj;
                switch (qr3.a[f48Var.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.onCreate(x48Var);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(x48Var);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(x48Var);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(x48Var);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(x48Var);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(x48Var);
                        break;
                    case 7:
                        qc0.j("ON_ANY must not been send by anybody");
                        break;
                    default:
                        ap.c();
                        break;
                }
                u48 u48Var = (u48) obj2;
                if (u48Var != null) {
                    u48Var.h(x48Var, f48Var);
                }
                break;
            case 1:
                if (f48Var == f48.ON_START) {
                    ((h48) obj).b(this);
                    ((vea) obj2).B();
                }
                break;
            case 2:
                pm9 pm9Var = (pm9) obj;
                int i2 = tm9.a[f48Var.ordinal()];
                if (i2 == 1) {
                    pm9Var.g(true);
                    break;
                } else if (i2 == 2) {
                    pm9Var.g(false);
                    break;
                } else if (i2 == 3) {
                    pm9Var.e();
                    ((h48) obj2).b(this);
                    break;
                }
                break;
            default:
                w48 w48Var = (w48) obj;
                HashMap map = ((t22) obj2).a;
                t22.a((List) map.get(f48Var), x48Var, f48Var, w48Var);
                t22.a((List) map.get(f48.ON_ANY), x48Var, f48Var, w48Var);
                break;
        }
    }

    public /* synthetic */ rr3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public rr3(pm9 pm9Var, um9 um9Var, h48 h48Var) {
        this.a = 2;
        this.b = pm9Var;
        this.c = h48Var;
    }
}
