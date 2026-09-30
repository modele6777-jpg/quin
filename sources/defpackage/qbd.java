package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qbd extends gu7 implements a26 {
    final /* synthetic */ cea $placeable;
    final /* synthetic */ tbd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbd(cea ceaVar, tbd tbdVar) {
        super(1);
        this.this$0 = tbdVar;
        this.$placeable = ceaVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        long j2;
        long jB;
        bea beaVar = (bea) obj;
        tbd tbdVar = this.this$0;
        tbdVar.G0 = true;
        tbdVar.F0 = null;
        hed hedVarE = tbdVar.H0.f().c.e();
        if (this.this$0.H0.k() && hedVarE.d()) {
            kxa kxaVarE = hedVarE.e();
            if (kxaVarE == null) {
                ho7.y(hedVarE, "Match State is configured, but target data is null. State = ");
                return null;
            }
            hkb hkbVarC = hedVarE.c();
            if (hkbVarC == null) {
                ho7.y(hedVarE, "Match State is configured, but current bounds is null. State = ");
                return null;
            }
            boolean zE = this.this$0.H0.f().b.e();
            tbd tbdVar2 = this.this$0;
            cea ceaVar = this.$placeable;
            if (zE) {
                tbdVar2.getClass();
                bv7 bv7VarB = beaVar.b();
                if (bv7VarB == null) {
                    beaVar.g(ceaVar, 0, 0, 0.0f);
                } else {
                    boolean zB = tbdVar2.H0.f().c.e().b();
                    long jK = tbdVar2.n1().K(bv7VarB, 0L);
                    z7c.j(kxaVarE);
                    icd icdVar = tbdVar2.H0;
                    if (zB) {
                        j = jK;
                        j2 = 4294967295L;
                        icdVar.e().a(hkbVarC, z7c.j(kxaVarE), null, tbdVar2.Z, tbdVar2.E0);
                    } else {
                        j2 = 4294967295L;
                        j = jK;
                        icdVar.e().a(hkbVarC, z7c.j(kxaVarE), new fv1(6), tbdVar2.Z, tbdVar2.E0);
                    }
                    tbdVar2.Z = null;
                    tbdVar2.E0 = null;
                    hkb hkbVarC2 = tbdVar2.H0.e().c();
                    hl9 hl9Var = hkbVarC2 != null ? new hl9(hl9.g(hl9.f(hkbVarC2.f(), ((hl9) ((vz9) kxaVarE.b).getValue()).a), ((hl9) ((vz9) kxaVarE.d).getValue()).a)) : null;
                    if (tbdVar2.H0.e().b() || !zB) {
                        jB = hl9Var != null ? hl9Var.a : j;
                        tbdVar2.H0.f().c.e().i(hl9Var == null ? z5c.g(j, db6.Y0(bv7VarB.l())) : z5c.g(hl9Var.a, hkbVarC2.e()));
                    } else {
                        jB = hl9Var != null ? hl9Var.a : hkbVarC.f();
                    }
                    scd scdVarB = tbdVar2.H0.b();
                    if (scdVarB != null) {
                        di2 di2Var = scdVarB.c;
                        if (scdVarB.d()) {
                            if (tbdVar2.H0.e().d()) {
                                j = jB;
                            }
                            bv7 bv7Var = scdVarB.e;
                            if (bv7Var != null && bv7Var.h() && tbdVar2.n1().h()) {
                                jB = vbd.b(jB, vbd.a(bv7Var, tbdVar2.n1(), ((Boolean) ((vz9) di2Var.e).getValue()).booleanValue() ? ((r2f) ((vz9) di2Var.f).getValue()).a : r2f.b), ((Boolean) ((vz9) di2Var.c).getValue()).booleanValue() ? ((qz9) di2Var.d).j() : 1.0f);
                            } else {
                                jB = j;
                            }
                        }
                    }
                    long jK2 = bv7VarB.K(tbdVar2.n1(), jB);
                    beaVar.g(ceaVar, Math.round(Float.intBitsToFloat((int) (jK2 >> 32))), Math.round(Float.intBitsToFloat((int) (jK2 & j2))), 0.0f);
                }
            } else if (tbdVar2.H0.e().b()) {
                beaVar.g(ceaVar, 0, 0, 0.0f);
            } else {
                bv7 bv7VarB2 = beaVar.b();
                long jR = bv7VarB2 != null ? qn4.R(hl9.f(hkbVarC.f(), tbdVar2.n1().K(bv7VarB2, 0L))) : 0L;
                beaVar.g(ceaVar, (int) (jR >> 32), (int) (jR & 4294967295L), 0.0f);
            }
        } else {
            beaVar.g(this.$placeable, 0, 0, 0.0f);
        }
        return wef.a;
    }
}
