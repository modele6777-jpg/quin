package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sbd extends gu7 implements a26 {
    final /* synthetic */ cea $placeable;
    final /* synthetic */ tbd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbd(cea ceaVar, tbd tbdVar) {
        super(1);
        this.$placeable = ceaVar;
        this.this$0 = tbdVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        bv7 bv7VarB;
        bea beaVar = (bea) obj;
        beaVar.g(this.$placeable, 0, 0, 0.0f);
        hcd hcdVarF = this.this$0.H0.f();
        icd icdVar = this.this$0.H0;
        gp3 gp3Var = hcdVarF.c;
        gp3Var.j();
        if (!pa7.t(gp3Var.e(), mf9.a) && icdVar.k()) {
            hed hedVarE = gp3Var.e();
            if (icdVar.e().b() && hedVarE.b() && (bv7VarB = beaVar.b()) != null) {
                long jY0 = db6.Y0(bv7VarB.l());
                xdd xddVar = icdVar.f().b;
                bv7 bv7Var = icdVar.f().b.f;
                if (bv7Var == null) {
                    qc0.j("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                    return null;
                }
                long jC = xddVar.a.c(bv7Var, bv7VarB);
                xdd xddVar2 = icdVar.f().b;
                bv7 bv7Var2 = icdVar.f().b.f;
                if (bv7Var2 == null) {
                    qc0.j("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                    return null;
                }
                long jE = bv7.e(bv7Var2, bv7VarB, 2);
                hed hedVarE2 = gp3Var.e();
                hcd hcdVar = (hcd) gp3Var.c;
                tbd tbdVar = (tbd) gp3Var.g;
                tbdVar.getClass();
                ((vz9) gp3Var.d).setValue(hedVarE2.a(hcdVar, tbdVar, jY0, jC, jE));
            }
        }
        return wef.a;
    }
}
