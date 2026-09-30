package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q2f {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public final cp7 l;
    public final du0 m;
    public final xc6 n;
    public final f82 o;
    public final f82 p;
    public final f82 q;
    public final f82 r;
    public final f82 s;
    public final f82 t;
    public final f82 u;
    public final f82 v;
    public final f82 w;
    public final boolean x;
    public final Matrix a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public q2f(qx qxVar) {
        mx mxVar = qxVar.a;
        this.l = (cp7) (mxVar == null ? null : mxVar.c0());
        sx sxVar = qxVar.b;
        this.m = sxVar == null ? null : sxVar.c0();
        kx kxVar = qxVar.c;
        this.n = (xc6) (kxVar == null ? null : kxVar.c0());
        lx lxVar = qxVar.d;
        this.o = lxVar == null ? null : lxVar.c0();
        lx lxVar2 = qxVar.f;
        f82 f82VarC0 = lxVar2 == null ? null : lxVar2.c0();
        this.q = f82VarC0;
        this.x = qxVar.m;
        lx lxVar3 = qxVar.h;
        this.s = lxVar3 == null ? null : lxVar3.c0();
        lx lxVar4 = qxVar.i;
        this.t = lxVar4 == null ? null : lxVar4.c0();
        lx lxVar5 = qxVar.j;
        this.u = lxVar5 == null ? null : lxVar5.c0();
        if (f82VarC0 != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        lx lxVar6 = qxVar.g;
        this.r = lxVar6 == null ? null : lxVar6.c0();
        kx kxVar2 = qxVar.e;
        if (kxVar2 != null) {
            this.p = (f82) kxVar2.c0();
        }
        lx lxVar7 = qxVar.k;
        if (lxVar7 != null) {
            this.v = lxVar7.c0();
        } else {
            this.v = null;
        }
        lx lxVar8 = qxVar.l;
        if (lxVar8 != null) {
            this.w = lxVar8.c0();
        } else {
            this.w = null;
        }
    }

    public final void a(eu0 eu0Var) {
        eu0Var.d(this.p);
        eu0Var.d(this.v);
        eu0Var.d(this.w);
        eu0Var.d(this.l);
        eu0Var.d(this.m);
        eu0Var.d(this.n);
        eu0Var.d(this.o);
        eu0Var.d(this.q);
        eu0Var.d(this.r);
        eu0Var.d(this.s);
        eu0Var.d(this.t);
        eu0Var.d(this.u);
    }

    public final void b(zt0 zt0Var) {
        f82 f82Var = this.p;
        if (f82Var != null) {
            f82Var.a(zt0Var);
        }
        f82 f82Var2 = this.v;
        if (f82Var2 != null) {
            f82Var2.a(zt0Var);
        }
        f82 f82Var3 = this.w;
        if (f82Var3 != null) {
            f82Var3.a(zt0Var);
        }
        cp7 cp7Var = this.l;
        if (cp7Var != null) {
            cp7Var.a(zt0Var);
        }
        du0 du0Var = this.m;
        if (du0Var != null) {
            du0Var.a(zt0Var);
        }
        xc6 xc6Var = this.n;
        if (xc6Var != null) {
            xc6Var.a(zt0Var);
        }
        f82 f82Var4 = this.o;
        if (f82Var4 != null) {
            f82Var4.a(zt0Var);
        }
        f82 f82Var5 = this.q;
        if (f82Var5 != null) {
            f82Var5.a(zt0Var);
        }
        f82 f82Var6 = this.r;
        if (f82Var6 != null) {
            f82Var6.a(zt0Var);
        }
        f82 f82Var7 = this.s;
        if (f82Var7 != null) {
            f82Var7.a(zt0Var);
            f82Var7.a(new p2f(0, this));
        }
        f82 f82Var8 = this.t;
        if (f82Var8 != null) {
            f82Var8.a(zt0Var);
            f82Var8.a(new p2f(1, this));
        }
        f82 f82Var9 = this.u;
        if (f82Var9 != null) {
            f82Var9.a(zt0Var);
            f82Var9.a(new p2f(2, this));
        }
    }

    public final void c() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix d() {
        PointF pointF;
        fec fecVar;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        xc6 xc6Var = this.n;
        cp7 cp7Var = this.l;
        du0 du0Var = this.m;
        f82 f82Var = this.u;
        f82 f82Var2 = this.t;
        f82 f82Var3 = this.s;
        if ((f82Var3 == null || f82Var3.i() == 0.0f) && ((f82Var2 == null || f82Var2.i() == 0.0f) && (f82Var == null || f82Var.i() == 0.0f))) {
            if (du0Var != null && (pointF2 = (PointF) du0Var.d()) != null) {
                float f = pointF2.x;
                if (f != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.x) {
                f82 f82Var4 = this.o;
                if (f82Var4 != null) {
                    float fI = f82Var4.i();
                    if (fI != 0.0f) {
                        matrix.preRotate(fI);
                    }
                }
            } else if (du0Var != null) {
                float f2 = du0Var.d;
                PointF pointF3 = (PointF) du0Var.d();
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                du0Var.g(1.0E-4f + f2);
                PointF pointF4 = (PointF) du0Var.d();
                du0Var.g(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
            }
            f82 f82Var5 = this.q;
            if (f82Var5 != null) {
                f82 f82Var6 = this.r;
                float fCos = f82Var6 == null ? 0.0f : (float) Math.cos(Math.toRadians((-f82Var6.i()) + 90.0f));
                float fSin = f82Var6 == null ? 1.0f : (float) Math.sin(Math.toRadians((-f82Var6.i()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(f82Var5.i()));
                c();
                float[] fArr = this.e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f5 = -fSin;
                fArr[3] = f5;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.b;
                matrix2.setValues(fArr);
                c();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.c;
                matrix3.setValues(fArr);
                c();
                fArr[0] = fCos;
                fArr[1] = f5;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            if (xc6Var != null && (fecVar = (fec) xc6Var.d()) != null) {
                float f6 = fecVar.a;
                if (f6 != 1.0f || fecVar.b != 1.0f) {
                    matrix.preScale(f6, fecVar.b);
                }
            }
            if (cp7Var != null && (pointF = (PointF) cp7Var.d()) != null) {
                float f7 = pointF.x;
                if (f7 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f7, -pointF.y);
                }
            }
        } else {
            float fI2 = f82Var3 != null ? f82Var3.i() : 0.0f;
            float fI3 = f82Var2 != null ? f82Var2.i() : 0.0f;
            float fI4 = f82Var != null ? f82Var.i() : 0.0f;
            if (this.k || fI2 != this.f || fI3 != this.g || fI4 != this.h) {
                this.f = fI2;
                this.g = fI3;
                this.h = fI4;
                if (fI2 != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(fI2));
                } else {
                    this.i = 1.0f;
                }
                if (fI3 != 0.0f) {
                    this.j = (float) Math.cos(Math.toRadians(fI3));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            PointF pointF5 = cp7Var == null ? null : (PointF) cp7Var.d();
            PointF pointF6 = du0Var == null ? null : (PointF) du0Var.d();
            fec fecVar2 = xc6Var != null ? (fec) xc6Var.d() : null;
            float f8 = fecVar2 != null ? fecVar2.a : 1.0f;
            float f9 = fecVar2 != null ? fecVar2.b : 1.0f;
            float f10 = this.i;
            float f11 = this.j;
            matrix.reset();
            if (pointF6 != null) {
                float f12 = pointF6.x;
                if (f12 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f12, pointF6.y);
                }
            }
            if (fI4 != 0.0f) {
                matrix.preRotate(fI4);
            }
            if (fI3 != 0.0f) {
                matrix.preScale(f11, 1.0f);
            }
            if (fI2 != 0.0f) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointF5 != null) {
                float f13 = pointF5.x;
                if (f13 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f13, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix e(float f) {
        du0 du0Var = this.m;
        PointF pointF = du0Var == null ? null : (PointF) du0Var.d();
        xc6 xc6Var = this.n;
        fec fecVar = xc6Var == null ? null : (fec) xc6Var.d();
        cp7 cp7Var = this.l;
        PointF pointF2 = cp7Var != null ? (PointF) cp7Var.d() : null;
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        f82 f82Var = this.s;
        float fI = f82Var != null ? f82Var.i() * f : 0.0f;
        f82 f82Var2 = this.t;
        float fI2 = f82Var2 != null ? f82Var2.i() * f : 0.0f;
        f82 f82Var3 = this.u;
        float fI3 = f82Var3 != null ? f82Var3.i() * f : 0.0f;
        if (fI == 0.0f && fI2 == 0.0f && fI3 == 0.0f) {
            f82 f82Var4 = this.o;
            if (f82Var4 != null) {
                matrix.preRotate(((Float) f82Var4.d()).floatValue() * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fI != 0.0f ? (float) Math.cos(Math.toRadians(fI)) : 1.0f;
            float fCos2 = fI2 != 0.0f ? (float) Math.cos(Math.toRadians(fI2)) : 1.0f;
            if (fI3 != 0.0f) {
                matrix.preRotate(fI3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fI2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fI != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (fecVar != null) {
            double d = f;
            matrix.preScale((float) Math.pow(fecVar.a, d), (float) Math.pow(fecVar.b, d));
        }
        return matrix;
    }
}
