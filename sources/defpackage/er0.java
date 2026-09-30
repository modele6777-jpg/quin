package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class er0 implements z21 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Object f;

    public er0(k00 k00Var, long j) {
        this.a = 2;
        String str = k00Var.b;
        p90 p90Var = new p90(3, (byte) 0);
        p90Var.d = str;
        p90Var.b = -1;
        p90Var.c = -1;
        this.f = p90Var;
        this.b = eue.g(j);
        this.c = eue.f(j);
        this.d = -1;
        this.e = -1;
        int iG = eue.g(j);
        int iF = eue.f(j);
        if (iG < 0 || iG > str.length()) {
            r3.i(ks0.k("start (", iG, ") offset is outside of text region ", str.length()));
            throw null;
        }
        if (iF < 0 || iF > str.length()) {
            r3.i(ks0.k("end (", iF, ") offset is outside of text region ", str.length()));
            throw null;
        }
        if (iG <= iF) {
            return;
        }
        qc0.j(ks0.k("Do not set reversed range: ", iG, " > ", iF));
        throw null;
    }

    public static String b(int i, int i2, int i3, boolean z) {
        StringBuilder sbN = ub3.n(i, "av01.", ".");
        Object[] objArr = {Integer.valueOf(i2)};
        String str = pqf.a;
        Locale locale = Locale.US;
        sbN.append(String.format(locale, "%02d", objArr));
        sbN.append(z ? "H" : "M");
        sbN.append(".");
        sbN.append(String.format(locale, "%02d", Integer.valueOf(i3)));
        return sbN.toString();
    }

    public static er0 i(byte[] bArr) throws l0a {
        try {
            zu1 zu1Var = new zu1(bArr, bArr.length);
            zu1Var.n();
            int iG = zu1Var.g(7);
            if (iG != 1) {
                xo1.V("Av1Config", "Unsupported av1C version: " + iG);
                return null;
            }
            int iG2 = zu1Var.g(3);
            int iG3 = zu1Var.g(5);
            boolean zF = zu1Var.f();
            int i = zu1Var.f() ? zu1Var.f() ? 12 : 10 : 8;
            zu1Var.o(13);
            String strB = b(iG2, iG3, i, zF);
            if (zu1Var.b() <= 0) {
                return new er0(i, strB);
            }
            zu1Var.n();
            int iG4 = zu1Var.g(4);
            if (iG4 != 1) {
                xo1.D("Av1Config", "Unsupported obu_type: " + iG4);
                return new er0(i, strB);
            }
            if (zu1Var.f()) {
                xo1.D("Av1Config", "Unsupported obu_extension_flag");
                return new er0(i, strB);
            }
            boolean zF2 = zu1Var.f();
            zu1Var.n();
            if (zF2 && zu1Var.g(8) > 127) {
                xo1.D("Av1Config", "Excessive obu_size");
                return new er0(i, strB);
            }
            int iG5 = zu1Var.g(3);
            zu1Var.n();
            if (zu1Var.f()) {
                xo1.D("Av1Config", "Unsupported reduced_still_picture_header");
                return new er0(i, strB);
            }
            if (zu1Var.f()) {
                xo1.D("Av1Config", "Unsupported timing_info_present_flag");
                return new er0(i, strB);
            }
            if (zu1Var.f()) {
                xo1.D("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new er0(i, strB);
            }
            int iG6 = zu1Var.g(5);
            boolean z = false;
            for (int i2 = 0; i2 <= iG6; i2++) {
                zu1Var.o(12);
                if (zu1Var.g(5) > 7) {
                    zu1Var.n();
                }
            }
            int iG7 = zu1Var.g(4);
            int iG8 = zu1Var.g(4);
            zu1Var.o(iG7 + 1);
            zu1Var.o(iG8 + 1);
            if (zu1Var.f()) {
                zu1Var.o(7);
            }
            zu1Var.o(7);
            boolean zF3 = zu1Var.f();
            if (zF3) {
                zu1Var.o(2);
            }
            if ((zu1Var.f() ? 2 : zu1Var.g(1)) > 0 && !zu1Var.f()) {
                zu1Var.o(1);
            }
            if (zF3) {
                zu1Var.o(3);
            }
            zu1Var.o(3);
            boolean zF4 = zu1Var.f();
            if (iG5 == 2 && zF4) {
                zu1Var.n();
            }
            if (iG5 != 1 && zu1Var.f()) {
                z = true;
            }
            if (!zu1Var.f()) {
                return new er0(i, strB);
            }
            int iG9 = zu1Var.g(8);
            int iG10 = zu1Var.g(8);
            return new er0(i, e82.f(iG9), ((z || iG9 != 1 || iG10 != 13 || zu1Var.g(8) != 0) ? zu1Var.g(1) : 1) == 1 ? 1 : 2, e82.g(iG10), strB);
        } catch (RuntimeException e) {
            throw l0a.a(e, "Error parsing AV1 config");
        }
    }

    public void a() {
        int i;
        int i2 = this.d;
        pa7.J(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.e == 0)));
    }

    public boolean c(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.e + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 > this.b) {
                break;
            }
            if (v(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        return i4 < i6 || (i4 == i6 && i5 == 0);
    }

    public boolean d() {
        int i = this.d;
        int i2 = this.e;
        int i3 = 0;
        while (this.d < this.b && !j()) {
            i3++;
        }
        boolean z = this.d == this.b;
        this.d = i;
        this.e = i2;
        return !z && c((i3 * 2) + 1);
    }

    public void e(int i, int i2) {
        long jB = u3c.b(i, i2);
        ((p90) this.f).c0(i, i2, "");
        long jT = xo1.T(u3c.b(this.b, this.c), jB);
        u(eue.g(jT));
        t(eue.f(jT));
        int i3 = this.d;
        if (i3 != -1) {
            long jT2 = xo1.T(u3c.b(i3, this.e), jB);
            if (eue.d(jT2)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = eue.g(jT2);
                this.e = eue.f(jT2);
            }
        }
    }

    public char f(int i) {
        p90 p90Var = (p90) this.f;
        g46 g46Var = (g46) p90Var.e;
        if (g46Var == null) {
            return ((String) p90Var.d).charAt(i);
        }
        if (i < p90Var.b) {
            return ((String) p90Var.d).charAt(i);
        }
        int iA = g46Var.b - g46Var.a();
        int i2 = p90Var.b;
        if (i >= iA + i2) {
            return ((String) p90Var.d).charAt(i - ((iA - p90Var.c) + i2));
        }
        int i3 = i - i2;
        int i4 = g46Var.d;
        char[] cArr = g46Var.c;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + g46Var.e];
    }

    public eue g() {
        int i = this.d;
        if (i != -1) {
            return new eue(u3c.b(i, this.e));
        }
        return null;
    }

    @Override // defpackage.z21
    public int h() {
        return -1;
    }

    public boolean j() {
        boolean z = (((byte[]) this.f)[this.d] & (UserMetadata.MAX_ROLLOUT_ASSIGNMENTS >> this.e)) != 0;
        w();
        return z;
    }

    public int k(int i) {
        int i2;
        this.e += i;
        int i3 = 0;
        while (true) {
            i2 = this.e;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.e = i5;
            byte[] bArr = (byte[]) this.f;
            int i6 = this.d;
            i3 |= (bArr[i6] & 255) << i5;
            if (!v(i6 + 1)) {
                i4 = 1;
            }
            this.d = i6 + i4;
        }
        byte[] bArr2 = (byte[]) this.f;
        int i7 = this.d;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.e = 0;
            this.d = i7 + (v(i7 + 1) ? 2 : 1);
        }
        a();
        return i8;
    }

    public int l() {
        int i = 0;
        while (!j()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? k(i) : 0);
    }

    public int m() {
        int iL = l();
        return ((iL + 1) / 2) * (iL % 2 == 0 ? -1 : 1);
    }

    public long n() {
        int i = this.d;
        if (i == 0) {
            s8f.c();
            return 0L;
        }
        long[] jArr = (long[]) this.f;
        int i2 = this.b;
        long j = jArr[i2];
        this.b = this.e & (i2 + 1);
        this.d = i - 1;
        return j;
    }

    public void o(int i, int i2, String str) {
        p90 p90Var = (p90) this.f;
        if (i < 0 || i > p90Var.C()) {
            r3.i(ks0.k("start (", i, ") offset is outside of text region ", p90Var.C()));
            return;
        }
        if (i2 < 0 || i2 > p90Var.C()) {
            r3.i(ks0.k("end (", i2, ") offset is outside of text region ", p90Var.C()));
            return;
        }
        if (i > i2) {
            qc0.j(ks0.k("Do not set reversed range: ", i, " > ", i2));
            return;
        }
        p90Var.c0(i, i2, str);
        u(str.length() + i);
        t(str.length() + i);
        this.d = -1;
        this.e = -1;
    }

    public void p(int i, int i2) {
        p90 p90Var = (p90) this.f;
        if (i < 0 || i > p90Var.C()) {
            r3.i(ks0.k("start (", i, ") offset is outside of text region ", p90Var.C()));
            return;
        }
        if (i2 < 0 || i2 > p90Var.C()) {
            r3.i(ks0.k("end (", i2, ") offset is outside of text region ", p90Var.C()));
        } else if (i >= i2) {
            qc0.j(ks0.k("Do not set reversed or empty range: ", i, " > ", i2));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    @Override // defpackage.z21
    public int q() {
        return this.b;
    }

    @Override // defpackage.z21
    public int r() {
        d0a d0aVar = (d0a) this.f;
        int i = this.c;
        if (i == 8) {
            return d0aVar.z();
        }
        if (i == 16) {
            return d0aVar.G();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int iZ = d0aVar.z();
        this.e = iZ;
        return (iZ & 240) >> 4;
    }

    public void s(int i, int i2) {
        p90 p90Var = (p90) this.f;
        if (i < 0 || i > p90Var.C()) {
            r3.i(ks0.k("start (", i, ") offset is outside of text region ", p90Var.C()));
            return;
        }
        if (i2 < 0 || i2 > p90Var.C()) {
            r3.i(ks0.k("end (", i2, ") offset is outside of text region ", p90Var.C()));
        } else if (i > i2) {
            qc0.j(ks0.k("Do not set reversed range: ", i, " > ", i2));
        } else {
            u(i);
            t(i2);
        }
    }

    public void t(int i) {
        if (!(i >= 0)) {
            j37.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return ((p90) this.f).toString();
            default:
                return super.toString();
        }
    }

    public void u(int i) {
        if (!(i >= 0)) {
            j37.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public boolean v(int i) {
        int i2 = i - 2;
        if (this.c > i2 || i >= this.b) {
            return false;
        }
        byte[] bArr = (byte[]) this.f;
        return bArr[i] == 3 && bArr[i2] == 0 && bArr[i - 1] == 0;
    }

    public void w() {
        int i = this.e + 1;
        this.e = i;
        if (i == 8) {
            this.e = 0;
            int i2 = this.d;
            this.d = i2 + (v(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public void x(int i) {
        int i2 = this.d;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.d = i4;
        int i5 = (i - (i3 * 8)) + this.e;
        this.e = i5;
        if (i5 > 7) {
            this.d = i4 + 1;
            this.e = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.d) {
                a();
                return;
            } else if (v(i2)) {
                this.d++;
                i2 += 2;
            }
        }
    }

    public er0(byte[] bArr, int i, int i2) {
        this.a = 4;
        this.f = bArr;
        this.c = i;
        this.d = i;
        this.b = i2;
        this.e = 0;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public er0(int i, String str) {
        this(i, -1, -1, -1, str);
        this.a = 0;
    }

    public er0(int i, int i2, int i3, int i4, String str) {
        this.a = 0;
        this.b = i;
        this.f = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public er0(n49 n49Var) {
        this.a = 1;
        d0a d0aVar = n49Var.c;
        this.f = d0aVar;
        d0aVar.M(12);
        this.c = d0aVar.D() & 255;
        this.b = d0aVar.D();
    }
}
