package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lp implements vl1 {
    public Canvas a = mp.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.vl1
    public final void a(long j, long j2, dy9 dy9Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), urg.E(dy9Var));
    }

    @Override // defpackage.vl1
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, dy9 dy9Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, urg.E(dy9Var));
    }

    @Override // defpackage.vl1
    public final void c(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.vl1
    public final void d(zt ztVar, dy9 dy9Var) {
        Canvas canvas = this.a;
        if (ztVar instanceof zt) {
            canvas.drawPath(ztVar.a, urg.E(dy9Var));
        } else {
            s8f.i("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.vl1
    public final void e(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.vl1
    public final void f(zt ztVar, int i) {
        Canvas canvas = this.a;
        if (ztVar instanceof zt) {
            canvas.clipPath(ztVar.a, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
        } else {
            s8f.i("Unable to obtain android.graphics.Path");
        }
    }

    @Override // defpackage.vl1
    public final void g() {
        this.a.save();
    }

    @Override // defpackage.vl1
    public final void h(float f, float f2, float f3, float f4, float f5, float f6, dy9 dy9Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, urg.E(dy9Var));
    }

    @Override // defpackage.vl1
    public final void i() {
        ok8.s(this.a, false);
    }

    @Override // defpackage.vl1
    public final void j(cv6 cv6Var, long j, long j2, long j3, long j4, dy9 dy9Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapO = abg.o(cv6Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapO, rect, rect2, urg.E(dy9Var));
    }

    @Override // defpackage.vl1
    public final void k(float[] fArr) {
        if (lmg.k0(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        hkg.L0(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.vl1
    public final void l(hkb hkbVar, dy9 dy9Var) {
        this.a.saveLayer(hkbVar.a, hkbVar.b, hkbVar.c, hkbVar.d, urg.E(dy9Var), 31);
    }

    @Override // defpackage.vl1
    public final void m(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.vl1
    public final void n(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.vl1
    public final void o() {
        this.a.restore();
    }

    @Override // defpackage.vl1
    public final void p(float f, long j, dy9 dy9Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, urg.E(dy9Var));
    }

    @Override // defpackage.vl1
    public final void q(cv6 cv6Var, long j, dy9 dy9Var) {
        this.a.drawBitmap(abg.o(cv6Var), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), urg.E(dy9Var));
    }

    @Override // defpackage.vl1
    public final void s(float f, float f2, float f3, float f4, dy9 dy9Var) {
        this.a.drawRect(f, f2, f3, f4, urg.E(dy9Var));
    }

    @Override // defpackage.vl1
    public final void t() {
        ok8.s(this.a, true);
    }
}
