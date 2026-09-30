package defpackage;

import android.os.Looper;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hw(int i, Runnable runnable) {
        this.a = 0;
        this.b = i;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        final int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Process.setThreadPriority(i2);
                ((Runnable) obj).run();
                break;
            case 1:
                t45 t45Var = (t45) ((k47) obj).c;
                String str = pqf.a;
                a80 a80Var = t45Var.a.C;
                i26 i26Var = new i26() { // from class: s45
                    @Override // defpackage.i26
                    public final Object apply(Object obj2) {
                        return Integer.valueOf(i2);
                    }
                };
                a80Var.getClass();
                pa7.J(Looper.myLooper() == ((jce) a80Var.d).a.getLooper());
                a80Var.b++;
                a80Var.B(new fe(13, a80Var, i26Var));
                a80Var.K(Integer.valueOf(i2));
                break;
            case 2:
                ((he1) obj).a(i2);
                break;
            case 3:
                uva uvaVar = (uva) ((hbc) ((ie1) obj).b).a;
                if (uvaVar != null) {
                    uvaVar.a(i2);
                }
                break;
            case 4:
                g55 g55Var = (g55) obj;
                ro3 ro3Var = g55Var.I0;
                int i3 = ((hu0) g55Var.a[i2].e).b;
                ro3Var.M(ro3Var.L(), 1033, new qd3(9));
                break;
            default:
                ((p90) obj).T(i2);
                break;
        }
    }

    public /* synthetic */ hw(g55 g55Var, int i, boolean z) {
        this.a = 4;
        this.c = g55Var;
        this.b = i;
    }

    public /* synthetic */ hw(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
