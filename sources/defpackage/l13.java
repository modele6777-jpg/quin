package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l13 implements LeadingMarginSpan {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public l13(float f, float f2, float f3, sw3 sw3Var, float f4) {
        this.a = f;
        this.b = f2;
        int iL = ym8.L(f + f3);
        this.c = iL;
        this.d = ym8.L(f4) - iL;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i, final int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        Integer numValueOf;
        if (canvas == null) {
            return;
        }
        final float f = (i3 + i5) / 2.0f;
        int i8 = i - this.c;
        if (i8 < 0) {
            i8 = 0;
        }
        final int i9 = i8;
        charSequence.getClass();
        if (((Spanned) charSequence).getSpanStart(this) != i6 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        paint.setStyle(Paint.Style.FILL);
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
        x16 x16Var = new x16(this) { // from class: k13
            @Override // defpackage.x16
            public final Object invoke() {
                long j = jFloatToRawIntBits;
                float fC = ald.c(j) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
                v6c v6cVarB = w6c.b(z5c.g(0L, j), jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2);
                new us9(v6cVarB);
                float f2 = i9;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f3 = f;
                if (w6c.o(v6cVarB)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (v6cVarB.e >> 32));
                    canvas2.drawRoundRect(f2, f3 - (v6cVarB.a() / 2.0f), (v6cVarB.b() * i2) + f2, (v6cVarB.a() / 2.0f) + f3, fIntBitsToFloat, fIntBitsToFloat, paint2);
                } else {
                    zt ztVarA = cu.a();
                    zt.c(ztVarA, v6cVarB);
                    canvas2.save();
                    canvas2.translate(f2, f3 - (v6cVarB.a() / 2.0f));
                    canvas2.drawPath(ztVarA.a, paint2);
                    canvas2.restore();
                }
                return wef.a;
            }
        };
        if (Float.isNaN(Float.NaN)) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(Double.NaN));
        }
        x16Var.invoke();
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        int i = this.d;
        if (i >= 0) {
            return 0;
        }
        return Math.abs(i);
    }
}
