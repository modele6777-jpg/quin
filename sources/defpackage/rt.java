package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rt implements dy9 {
    public final Paint a;
    public int b = 3;
    public Shader c;
    public c82 d;
    public au e;

    public rt(Paint paint) {
        this.a = paint;
    }

    public final long a() {
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        return i >= 29 ? ocg.a.a(paint) : abg.c(paint.getColor());
    }

    public final int b() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : st.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int c() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : st.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void d(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void e(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        int i2 = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i2 >= 29) {
            ocg.a.b(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(bp.X(i)));
        }
    }

    public final void f(long j) {
        int i = Build.VERSION.SDK_INT;
        Paint paint = this.a;
        if (i >= 29) {
            ocg.a.c(paint, j);
        } else {
            paint.setColor(abg.Z(j));
        }
    }

    public final void g(c82 c82Var) {
        this.d = c82Var;
        this.a.setColorFilter(c82Var != null ? c82Var.a : null);
    }

    public final void h(int i) {
        this.a.setFilterBitmap(!(i == 0));
    }

    public final void i(au auVar) {
        this.a.setPathEffect(auVar != null ? auVar.a : null);
        this.e = auVar;
    }

    public final void j(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    public final void k(int i) {
        Paint.Cap cap;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else {
            cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
        }
        this.a.setStrokeCap(cap);
    }

    public final void l(int i) {
        Paint.Join join;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        this.a.setStrokeJoin(join);
    }

    public final void m(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void n(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
