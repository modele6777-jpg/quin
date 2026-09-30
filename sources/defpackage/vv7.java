package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vv7 implements sn4, im2 {
    public final xl1 a = new xl1();
    public pn4 b;

    @Override // defpackage.sn4
    public final void B(long j, long j2, long j3, float f, un4 un4Var, int i) {
        this.a.B(j, j2, j3, f, un4Var, i);
    }

    @Override // defpackage.sw3
    public final int D0(float f) {
        return this.a.D0(f);
    }

    @Override // defpackage.sw3
    public final float F(long j) {
        return this.a.F(j);
    }

    @Override // defpackage.sn4
    public final void F0(long j, a26 a26Var, ke6 ke6Var) {
        ke6Var.e(this, getLayoutDirection(), j, new it3(this, this.b, a26Var, 17));
    }

    @Override // defpackage.sn4
    public final long H0() {
        return this.a.H0();
    }

    @Override // defpackage.sn4
    public final void I0(zt ztVar, long j, un4 un4Var) {
        this.a.I0(ztVar, j, un4Var);
    }

    @Override // defpackage.sn4
    public final void M0(b41 b41Var, long j, long j2, long j3, float f, un4 un4Var, c82 c82Var, int i) {
        this.a.M0(b41Var, j, j2, j3, f, un4Var, c82Var, i);
    }

    @Override // defpackage.sw3
    public final long N0(long j) {
        return this.a.N0(j);
    }

    @Override // defpackage.sw3
    public final long P(int i) {
        return this.a.P(i);
    }

    @Override // defpackage.sn4
    public final void Q(long j, float f, long j2, un4 un4Var) {
        this.a.Q(j, f, j2, un4Var);
    }

    @Override // defpackage.sw3
    public final float Q0(long j) {
        return this.a.Q0(j);
    }

    @Override // defpackage.sw3
    public final long S(float f) {
        return this.a.S(f);
    }

    @Override // defpackage.sn4
    public final void W0(b41 b41Var, long j, long j2, float f, un4 un4Var, c82 c82Var, int i) {
        this.a.W0(b41Var, j, j2, f, un4Var, c82Var, i);
    }

    @Override // defpackage.sn4
    public final void X0(long j, float f, float f2, long j2, long j3, un4 un4Var) {
        this.a.X0(j, f, f2, j2, j3, un4Var);
    }

    @Override // defpackage.sw3
    public final float Z(int i) {
        return this.a.Z(i);
    }

    public final void a() {
        xl1 xl1Var = this.a;
        ta0 ta0Var = xl1Var.b;
        vl1 vl1VarP = xl1Var.b.p();
        rv3 rv3Var = this.b;
        if (rv3Var == null) {
            throw kv2.d("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        i09 i09Var = (i09) rv3Var;
        i09 i09VarM0 = i09Var.a.f;
        if (i09VarM0 != null && (i09VarM0.d & 4) != 0) {
            while (true) {
                if (i09VarM0 != null) {
                    int i = i09VarM0.c;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            i09VarM0 = i09VarM0.f;
                        }
                    }
                }
                i09VarM0 = null;
                break;
            }
        } else {
            i09VarM0 = null;
            break;
        }
        if (i09VarM0 == null) {
            yf9 yf9VarP0 = vd0.p0(rv3Var, 4);
            if (yf9VarP0.h1() == i09Var.a) {
                yf9VarP0 = yf9VarP0.M0;
                yf9VarP0.getClass();
            }
            yf9VarP0.x1(vl1VarP, (ke6) ta0Var.d);
            return;
        }
        p89 p89Var = null;
        while (i09VarM0 != null) {
            if (i09VarM0 instanceof pn4) {
                pn4 pn4Var = (pn4) i09VarM0;
                ke6 ke6Var = (ke6) ta0Var.d;
                yf9 yf9VarP1 = vd0.p0(pn4Var, 4);
                long jY0 = db6.Y0(yf9VarP1.c);
                LayoutNode layoutNode = yf9VarP1.J0;
                layoutNode.getClass();
                wv7.a(layoutNode).getSharedDrawScope().b(vl1VarP, jY0, yf9VarP1, pn4Var, ke6Var);
            } else if ((i09VarM0.c & 4) != 0 && (i09VarM0 instanceof sv3)) {
                int i2 = 0;
                for (i09 i09Var2 = ((sv3) i09VarM0).E0; i09Var2 != null; i09Var2 = i09Var2.f) {
                    if ((i09Var2.c & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            i09VarM0 = i09Var2;
                        } else {
                            if (p89Var == null) {
                                p89Var = new p89(0, new i09[16]);
                            }
                            if (i09VarM0 != null) {
                                p89Var.b(i09VarM0);
                                i09VarM0 = null;
                            }
                            p89Var.b(i09Var2);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            i09VarM0 = vd0.m0(p89Var);
        }
    }

    public final void b(vl1 vl1Var, long j, yf9 yf9Var, pn4 pn4Var, ke6 ke6Var) {
        pn4 pn4Var2 = this.b;
        this.b = pn4Var;
        cv7 cv7Var = yf9Var.J0.P0;
        ta0 ta0Var = this.a.b;
        sw3 sw3VarU = ta0Var.u();
        cv7 cv7VarW = ta0Var.w();
        vl1 vl1VarP = ta0Var.p();
        long jZ = ta0Var.z();
        ke6 ke6Var2 = (ke6) ta0Var.d;
        ta0Var.P(yf9Var);
        ta0Var.Q(cv7Var);
        ta0Var.O(vl1Var);
        ta0Var.R(j);
        ta0Var.d = ke6Var;
        vl1Var.g();
        try {
            pn4Var.o0(this);
            vl1Var.o();
            ta0Var.P(sw3VarU);
            ta0Var.Q(cv7VarW);
            ta0Var.O(vl1VarP);
            ta0Var.R(jZ);
            ta0Var.d = ke6Var2;
            this.b = pn4Var2;
        } catch (Throwable th) {
            vl1Var.o();
            ta0Var.P(sw3VarU);
            ta0Var.Q(cv7VarW);
            ta0Var.O(vl1VarP);
            ta0Var.R(jZ);
            ta0Var.d = ke6Var2;
            throw th;
        }
    }

    @Override // defpackage.sw3
    public final float c0(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.sn4
    public final long f() {
        return this.a.f();
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.sn4
    public final cv7 getLayoutDirection() {
        return this.a.a.b;
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.a.h0();
    }

    @Override // defpackage.sn4
    public final void i(float f, float f2, long j, ibb ibbVar) {
        this.a.i(f, f2, j, ibbVar);
    }

    @Override // defpackage.sn4
    public final void m(long j, long j2, long j3, float f, int i, au auVar, int i2) {
        this.a.m(j, j2, j3, f, i, auVar, i2);
    }

    @Override // defpackage.sn4
    public final void m0(long j, long j2, long j3, long j4, un4 un4Var) {
        this.a.m0(j, j2, j3, j4, un4Var);
    }

    @Override // defpackage.sn4
    public final void o(cv6 cv6Var, long j, float f, c82 c82Var, int i) {
        this.a.o(cv6Var, j, f, c82Var, i);
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

    @Override // defpackage.sn4
    public final ta0 v0() {
        return this.a.b;
    }

    @Override // defpackage.sn4
    public final void x(zt ztVar, b41 b41Var, float f, un4 un4Var, c82 c82Var, int i) {
        this.a.x(ztVar, b41Var, f, un4Var, c82Var, i);
    }

    @Override // defpackage.sw3
    public final int x0(long j) {
        return this.a.x0(j);
    }

    @Override // defpackage.sn4
    public final void z(cv6 cv6Var, long j, long j2, long j3, long j4, float f, c82 c82Var, int i, int i2) {
        this.a.z(cv6Var, j, j2, j3, j4, f, c82Var, i, i2);
    }
}
