package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class amg {
    public int a;
    public int b;
    public k01 c;

    public static amg h(InputStream inputStream, int i) {
        if (i <= 0) {
            qc0.j("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new zlg(inputStream, i);
        }
        ylg ylgVar = new ylg(xmg.a);
        try {
            ylgVar.a(0);
            return ylgVar;
        } catch (bng e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int j(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long k(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract long F();

    public abstract int G();

    public abstract long H();

    public abstract int a(int i);

    public abstract void b(int i);

    public abstract int c();

    public abstract boolean d();

    public abstract int e();

    public abstract int f(byte[] bArr, int i, int i2);

    public abstract void g(int i);

    public final void i() throws bng {
        boolean zN;
        do {
            int iL = l();
            if (iL == 0) {
                return;
            }
            int i = this.a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                s8f.q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.b = i2 + 1;
                zN = n(iL);
                this.b--;
            }
        } while (zN);
    }

    public abstract int l();

    public abstract void m(int i);

    public abstract boolean n(int i);

    public abstract double o();

    public abstract float p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract boolean v();

    public abstract String w();

    public abstract String x();

    public abstract wlg y();

    public abstract byte[] z();
}
