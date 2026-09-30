package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z6f implements f8e {
    public final d0a a = new d0a();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public z6f(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = pqf.g(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f8e
    public final void s(byte[] bArr, int i, int i2, e8e e8eVar, xl2 xl2Var) {
        String strX;
        int i3;
        d0a d0aVar = this.a;
        d0aVar.K(bArr, i + i2);
        d0aVar.M(i);
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        pa7.A(d0aVar.a() >= 2);
        int iG = d0aVar.G();
        if (iG == 0) {
            strX = "";
        } else {
            int i7 = d0aVar.b;
            Charset charsetI = d0aVar.I();
            int i8 = iG - (d0aVar.b - i7);
            if (charsetI == null) {
                charsetI = StandardCharsets.UTF_8;
            }
            strX = d0aVar.x(i8, charsetI);
        }
        if (strX.isEmpty()) {
            ey6 ey6Var = jy6.b;
            xl2Var.accept(new w03(-9223372036854775807L, -9223372036854775807L, yob.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strX);
        b(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        a(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fG = this.f;
        while (d0aVar.a() >= 8) {
            int i9 = d0aVar.b;
            int iM = d0aVar.m();
            int iM2 = d0aVar.m();
            if (iM2 == 1937013100) {
                pa7.A(d0aVar.a() >= i6 ? i4 : i5);
                int iG2 = d0aVar.G();
                int i10 = i5;
                while (i10 < iG2) {
                    pa7.A(d0aVar.a() >= 12 ? i4 : i5);
                    int iG3 = d0aVar.G();
                    int iG4 = d0aVar.G();
                    d0aVar.N(i6);
                    int i11 = i10;
                    int iZ = d0aVar.z();
                    d0aVar.N(i4);
                    int iM3 = d0aVar.m();
                    if (iG4 > spannableStringBuilder.length()) {
                        StringBuilder sbN = ub3.n(iG4, "Truncating styl end (", ") to cueText.length() (");
                        sbN.append(spannableStringBuilder.length());
                        sbN.append(").");
                        xo1.V("Tx3gParser", sbN.toString());
                        iG4 = spannableStringBuilder.length();
                    }
                    if (iG3 >= iG4) {
                        xo1.V("Tx3gParser", kv2.h(iG3, iG4, "Ignoring styl with start (", ") >= end (", ")."));
                    } else {
                        int i12 = iG4;
                        b(spannableStringBuilder, iZ, this.c, iG3, i12, 0);
                        a(spannableStringBuilder, iM3, this.d, iG3, i12, 0);
                    }
                    i10 = i11 + 1;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iM2 == 1952608120 && this.b) {
                i3 = 2;
                pa7.A(d0aVar.a() >= 2);
                fG = pqf.g(d0aVar.G() / this.g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            d0aVar.M(i9 + iM);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
        xl2Var.accept(new w03(-9223372036854775807L, -9223372036854775807L, jy6.s(new t03(spannableStringBuilder, null, null, null, fG, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }
}
