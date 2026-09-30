package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xq9 extends ni5 {
    public static final xq9 d = new xq9(0, 3, 1);

    @Override // defpackage.ni5
    public final void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        fz3 fz3Var;
        lpd lpdVar = (lpd) k01Var.c(1);
        f46 f46Var = (f46) k01Var.c(0);
        wh5 wh5Var = (wh5) k01Var.c(2);
        opd opdVarI = lpdVar.i();
        if (qr9Var != null) {
            try {
                fz3Var = new fz3(27, qr9Var, opdVar);
            } catch (Throwable th) {
                opdVarI.e(false);
                throw th;
            }
        } else {
            fz3Var = null;
        }
        if (!wh5Var.m.T()) {
            wf2.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        wh5Var.l.S(ac0Var, opdVarI, bwVar, fz3Var);
        opdVarI.e(true);
        opdVar.d();
        f46Var.getClass();
        opdVar.z(lpdVar, lpdVar.c(f46Var));
        opdVar.j();
    }
}
