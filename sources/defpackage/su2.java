package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class su2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cre b;

    public /* synthetic */ su2(cre creVar, int i) {
        this.a = i;
        this.b = creVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        hkb hkbVar;
        bv7 bv7VarC;
        char c;
        float fIntBitsToFloat;
        bv7 bv7VarC2;
        bv7 bv7VarC3;
        bv7 bv7VarC4;
        bv7 bv7VarC5;
        int i = this.a;
        cre creVar = this.b;
        switch (i) {
            case 0:
                return new lf(11, creVar);
            case 1:
                creVar.s();
                return wef.a;
            default:
                bv7 bv7Var = (bv7) obj;
                r38 r38Var = creVar.d;
                if (r38Var == null) {
                    hkbVar = hkb.e;
                } else {
                    if (r38Var.p) {
                        r38Var = null;
                    }
                    if (r38Var != null) {
                        sl9 sl9Var = creVar.b;
                        long j = creVar.l().b;
                        int i2 = eue.c;
                        int iV = sl9Var.v((int) (j >> 32));
                        int iV2 = creVar.b.v((int) (creVar.l().b & 4294967295L));
                        r38 r38Var2 = creVar.d;
                        long jN = 0;
                        long jN2 = (r38Var2 == null || (bv7VarC5 = r38Var2.c()) == null) ? 0L : bv7VarC5.N(creVar.j(true));
                        r38 r38Var3 = creVar.d;
                        if (r38Var3 != null && (bv7VarC4 = r38Var3.c()) != null) {
                            jN = bv7VarC4.N(creVar.j(false));
                        }
                        r38 r38Var4 = creVar.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (r38Var4 == null || (bv7VarC3 = r38Var4.c()) == null) {
                            c = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            tte tteVarD = r38Var.d();
                            c = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (bv7VarC3.N((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(tteVarD != null ? tteVarD.a.c(iV).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        r38 r38Var5 = creVar.d;
                        if (r38Var5 != null && (bv7VarC2 = r38Var5.c()) != null) {
                            tte tteVarD2 = r38Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (bv7VarC2.N((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(tteVarD2 != null ? tteVarD2.a.c(iV2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jN2 >> c);
                        int i4 = (int) (jN >> c);
                        hkbVar = new hkb(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (((sw3) r38Var.a.d).getDensity() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jN2 & 4294967295L)), Float.intBitsToFloat((int) (jN & 4294967295L))));
                    } else {
                        hkbVar = hkb.e;
                    }
                }
                r38 r38Var6 = creVar.d;
                if (r38Var6 == null || (bv7VarC = r38Var6.c()) == null) {
                    return null;
                }
                return vd0.A0(hkbVar, bv7VarC, bv7Var);
        }
    }
}
