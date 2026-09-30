package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nea extends ReplacementSpan {
    public final float a;
    public final int b;
    public final float c;
    public final int d;
    public final float e;
    public final float f;
    public final int g;
    public Paint.FontMetricsInt v;
    public int w;
    public int x;
    public boolean y;

    public nea(float f, int i, float f2, int i2, sw3 sw3Var, int i3) {
        float fQ0 = i == 0 ? sw3Var.Q0(w6c.r(4294967296L, f)) : 0.0f;
        float fQ1 = i2 == 0 ? sw3Var.Q0(w6c.r(4294967296L, f2)) : 0.0f;
        this.a = f;
        this.b = i;
        this.c = f2;
        this.d = i2;
        this.e = fQ0;
        this.f = fQ1;
        this.g = i3;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.v;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        pa7.g0("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.y) {
            j37.c("PlaceholderSpan is not laid out yet.");
        }
        return this.x;
    }

    public final int c() {
        if (!this.y) {
            j37.c("PlaceholderSpan is not laid out yet.");
        }
        return this.w;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        this.y = true;
        float textSize = paint.getTextSize();
        this.v = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            j37.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.b;
        if (i3 == 0) {
            f = this.e;
        } else {
            if (i3 != 1) {
                j37.b("Unsupported unit.");
                oo3.f();
                return 0;
            }
            f = this.a * textSize;
        }
        this.w = (int) Math.ceil(f);
        int i4 = this.d;
        if (i4 == 0) {
            f2 = this.f;
        } else {
            if (i4 != 1) {
                j37.b("Unsupported unit.");
                oo3.f();
                return 0;
            }
            f2 = this.c * textSize;
        }
        this.x = (int) Math.ceil(f2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.g) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = b() + iB;
                    }
                    break;
                default:
                    j37.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
