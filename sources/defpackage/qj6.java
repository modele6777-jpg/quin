package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qj6 extends i09 implements ug2, kv7, al9 {
    public int E0;
    public int F0;
    public boolean G0;
    public int H0;
    public int I0;
    public mue J0;
    public l9f K0;
    public mue Z;

    @Override // defpackage.al9
    public final void A0() {
        if (this.K0 != null) {
            if9.C(this, new pj6(this, 1));
        }
        this.G0 = true;
        rs0.F(this);
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.rv3
    public final void b0() {
        this.J0 = a6c.k(this.Z, vd0.s0(this).P0);
        this.G0 = true;
        rs0.F(this);
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        if (this.G0) {
            l1(zn8Var, n1(), (xp5) eb3.H(this, zg2.k));
            this.G0 = false;
        }
        int i = this.H0;
        int iO = i != -1 ? mh3.o(i, kl2.i(j), kl2.g(j)) : kl2.i(j);
        int i2 = this.I0;
        cea ceaVarV = tn8Var.v(kl2.a(j, 0, 0, iO, i2 != -1 ? mh3.o(i2, kl2.i(j), kl2.g(j)) : kl2.g(j), 3));
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 8));
    }

    @Override // defpackage.i09
    public final void d1() {
        xp5 xp5Var = (xp5) eb3.H(this, zg2.k);
        this.J0 = a6c.k(this.Z, vd0.s0(this).P0);
        yp5 yp5Var = n1().a.f;
        ar5 ar5Var = n1().a.c;
        if (ar5Var == null) {
            ar5Var = ar5.w;
        }
        wq5 wq5Var = n1().a.d;
        int i = wq5Var != null ? wq5Var.a : 0;
        xq5 xq5Var = n1().a.e;
        this.K0 = ((zp5) xp5Var).b(yp5Var, ar5Var, i, xq5Var != null ? xq5Var.a : 65535);
        if9.C(this, new pj6(this, 0));
        this.G0 = true;
    }

    @Override // defpackage.rv3
    public final void e() {
        this.G0 = true;
        rs0.F(this);
    }

    @Override // defpackage.i09
    public final void e1() {
        this.J0 = null;
        this.K0 = null;
        this.G0 = false;
    }

    @Override // defpackage.kv7
    public final int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        m1(lg8Var);
        int i2 = this.H0;
        int i3 = this.I0;
        if (i2 == i3) {
            return i3;
        }
        int iB = tn8Var.b(i);
        int i4 = this.H0;
        int i5 = this.I0;
        if (iB < i4) {
            iB = i4;
        }
        return iB > i5 ? i5 : iB;
    }

    public final void l1(zn8 zn8Var, mue mueVar, xp5 xp5Var) {
        qte qteVar = dpe.b(mueVar, zn8Var, xp5Var, 3, true).d;
        float fH = qteVar.h(0);
        float fH2 = qteVar.h(1);
        float fH3 = qteVar.h(2);
        this.H0 = cn1.r(fH, fH2, fH3, this.E0, 1);
        this.I0 = cn1.r(fH, fH2, fH3, this.F0, Integer.MAX_VALUE);
    }

    public final void m1(lg8 lg8Var) {
        if (this.G0) {
            l1(lg8Var, n1(), (xp5) eb3.H(this, zg2.k));
            this.G0 = false;
        }
        int i = this.H0;
        this.H0 = i >= 0 ? i : 0;
        int i2 = this.I0;
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        this.I0 = i2;
    }

    public final mue n1() {
        mue mueVar = this.J0;
        if (mueVar != null) {
            return mueVar;
        }
        throw ub3.e("Resolved style is not set.");
    }

    @Override // defpackage.kv7
    public final int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        m1(lg8Var);
        int i2 = this.H0;
        if (i2 == this.I0) {
            return i2;
        }
        int iV = tn8Var.V(i);
        int i3 = this.H0;
        int i4 = this.I0;
        if (iV < i3) {
            iV = i3;
        }
        return iV > i4 ? i4 : iV;
    }
}
