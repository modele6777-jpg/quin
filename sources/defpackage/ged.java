package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ged extends i09 implements kv7, al9, pn4, ug2 {
    public xdd Z;

    @Override // defpackage.al9
    public final void A0() {
        this.Z.f();
        if9.C(this, this.Z.d);
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        cea ceaVarV = tn8Var.v(j);
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new fed(zn8Var, this, ceaVarV));
    }

    @Override // defpackage.i09
    public final void d1() {
        if9.C(this, this.Z.d);
        this.Z.getClass();
    }

    @Override // defpackage.i09
    public final void e1() {
        this.Z.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x013d  */
    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        hkb hkbVarC;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        boolean z;
        vv7 vv7Var = (vv7) im2Var;
        vv7Var.a();
        xdd xddVar = this.Z;
        ie6 ie6VarQ0 = vd0.q0(this);
        ta0 ta0Var = vv7Var.a.b;
        i79 i79Var = xddVar.v;
        int iJ = xddVar.g.j();
        boolean z2 = true;
        if (xddVar.x != iJ) {
            ydd yddVar = ded.a;
            int i = i79Var.b;
            for (int i2 = 1; i2 < i; i2++) {
                Object objB = i79Var.b(i2);
                int i3 = i2 - 1;
                while (i3 >= 0 && Float.compare(ww2.a((icd) i79Var.b(i3)), ww2.a((icd) objB)) > 0) {
                    i79Var.p(i3 + 1, i79Var.b(i3));
                    i3--;
                }
                i79Var.p(i3 + 1, objB);
            }
            xddVar.x = iJ;
        }
        Object[] objArr = i79Var.a;
        int i4 = i79Var.b;
        int i5 = 0;
        while (i5 < i4) {
            icd icdVar = (icd) objArr[i5];
            boolean zH = icdVar.h();
            vz9 vz9Var = icdVar.Y;
            if (zH && ((ke6) vz9Var.getValue()) == null) {
                vz9Var.setValue(ie6VarQ0.c());
            }
            ke6 ke6Var = (ke6) vz9Var.getValue();
            if (ke6Var == null || (hkbVarC = icdVar.f().c.e().c()) == null || !icdVar.h()) {
                z = z2;
            } else {
                long jF = hkbVarC.f();
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jF >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jF & 4294967295L));
                scd scdVarB = icdVar.b();
                bv7 bv7Var = scdVarB != null ? scdVarB.e : null;
                bv7 bv7Var2 = icdVar.f().b.e;
                if (bv7Var2 == null) {
                    qc0.j("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                    return;
                }
                float fJ = 1.0f;
                if (scdVarB != null) {
                    di2 di2Var = scdVarB.c;
                    if (scdVarB.d() == z2 && bv7Var != null && bv7Var.h() && bv7Var2.h()) {
                        fJ = ((Boolean) ((vz9) di2Var.c).getValue()).booleanValue() ? ((qz9) di2Var.d).j() : 1.0f;
                        long jA = vbd.a(bv7Var, bv7Var2, ((Boolean) ((vz9) di2Var.e).getValue()).booleanValue() ? ((r2f) ((vz9) di2Var.f).getValue()).a : r2f.b);
                        fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA >> 32));
                        fIntBitsToFloat = Float.intBitsToFloat((int) (jA & 4294967295L));
                    } else {
                        ke6Var = ke6Var;
                        fIntBitsToFloat = 0.0f;
                        fIntBitsToFloat2 = 0.0f;
                    }
                } else {
                    ke6Var = ke6Var;
                    fIntBitsToFloat = 0.0f;
                    fIntBitsToFloat2 = 0.0f;
                }
                float f = fJ;
                zt ztVar = icdVar.y;
                ((vd9) ta0Var.c).I(0.0f, 0.0f);
                try {
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                    long jZ = ta0Var.z();
                    ta0Var.p().g();
                    try {
                        ((vd9) ta0Var.c).G(f, f, jFloatToRawIntBits);
                        if (ztVar != null) {
                            long jZ2 = ta0Var.z();
                            ta0Var.p().g();
                            try {
                                z = true;
                                ((vd9) ta0Var.c).k(ztVar, 1);
                                ((vd9) ta0Var.c).I(fIntBitsToFloat3, fIntBitsToFloat4);
                                try {
                                    i7h.r(vv7Var, ke6Var);
                                    ((vd9) ta0Var.c).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                    ta0Var.p().o();
                                    ta0Var.R(jZ2);
                                } catch (Throwable th) {
                                    ((vd9) ta0Var.c).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                ta0Var.p().o();
                                ta0Var.R(jZ2);
                                throw th2;
                            }
                        } else {
                            z = true;
                            ((vd9) ta0Var.c).I(fIntBitsToFloat3, fIntBitsToFloat4);
                            try {
                                i7h.r(vv7Var, ke6Var);
                                ((vd9) ta0Var.c).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                            } catch (Throwable th3) {
                                ((vd9) ta0Var.c).I(-fIntBitsToFloat3, -fIntBitsToFloat4);
                                throw th3;
                            }
                        }
                        ta0Var.p().o();
                        ta0Var.R(jZ);
                        ((vd9) ta0Var.c).I(-0.0f, -0.0f);
                    } catch (Throwable th4) {
                        ta0Var.p().o();
                        ta0Var.R(jZ);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    ((vd9) ta0Var.c).I(-0.0f, -0.0f);
                    throw th5;
                }
            }
            i5++;
            z2 = z;
            ie6VarQ0 = ie6VarQ0;
            objArr = objArr;
        }
    }
}
