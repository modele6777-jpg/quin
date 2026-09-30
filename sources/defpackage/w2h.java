package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w2h implements Closeable {
    public final ByteArrayInputStream a;
    public u2h b;
    public final byte[] c = new byte[8];
    public final yea d = new yea(15);

    public w2h(ByteArrayInputStream byteArrayInputStream) {
        this.a = byteArrayInputStream;
    }

    public final long E() throws IOException {
        u2h u2hVar = this.b;
        byte b = u2hVar.b;
        if (b < 24) {
            long j = b;
            this.b = null;
            return j;
        }
        if (b == 24) {
            int i = this.a.read();
            if (i == -1) {
                throw new EOFException();
            }
            this.b = null;
            return ((long) i) & 255;
        }
        byte[] bArr = this.c;
        if (b == 25) {
            R(bArr, 2);
            return ((((long) bArr[0]) & 255) << 8) | (((long) bArr[1]) & 255);
        }
        if (b == 26) {
            R(bArr, 4);
            return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (((long) bArr[3]) & 255);
        }
        if (b != 27) {
            yg5.m(ks0.k("invalid additional information ", b, " for major type ", (u2hVar.a >> 5) & 7));
            return 0L;
        }
        R(bArr, 8);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3];
        return (((long) bArr[7]) & 255) | ((j3 & 255) << 48) | ((j2 & 255) << 56) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8);
    }

    public final void G() {
        u();
        byte b = this.b.b;
        if (b != 31) {
            return;
        }
        qc0.p(tec.e(b, "expected definite length but found "));
    }

    public final void N(byte b) {
        u();
        byte b2 = this.b.a;
        if (b2 == b) {
            return;
        }
        qc0.p(ks0.k("expected major type ", (b >> 5) & 7, " but found ", (b2 >> 5) & 7));
    }

    public final void R(byte[] bArr, int i) throws IOException {
        int i2 = 0;
        while (i2 != i) {
            int i3 = this.a.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        this.b = null;
    }

    public final byte[] U() {
        G();
        long jE = E();
        if (jE < 0 || jE > 2147483647L) {
            s8f.i("the maximum supported byte/text string length is 2147483647 bytes");
            return null;
        }
        if (this.a.available() < jE) {
            throw new EOFException();
        }
        int i = (int) jE;
        byte[] bArr = new byte[i];
        R(bArr, i);
        return bArr;
    }

    public final long b() {
        N((byte) -128);
        G();
        long jE = E();
        if (jE < 0) {
            s8f.i("the maximum supported array length is 9223372036854775807");
            return 0L;
        }
        if (jE > 0) {
            ((ArrayDeque) this.d.a).push(Long.valueOf(jE));
        }
        return jE;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        this.d.i();
    }

    public final long h() {
        boolean z;
        u();
        byte b = this.b.a;
        if (b == 0) {
            z = true;
        } else {
            if (b != 32) {
                qc0.p(tec.e((b >> 5) & 7, "expected major type 0 or 1 but found "));
                return 0L;
            }
            z = false;
        }
        long jE = E();
        if (jE >= 0) {
            return z ? jE : ~jE;
        }
        s8f.i("the maximum supported unsigned/negative integer is 9223372036854775807");
        return 0L;
    }

    public final long l() {
        N((byte) -96);
        G();
        long jE = E();
        if (jE < 0 || jE > 4611686018427387903L) {
            s8f.i("the maximum supported map length is 4611686018427387903L");
            return 0L;
        }
        if (jE > 0) {
            ((ArrayDeque) this.d.a).push(Long.valueOf(jE + jE));
        }
        return jE;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        if (r2 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.u2h u() {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w2h.u():u2h");
    }

    public final boolean x() {
        N((byte) -32);
        if (this.b.b > 24) {
            qc0.p("expected simple value");
            return false;
        }
        int iE = (int) E();
        if (iE == 20) {
            return false;
        }
        if (iE == 21) {
            return true;
        }
        qc0.p("expected FALSE or TRUE");
        return false;
    }
}
