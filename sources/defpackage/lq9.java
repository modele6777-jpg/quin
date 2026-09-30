package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lq9 extends ni5 {
    public static final lq9 d = new lq9(0, 4, 1);

    @Override // defpackage.ni5
    public final void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        g49 g49Var = (g49) k01Var.c(2);
        g49 g49Var2 = (g49) k01Var.c(3);
        lg2 lg2Var = (lg2) k01Var.c(1);
        f49 f49VarP = (f49) k01Var.c(0);
        if (f49VarP == null && (f49VarP = lg2Var.p(g49Var)) == null) {
            wf2.b("Could not resolve state for movable content");
            oo3.f();
            return;
        }
        lpd lpdVarA = npd.a(f49VarP.a);
        if (opdVar.n > 0 || opdVar.t(opdVar.t + 1) != 1) {
            wf2.a("Check failed");
        }
        int i = opdVar.t;
        int i2 = opdVar.i;
        int i3 = opdVar.j;
        opdVar.a(1);
        opdVar.Q();
        opdVar.d();
        opd opdVarI = lpdVarA.i();
        try {
            List listJ = drb.j(opdVarI, 2, opdVar, false, true, true);
            opdVarI.e(true);
            opdVar.j();
            opdVar.i();
            opdVar.t = i;
            opdVar.i = i2;
            opdVar.j = i3;
            ym8.l(opdVar, listJ, g49Var2.c);
        } catch (Throwable th) {
            opdVarI.e(false);
            throw th;
        }
    }
}
