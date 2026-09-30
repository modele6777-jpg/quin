package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ub6 extends sv3 implements pn4 {
    public final tr F0;
    public final ls4 G0;
    public final bx9 H0;

    public ub6(obe obeVar, tr trVar, ls4 ls4Var, bx9 bx9Var) {
        this.F0 = trVar;
        this.G0 = ls4Var;
        this.H0 = bx9Var;
        l1(obeVar);
    }

    public static boolean o1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        boolean zO1;
        char c;
        long j;
        vv7 vv7Var = (vv7) im2Var;
        xl1 xl1Var = vv7Var.a;
        long jF = xl1Var.f();
        tr trVar = this.F0;
        trVar.l(jF);
        if (ald.e(xl1Var.f())) {
            vv7Var.a();
            return;
        }
        vv7Var.a();
        trVar.d.getValue();
        Canvas canvasB = mp.b(xl1Var.b.p());
        ls4 ls4Var = this.G0;
        boolean zF = ls4.f(ls4Var.f);
        bx9 bx9Var = this.H0;
        if (zF) {
            zO1 = o1(270.0f, (((long) Float.floatToRawIntBits(vv7Var.p0(bx9Var.b(vv7Var.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (xl1Var.f() & 4294967295L)))) << 32), ls4Var.c(), canvasB);
        } else {
            zO1 = false;
        }
        if (ls4.f(ls4Var.d)) {
            c = ' ';
            j = 4294967295L;
            zO1 = o1(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(vv7Var.p0(bx9Var.b))) & 4294967295L), ls4Var.e(), canvasB) || zO1;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (ls4.f(ls4Var.g)) {
            zO1 = o1(90.0f, (((long) Float.floatToRawIntBits(vv7Var.p0(bx9Var.c(vv7Var.getLayoutDirection())) + (-((float) ym8.L(Float.intBitsToFloat((int) (xl1Var.f() >> c))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c), ls4Var.d(), canvasB) || zO1;
        }
        if (ls4.f(ls4Var.e)) {
            EdgeEffect edgeEffectB = ls4Var.b();
            zO1 = o1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (xl1Var.f() >> c)))) << c) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (xl1Var.f() & j))) + vv7Var.p0(bx9Var.d))) & j), edgeEffectB, canvasB) || zO1;
        }
        if (zO1) {
            trVar.g();
        }
    }
}
