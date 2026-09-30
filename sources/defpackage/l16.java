package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l16 implements x4d {
    public final float a;

    public l16(float f) {
        this.a = f;
    }

    @Override // defpackage.x4d
    public final vs9 a(long j, cv7 cv7Var, sw3 sw3Var) {
        cv7Var.getClass();
        sw3Var.getClass();
        Path path = new Path();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        RectF rectF = new RectF(0.0f, 0.0f, Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        float fP0 = sw3Var.p0(12.0f);
        float fP1 = sw3Var.p0(12.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, fP0, fP1, direction);
        Path path2 = new Path();
        float fP2 = sw3Var.p0(8.0f);
        float fP3 = sw3Var.p0(this.a);
        float fIntBitsToFloat = Float.intBitsToFloat(i2) - fP2;
        if (fP3 > fIntBitsToFloat) {
            fP3 = fIntBitsToFloat;
        }
        path2.addCircle(0.0f, fP3, fP2, direction);
        path2.addCircle(Float.intBitsToFloat(i), fP3, fP2, direction);
        float fP4 = sw3Var.p0(6.0f);
        float fP5 = sw3Var.p0(4.0f);
        float fP6 = sw3Var.p0(12.5f);
        float fP7 = sw3Var.p0(16.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) - (2.0f * fP6);
        float f = fIntBitsToFloat2 >= 0.0f ? fIntBitsToFloat2 : 0.0f;
        int i3 = ((int) (f / fP7)) + 1;
        if (i3 < 2) {
            i3 = 2;
        }
        float f2 = f / (i3 - 1);
        for (int i4 = 0; i4 < i3; i4++) {
            float f3 = (i4 * f2) + fP6;
            Path.Direction direction2 = Path.Direction.CW;
            path2.addCircle(f3, -fP5, fP4, direction2);
            path2.addCircle(f3, Float.intBitsToFloat(i2) + fP5, fP4, direction2);
        }
        path.op(path2, Path.Op.DIFFERENCE);
        return new ss9(new zt(path));
    }
}
