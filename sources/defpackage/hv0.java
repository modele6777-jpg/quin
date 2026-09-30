package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hv0 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jse b;

    public /* synthetic */ hv0(jse jseVar, int i) {
        this.a = i;
        this.b = jseVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        bv7 bv7VarQ;
        hkb hkbVar;
        int i = this.a;
        wef wefVar = wef.a;
        jse jseVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(jseVar.j(false).a);
            case 1:
                return jseVar.p(true, false);
            case 2:
                return jseVar.p(false, false);
            case 3:
                vz9 vz9Var = jseVar.s;
                z2f z2fVar = jseVar.a;
                boolean zD = eue.d(z2fVar.d().d);
                if (((zD && ((sue) vz9Var.getValue()) == sue.b) || (!zD && ((sue) vz9Var.getValue()) == sue.c)) && jseVar.l() == null && ((Boolean) jseVar.k.getValue()).booleanValue() && (bv7VarQ = jseVar.q()) != null) {
                    hkb hkbVarZ = dj6.Z(bv7VarQ);
                    hkb hkbVarG = z5c.g(bv7VarQ.N(hkbVarZ.f()), hkbVarZ.e());
                    bv7 bv7VarQ2 = jseVar.q();
                    if (bv7VarQ2 != null) {
                        long j = z2fVar.d().d;
                        if (eue.d(j)) {
                            hkb hkbVarK = jseVar.k();
                            hkbVar = z5c.g(bv7VarQ2.N(hkbVarK.f()), hkbVarK.e());
                        } else {
                            long jN = bv7VarQ2.N(jseVar.o(true));
                            long jN2 = bv7VarQ2.N(jseVar.o(false));
                            ste steVarC = jseVar.b.c();
                            if (steVarC == null) {
                                hkbVar = hkb.e;
                            } else {
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (bv7VarQ2.N((((long) Float.floatToRawIntBits(steVarC.c((int) (j >> 32)).b)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bv7VarQ2.N((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(steVarC.c((int) (j & 4294967295L)).b)) & 4294967295L)) & 4294967295L));
                                int i2 = (int) (jN >> 32);
                                int i3 = (int) (jN2 >> 32);
                                float fMin = Math.min(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
                                float fMax = Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
                                if (fMin == fMax) {
                                    fMax += 1.0f;
                                }
                                hkbVar = new hkb(fMin, Math.min(fIntBitsToFloat, fIntBitsToFloat2), fMax, Math.max(Float.intBitsToFloat((int) (jN & 4294967295L)), Float.intBitsToFloat((int) (jN2 & 4294967295L))));
                            }
                        }
                        if (hkbVar.i(hkbVarG)) {
                            return hkbVar.g(hkbVarG);
                        }
                    } else {
                        l37.d("textLayoutCoordinates should not be null.");
                        oo3.f();
                    }
                }
                return null;
            case 4:
                return (hkb) jseVar.x.getValue();
            case 5:
                return jseVar.a.d();
            case 6:
                jseVar.b();
                return wefVar;
            case 7:
                return Boolean.valueOf(!((Boolean) jseVar.t.getValue()).booleanValue());
            case 8:
                z2f z2fVar2 = jseVar.a;
                use useVar = z2fVar2.a;
                u47 u47Var = z2fVar2.b;
                useVar.b.a().v();
                une uneVar = useVar.b;
                xdc.u(uneVar, 0, uneVar.c.length());
                useVar.b(u47Var, true, fpe.a);
                useVar.g(true);
                useVar.f(useVar.b.e);
                return wefVar;
            default:
                x16 x16Var = jseVar.l;
                if (x16Var != null) {
                    x16Var.invoke();
                }
                return wefVar;
        }
    }
}
