package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y02 implements x4d {
    public static final y02 b = new y02(0);
    public static final y02 c = new y02(1);
    public static final y02 d = new y02(2);
    public final /* synthetic */ int a;

    public /* synthetic */ y02(int i) {
        this.a = i;
    }

    @Override // defpackage.x4d
    public final vs9 a(long j, cv7 cv7Var, sw3 sw3Var) {
        switch (this.a) {
            case 0:
                float fC = ald.c(j) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
                return new us9(w6c.b(z5c.g(0L, j), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
            case 1:
                float fD0 = sw3Var.D0(30.0f);
                return new ts9(new hkb(0.0f, -fD0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + fD0));
            case 2:
                float fD1 = sw3Var.D0(30.0f);
                return new ts9(new hkb(-fD1, 0.0f, Float.intBitsToFloat((int) (j >> 32)) + fD1, Float.intBitsToFloat((int) (j & 4294967295L))));
            case 3:
                cv7Var.getClass();
                sw3Var.getClass();
                zt ztVarA = cu.a();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                float fP0 = sw3Var.p0(0.0f);
                float fP1 = sw3Var.p0(10.0f);
                float fP2 = sw3Var.p0(16.0f);
                float f = fIntBitsToFloat2 / 2.0f;
                Path path = ztVarA.a;
                ztVarA.h(fP0, 0.0f);
                ztVarA.g(fIntBitsToFloat - fP0, 0.0f);
                if (fP0 > 0.0f) {
                    float f2 = 2.0f * fP0;
                    float f3 = fIntBitsToFloat - f2;
                    RectF rectF = ztVarA.b;
                    if (rectF == null) {
                        rectF = new RectF();
                        ztVarA.b = rectF;
                    }
                    rectF.set(f3, 0.0f, fIntBitsToFloat, f2);
                    RectF rectF2 = ztVarA.b;
                    rectF2.getClass();
                    path.arcTo(rectF2, 270.0f, 90.0f, false);
                }
                float f4 = fP2 / 2.0f;
                ztVarA.g(fIntBitsToFloat, f - f4);
                ztVarA.g(fP1 + fIntBitsToFloat, f);
                ztVarA.g(fIntBitsToFloat, f + f4);
                ztVarA.g(fIntBitsToFloat, fIntBitsToFloat2 - fP0);
                if (fP0 > 0.0f) {
                    float f5 = 2.0f * fP0;
                    float f6 = fIntBitsToFloat - f5;
                    float f7 = fIntBitsToFloat2 - f5;
                    RectF rectF3 = ztVarA.b;
                    if (rectF3 == null) {
                        rectF3 = new RectF();
                        ztVarA.b = rectF3;
                    }
                    rectF3.set(f6, f7, fIntBitsToFloat, fIntBitsToFloat2);
                    RectF rectF4 = ztVarA.b;
                    rectF4.getClass();
                    path.arcTo(rectF4, 0.0f, 90.0f, false);
                }
                ztVarA.g(fP0, fIntBitsToFloat2);
                if (fP0 > 0.0f) {
                    float f8 = 2.0f * fP0;
                    float f9 = fIntBitsToFloat2 - f8;
                    RectF rectF5 = ztVarA.b;
                    if (rectF5 == null) {
                        rectF5 = new RectF();
                        ztVarA.b = rectF5;
                    }
                    rectF5.set(0.0f, f9, f8, fIntBitsToFloat2);
                    RectF rectF6 = ztVarA.b;
                    rectF6.getClass();
                    path.arcTo(rectF6, 90.0f, 90.0f, false);
                }
                ztVarA.g(0.0f, fP0);
                if (fP0 > 0.0f) {
                    float f10 = 2.0f * fP0;
                    RectF rectF7 = ztVarA.b;
                    if (rectF7 == null) {
                        rectF7 = new RectF();
                        ztVarA.b = rectF7;
                    }
                    rectF7.set(0.0f, 0.0f, f10, f10);
                    RectF rectF8 = ztVarA.b;
                    rectF8.getClass();
                    path.arcTo(rectF8, 180.0f, 90.0f, false);
                }
                ztVarA.e();
                return new ss9(ztVarA);
            default:
                return new ts9(z5c.g(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
