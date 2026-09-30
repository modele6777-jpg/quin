package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qte {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public p90 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final z58[] n;
    public final Rect o = new Rect();
    public a82 p;

    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:117:0x0218  */
    /* JADX WARN: Code duplicated, block: B:119:0x021d  */
    /* JADX WARN: Code duplicated, block: B:120:0x021f  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x019d A[PHI: r14
  0x019d: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:94:0x01af, B:87:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    public qte(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, hv7 hv7Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutF;
        boolean z2;
        int i10;
        z58[] z58VarArr;
        int i11;
        int i12;
        long jA;
        int i13;
        long j;
        char c;
        int i14;
        long jA2;
        int i15;
        int i16;
        long jA3;
        ?? r13;
        boolean zY;
        int topPadding;
        boolean zX;
        int i17;
        Paint.FontMetricsInt fontMetricsInt;
        boolean z3;
        ?? r15;
        z58 z58Var;
        z58 z58Var2;
        int i18;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = vte.b(i2);
        Layout.Alignment alignment = kme.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : kme.b : kme.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, pu0.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = hv7Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || hv7Var.c() > f || z4) {
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutF = hcc.f(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (iCeil < 0) {
                    j37.a("negative width");
                }
                if (iCeil < 0) {
                    j37.a("negative ellipsized width");
                }
                layoutF = Build.VERSION.SDK_INT >= 33 ? r11.a(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                z2 = true;
            }
            this.f = layoutF;
            Trace.endSection();
            int iMin = Math.min(layoutF.getLineCount(), i9);
            this.g = iMin;
            int i19 = iMin - 1;
            this.d = iMin >= i9 && (layoutF.getEllipsisCount(i19) > 0 || layoutF.getLineEnd(i19) != charSequence.length());
            if (layoutF.getText() instanceof Spanned) {
                CharSequence text = layoutF.getText();
                text.getClass();
                if (w6c.m((Spanned) text, z58.class) || layoutF.getText().length() <= 0) {
                    CharSequence text2 = layoutF.getText();
                    text2.getClass();
                    i10 = 0;
                    z58VarArr = (z58[]) ((Spanned) text2).getSpans(0, layoutF.getText().length(), z58.class);
                } else {
                    z58VarArr = null;
                    i10 = 0;
                }
            } else {
                z58VarArr = null;
                i10 = 0;
            }
            this.n = z58VarArr;
            if (z58VarArr == null || (z58Var2 = (z58) qd0.m0(z58VarArr)) == null) {
                i11 = 2;
                i12 = i10;
            } else {
                if (z58Var2.c) {
                    i11 = 2;
                    i18 = z58Var2.f == 2 ? 1 : i18;
                    i12 = i18;
                } else {
                    i11 = 2;
                }
                i18 = i10;
                i12 = i18;
            }
            int i20 = (z58VarArr == null || (z58Var = (z58) qd0.m0(z58VarArr)) == null || !z58Var.d || z58Var.f != i11) ? i10 : 1;
            if (i12 == 0 || i20 == 0) {
                jA = vte.b;
                if (z) {
                    i13 = 33;
                } else {
                    if (z2) {
                        BoringLayout boringLayout = (BoringLayout) layoutF;
                        i13 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zX = q6.x(boringLayout);
                        } else {
                            r13 = i10;
                        }
                    } else {
                        i13 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutF;
                        int i21 = Build.VERSION.SDK_INT;
                        if (i21 >= 33) {
                            zY = q6.y(staticLayout);
                        } else if (i21 >= 28) {
                            r13 = 1;
                        } else {
                            r13 = i10;
                        }
                    }
                    if (r13 == 0) {
                        r13 = zY;
                        TextPaint paint = layoutF.getPaint();
                        CharSequence text3 = layoutF.getText();
                        c = ' ';
                        Rect rectD = mh3.D(paint, text3, layoutF.getLineStart(i10), layoutF.getLineEnd(i10));
                        int lineAscent = layoutF.getLineAscent(i10);
                        j = 4294967295L;
                        int i22 = rectD.top;
                        if (i22 < lineAscent) {
                            r13 = zX;
                            topPadding = lineAscent - i22;
                        } else {
                            r13 = zX;
                            topPadding = layoutF.getTopPadding();
                        }
                        i14 = 1;
                        rectD = iMin != 1 ? mh3.D(paint, text3, layoutF.getLineStart(i19), layoutF.getLineEnd(i19)) : rectD;
                        int lineDescent = layoutF.getLineDescent(i19);
                        int i23 = rectD.bottom;
                        int bottomPadding = i23 > lineDescent ? i23 - lineDescent : layoutF.getBottomPadding();
                        jA2 = (topPadding == 0 && bottomPadding == 0) ? jA2 : vte.a(topPadding, bottomPadding);
                        if (i12 != 0) {
                            i15 = i10;
                        } else {
                            i15 = (int) (jA2 >> c);
                        }
                        if (i20 != 0) {
                            i16 = i10;
                        } else {
                            i16 = (int) (jA2 & j);
                        }
                        jA3 = vte.a(i15, i16);
                    }
                    jA2 = jA;
                    if (i12 != 0) {
                        i15 = i10;
                    } else {
                        i15 = (int) (jA2 >> c);
                    }
                    if (i20 != 0) {
                        i16 = i10;
                    } else {
                        i16 = (int) (jA2 & j);
                    }
                    jA3 = vte.a(i15, i16);
                }
                r13 = zY;
                r13 = zX;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                jA2 = jA;
                if (i12 != 0) {
                    i15 = i10;
                } else {
                    i15 = (int) (jA2 >> c);
                }
                if (i20 != 0) {
                    i16 = i10;
                } else {
                    i16 = (int) (jA2 & j);
                }
                jA3 = vte.a(i15, i16);
            } else {
                jA3 = vte.b;
                jA = jA3;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                i13 = 33;
            }
            if (z58VarArr != null) {
                int length2 = z58VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i24 = iMax2; i24 < length2; i24++) {
                    z58 z58Var3 = z58VarArr[i24];
                    int i25 = z58Var3.y;
                    iMax = i25 < 0 ? Math.max(iMax, Math.abs(i25)) : iMax;
                    int i26 = z58Var3.z;
                    if (i26 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i26));
                    }
                }
                jA = (iMax == 0 && iMax2 == 0) ? vte.b : vte.a(iMax, iMax2);
            }
            this.h = Math.max((int) (jA3 >> c), (int) (jA >> c));
            this.i = Math.max((int) (jA3 & j), (int) (jA & j));
            TextPaint textPaint2 = this.a;
            z58[] z58VarArr2 = this.n;
            int i27 = this.g - i14;
            Layout layout = this.f;
            if (layout.getLineStart(i27) != layout.getLineEnd(i27) || z58VarArr2 == null || z58VarArr2.length == 0) {
                i17 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                z58 z58Var4 = (z58) qd0.l0(z58VarArr2);
                int length3 = spannableString.length();
                if (i27 == 0 || !(z3 = z58Var4.d)) {
                    boolean z5 = z58Var4.d;
                    z3 = z5 ? 1 : 0;
                    r15 = z5;
                } else {
                    r15 = i10;
                }
                spannableString.setSpan(new z58(z58Var4.a, length3, r15, z3, z58Var4.e, z58Var4.f), i10, spannableString.length(), i13);
                i17 = i10;
                StaticLayout staticLayoutF = hcc.f(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, av7.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutF.getLineAscent(i17);
                fontMetricsInt.descent = staticLayoutF.getLineDescent(i17);
                fontMetricsInt.top = staticLayoutF.getLineTop(i17);
                fontMetricsInt.bottom = staticLayoutF.getLineBottom(i17);
            }
            this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) h(i19)) : i17;
            this.l = fontMetricsInt;
            Layout layout2 = this.f;
            this.j = rs0.B(layout2, i19, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = rs0.C(layout3, i19, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.m;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final a82 c() {
        a82 a82Var = this.p;
        if (a82Var != null) {
            return a82Var;
        }
        a82 a82Var2 = new a82(this.f);
        this.p = a82Var2;
        return a82Var2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.l) == null) ? this.f.getLineBaseline(i) : i(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = vte.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int g(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float h(int i) {
        return e(i) - i(i);
    }

    public final float i(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float j(int i, boolean z) {
        return b(g(i)) + c().D(i, true, z);
    }

    public final float k(int i, boolean z) {
        return b(g(i)) + c().D(i, false, z);
    }

    public final p90 l() {
        p90 p90Var = this.e;
        if (p90Var != null) {
            return p90Var;
        }
        Layout layout = this.f;
        p90 p90Var2 = new p90(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = p90Var2;
        return p90Var2;
    }
}
