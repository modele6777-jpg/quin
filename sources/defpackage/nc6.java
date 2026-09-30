package defpackage;

import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nc6 implements xm9, ha1 {
    public final /* synthetic */ pl1 a;

    public /* synthetic */ nc6(pl1 pl1Var) {
        this.a = pl1Var;
    }

    @Override // defpackage.xm9
    public void k(Task task) {
        task.getClass();
        pl1 pl1Var = this.a;
        if (pl1Var.u() instanceof sg9) {
            pl1Var.g(wef.a);
        }
    }

    @Override // defpackage.ha1
    public void p(u91 u91Var, qyb qybVar) {
        boolean z = qybVar.a.F0;
        pl1 pl1Var = this.a;
        if (!z) {
            pl1Var.g(new dzb(new qs6(qybVar)));
            return;
        }
        Object obj = qybVar.b;
        if (obj != null) {
            pl1Var.g(obj);
            return;
        }
        Object objB = u91Var.C0().b();
        objB.getClass();
        zc7 zc7Var = (zc7) objB;
        pl1Var.g(new dzb(new ot7("Response from " + zc7Var.a.getName() + '.' + zc7Var.c.getName() + " was null but response body type was declared as non-null")));
    }

    @Override // defpackage.ha1
    public void w(u91 u91Var, Throwable th) {
        this.a.g(new dzb(th));
    }
}
