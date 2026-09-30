package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jq9 extends ni5 {
    public static final jq9 d = new jq9(0, 2, 1);

    @Override // defpackage.ni5
    public final void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        b77 b77Var = (b77) k01Var.c(1);
        int i = b77Var != null ? b77Var.a : 0;
        uv1 uv1Var = (uv1) k01Var.c(0);
        if (i > 0) {
            ac0Var = new yl9(ac0Var, i);
        }
        uv1Var.T0(ac0Var, opdVar, bwVar, qr9Var != null ? new fz3(27, qr9Var, opdVar) : null);
    }
}
