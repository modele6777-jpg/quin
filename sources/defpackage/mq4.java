package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mq4 implements zt0 {
    public final eu0 a;
    public final eu0 b;
    public final f82 c;
    public final f82 d;
    public final f82 e;
    public final f82 f;
    public final f82 g;
    public Matrix h;

    public mq4(eu0 eu0Var, eu0 eu0Var2, a82 a82Var) {
        this.b = eu0Var;
        this.a = eu0Var2;
        du0 du0VarC0 = ((kx) a82Var.c).c0();
        this.c = (f82) du0VarC0;
        du0VarC0.a(this);
        eu0Var2.d(du0VarC0);
        f82 f82VarC0 = ((lx) a82Var.d).c0();
        this.d = f82VarC0;
        f82VarC0.a(this);
        eu0Var2.d(f82VarC0);
        f82 f82VarC1 = ((lx) a82Var.b).c0();
        this.e = f82VarC1;
        f82VarC1.a(this);
        eu0Var2.d(f82VarC1);
        f82 f82VarC2 = ((lx) a82Var.e).c0();
        this.f = f82VarC2;
        f82VarC2.a(this);
        eu0Var2.d(f82VarC2);
        f82 f82VarC3 = ((lx) a82Var.f).c0();
        this.g = f82VarC3;
        f82VarC3.a(this);
        eu0Var2.d(f82VarC3);
    }

    @Override // defpackage.zt0
    public final void a() {
        this.b.a();
    }

    public final kq4 b(Matrix matrix, int i) {
        float fI = this.e.i() * 0.017453292f;
        float fFloatValue = ((Float) this.f.d()).floatValue();
        double d = fI;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.g.d()).floatValue();
        int iIntValue = ((Integer) this.c.d()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.d.d()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        kq4 kq4Var = new kq4();
        kq4Var.a = fFloatValue2 * 0.33f;
        kq4Var.b = fSin;
        kq4Var.c = fCos;
        kq4Var.d = iArgb;
        kq4Var.e = null;
        kq4Var.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.d().invert(this.h);
        kq4Var.c(this.h);
        return kq4Var;
    }
}
