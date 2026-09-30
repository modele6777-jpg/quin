package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tse extends i09 implements ug2, kv7 {
    public l9f E0;
    public rse F0;
    public final mue Z;

    public tse(mue mueVar) {
        this.Z = mueVar;
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.rv3
    public final void b0() {
        rse rseVar = this.F0;
        if (rseVar != null) {
            rse.a(rseVar, vd0.s0(this).P0, null, null, 30);
        }
        rs0.F(this);
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        rse rseVar = this.F0;
        if (rseVar == null) {
            throw ub3.e("Min size state is not set.");
        }
        vz9 vz9Var = rseVar.f;
        l9f l9fVar = this.E0;
        if (l9fVar == null) {
            throw ub3.e("Font resolution state is not set.");
        }
        Object value = l9fVar.getValue();
        if (!pa7.t(value, rseVar.e)) {
            rseVar.e = value;
            vz9Var.setValue(Boolean.TRUE);
        }
        if (((Boolean) vz9Var.getValue()).booleanValue()) {
            rseVar.g = dpe.a(rseVar.d, rseVar.b, rseVar.c);
            vz9Var.setValue(Boolean.FALSE);
        }
        long j2 = rseVar.g;
        cea ceaVarV = tn8Var.v(ll2.e(j, ll2.b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 20));
    }

    @Override // defpackage.i09
    public final void d1() {
        mue mueVarK = a6c.k(this.Z, vd0.s0(this).P0);
        xp5 xp5Var = (xp5) eb3.H(this, zg2.k);
        l1(mueVarK, xp5Var);
        cv7 cv7Var = vd0.s0(this).P0;
        sw3 sw3Var = vd0.s0(this).O0;
        l9f l9fVar = this.E0;
        if (l9fVar == null) {
            throw ub3.e("Font resolution state is not set.");
        }
        this.F0 = new rse(cv7Var, sw3Var, xp5Var, mueVarK, l9fVar.getValue());
    }

    @Override // defpackage.rv3
    public final void e() {
        rse rseVar = this.F0;
        if (rseVar != null) {
            rse.a(rseVar, null, vd0.s0(this).O0, null, 29);
        }
        rs0.F(this);
    }

    @Override // defpackage.i09
    public final void e1() {
        this.E0 = null;
        this.F0 = null;
    }

    public final void l1(mue mueVar, xp5 xp5Var) {
        xtd xtdVar = mueVar.a;
        yp5 yp5Var = xtdVar.f;
        ar5 ar5Var = xtdVar.c;
        if (ar5Var == null) {
            ar5Var = ar5.w;
        }
        wq5 wq5Var = xtdVar.d;
        int i = wq5Var != null ? wq5Var.a : 0;
        xq5 xq5Var = xtdVar.e;
        this.E0 = ((zp5) xp5Var).b(yp5Var, ar5Var, i, xq5Var != null ? xq5Var.a : 65535);
        rs0.F(this);
    }
}
