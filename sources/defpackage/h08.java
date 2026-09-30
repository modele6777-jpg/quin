package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h08 {
    public lyd a;
    public wz b;

    public h08() {
        y6f y6fVar = xo1.g;
        Float fValueOf = Float.valueOf(0.0f);
        this.b = new wz(y6fVar, fValueOf, (b00) y6fVar.a.d(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void a() {
        lyd lydVar = this.a;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.b = new wz(xo1.g, Float.valueOf(0.0f), null, 60);
    }

    public final void b(float f, sw3 sw3Var, aw2 aw2Var) {
        if (f <= sw3Var.p0(1.0f)) {
            return;
        }
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            float fFloatValue = ((Number) this.b.b.getValue()).floatValue();
            lyd lydVar = this.a;
            if (lydVar != null) {
                lydVar.h(null);
            }
            wz wzVar = this.b;
            if (wzVar.f) {
                this.b = g21.D(wzVar, fFloatValue - f, 0.0f, 30);
            } else {
                this.b = new wz(xo1.g, Float.valueOf(-f), null, 60);
            }
            this.a = ynb.V(aw2Var, null, null, new g08(this, null), 3);
        } finally {
            iqf.p(irdVarJ, irdVarL, a26VarE);
        }
    }
}
