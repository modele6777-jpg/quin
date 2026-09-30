package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hc0 implements fc0, zn8, sg8 {
    public final nv7 a;
    public tbd b;
    public boolean c;

    public hc0(nv7 nv7Var, tbd tbdVar) {
        this.a = nv7Var;
        this.b = tbdVar;
    }

    @Override // defpackage.sw3
    public final int D0(float f) {
        return this.a.D0(f);
    }

    @Override // defpackage.sw3
    public final float F(long j) {
        return this.a.F(j);
    }

    @Override // defpackage.sw3
    public final long N0(long j) {
        return this.a.N0(j);
    }

    @Override // defpackage.sw3
    public final long P(int i) {
        return this.a.P(i);
    }

    @Override // defpackage.sw3
    public final float Q0(long j) {
        return this.a.Q0(j);
    }

    @Override // defpackage.sw3
    public final long S(float f) {
        return this.a.S(f);
    }

    @Override // defpackage.sw3
    public final float Z(int i) {
        return this.a.Z(i);
    }

    @Override // defpackage.sg8
    public final bv7 a(bv7 bv7Var) {
        og8 og8Var;
        if (bv7Var instanceof og8) {
            return bv7Var;
        }
        if (bv7Var instanceof yf9) {
            ng8 ng8VarF1 = ((yf9) bv7Var).f1();
            return (ng8VarF1 == null || (og8Var = ng8VarF1.M0) == null) ? bv7Var : og8Var;
        }
        i37.b("Unsupported LayoutCoordinates");
        oo3.f();
        return null;
    }

    @Override // defpackage.sw3
    public final float c0(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.ga7
    public final cv7 getLayoutDirection() {
        return this.a.J0.P0;
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.a.h0();
    }

    @Override // defpackage.ga7
    public final boolean k0() {
        return false;
    }

    @Override // defpackage.zn8
    public final yn8 n0(int i, int i2, Map map, a26 a26Var) {
        return this.a.y(i, i2, map, null, a26Var);
    }

    @Override // defpackage.sw3
    public final float p0(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.sw3
    public final long t(float f) {
        return this.a.t(f);
    }

    @Override // defpackage.sw3
    public final long u(long j) {
        return this.a.u(j);
    }

    @Override // defpackage.sw3
    public final int x0(long j) {
        return this.a.x0(j);
    }

    @Override // defpackage.zn8
    public final yn8 y(int i, int i2, Map map, a26 a26Var, a26 a26Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            i37.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new gc0(i, i2, map, a26Var, a26Var2, this, 0);
    }
}
