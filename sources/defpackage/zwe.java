package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zwe extends i09 implements kv7 {
    public boolean E0;
    public fxd F0;
    public boolean G0;
    public jx H0;
    public jx I0;
    public float J0;
    public float K0;
    public m77 Z;

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        float f;
        float f2 = urg.J;
        boolean z = (tn8Var.b(kl2.h(j)) == 0 || tn8Var.q(kl2.g(j)) == 0) ? false : true;
        if (this.G0) {
            f = urg.C;
        } else {
            f = (z || this.E0) ? wbe.a : wbe.b;
        }
        float fP0 = zn8Var.p0(f);
        jx jxVar = this.I0;
        int iFloatValue = (int) (jxVar != null ? ((Number) jxVar.e()).floatValue() : fP0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            k37.a("width and height must be >= 0");
        }
        cea ceaVarV = tn8Var.v(ll2.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fP1 = zn8Var.p0((wbe.d - zn8Var.c0(fP0)) / 2.0f);
        float fP2 = zn8Var.p0((wbe.c - wbe.a) - wbe.e);
        boolean z2 = this.G0;
        if (z2 && this.E0) {
            fP1 = fP2 - zn8Var.p0(f2);
        } else if (z2 && !this.E0) {
            fP1 = zn8Var.p0(f2);
        } else if (this.E0) {
            fP1 = fP2;
        }
        jx jxVar2 = this.I0;
        Float f3 = jxVar2 != null ? (Float) jxVar2.e.getValue() : null;
        if (f3 == null || f3.floatValue() != fP0) {
            ynb.V(Z0(), null, null, new wwe(this, fP0, null), 3);
        }
        jx jxVar3 = this.H0;
        Float f4 = jxVar3 != null ? (Float) jxVar3.e.getValue() : null;
        if (f4 == null || f4.floatValue() != fP1) {
            ynb.V(Z0(), null, null, new xwe(this, fP1, null), 3);
        }
        if (Float.isNaN(this.K0) && Float.isNaN(this.J0)) {
            this.K0 = fP0;
            this.J0 = fP1;
        }
        return zn8Var.n0(iFloatValue, iFloatValue, qu4.a, new er(ceaVarV, this, fP1, 6));
    }

    @Override // defpackage.i09
    public final void d1() {
        ynb.V(Z0(), null, null, new ywe(this, null), 3);
    }
}
