package defpackage;

import androidx.compose.ui.graphics.shadow.DropShadowPainter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a01 extends i09 implements pn4, al9, sw3 {
    public n4d E0;
    public DropShadowPainter F0;
    public boolean G0;
    public y6c H0;
    public a26 I0;
    public float J0;
    public long K0;
    public float L0;
    public int M0;
    public sw3 Z;

    @Override // defpackage.al9
    public final void A0() {
        this.G0 = false;
        l1();
    }

    @Override // defpackage.i09
    public final void d1() {
        sw3 sw3Var = vd0.s0(this).O0;
        if (pa7.t(this.Z, sw3Var)) {
            return;
        }
        this.Z = sw3Var;
        this.G0 = false;
        l1();
    }

    @Override // defpackage.rv3
    public final void e() {
        if (this.Y) {
            sw3 sw3Var = vd0.s0(this).O0;
            if (pa7.t(this.Z, sw3Var)) {
                return;
            }
            this.Z = sw3Var;
            this.G0 = false;
            l1();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a01)) {
            return false;
        }
        a01 a01Var = (a01) obj;
        if (this.L0 != a01Var.L0 || !pa7.t(this.H0, a01Var.H0) || this.I0 != a01Var.I0 || this.J0 != a01Var.J0 || !hl9.c(0L, 0L)) {
            return false;
        }
        long j = this.K0;
        long j2 = a01Var.K0;
        int i = y72.l;
        return faf.a(j, j2) && this.M0 == a01Var.M0;
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        sw3 sw3Var = this.Z;
        if (sw3Var != null) {
            return sw3Var.getDensity();
        }
        return 1.0f;
    }

    @Override // defpackage.sw3
    public final float h0() {
        sw3 sw3Var = this.Z;
        if (sw3Var != null) {
            return sw3Var.h0();
        }
        return 1.0f;
    }

    public final int hashCode() {
        int iB = ib8.b(ub3.a(0.0f, ub3.a(this.J0, (this.I0.hashCode() + ((this.H0.hashCode() + (Float.hashCode(this.L0) * 31)) * 31)) * 31, 31), 31), 31, 0L);
        long j = this.K0;
        int i = y72.l;
        return Integer.hashCode(this.M0) + ib8.b(iB, 961, j);
    }

    public final void l1() {
        this.E0 = null;
        this.F0 = null;
        qn4.G(this);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        if (!this.G0) {
            this.G0 = true;
            if (this.J0 != 0.0f) {
                this.J0 = 0.0f;
                l1();
            }
            if (!hl9.c(0L, 0L)) {
                qn4.G(this);
            }
            long j = y72.b;
            if (!faf.a(this.K0, j)) {
                this.K0 = j;
                l1();
            }
            if (this.L0 != 1.0f) {
                this.L0 = 1.0f;
                l1();
            }
            if (this.M0 != 3) {
                this.M0 = 3;
                l1();
            }
            if9.C(this, new p(13, this));
        }
        n4d n4dVar = this.E0;
        DropShadowPainter dropShadowPainter = this.F0;
        float density = this.J0 / getDensity();
        float density2 = 0.0f / getDensity();
        float fIntBitsToFloat = Float.intBitsToFloat(0) / getDensity();
        float fIntBitsToFloat2 = Float.intBitsToFloat(0) / getDensity();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        if (dropShadowPainter == null || n4dVar == null || !yi4.b(n4dVar.a, density) || !yi4.b(n4dVar.b, density2)) {
            n4d n4dVar2 = new n4d(density, this.K0, density2, jFloatToRawIntBits, this.L0, this.M0);
            this.E0 = n4dVar2;
            ta0 ta0VarB = vd0.q0(this).b();
            y6c y6cVar = this.H0;
            ta0VarB.getClass();
            dropShadowPainter = new DropShadowPainter(y6cVar, n4dVar2, ta0VarB);
            this.F0 = dropShadowPainter;
        } else {
            long j2 = n4dVar.e;
            long j3 = this.K0;
            int i = y72.l;
            if (!faf.a(j2, j3) || !pa7.t(n4dVar.f, null) || n4dVar.g != this.L0 || n4dVar.d != this.M0 || n4dVar.c != jFloatToRawIntBits) {
                n4d n4dVar3 = new n4d(density, this.K0, density2, jFloatToRawIntBits, this.L0, this.M0);
                this.E0 = n4dVar3;
                ta0 ta0VarB2 = vd0.q0(this).b();
                y6c y6cVar2 = this.H0;
                ta0VarB2.getClass();
                dropShadowPainter = new DropShadowPainter(y6cVar2, n4dVar3, ta0VarB2);
                this.F0 = dropShadowPainter;
            }
        }
        vv7 vv7Var = (vv7) im2Var;
        fy9.h(dropShadowPainter, im2Var, vv7Var.a.f(), 0.0f, 6);
        vv7Var.a();
    }
}
