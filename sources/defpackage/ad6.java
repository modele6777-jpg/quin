package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ad6 implements ep4, zt0, zl2 {
    public final boolean a;
    public final gg8 b;
    public final gg8 c;
    public final Path d;
    public final du7 e;
    public final RectF f;
    public final ArrayList g;
    public final int h;
    public final xc6 i;
    public final f82 j;
    public final xc6 k;
    public final xc6 l;
    public final oi8 m;
    public final int n;
    public final f82 o;
    public float p;

    public ad6(oi8 oi8Var, uh8 uh8Var, eu0 eu0Var, zc6 zc6Var) {
        Object obj = null;
        this.b = new gg8(obj);
        this.c = new gg8(obj);
        Path path = new Path();
        this.d = path;
        this.e = new du7(1, 0);
        this.f = new RectF();
        this.g = new ArrayList();
        this.p = 0.0f;
        this.a = zc6Var.g;
        this.m = oi8Var;
        this.h = zc6Var.a;
        path.setFillType(zc6Var.b);
        this.n = (int) (uh8Var.b() / 32.0f);
        du0 du0VarC0 = zc6Var.c.c0();
        this.i = (xc6) du0VarC0;
        du0VarC0.a(this);
        eu0Var.d(du0VarC0);
        du0 du0VarC1 = zc6Var.d.c0();
        this.j = (f82) du0VarC1;
        du0VarC1.a(this);
        eu0Var.d(du0VarC1);
        du0 du0VarC2 = zc6Var.e.c0();
        this.k = (xc6) du0VarC2;
        du0VarC2.a(this);
        eu0Var.d(du0VarC2);
        du0 du0VarC3 = zc6Var.f.c0();
        this.l = (xc6) du0VarC3;
        du0VarC3.a(this);
        eu0Var.d(du0VarC3);
        if (eu0Var.j() != null) {
            f82 f82VarC0 = ((lx) eu0Var.j().b).c0();
            this.o = f82VarC0;
            f82VarC0.a(this);
            eu0Var.d(f82VarC0);
        }
    }

    @Override // defpackage.zt0
    public final void a() {
        this.m.invalidateSelf();
    }

    @Override // defpackage.zl2
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            zl2 zl2Var = (zl2) list2.get(i);
            if (zl2Var instanceof h1a) {
                this.g.add((h1a) zl2Var);
            }
        }
    }

    @Override // defpackage.ep4
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.d;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((h1a) arrayList.get(i)).e(), matrix);
                i++;
            }
        }
    }

    public final int d() {
        float f = this.k.d;
        float f2 = this.n;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.l.d * f2);
        int iRound3 = Math.round(this.i.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    @Override // defpackage.ep4
    public final void f(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.a) {
            return;
        }
        Path path = this.d;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((h1a) arrayList.get(i2)).e(), matrix);
            i2++;
        }
        path.computeBounds(this.f, false);
        int i3 = this.h;
        xc6 xc6Var = this.i;
        xc6 xc6Var2 = this.l;
        xc6 xc6Var3 = this.k;
        if (i3 == 1) {
            long jD = d();
            gg8 gg8Var = this.b;
            linearGradient = (LinearGradient) gg8Var.c(jD);
            if (linearGradient == null) {
                PointF pointF = (PointF) xc6Var3.d();
                PointF pointF2 = (PointF) xc6Var2.d();
                wc6 wc6Var = (wc6) xc6Var.d();
                int[] iArr3 = wc6Var.b;
                float[] fArr2 = wc6Var.a;
                if (iArr3.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArr3[0], iArr3[0]};
                } else {
                    iArr2 = iArr3;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                gg8Var.e(jD, linearGradient);
            }
        } else {
            long jD2 = d();
            gg8 gg8Var2 = this.c;
            RadialGradient radialGradient = (RadialGradient) gg8Var2.c(jD2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) xc6Var3.d();
                PointF pointF4 = (PointF) xc6Var2.d();
                wc6 wc6Var2 = (wc6) xc6Var.d();
                int[] iArr4 = wc6Var2.b;
                float[] fArr3 = wc6Var2.a;
                if (iArr4.length < 2) {
                    iArr = new int[]{iArr4[0], iArr4[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArr4;
                }
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                gg8Var2.e(jD2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        du7 du7Var = this.e;
        du7Var.setShader(linearGradient);
        f82 f82Var = this.o;
        if (f82Var != null) {
            float fFloatValue = ((Float) f82Var.d()).floatValue();
            if (fFloatValue == 0.0f) {
                du7Var.setMaskFilter(null);
            } else if (fFloatValue != this.p) {
                du7Var.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.p = fFloatValue;
        }
        float fIntValue = ((Integer) this.j.d()).intValue() / 100.0f;
        du7Var.setAlpha(aw8.c((int) (i * fIntValue)));
        if (kq4Var != null) {
            kq4Var.a((int) (fIntValue * 255.0f), du7Var);
        }
        canvas.drawPath(path, du7Var);
    }
}
