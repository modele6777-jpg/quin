package com.canhub.cropper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ScaleGestureDetector;
import android.view.View;
import defpackage.af1;
import defpackage.ap;
import defpackage.jz2;
import defpackage.kz2;
import defpackage.lz2;
import defpackage.mz2;
import defpackage.pa7;
import defpackage.qc0;
import defpackage.t72;
import defpackage.uz2;
import defpackage.vz0;
import defpackage.vz2;
import defpackage.wz2;
import defpackage.xz2;
import defpackage.zz2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class CropOverlayView extends View {
    public Paint E0;
    public Paint F0;
    public Integer G0;
    public final Path H0;
    public final float[] I0;
    public final RectF J0;
    public int K0;
    public int L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    public zz2 R0;
    public boolean S0;
    public int T0;
    public int U0;
    public float V0;
    public mz2 W0;
    public lz2 X0;
    public kz2 Y0;
    public boolean Z0;
    public float a;
    public String a1;
    public Integer b;
    public float b1;
    public jz2 c;
    public int c1;
    public ScaleGestureDetector d;
    public final Rect d1;
    public boolean e;
    public boolean e1;
    public boolean f;
    public final float f1;
    public final xz2 g;
    public uz2 v;
    public final RectF w;
    public Paint x;
    public Paint y;
    public Paint z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f = true;
        this.g = new xz2();
        this.w = new RectF();
        this.H0 = new Path();
        this.I0 = new float[8];
        this.J0 = new RectF();
        this.V0 = this.T0 / this.U0;
        this.a1 = "";
        this.b1 = 20.0f;
        this.c1 = -1;
        this.d1 = new Rect();
        this.f1 = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());
    }

    public final boolean a(RectF rectF) {
        float f;
        float f2;
        Rect rect = vz0.a;
        float[] fArr = this.I0;
        float fN = vz0.n(fArr);
        float fP = vz0.p(fArr);
        float fO = vz0.o(fArr);
        float fL = vz0.l(fArr);
        float f3 = fArr[0];
        float f4 = fArr[6];
        RectF rectF2 = this.J0;
        if (f3 == f4 || fArr[1] == fArr[7]) {
            rectF2.set(fN, fP, fO, fL);
            return false;
        }
        float f5 = fArr[0];
        float f6 = fArr[1];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[6];
        float f10 = fArr[7];
        if (f10 < f6) {
            float f11 = fArr[3];
            if (f6 < f11) {
                float f12 = fArr[2];
                f = f10;
                f10 = f11;
                f2 = f9;
                f6 = f8;
                f9 = f12;
                f5 = f7;
            } else {
                f9 = f5;
                f10 = f6;
                f6 = f11;
                f5 = fArr[2];
                f2 = f7;
                f = f8;
            }
        } else {
            f = fArr[3];
            if (f6 > f) {
                f2 = fArr[2];
            } else {
                f2 = f5;
                f5 = f9;
                f = f6;
                f6 = f10;
                f9 = f7;
                f10 = f8;
            }
        }
        float f13 = (f6 - f) / (f5 - f2);
        float f14 = (-1.0f) / f13;
        float f15 = f - (f13 * f2);
        float f16 = f - (f2 * f14);
        float f17 = f10 - (f13 * f9);
        float f18 = f10 - (f9 * f14);
        float fCenterY = rectF.centerY() - rectF.top;
        float fCenterX = rectF.centerX();
        float f19 = rectF.left;
        float f20 = fCenterY / (fCenterX - f19);
        float f21 = -f20;
        float f22 = rectF.top;
        float f23 = f22 - (f19 * f20);
        float f24 = rectF.right;
        float f25 = f22 - (f21 * f24);
        float f26 = f13 - f20;
        float f27 = (f23 - f15) / f26;
        float fMax = Math.max(fN, f27 < f24 ? f27 : fN);
        float f28 = (f23 - f16) / (f14 - f20);
        if (f28 >= rectF.right) {
            f28 = fMax;
        }
        float fMax2 = Math.max(fMax, f28);
        float f29 = f14 - f21;
        float f30 = (f25 - f18) / f29;
        float fMax3 = Math.max(fMax2, f30 < rectF.right ? f30 : fMax2);
        float f31 = (f25 - f16) / f29;
        if (f31 <= rectF.left) {
            f31 = fO;
        }
        float fMin = Math.min(fO, f31);
        float f32 = (f25 - f17) / (f13 - f21);
        if (f32 <= rectF.left) {
            f32 = fMin;
        }
        float fMin2 = Math.min(fMin, f32);
        float f33 = (f23 - f17) / f26;
        if (f33 <= rectF.left) {
            f33 = fMin2;
        }
        float fMin3 = Math.min(fMin2, f33);
        float fMax4 = Math.max(fP, Math.max((f13 * fMax3) + f15, (f14 * fMin3) + f16));
        float fMin4 = Math.min(fL, Math.min((f14 * fMax3) + f18, (f13 * fMin3) + f17));
        rectF2.left = fMax3;
        rectF2.top = fMax4;
        rectF2.right = fMin3;
        rectF2.bottom = fMin4;
        return true;
    }

    public final void b(Canvas canvas, RectF rectF, float f, float f2) {
        lz2 lz2Var = this.X0;
        int i = lz2Var == null ? -1 : wz2.a[lz2Var.ordinal()];
        if (i == 1) {
            float f3 = this.a;
            kz2 kz2Var = this.Y0;
            int i2 = kz2Var == null ? -1 : wz2.b[kz2Var.ordinal()];
            if (i2 != -1) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        d(canvas, rectF, f, f2);
                        return;
                    } else {
                        ap.c();
                        return;
                    }
                }
                float f4 = rectF.left - f;
                float f5 = rectF.top - f;
                Paint paint = this.y;
                paint.getClass();
                canvas.drawCircle(f4, f5, f3, paint);
                float f6 = rectF.right + f;
                float f7 = rectF.top - f;
                Paint paint2 = this.y;
                paint2.getClass();
                canvas.drawCircle(f6, f7, f3, paint2);
                float f8 = rectF.left - f;
                float f9 = rectF.bottom + f;
                Paint paint3 = this.y;
                paint3.getClass();
                canvas.drawCircle(f8, f9, f3, paint3);
                float f10 = rectF.right + f;
                float f11 = rectF.bottom + f;
                Paint paint4 = this.y;
                paint4.getClass();
                canvas.drawCircle(f10, f11, f3, paint4);
                return;
            }
            return;
        }
        if (i == 2) {
            float fCenterX = rectF.centerX() - this.N0;
            float f12 = rectF.top - f;
            float fCenterX2 = this.N0 + rectF.centerX();
            float f13 = rectF.top - f;
            Paint paint5 = this.y;
            paint5.getClass();
            canvas.drawLine(fCenterX, f12, fCenterX2, f13, paint5);
            float fCenterX3 = rectF.centerX() - this.N0;
            float f14 = rectF.bottom + f;
            float fCenterX4 = rectF.centerX() + this.N0;
            float f15 = rectF.bottom + f;
            Paint paint6 = this.y;
            paint6.getClass();
            canvas.drawLine(fCenterX3, f14, fCenterX4, f15, paint6);
            return;
        }
        if (i != 3) {
            if (i == 4) {
                d(canvas, rectF, f, f2);
                return;
            } else {
                qc0.p("Unrecognized crop shape");
                return;
            }
        }
        float f16 = rectF.left - f;
        float fCenterY = rectF.centerY() - this.N0;
        float f17 = rectF.left - f;
        float fCenterY2 = this.N0 + rectF.centerY();
        Paint paint7 = this.y;
        paint7.getClass();
        canvas.drawLine(f16, fCenterY, f17, fCenterY2, paint7);
        float f18 = rectF.right + f;
        float fCenterY3 = rectF.centerY() - this.N0;
        float f19 = rectF.right + f;
        float fCenterY4 = rectF.centerY() + this.N0;
        Paint paint8 = this.y;
        paint8.getClass();
        canvas.drawLine(f18, fCenterY3, f19, fCenterY4, paint8);
    }

    public final void c(Canvas canvas) {
        if (this.z != null) {
            Paint paint = this.x;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF rectFG = this.g.g();
            rectFG.inset(strokeWidth, strokeWidth);
            float fWidth = rectFG.width() / 3.0f;
            float fHeight = rectFG.height() / 3.0f;
            lz2 lz2Var = this.X0;
            int i = lz2Var == null ? -1 : wz2.a[lz2Var.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                float f = rectFG.left + fWidth;
                float f2 = rectFG.right - fWidth;
                float f3 = rectFG.top;
                float f4 = rectFG.bottom;
                Paint paint2 = this.z;
                paint2.getClass();
                canvas.drawLine(f, f3, f, f4, paint2);
                float f5 = rectFG.top;
                float f6 = rectFG.bottom;
                Paint paint3 = this.z;
                paint3.getClass();
                canvas.drawLine(f2, f5, f2, f6, paint3);
                float f7 = rectFG.top + fHeight;
                float f8 = rectFG.bottom - fHeight;
                float f9 = rectFG.left;
                float f10 = rectFG.right;
                Paint paint4 = this.z;
                paint4.getClass();
                canvas.drawLine(f9, f7, f10, f7, paint4);
                float f11 = rectFG.left;
                float f12 = rectFG.right;
                Paint paint5 = this.z;
                paint5.getClass();
                canvas.drawLine(f11, f8, f12, f8, paint5);
                return;
            }
            if (i != 4) {
                qc0.p("Unrecognized crop shape");
                return;
            }
            float fWidth2 = (rectFG.width() / 2.0f) - strokeWidth;
            float fHeight2 = (rectFG.height() / 2.0f) - strokeWidth;
            float f13 = rectFG.left + fWidth;
            float f14 = rectFG.right - fWidth;
            float fSin = (float) (Math.sin(Math.acos((fWidth2 - fWidth) / fWidth2)) * ((double) fHeight2));
            float f15 = (rectFG.top + fHeight2) - fSin;
            float f16 = (rectFG.bottom - fHeight2) + fSin;
            Paint paint6 = this.z;
            paint6.getClass();
            canvas.drawLine(f13, f15, f13, f16, paint6);
            float f17 = (rectFG.top + fHeight2) - fSin;
            float f18 = (rectFG.bottom - fHeight2) + fSin;
            Paint paint7 = this.z;
            paint7.getClass();
            canvas.drawLine(f14, f17, f14, f18, paint7);
            float f19 = rectFG.top + fHeight;
            float f20 = rectFG.bottom - fHeight;
            float fCos = (float) (Math.cos(Math.asin((fHeight2 - fHeight) / fHeight2)) * ((double) fWidth2));
            float f21 = (rectFG.left + fWidth2) - fCos;
            float f22 = (rectFG.right - fWidth2) + fCos;
            Paint paint8 = this.z;
            paint8.getClass();
            canvas.drawLine(f21, f19, f22, f19, paint8);
            float f23 = (rectFG.left + fWidth2) - fCos;
            float f24 = (rectFG.right - fWidth2) + fCos;
            Paint paint9 = this.z;
            paint9.getClass();
            canvas.drawLine(f23, f20, f24, f20, paint9);
        }
    }

    public final void d(Canvas canvas, RectF rectF, float f, float f2) {
        float f3 = rectF.left - f;
        float f4 = rectF.top;
        float f5 = f4 + this.N0;
        Paint paint = this.y;
        paint.getClass();
        canvas.drawLine(f3, f4 - f2, f3, f5, paint);
        float f6 = rectF.left;
        float f7 = rectF.top - f;
        float f8 = f6 + this.N0;
        Paint paint2 = this.y;
        paint2.getClass();
        canvas.drawLine(f6 - f2, f7, f8, f7, paint2);
        float f9 = rectF.right + f;
        float f10 = rectF.top;
        float f11 = f10 + this.N0;
        Paint paint3 = this.y;
        paint3.getClass();
        canvas.drawLine(f9, f10 - f2, f9, f11, paint3);
        float f12 = rectF.right;
        float f13 = rectF.top - f;
        float f14 = f12 - this.N0;
        Paint paint4 = this.y;
        paint4.getClass();
        canvas.drawLine(f12 + f2, f13, f14, f13, paint4);
        float f15 = rectF.left - f;
        float f16 = rectF.bottom;
        float f17 = f16 - this.N0;
        Paint paint5 = this.y;
        paint5.getClass();
        canvas.drawLine(f15, f16 + f2, f15, f17, paint5);
        float f18 = rectF.left;
        float f19 = rectF.bottom + f;
        float f20 = f18 + this.N0;
        Paint paint6 = this.y;
        paint6.getClass();
        canvas.drawLine(f18 - f2, f19, f20, f19, paint6);
        float f21 = rectF.right + f;
        float f22 = rectF.bottom;
        float f23 = f22 - this.N0;
        Paint paint7 = this.y;
        paint7.getClass();
        canvas.drawLine(f21, f22 + f2, f21, f23, paint7);
        float f24 = rectF.right;
        float f25 = rectF.bottom + f;
        float f26 = f24 - this.N0;
        Paint paint8 = this.y;
        paint8.getClass();
        canvas.drawLine(f24 + f2, f25, f26, f25, paint8);
    }

    public final void e(RectF rectF) {
        float fWidth = rectF.width();
        xz2 xz2Var = this.g;
        if (fWidth < xz2Var.e()) {
            float fE = (xz2Var.e() - rectF.width()) / 2.0f;
            rectF.left -= fE;
            rectF.right += fE;
        }
        if (rectF.height() < xz2Var.d()) {
            float fD = (xz2Var.d() - rectF.height()) / 2.0f;
            rectF.top -= fD;
            rectF.bottom += fD;
        }
        if (rectF.width() > xz2Var.c()) {
            float fWidth2 = (rectF.width() - xz2Var.c()) / 2.0f;
            rectF.left += fWidth2;
            rectF.right -= fWidth2;
        }
        if (rectF.height() > xz2Var.b()) {
            float fHeight = (rectF.height() - xz2Var.b()) / 2.0f;
            rectF.top += fHeight;
            rectF.bottom -= fHeight;
        }
        a(rectF);
        RectF rectF2 = this.J0;
        if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
            float fMax = Math.max(rectF2.left, 0.0f);
            float fMax2 = Math.max(rectF2.top, 0.0f);
            float fMin = Math.min(rectF2.right, getWidth());
            float fMin2 = Math.min(rectF2.bottom, getHeight());
            if (rectF.left < fMax) {
                rectF.left = fMax;
            }
            if (rectF.top < fMax2) {
                rectF.top = fMax2;
            }
            if (rectF.right > fMin) {
                rectF.right = fMin;
            }
            if (rectF.bottom > fMin2) {
                rectF.bottom = fMin2;
            }
        }
        if (!this.S0 || Math.abs(rectF.width() - (rectF.height() * this.V0)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.V0) {
            float fAbs = Math.abs((rectF.height() * this.V0) - rectF.width()) / 2.0f;
            rectF.left += fAbs;
            rectF.right -= fAbs;
        } else {
            float fAbs2 = Math.abs((rectF.width() / this.V0) - rectF.height()) / 2.0f;
            rectF.top += fAbs2;
            rectF.bottom -= fAbs2;
        }
    }

    public final void f() {
        Rect rect = vz0.a;
        float[] fArr = this.I0;
        float fMax = Math.max(vz0.n(fArr), 0.0f);
        float fMax2 = Math.max(vz0.p(fArr), 0.0f);
        float fMin = Math.min(vz0.o(fArr), getWidth());
        float fMin2 = Math.min(vz0.l(fArr), getHeight());
        if (fMin <= fMax || fMin2 <= fMax2) {
            return;
        }
        RectF rectF = new RectF();
        this.e1 = true;
        float f = this.O0;
        float f2 = fMin - fMax;
        float f3 = f * f2;
        float f4 = fMin2 - fMax2;
        float f5 = f * f4;
        Rect rect2 = this.d1;
        int iWidth = rect2.width();
        xz2 xz2Var = this.g;
        if (iWidth > 0 && rect2.height() > 0) {
            float f6 = (rect2.left / xz2Var.k) + fMax;
            rectF.left = f6;
            rectF.top = (rect2.top / xz2Var.l) + fMax2;
            rectF.right = (rect2.width() / xz2Var.k) + f6;
            rectF.bottom = (rect2.height() / xz2Var.l) + rectF.top;
            rectF.left = Math.max(fMax, rectF.left);
            rectF.top = Math.max(fMax2, rectF.top);
            rectF.right = Math.min(fMin, rectF.right);
            rectF.bottom = Math.min(fMin2, rectF.bottom);
        } else if (!this.S0 || fMin <= fMax || fMin2 <= fMax2) {
            rectF.left = fMax + f3;
            rectF.top = fMax2 + f5;
            rectF.right = fMin - f3;
            rectF.bottom = fMin2 - f5;
        } else if (f2 / f4 > this.V0) {
            rectF.top = fMax2 + f5;
            rectF.bottom = fMin2 - f5;
            float width = getWidth() / 2.0f;
            this.V0 = this.T0 / this.U0;
            float fMax3 = Math.max(xz2Var.e(), rectF.height() * this.V0) / 2.0f;
            rectF.left = width - fMax3;
            rectF.right = width + fMax3;
        } else {
            rectF.left = fMax + f3;
            rectF.right = fMin - f3;
            float height = getHeight() / 2.0f;
            float fMax4 = Math.max(xz2Var.d(), rectF.width() / this.V0) / 2.0f;
            rectF.top = height - fMax4;
            rectF.bottom = height + fMax4;
        }
        e(rectF);
        xz2Var.getClass();
        xz2Var.a.set(rectF);
    }

    public final void g() {
        if (this.e1) {
            setCropWindowRect(vz0.b);
            f();
            invalidate();
        }
    }

    public final int getAspectRatioX() {
        return this.T0;
    }

    public final int getAspectRatioY() {
        return this.U0;
    }

    public final kz2 getCornerShape() {
        return this.Y0;
    }

    public final lz2 getCropShape() {
        return this.X0;
    }

    public final RectF getCropWindowRect() {
        return this.g.g();
    }

    public final mz2 getGuidelines() {
        return this.W0;
    }

    public final Rect getInitialCropWindowRect() {
        return this.d1;
    }

    public final void h(int i, int i2, float[] fArr) {
        float[] fArr2 = this.I0;
        if (fArr == null || !Arrays.equals(fArr2, fArr)) {
            if (fArr == null) {
                Arrays.fill(fArr2, 0.0f);
            } else {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            }
            this.K0 = i;
            this.L0 = i2;
            RectF rectFG = this.g.g();
            if (rectFG.width() == 0.0f || rectFG.height() == 0.0f) {
                f();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        Paint paint;
        canvas.getClass();
        super.onDraw(canvas);
        xz2 xz2Var = this.g;
        RectF rectFG = xz2Var.g();
        Rect rect = vz0.a;
        float[] fArr = this.I0;
        float fMax = Math.max(vz0.n(fArr), 0.0f);
        float fMax2 = Math.max(vz0.p(fArr), 0.0f);
        float fMin = Math.min(vz0.o(fArr), getWidth());
        float fMin2 = Math.min(vz0.l(fArr), getHeight());
        lz2 lz2Var = this.X0;
        int i3 = lz2Var == null ? -1 : wz2.a[lz2Var.ordinal()];
        Path path = this.H0;
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i = 4;
            i2 = 3;
            if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
                float f = rectFG.top;
                Paint paint2 = this.E0;
                paint2.getClass();
                canvas2 = canvas;
                canvas2.drawRect(fMax, fMax2, fMin, f, paint2);
                float f2 = rectFG.bottom;
                Paint paint3 = this.E0;
                paint3.getClass();
                canvas2.drawRect(fMax, f2, fMin, fMin2, paint3);
                float f3 = rectFG.top;
                float f4 = rectFG.left;
                float f5 = rectFG.bottom;
                Paint paint4 = this.E0;
                paint4.getClass();
                canvas2.drawRect(fMax, f3, f4, f5, paint4);
                float f6 = rectFG.right;
                float f7 = rectFG.top;
                float f8 = rectFG.bottom;
                Paint paint5 = this.E0;
                paint5.getClass();
                canvas2.drawRect(f6, f7, fMin, f8, paint5);
            } else {
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.close();
                canvas.save();
                canvas.clipOutPath(path);
                Paint paint6 = this.E0;
                paint6.getClass();
                canvas2 = canvas;
                canvas2.drawRect(fMax, fMax2, fMin, fMin2, paint6);
                canvas2.restore();
            }
        } else {
            if (i3 != 4) {
                qc0.p("Unrecognized crop shape");
                return;
            }
            path.reset();
            float f9 = rectFG.left;
            float f10 = rectFG.top;
            i = 4;
            float f11 = rectFG.right;
            float f12 = rectFG.bottom;
            i2 = 3;
            RectF rectF = this.w;
            rectF.set(f9, f10, f11, f12);
            path.addOval(rectF, Path.Direction.CW);
            canvas.save();
            canvas.clipOutPath(path);
            Paint paint7 = this.E0;
            paint7.getClass();
            canvas.drawRect(fMax, fMax2, fMin, fMin2, paint7);
            canvas.restore();
            canvas2 = canvas;
        }
        RectF rectF2 = xz2Var.a;
        if (rectF2.width() >= 100.0f && rectF2.height() >= 100.0f) {
            mz2 mz2Var = this.W0;
            if (mz2Var == mz2.b) {
                c(canvas);
            } else if (mz2Var == mz2.a && this.R0 != null) {
                c(canvas);
            }
        }
        jz2 jz2Var = this.c;
        this.y = af1.V(jz2Var != null ? jz2Var.Q0 : -1, jz2Var != null ? jz2Var.N0 : 0.0f);
        if (this.Z0) {
            RectF rectFG2 = xz2Var.g();
            float f13 = (rectFG2.left + rectFG2.right) / 2.0f;
            float f14 = rectFG2.top - 50.0f;
            Paint paint8 = this.F0;
            if (paint8 != null) {
                paint8.setTextSize(this.b1);
                paint8.setColor(this.c1);
            }
            String str = this.a1;
            Paint paint9 = this.F0;
            paint9.getClass();
            canvas2.drawText(str, f13, f14, paint9);
            canvas2.save();
        }
        Paint paint10 = this.x;
        if (paint10 != null) {
            float strokeWidth = paint10.getStrokeWidth();
            RectF rectFG3 = xz2Var.g();
            float f15 = strokeWidth / 2.0f;
            rectFG3.inset(f15, f15);
            lz2 lz2Var2 = this.X0;
            int i4 = lz2Var2 == null ? -1 : wz2.a[lz2Var2.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == i2) {
                Paint paint11 = this.x;
                paint11.getClass();
                canvas2.drawRect(rectFG3, paint11);
            } else if (i4 != i) {
                qc0.p("Unrecognized crop shape");
                return;
            } else {
                Paint paint12 = this.x;
                paint12.getClass();
                canvas2.drawOval(rectFG3, paint12);
            }
        }
        if (this.y != null) {
            Paint paint13 = this.x;
            float strokeWidth2 = paint13 != null ? paint13.getStrokeWidth() : 0.0f;
            Paint paint14 = this.y;
            paint14.getClass();
            float strokeWidth3 = paint14.getStrokeWidth();
            float f16 = (strokeWidth3 - strokeWidth2) / 2.0f;
            float f17 = strokeWidth3 / 2.0f;
            float f18 = f17 + f16;
            lz2 lz2Var3 = this.X0;
            int i5 = lz2Var3 == null ? -1 : wz2.a[lz2Var3.ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                f17 += this.M0;
            } else if (i5 != 4) {
                qc0.p("Unrecognized crop shape");
                return;
            }
            RectF rectFG4 = xz2Var.g();
            rectFG4.inset(f17, f17);
            b(canvas2, rectFG4, f16, f18);
            if (this.Y0 == kz2.b) {
                Integer num = this.b;
                if (num != null) {
                    int iIntValue = num.intValue();
                    paint = new Paint();
                    paint.setColor(iIntValue);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAntiAlias(true);
                } else {
                    paint = null;
                }
                this.y = paint;
                b(canvas2, rectFG4, f16, f18);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            RectF rectFG5 = xz2Var.g();
            List<Rect> systemGestureExclusionRects = getSystemGestureExclusionRects();
            systemGestureExclusionRects.getClass();
            Rect rect2 = systemGestureExclusionRects.size() > 0 ? systemGestureExclusionRects.get(0) : new Rect();
            List<Rect> systemGestureExclusionRects2 = getSystemGestureExclusionRects();
            systemGestureExclusionRects2.getClass();
            Rect rect3 = 1 < systemGestureExclusionRects2.size() ? systemGestureExclusionRects2.get(1) : new Rect();
            List<Rect> systemGestureExclusionRects3 = getSystemGestureExclusionRects();
            systemGestureExclusionRects3.getClass();
            Rect rect4 = 2 < systemGestureExclusionRects3.size() ? systemGestureExclusionRects3.get(2) : new Rect();
            float f19 = rectFG5.left;
            float f20 = this.P0;
            int i6 = (int) (f19 - f20);
            rect2.left = i6;
            int i7 = (int) (rectFG5.right + f20);
            rect2.right = i7;
            float f21 = rectFG5.top;
            int i8 = (int) (f21 - f20);
            rect2.top = i8;
            float f22 = this.f1;
            float f23 = 0.3f * f22;
            rect2.bottom = (int) (i8 + f23);
            rect3.left = i6;
            rect3.right = i7;
            float f24 = rectFG5.bottom;
            int i9 = (int) (((f21 + f24) / 2.0f) - (0.2f * f22));
            rect3.top = i9;
            rect3.bottom = (int) ((f22 * 0.4f) + i9);
            rect4.left = rect2.left;
            rect4.right = rect2.right;
            int i10 = (int) (f24 + f20);
            rect4.bottom = i10;
            rect4.top = (int) (i10 - f23);
            setSystemGestureExclusionRects(t72.I(rect2, rect3, rect4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x037e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0390  */
    /* JADX WARN: Code duplicated, block: B:135:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:138:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:169:0x045e  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r2 != 3) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAspectRatioX(int i) {
        if (i <= 0) {
            qc0.j("Cannot set aspect ratio value to a number less than or equal to 0.");
            return;
        }
        if (this.T0 != i) {
            this.T0 = i;
            this.V0 = i / this.U0;
            if (this.e1) {
                f();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i) {
        if (i <= 0) {
            qc0.j("Cannot set aspect ratio value to a number less than or equal to 0.");
            return;
        }
        if (this.U0 != i) {
            this.U0 = i;
            this.V0 = this.T0 / i;
            if (this.e1) {
                f();
                invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float f) {
        this.a = f;
    }

    public final void setCropCornerShape(kz2 kz2Var) {
        kz2Var.getClass();
        if (this.Y0 != kz2Var) {
            this.Y0 = kz2Var;
            invalidate();
        }
    }

    public final void setCropLabelText(String str) {
        if (str != null) {
            this.a1 = str;
        }
    }

    public final void setCropLabelTextColor(int i) {
        this.c1 = i;
        invalidate();
    }

    public final void setCropLabelTextSize(float f) {
        this.b1 = f;
        invalidate();
    }

    public final void setCropShape(lz2 lz2Var) {
        lz2Var.getClass();
        if (this.X0 != lz2Var) {
            this.X0 = lz2Var;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(uz2 uz2Var) {
        this.v = uz2Var;
    }

    public final void setCropWindowRect(RectF rectF) {
        rectF.getClass();
        xz2 xz2Var = this.g;
        xz2Var.getClass();
        xz2Var.a.set(rectF);
    }

    public final void setCropperTextLabelVisibility(boolean z) {
        this.Z0 = z;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean z) {
        if (this.S0 != z) {
            this.S0 = z;
            if (this.e1) {
                f();
                invalidate();
            }
        }
    }

    public final void setGuidelines(mz2 mz2Var) {
        mz2Var.getClass();
        if (this.W0 != mz2Var) {
            this.W0 = mz2Var;
            if (this.e1) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(jz2 jz2Var) {
        uz2 uz2Var;
        jz2Var.getClass();
        float f = jz2Var.z1;
        int i = jz2Var.A1;
        int i2 = jz2Var.a1;
        int i3 = jz2Var.Z0;
        int i4 = jz2Var.Y0;
        int i5 = jz2Var.X0;
        int i6 = jz2Var.K0;
        int i7 = jz2Var.J0;
        boolean z = jz2Var.I0;
        boolean zT = pa7.t(this.c, jz2Var);
        jz2 jz2Var2 = this.c;
        boolean z2 = (jz2Var2 != null && z == jz2Var2.I0 && i7 == jz2Var2.J0 && i6 == jz2Var2.K0) ? false : true;
        this.c = jz2Var;
        float f2 = i5;
        xz2 xz2Var = this.g;
        xz2Var.g = f2;
        float f3 = i4;
        xz2Var.h = f3;
        float f4 = i3;
        xz2Var.i = f4;
        float f5 = i2;
        xz2Var.j = f5;
        if (zT) {
            return;
        }
        xz2Var.c = jz2Var.V0;
        xz2Var.d = jz2Var.W0;
        xz2Var.g = f2;
        xz2Var.h = f3;
        xz2Var.i = f4;
        xz2Var.j = f5;
        this.c1 = i;
        this.b1 = f;
        String str = jz2Var.B1;
        if (str == null) {
            str = "";
        }
        this.a1 = str;
        this.Z0 = jz2Var.y;
        this.a = jz2Var.e;
        this.Y0 = jz2Var.d;
        this.X0 = jz2Var.c;
        this.Q0 = jz2Var.f;
        setEnabled(jz2Var.F0);
        this.W0 = jz2Var.v;
        this.S0 = z;
        setAspectRatioX(i7);
        setAspectRatioY(i6);
        boolean z3 = jz2Var.Z;
        this.e = z3;
        if (z3 && this.d == null) {
            this.d = new ScaleGestureDetector(getContext(), new vz2(this));
        }
        this.f = jz2Var.E0;
        this.P0 = jz2Var.g;
        this.O0 = jz2Var.H0;
        this.x = af1.V(jz2Var.M0, jz2Var.L0);
        this.M0 = jz2Var.O0;
        this.N0 = jz2Var.P0;
        this.b = Integer.valueOf(jz2Var.R0);
        this.y = af1.V(jz2Var.Q0, jz2Var.N0);
        this.z = af1.V(jz2Var.T0, jz2Var.S0);
        int i8 = jz2Var.U0;
        Paint paint = new Paint();
        paint.setColor(i8);
        this.E0 = paint;
        Paint paint2 = new Paint();
        paint2.setStrokeWidth(1.0f);
        paint2.setTextSize(f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(i);
        this.F0 = paint2;
        if (z2) {
            f();
        }
        invalidate();
        if (!z2 || (uz2Var = this.v) == null) {
            return;
        }
        ((CropImageView) uz2Var).c(false, true);
    }

    public final void setInitialCropWindowRect(Rect rect) {
        if (rect == null) {
            rect = vz0.a;
        }
        this.d1.set(rect);
        if (this.e1) {
            f();
            invalidate();
            uz2 uz2Var = this.v;
            if (uz2Var != null) {
                ((CropImageView) uz2Var).c(false, true);
            }
        }
    }

    public final void setSnapRadius(float f) {
        this.Q0 = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropOverlayView(Context context) {
        this(context, null);
        context.getClass();
    }
}
