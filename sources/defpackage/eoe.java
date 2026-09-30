package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eoe extends sv3 implements kv7, pn4, ug2, mb6, wwc {
    public boolean F0;
    public boolean G0;
    public ute H0;
    public z2f I0;
    public jse J0;
    public b41 K0;
    public boolean L0;
    public ghc M0;
    public ks9 N0;
    public tze O0;
    public rfa P0;
    public g13 Q0;
    public lyd R0;
    public eue S0;
    public hkb T0 = new hkb(-1.0f, -1.0f, -1.0f, -1.0f);
    public int U0;
    public int V0;
    public final aqe W0;
    public final lne X0;

    public eoe(boolean z, boolean z2, boolean z3, ute uteVar, z2f z2fVar, jse jseVar, b41 b41Var, boolean z4, ghc ghcVar, ks9 ks9Var, tze tzeVar, rfa rfaVar) {
        this.F0 = z;
        this.G0 = z2;
        this.H0 = uteVar;
        this.I0 = z2fVar;
        this.J0 = jseVar;
        this.K0 = b41Var;
        this.L0 = z4;
        this.M0 = ghcVar;
        this.N0 = ks9Var;
        this.O0 = tzeVar;
        this.P0 = rfaVar;
        aqe fqeVar = pj8.a() ? new fqe(z2fVar, jseVar, uteVar, z || z2 || z3) : new tv();
        l1(fqeVar);
        this.W0 = fqeVar;
        lne lneVar = new lne(this.O0, new boe(this, null), new coe(this, null), new trd(12, this));
        l1(lneVar);
        this.X0 = lneVar;
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        this.W0.R0(hxcVar);
    }

    @Override // defpackage.kv7
    public final yn8 d(final zn8 zn8Var, tn8 tn8Var, long j) {
        ks9 ks9Var = this.N0;
        ks9 ks9Var2 = ks9.a;
        qu4 qu4Var = qu4.a;
        if (ks9Var == ks9Var2) {
            final cea ceaVarV = tn8Var.v(kl2.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
            final int iMin = Math.min(ceaVarV.b, kl2.g(j));
            final int i = 1;
            return zn8Var.n0(ceaVarV.a, iMin, qu4Var, new a26(this) { // from class: yne
                public final /* synthetic */ eoe b;

                {
                    this.b = this;
                }

                @Override // defpackage.a26
                public final Object d(Object obj) {
                    int i2 = i;
                    wef wefVar = wef.a;
                    zn8 zn8Var2 = zn8Var;
                    cea ceaVar = ceaVarV;
                    switch (i2) {
                        case 0:
                            bea beaVar = (bea) obj;
                            int i3 = ceaVar.a;
                            eoe eoeVar = this.b;
                            eoeVar.q1(beaVar, iMin, i3, eoeVar.I0.d().d, zn8Var2.getLayoutDirection());
                            beaVar.k(ceaVar, -eoeVar.M0.a.j(), 0, 0.0f);
                            break;
                        default:
                            bea beaVar2 = (bea) obj;
                            int i4 = ceaVar.b;
                            eoe eoeVar2 = this.b;
                            eoeVar2.q1(beaVar2, iMin, i4, eoeVar2.I0.d().d, zn8Var2.getLayoutDirection());
                            beaVar2.k(ceaVar, 0, -eoeVar2.M0.a.j(), 0.0f);
                            break;
                    }
                    return wefVar;
                }
            });
        }
        final cea ceaVarV2 = tn8Var.v(kl2.a(j, 0, Integer.MAX_VALUE, 0, 0, 13));
        final int iMin2 = Math.min(ceaVarV2.a, kl2.h(j));
        final int i2 = 0;
        return zn8Var.n0(iMin2, ceaVarV2.b, qu4Var, new a26(this) { // from class: yne
            public final /* synthetic */ eoe b;

            {
                this.b = this;
            }

            @Override // defpackage.a26
            public final Object d(Object obj) {
                int i3 = i2;
                wef wefVar = wef.a;
                zn8 zn8Var2 = zn8Var;
                cea ceaVar = ceaVarV2;
                switch (i3) {
                    case 0:
                        bea beaVar = (bea) obj;
                        int i4 = ceaVar.a;
                        eoe eoeVar = this.b;
                        eoeVar.q1(beaVar, iMin2, i4, eoeVar.I0.d().d, zn8Var2.getLayoutDirection());
                        beaVar.k(ceaVar, -eoeVar.M0.a.j(), 0, 0.0f);
                        break;
                    default:
                        bea beaVar2 = (bea) obj;
                        int i5 = ceaVar.b;
                        eoe eoeVar2 = this.b;
                        eoeVar2.q1(beaVar2, iMin2, i5, eoeVar2.I0.d().d, zn8Var2.getLayoutDirection());
                        beaVar2.k(ceaVar, 0, -eoeVar2.M0.a.j(), 0.0f);
                        break;
                }
                return wefVar;
            }
        });
    }

    @Override // defpackage.i09
    public final void d1() {
        jse jseVar = this.J0;
        boolean z = this.F0;
        jseVar.h = z;
        if (z && o1()) {
            p1();
        }
    }

    @Override // defpackage.mb6
    public final void l0(yf9 yf9Var) {
        this.H0.e.setValue(yf9Var);
        this.W0.l0(yf9Var);
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) throws Throwable {
        int iG;
        int iF;
        vv7 vv7Var = (vv7) im2Var;
        xl1 xl1Var = vv7Var.a;
        vv7Var.a();
        vne vneVarD = this.I0.d();
        ste steVarC = this.H0.c();
        if (steVarC == null) {
            return;
        }
        iy9 iy9Var = vneVarD.f;
        iy9 iy9Var2 = vneVarD.f;
        long j = vneVarD.d;
        if (iy9Var != null) {
            int i = ((dte) iy9Var.a()).a;
            long j2 = ((eue) iy9Var.b()).a;
            if (!eue.d(j2)) {
                zt ztVarL = steVarC.l(eue.g(j2), eue.f(j2));
                mue mueVar = steVarC.a.b;
                if (i == 1) {
                    b41 b41VarB = mueVar.b();
                    if (b41VarB != null) {
                        sn4.s(vv7Var, ztVarL, b41VarB, 0.2f, null, null, 0, 56);
                    } else {
                        long jC = mueVar.c();
                        if (jC == 16) {
                            jC = y72.b;
                        }
                        sn4.R(vv7Var, ztVarL, y72.b(jC, y72.c(jC) * 0.2f), null, 60);
                    }
                } else {
                    sn4.R(vv7Var, ztVarL, ((hue) eb3.H(this, iue.a)).b, null, 60);
                }
            }
        }
        if (eue.d(j)) {
            q1c.g(xl1Var.b.p(), steVarC);
            if (iy9Var2 == null) {
                b41 b41Var = this.K0;
                boolean zO1 = o1();
                g13 g13Var = this.Q0;
                jse jseVar = this.J0;
                float fJ = g13Var != null ? g13Var.c.j() : 0.0f;
                if (fJ != 0.0f && zO1) {
                    hkb hkbVarK = jseVar.k();
                    float f = hkbVarK.c;
                    float f2 = hkbVarK.a;
                    float f3 = f - f2;
                    sn4.L0(vv7Var, b41Var, (((long) Float.floatToRawIntBits(hkbVarK.b)) & 4294967295L) | (((long) Float.floatToRawIntBits((f3 / 2.0f) + f2)) << 32), hkbVarK.c(), f3, fJ);
                }
            }
        } else {
            if (iy9Var2 == null && (iG = eue.g(j)) != (iF = eue.f(j))) {
                sn4.R(vv7Var, steVarC.l(iG, iF), ((hue) eb3.H(this, iue.a)).b, null, 60);
            }
            q1c.g(xl1Var.b.p(), steVarC);
        }
        this.W0.o0(vv7Var);
    }

    public final boolean o1() {
        if (!this.L0) {
            return false;
        }
        if (!this.F0 && !this.G0) {
            return false;
        }
        b41 b41Var = this.K0;
        return ((b41Var instanceof dtd) && ((dtd) b41Var).a == 16) ? false : true;
    }

    public final void p1() {
        if (this.Q0 == null) {
            this.Q0 = new g13(((Boolean) eb3.H(this, zg2.y)).booleanValue());
            qn4.G(this);
        }
        this.R0 = ynb.V(Z0(), null, null, new aoe(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e0  */
    public final void q1(bea beaVar, int i, int i2, long j, cv7 cv7Var) {
        int i3;
        ste steVarC;
        float f;
        this.M0.b.k(i);
        this.M0.g(i2 - i);
        eue eueVar = this.S0;
        if (eueVar != null) {
            int i4 = eue.c;
            int i5 = (int) (j & 4294967295L);
            long j2 = eueVar.a;
            if (i5 == ((int) (j2 & 4294967295L))) {
                i3 = (int) (j >> 32);
                if (i3 == ((int) (j2 >> 32)) && i2 == this.U0 && i == this.V0) {
                    i3 = -1;
                }
            } else {
                int i6 = eue.c;
                i3 = (int) (4294967295L & j);
            }
        } else {
            int i7 = eue.c;
            i3 = (int) (4294967295L & j);
        }
        if (i3 < 0 || !o1() || (steVarC = this.H0.c()) == null) {
            return;
        }
        hkb hkbVarC = steVarC.c(mh3.p(i3, new z67(0, steVarC.a.a.b.length(), 1)));
        float f2 = hkbVarC.a;
        float f3 = hkbVarC.c;
        boolean z = cv7Var == cv7.b;
        int iD0 = beaVar.D0(2.0f);
        float f4 = z ? i2 - f3 : f2;
        if (z) {
            f2 = i2 - f3;
        }
        float f5 = f2 + iD0;
        float f6 = i2;
        if (f5 > f6) {
            f5 = f6;
        }
        hkb hkbVarB = hkb.b(hkbVarC, f4, f5, 0.0f, 10);
        float f7 = hkbVarB.b;
        float f8 = hkbVarB.a;
        hkb hkbVar = this.T0;
        boolean z2 = (f8 == hkbVar.a && f7 == hkbVar.b && i2 == this.U0) ? false : true;
        if (z2 || i != this.V0) {
            boolean z3 = this.N0 == ks9.a;
            if (!z3) {
                f7 = f8;
            }
            float f9 = z3 ? hkbVarB.d : hkbVarB.c;
            int iJ = this.M0.a.j();
            float f10 = iJ + i;
            if (f9 > f10) {
                f = f9 - f10;
            } else {
                float f11 = iJ;
                if (f7 >= f11 || f9 - f7 <= i) {
                    f = (f7 >= f11 || f9 - f7 > ((float) i)) ? 0.0f : f7 - f11;
                } else {
                    f = f9 - f10;
                }
            }
            this.S0 = new eue(j);
            this.T0 = hkbVarB;
            this.V0 = i;
            this.U0 = i2;
            ynb.V(Z0(), null, dw2.d, new doe(f, this, z2, j, hkbVarC, null), 1);
        }
    }
}
