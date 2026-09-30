package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class utc extends a71 {
    public final transient byte[][] d;
    public final transient int[] e;

    public utc(byte[][] bArr, int[] iArr) {
        super(a71.c.d());
        this.d = bArr;
        this.e = iArr;
    }

    private final Object writeReplace() {
        return w();
    }

    @Override // defpackage.a71
    public final String a() {
        throw null;
    }

    @Override // defpackage.a71
    public final a71 c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.d;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.e;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new a71(bArrDigest);
    }

    @Override // defpackage.a71
    public final int e() {
        return this.e[this.d.length - 1];
    }

    @Override // defpackage.a71
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a71) {
            a71 a71Var = (a71) obj;
            if (a71Var.e() == e() && n(0, a71Var, e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.a71
    public final String g() {
        return w().g();
    }

    @Override // defpackage.a71
    public final int h(byte[] bArr, int i) {
        bArr.getClass();
        return w().h(bArr, i);
    }

    @Override // defpackage.a71
    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.d;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.e;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.a = i3;
        return i3;
    }

    @Override // defpackage.a71
    public final byte[] j() {
        return v();
    }

    @Override // defpackage.a71
    public final byte k(int i) {
        byte[][] bArr = this.d;
        int length = bArr.length - 1;
        int[] iArr = this.e;
        vpf.s(iArr[length], i, 1L);
        int iX = t72.X(this, i);
        return bArr[iX][(i - (iX == 0 ? 0 : iArr[iX - 1])) + iArr[bArr.length + iX]];
    }

    @Override // defpackage.a71
    public final int l(byte[] bArr, int i) {
        bArr.getClass();
        return w().l(bArr, i);
    }

    @Override // defpackage.a71
    public final boolean n(int i, a71 a71Var, int i2) {
        a71Var.getClass();
        if (i >= 0 && i <= e() - i2) {
            int i3 = i2 + i;
            int iX = t72.X(this, i);
            int i4 = 0;
            while (i < i3) {
                int[] iArr = this.e;
                int i5 = iX == 0 ? 0 : iArr[iX - 1];
                int i6 = iArr[iX] - i5;
                byte[][] bArr = this.d;
                int i7 = iArr[bArr.length + iX];
                int iMin = Math.min(i3, i6 + i5) - i;
                if (a71Var.o(i4, bArr[iX], (i - i5) + i7, iMin)) {
                    i4 += iMin;
                    i += iMin;
                    iX++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.a71
    public final boolean o(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0 && i <= e() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iX = t72.X(this, i);
            while (i < i4) {
                int[] iArr = this.e;
                int i5 = iX == 0 ? 0 : iArr[iX - 1];
                int i6 = iArr[iX] - i5;
                byte[][] bArr2 = this.d;
                int i7 = iArr[bArr2.length + iX];
                int iMin = Math.min(i4, i6 + i5) - i;
                if (vpf.l((i - i5) + i7, i2, iMin, bArr2[iX], bArr)) {
                    i2 += iMin;
                    i += iMin;
                    iX++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.a71
    public final String p(Charset charset) {
        charset.getClass();
        return w().p(charset);
    }

    @Override // defpackage.a71
    public final a71 q(int i, int i2) {
        if (i < 0) {
            qc0.o(tec.f(i, "beginIndex=", " < 0"));
            return null;
        }
        if (i2 > e()) {
            StringBuilder sbN = ub3.n(i2, "endIndex=", " > length(");
            sbN.append(e());
            sbN.append(')');
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            qc0.o(ks0.k("endIndex=", i2, " < beginIndex=", i));
            return null;
        }
        if (i == 0 && i2 == e()) {
            return this;
        }
        if (i == i2) {
            return a71.c;
        }
        int iX = t72.X(this, i);
        int iX2 = t72.X(this, i2 - 1);
        byte[][] bArr = this.d;
        byte[][] bArr2 = (byte[][]) qd0.f0(bArr, iX, iX2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.e;
        if (iX <= iX2) {
            int i4 = iX;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(iArr2[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = iArr2[bArr.length + i4];
                if (i4 == iX2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = iX != 0 ? iArr2[iX - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i7) + iArr[length];
        return new utc(bArr2, iArr);
    }

    @Override // defpackage.a71
    public final a71 s() {
        return w().s();
    }

    @Override // defpackage.a71
    public final String toString() {
        return w().toString();
    }

    @Override // defpackage.a71
    public final void u(f41 f41Var, int i) {
        int iX = t72.X(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.e;
            int i3 = iX == 0 ? 0 : iArr[iX - 1];
            int i4 = iArr[iX] - i3;
            byte[][] bArr = this.d;
            int i5 = iArr[bArr.length + iX];
            int iMin = Math.min(i, i4 + i3) - i2;
            int i6 = (i2 - i3) + i5;
            qtc qtcVar = new qtc(bArr[iX], i6, i6 + iMin, true);
            qtc qtcVar2 = f41Var.a;
            if (qtcVar2 == null) {
                qtcVar.g = qtcVar;
                qtcVar.f = qtcVar;
                f41Var.a = qtcVar;
            } else {
                qtc qtcVar3 = qtcVar2.g;
                qtcVar3.getClass();
                qtcVar3.b(qtcVar);
            }
            i2 += iMin;
            iX++;
        }
        f41Var.b += (long) i;
    }

    public final byte[] v() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.d;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.e;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            qd0.X(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final a71 w() {
        return new a71(v());
    }
}
