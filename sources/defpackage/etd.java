package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class etd extends eu0 {
    public final RectF D;
    public final du7 E;
    public final float[] F;
    public final Path G;
    public final tu7 H;

    public etd(oi8 oi8Var, tu7 tu7Var) {
        super(oi8Var, tu7Var);
        this.D = new RectF();
        du7 du7Var = new du7();
        this.E = du7Var;
        this.F = new float[8];
        this.G = new Path();
        this.H = tu7Var;
        du7Var.setAlpha(0);
        du7Var.setStyle(Paint.Style.FILL);
        du7Var.setColor(tu7Var.l);
    }

    @Override // defpackage.eu0, defpackage.ep4
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        tu7 tu7Var = this.H;
        float f = tu7Var.j;
        float f2 = tu7Var.k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.eu0
    public final void i(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        tu7 tu7Var = this.H;
        int iAlpha = Color.alpha(tu7Var.l);
        if (iAlpha == 0) {
            return;
        }
        int i2 = tu7Var.l;
        du7 du7Var = this.E;
        du7Var.setColor(i2);
        f82 f82Var = this.w.p;
        int iIntValue = (int) ((((iAlpha / 255.0f) * (f82Var == null ? 100 : ((Integer) f82Var.d()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        du7Var.setAlpha(iIntValue);
        if (kq4Var == null || Color.alpha(kq4Var.d) <= 0) {
            du7Var.clearShadowLayer();
        } else {
            du7Var.setShadowLayer(Math.max(kq4Var.a, Float.MIN_VALUE), kq4Var.b, kq4Var.c, kq4Var.d);
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = tu7Var.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = tu7Var.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, du7Var);
        }
    }
}
