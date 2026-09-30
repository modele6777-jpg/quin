package defpackage;

import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hy2 implements iy2, xm9, ha1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pl1 b;

    public /* synthetic */ hy2(pl1 pl1Var, int i) {
        this.a = i;
        this.b = pl1Var;
    }

    public void a(Object obj) {
        b76 b76Var = (b76) obj;
        b76Var.getClass();
        pl1 pl1Var = this.b;
        if (pl1Var.u() instanceof sg9) {
            pl1Var.g(new dzb(b76Var));
        }
    }

    public void b(Object obj) {
        f76 f76Var = (f76) obj;
        f76Var.getClass();
        pl1 pl1Var = this.b;
        if (pl1Var.u() instanceof sg9) {
            pl1Var.g(f76Var);
        }
    }

    @Override // defpackage.xm9
    public void k(Task task) {
        int i = this.a;
        pl1 pl1Var = this.b;
        switch (i) {
            case 1:
                task.getClass();
                if (pl1Var.u() instanceof sg9) {
                    if (!task.m()) {
                        task = null;
                    }
                    pl1Var.g(task != null ? (q0c) task.i() : null);
                    break;
                }
                break;
            default:
                Exception excH = task.h();
                if (excH != null) {
                    pl1Var.g(new dzb(excH));
                } else if (!task.k()) {
                    pl1Var.g(task.i());
                } else {
                    pl1Var.p(null);
                }
                break;
        }
    }

    @Override // defpackage.ha1
    public void p(u91 u91Var, qyb qybVar) {
        boolean z = qybVar.a.F0;
        pl1 pl1Var = this.b;
        if (z) {
            pl1Var.g(qybVar.b);
        } else {
            pl1Var.g(new dzb(new qs6(qybVar)));
        }
    }

    @Override // defpackage.ha1
    public void w(u91 u91Var, Throwable th) {
        this.b.g(new dzb(th));
    }
}
