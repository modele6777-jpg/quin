package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j72 {
    public static final Logger e = Logger.getLogger(j72.class.getName());
    public static final boolean f = wff.e;
    public kb6 a;
    public final byte[] b;
    public final int c;
    public int d;

    public j72(byte[] bArr, int i) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int b(String str) {
        int length;
        try {
            length = mqf.a(str);
        } catch (kqf unused) {
            length = str.getBytes(p87.a).length;
        }
        return d(length) + length;
    }

    public static int c(int i) {
        return d(i << 3);
    }

    public static int d(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int e(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void f(byte b) throws k72 {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new k72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void g(byte[] bArr, int i, int i2) throws k72 {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new k72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2);
        }
    }

    public final void h(y61 y61Var) throws k72 {
        n(y61Var.size());
        v61 v61Var = (v61) y61Var;
        g(v61Var.bytes, v61Var.g(), v61Var.size());
    }

    public final void i(int i) throws k72 {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new k72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void j(long j) throws k72 {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new k72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void k(int i) throws k72 {
        if (i >= 0) {
            n(i);
        } else {
            o(i);
        }
    }

    public final void l(String str) throws k72 {
        int i = this.d;
        try {
            int iD = d(str.length() * 3);
            int iD2 = d(str.length());
            int i2 = this.c;
            byte[] bArr = this.b;
            if (iD2 != iD) {
                n(mqf.a(str));
                int i3 = this.d;
                this.d = mqf.a.i(str, bArr, i3, i2 - i3);
                return;
            }
            int i4 = i + iD2;
            this.d = i4;
            int i5 = mqf.a.i(str, bArr, i4, i2 - i4);
            this.d = i;
            n((i5 - i) - iD2);
            this.d = i5;
        } catch (IndexOutOfBoundsException e2) {
            throw new k72(e2);
        } catch (kqf e3) {
            this.d = i;
            e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(p87.a);
            try {
                n(bytes.length);
                g(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e4) {
                throw new k72(e4);
            }
        }
    }

    public final void m(int i, int i2) {
        n((i << 3) | i2);
    }

    public final void n(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.d;
            byte[] bArr = this.b;
            if (i2 == 0) {
                this.d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) ((i & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new k72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
                }
            }
            throw new k72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void o(long j) throws k72 {
        boolean z = f;
        int i = this.c;
        byte[] bArr = this.b;
        if (!z || i - this.d < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.d;
                if (j2 == 0) {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.d = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new k72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
                    }
                }
                throw new k72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = this.d;
            if (j3 == 0) {
                this.d = i3 + 1;
                wff.l(bArr, i3, (byte) j);
                return;
            } else {
                this.d = i3 + 1;
                wff.l(bArr, i3, (byte) ((((int) j) & 127) | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
                j >>>= 7;
            }
        }
    }
}
