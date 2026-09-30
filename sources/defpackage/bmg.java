package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bmg extends gmg {
    public final byte[] c;
    public final int d;
    public int e;

    public bmg(byte[] bArr, int i) {
        int length = bArr.length;
        if (((length - i) | i) < 0) {
            Locale locale = Locale.US;
            qc0.j(ks0.k("Array range is invalid. Buffer.length=", length, ", offset=0, length=", i));
            throw null;
        }
        this.c = bArr;
        this.e = 0;
        this.d = i;
    }

    @Override // defpackage.gmg
    public final void c(byte[] bArr, int i, int i2) throws cmg {
        w(bArr, i, i2);
    }

    @Override // defpackage.gmg
    public final void d(int i, int i2) throws cmg {
        r((i << 3) | i2);
    }

    @Override // defpackage.gmg
    public final void e(int i, int i2) throws cmg {
        r(i << 3);
        q(i2);
    }

    @Override // defpackage.gmg
    public final void f(int i, int i2) throws cmg {
        r(i << 3);
        r(i2);
    }

    @Override // defpackage.gmg
    public final void g(int i, int i2) throws cmg {
        r((i << 3) | 5);
        s(i2);
    }

    @Override // defpackage.gmg
    public final void h(int i, long j) throws cmg {
        r(i << 3);
        t(j);
    }

    @Override // defpackage.gmg
    public final void i(int i, long j) throws cmg {
        r((i << 3) | 1);
        u(j);
    }

    @Override // defpackage.gmg
    public final void j(int i, boolean z) throws cmg {
        r(i << 3);
        p(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.gmg
    public final void k(int i, String str) throws cmg {
        r((i << 3) | 2);
        v(str);
    }

    @Override // defpackage.gmg
    public final void l(int i, xlg xlgVar) throws cmg {
        r((i << 3) | 2);
        m(xlgVar);
    }

    @Override // defpackage.gmg
    public final void m(xlg xlgVar) throws cmg {
        r(xlgVar.c());
        xlgVar.g(this);
    }

    @Override // defpackage.gmg
    public final void n(byte[] bArr, int i) throws cmg {
        r(i);
        w(bArr, 0, i);
    }

    @Override // defpackage.gmg
    public final void o(qlg qlgVar) throws cmg {
        omg omgVar = (omg) qlgVar;
        r(omgVar.k());
        omgVar.d(this);
    }

    @Override // defpackage.gmg
    public final void p(byte b) throws cmg {
        int i = this.e;
        try {
            int i2 = i + 1;
            try {
                this.c[i] = b;
                this.e = i2;
            } catch (IndexOutOfBoundsException e) {
                e = e;
                i = i2;
                throw new cmg(i, this.d, 1, e);
            }
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
        }
    }

    @Override // defpackage.gmg
    public final void q(int i) throws cmg {
        if (i >= 0) {
            r(i);
        } else {
            t(i);
        }
    }

    @Override // defpackage.gmg
    public final void r(int i) throws cmg {
        int i2;
        int i3 = this.e;
        while (true) {
            int i4 = i & (-128);
            byte[] bArr = this.c;
            if (i4 == 0) {
                i2 = i3 + 1;
                bArr[i3] = (byte) i;
                this.e = i2;
                return;
            } else {
                i2 = i3 + 1;
                try {
                    bArr[i3] = (byte) (i | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new cmg(i2, this.d, 1, e);
                }
            }
            throw new cmg(i2, this.d, 1, e);
        }
    }

    @Override // defpackage.gmg
    public final void s(int i) throws cmg {
        int i2 = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.e = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new cmg(i2, this.d, 4, e);
        }
    }

    @Override // defpackage.gmg
    public final void t(long j) throws cmg {
        int i;
        int i2 = this.e;
        byte[] bArr = this.c;
        int i3 = this.d;
        if (!gmg.b || i3 - i2 < 10) {
            while ((j & (-128)) != 0) {
                int i4 = i2 + 1;
                try {
                    bArr[i2] = (byte) (((int) j) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    j >>>= 7;
                    i2 = i4;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i = i4;
                    throw new cmg(i, i3, 1, e);
                }
            }
            i = i2 + 1;
            try {
                bArr[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                throw new cmg(i, i3, 1, e);
            }
        } else {
            while ((j & (-128)) != 0) {
                iog.j(bArr, i2, (byte) (((int) j) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            iog.j(bArr, i2, (byte) j);
        }
        this.e = i;
    }

    @Override // defpackage.gmg
    public final void u(long j) throws cmg {
        int i = this.e;
        try {
            byte[] bArr = this.c;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.e = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new cmg(i, this.d, 8, e);
        }
    }

    @Override // defpackage.gmg
    public final void v(String str) throws cmg {
        int i = this.e;
        try {
            int iA = gmg.a(str.length() * 3);
            int iA2 = gmg.a(str.length());
            byte[] bArr = this.c;
            if (iA2 != iA) {
                r(kog.b(str));
                int i2 = this.e;
                this.e = kog.c(str, bArr, i2, bArr.length - i2);
            } else {
                int i3 = i + iA2;
                this.e = i3;
                int iC = kog.c(str, bArr, i3, bArr.length - i3);
                this.e = i;
                r((iC - i) - iA2);
                this.e = iC;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new cmg(e);
        }
    }

    public final void w(byte[] bArr, int i, int i2) throws cmg {
        try {
            System.arraycopy(bArr, i, this.c, this.e, i2);
            this.e += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new cmg(this.e, this.d, i2, e);
        }
    }

    public final int x() {
        return this.d - this.e;
    }
}
