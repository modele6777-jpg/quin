package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q0a implements CharSequence {
    public CharSequence a;
    public g46 b;
    public int c;
    public int d;

    public final void a(int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (i > i2) {
            l37.a("start=" + i + " > end=" + i2);
        }
        if (i3 > i4) {
            l37.a("textStart=" + i3 + " > textEnd=" + i4);
        }
        if (i < 0) {
            l37.a("start must be non-negative, but was " + i);
        }
        if (i3 < 0) {
            l37.a("textStart must be non-negative, but was " + i3);
        }
        g46 g46Var = this.b;
        int i5 = i4 - i3;
        if (g46Var == null) {
            int iMax = Math.max(255, i5 + UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.a.length() - i2, 64);
            int i6 = i - iMin;
            hcc.o(this.a, cArr, 0, i6, i);
            int i7 = iMax - iMin2;
            int i8 = iMin2 + i2;
            hcc.o(this.a, cArr, i7, i2, i8);
            hcc.o(charSequence, cArr, iMin, i3, i4);
            g46 g46Var2 = new g46(1);
            g46Var2.b = iMax;
            g46Var2.c = cArr;
            g46Var2.d = iMin + i5;
            g46Var2.e = i7;
            this.b = g46Var2;
            this.c = i6;
            this.d = i8;
            return;
        }
        int i9 = this.c;
        int i10 = i - i9;
        int i11 = i2 - i9;
        if (i10 < 0 || i11 > g46Var.b - g46Var.a()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            a(i, i2, charSequence, i3, i4);
            return;
        }
        int i12 = i5 - (i11 - i10);
        if (i12 > g46Var.a()) {
            int iA = i12 - g46Var.a();
            int i13 = g46Var.b;
            do {
                i13 *= 2;
            } while (i13 - g46Var.b < iA);
            char[] cArr2 = new char[i13];
            qd0.a0(g46Var.c, cArr2, 0, 0, g46Var.d);
            int i14 = g46Var.b;
            int i15 = g46Var.e;
            int i16 = i14 - i15;
            int i17 = i13 - i16;
            qd0.a0(g46Var.c, cArr2, i17, i15, i16 + i15);
            g46Var.c = cArr2;
            g46Var.b = i13;
            g46Var.e = i17;
        }
        int i18 = g46Var.d;
        if (i10 < i18 && i11 <= i18) {
            int i19 = i18 - i11;
            char[] cArr3 = g46Var.c;
            qd0.a0(cArr3, cArr3, g46Var.e - i19, i11, i18);
            g46Var.d = i10;
            g46Var.e -= i19;
        } else if (i10 >= i18 || i11 < i18) {
            int iA2 = g46Var.a() + i10;
            int iA3 = g46Var.a() + i11;
            int i20 = g46Var.e;
            char[] cArr4 = g46Var.c;
            qd0.a0(cArr4, cArr4, g46Var.d, i20, iA2);
            i10 = g46Var.d + (iA2 - i20);
            g46Var.d = i10;
            g46Var.e = iA3;
        } else {
            g46Var.e = g46Var.a() + i11;
            g46Var.d = i10;
        }
        hcc.o(charSequence, g46Var.c, i10, i3, i4);
        g46Var.d += i5;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        g46 g46Var = this.b;
        if (g46Var == null) {
            return this.a.charAt(i);
        }
        if (i < this.c) {
            return this.a.charAt(i);
        }
        int iA = g46Var.b - g46Var.a();
        int i2 = this.c;
        if (i >= iA + i2) {
            return this.a.charAt(i - ((iA - this.d) + i2));
        }
        int i3 = i - i2;
        int i4 = g46Var.d;
        char[] cArr = g46Var.c;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + g46Var.e];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        g46 g46Var = this.b;
        CharSequence charSequence = this.a;
        if (g46Var == null) {
            return charSequence.length();
        }
        return (g46Var.b - g46Var.a()) + (charSequence.length() - (this.d - this.c));
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        g46 g46Var = this.b;
        if (g46Var == null) {
            return this.a.toString();
        }
        StringBuilder sb = new StringBuilder((this.a.length() + ((g46Var.b - g46Var.a()) + this.c)) - this.d);
        sb.append(this.a, 0, this.c);
        sb.append(g46Var.c, 0, g46Var.d);
        char[] cArr = g46Var.c;
        int i = g46Var.e;
        sb.append(cArr, i, g46Var.b - i);
        CharSequence charSequence = this.a;
        sb.append(charSequence, this.d, charSequence.length());
        return sb.toString();
    }
}
