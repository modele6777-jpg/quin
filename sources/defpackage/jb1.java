package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jb1 implements ia1, ha1 {
    public final /* synthetic */ pl1 a;

    public /* synthetic */ jb1(pl1 pl1Var) {
        this.a = pl1Var;
    }

    @Override // defpackage.ia1
    public void d(v91 v91Var, ryb rybVar) {
        this.a.n(rybVar, ib1.b);
    }

    @Override // defpackage.ia1
    public void h(v91 v91Var, IOException iOException) {
        this.a.g(new dzb(iOException));
    }

    @Override // defpackage.ha1
    public void p(u91 u91Var, qyb qybVar) {
        this.a.g(qybVar);
    }

    @Override // defpackage.ha1
    public void w(u91 u91Var, Throwable th) {
        this.a.g(new dzb(th));
    }
}
