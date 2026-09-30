package defpackage;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bk implements l95 {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final l94 b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public n95 j;
    public k1f k;
    public k1f l;
    public xsc m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = pqf.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public bk() {
        l94 l94Var = new l94();
        this.b = l94Var;
        this.l = l94Var;
    }

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        return h(m95Var);
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        xsc xscVar = this.m;
        if (!(xscVar instanceof j17)) {
            if (j == 0 || !(xscVar instanceof yk2)) {
                this.i = 0L;
                return;
            } else {
                yk2 yk2Var = (yk2) xscVar;
                this.i = (Math.max(0L, j - yk2Var.b) * 8000000) / ((long) yk2Var.e);
                return;
            }
        }
        j17 j17Var = (j17) xscVar;
        jf8 jf8Var = j17Var.b;
        long jD = jf8Var.b == 0 ? -9223372036854775807L : jf8Var.d(pqf.b(j17Var.a, j));
        this.i = jD;
        if (Math.abs(this.o - jD) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        int iC;
        int i;
        this.k.getClass();
        String str = pqf.a;
        if (m95Var.getPosition() == 0 && !h(m95Var)) {
            throw l0a.a(null, "Could not find AMR header.");
        }
        if (!this.p) {
            this.p = true;
            boolean z = this.c;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? 16000 : 8000;
            int i3 = z ? r[8] : q[7];
            k1f k1fVar = this.k;
            qr5 qr5Var = new qr5();
            qr5Var.n = qv8.l(str2);
            qr5Var.o = qv8.l(str3);
            qr5Var.p = i3;
            qr5Var.I = 1;
            qr5Var.K = i2;
            k1fVar.g(new rr5(qr5Var));
        }
        int i4 = 0;
        if (this.f == 0) {
            try {
                int iG = g(m95Var);
                this.e = iG;
                this.f = iG;
                int i5 = this.g;
                if (i5 == -1) {
                    m95Var.getPosition();
                    iG = this.e;
                    this.g = iG;
                    i5 = iG;
                }
                if (i5 == iG) {
                    this.h++;
                }
                xsc xscVar = this.m;
                if (xscVar instanceof j17) {
                    j17 j17Var = (j17) xscVar;
                    long j = this.i + this.d + 20000;
                    long position = m95Var.getPosition() + ((long) this.e);
                    jf8 jf8Var = j17Var.b;
                    int i6 = jf8Var.b;
                    if (i6 == 0 || j - jf8Var.d(i6 - 1) >= 100000) {
                        j17Var.i(j, position);
                    }
                    if (this.n && Math.abs(this.o - j) < 20000) {
                        this.n = false;
                        this.l = this.k;
                    }
                }
                iC = this.l.c(m95Var, this.f, true);
                if (iC == -1) {
                    i4 = -1;
                } else {
                    i = this.f - iC;
                    this.f = i;
                    if (i <= 0) {
                        this.l.a(this.i + this.d, 1, this.e, 0, null);
                        this.d += 20000;
                    }
                }
            } catch (EOFException unused) {
            }
        } else {
            iC = this.l.c(m95Var, this.f, true);
            if (iC == -1) {
                i4 = -1;
            } else {
                i = this.f - iC;
                this.f = i;
                if (i <= 0) {
                    this.l.a(this.i + this.d, 1, this.e, 0, null);
                    this.d += 20000;
                }
            }
        }
        m95Var.getLength();
        if (this.m == null) {
            ir0 ir0Var = new ir0(-9223372036854775807L);
            this.m = ir0Var;
            this.j.q(ir0Var);
        }
        if (i4 == -1) {
            xsc xscVar2 = this.m;
            if (xscVar2 instanceof j17) {
                long j2 = this.i + this.d;
                ((j17) xscVar2).c = j2;
                this.j.q(xscVar2);
                this.k.d(j2);
            }
        }
        return i4;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.j = n95Var;
        k1f k1fVarN = n95Var.n(0, 1);
        this.k = k1fVarN;
        this.l = k1fVarN;
        n95Var.j();
    }

    public final int g(m95 m95Var) throws l0a {
        boolean z;
        m95Var.k();
        byte[] bArr = this.a;
        m95Var.o(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw l0a.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw l0a.a(null, sb.toString());
    }

    public final boolean h(m95 m95Var) {
        m95Var.k();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        m95Var.o(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            m95Var.l(bArr.length);
            return true;
        }
        m95Var.k();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        m95Var.o(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        m95Var.l(bArr3.length);
        return true;
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
