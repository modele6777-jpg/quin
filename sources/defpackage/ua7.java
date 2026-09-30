package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ua7 implements zn8, ga7 {
    public final /* synthetic */ ga7 a;
    public final cv7 b;

    public ua7(ga7 ga7Var, cv7 cv7Var) {
        this.a = ga7Var;
        this.b = cv7Var;
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

    @Override // defpackage.sw3
    public final float c0(float f) {
        return this.a.c0(f);
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.ga7
    public final cv7 getLayoutDirection() {
        return this.b;
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.a.h0();
    }

    @Override // defpackage.ga7
    public final boolean k0() {
        return this.a.k0();
    }

    @Override // defpackage.sw3
    public final float p0(float f) {
        return this.a.p0(f);
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
        int i3 = i < 0 ? 0 : i;
        int i4 = i2 < 0 ? 0 : i2;
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i4) != 0) {
            i37.c("Size(" + i3 + " x " + i4 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new dc0(i3, i4, map, a26Var, 1);
    }
}
