package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fy9 {
    public rt a;
    public boolean b;
    public c82 c;
    public float d = 1.0f;
    public cv7 e = cv7.a;

    public static /* synthetic */ void h(fy9 fy9Var, sn4 sn4Var, long j, float f, int i) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        fy9Var.g(sn4Var, j, f, null);
    }

    public boolean b(float f) {
        return false;
    }

    public boolean e(c82 c82Var) {
        return false;
    }

    public final void g(sn4 sn4Var, long j, float f, c82 c82Var) {
        if (this.d != f) {
            if (!b(f)) {
                rt rtVarH = this.a;
                if (f == 1.0f) {
                    if (rtVarH != null) {
                        rtVarH.d(f);
                    }
                    this.b = false;
                } else {
                    if (rtVarH == null) {
                        rtVarH = urg.h();
                        this.a = rtVarH;
                    }
                    rtVarH.d(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!pa7.t(this.c, c82Var)) {
            if (!e(c82Var)) {
                rt rtVarH2 = this.a;
                if (c82Var == null) {
                    if (rtVarH2 != null) {
                        rtVarH2.g(null);
                    }
                    this.b = false;
                } else {
                    if (rtVarH2 == null) {
                        rtVarH2 = urg.h();
                        this.a = rtVarH2;
                    }
                    rtVarH2.g(c82Var);
                    this.b = true;
                }
            }
            this.c = c82Var;
        }
        cv7 layoutDirection = sn4Var.getLayoutDirection();
        if (this.e != layoutDirection) {
            f(layoutDirection);
            this.e = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) - Float.intBitsToFloat(i2);
        ((vd9) sn4Var.v0().c).z(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.b) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        hkb hkbVarG = z5c.g(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        vl1 vl1VarP = sn4Var.v0().p();
                        rt rtVarH3 = this.a;
                        if (rtVarH3 == null) {
                            rtVarH3 = urg.h();
                            this.a = rtVarH3;
                        }
                        try {
                            vl1VarP.l(hkbVarG, rtVarH3);
                            j(sn4Var);
                            vl1VarP.o();
                        } catch (Throwable th) {
                            vl1VarP.o();
                            throw th;
                        }
                    } else {
                        j(sn4Var);
                    }
                }
            } catch (Throwable th2) {
                ((vd9) sn4Var.v0().c).z(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((vd9) sn4Var.v0().c).z(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long i();

    public abstract void j(sn4 sn4Var);

    public void f(cv7 cv7Var) {
    }
}
