package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z58 implements LineHeightSpan {
    public final float a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final int f;
    public int g = Integer.MIN_VALUE;
    public int v = Integer.MIN_VALUE;
    public int w = Integer.MIN_VALUE;
    public int x = Integer.MIN_VALUE;
    public int y;
    public int z;

    public z58(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.a = f;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = f2;
        this.f = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            j37.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.b;
        int i7 = this.f;
        boolean z3 = this.d;
        boolean z4 = this.c;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.g == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.a);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i9);
                }
                int i10 = (int) dCeil;
                int i11 = fontMetricsInt.descent;
                int i12 = i10 + i11;
                this.w = i12;
                int i13 = i12 - iCeil;
                this.v = i13;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i13 = fontMetricsInt.ascent;
                    }
                    this.g = i13;
                    if (z3) {
                        i12 = i11;
                    }
                    this.x = i12;
                    this.y = fontMetricsInt.ascent - i13;
                    this.z = i12 - i11;
                } else if (i7 == 2) {
                    int i14 = fontMetricsInt.ascent;
                    this.g = z4 ? Math.max(i14, i13) : Math.min(i14, i13);
                    int i15 = fontMetricsInt.descent;
                    int i16 = this.w;
                    this.x = z3 ? Math.min(i15, i16) : Math.max(i15, i16);
                    this.y = 0;
                    this.z = 0;
                }
            } else {
                int i17 = fontMetricsInt.ascent;
                this.v = i17;
                int i18 = fontMetricsInt.descent;
                this.w = i18;
                this.g = i17;
                this.x = i18;
                this.y = 0;
                this.z = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.g : this.v;
        fontMetricsInt.descent = z2 ? this.x : this.w;
    }
}
