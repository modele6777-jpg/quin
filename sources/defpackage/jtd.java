package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jtd implements ak0 {
    public float b;
    public float c;
    public wj0 d;
    public wj0 e;
    public wj0 f;
    public wj0 g;
    public boolean h;
    public itd i;
    public ByteBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;

    @Override // defpackage.ak0
    public final boolean b() {
        if (this.e.a != -1) {
            return Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.a != this.d.a;
        }
        return false;
    }

    @Override // defpackage.ak0
    public final boolean c() {
        if (this.n) {
            itd itdVar = this.i;
            if (itdVar != null) {
                pa7.J(itdVar.k >= 0);
                if (itdVar.i.o() * itdVar.k * itdVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ak0
    public final ByteBuffer d() {
        itd itdVar = this.i;
        if (itdVar != null) {
            gtd gtdVar = itdVar.i;
            int i = itdVar.b;
            pa7.J(itdVar.k >= 0);
            int iO = gtdVar.o() * itdVar.k * i;
            if (iO > 0) {
                if (this.j.capacity() < iO) {
                    this.j = ByteBuffer.allocateDirect(iO).order(ByteOrder.nativeOrder());
                } else {
                    this.j.clear();
                }
                ByteBuffer byteBuffer = this.j;
                pa7.J(itdVar.k >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (gtdVar.o() * i), itdVar.k);
                gtdVar.b(iMin, byteBuffer);
                itdVar.k -= iMin;
                System.arraycopy(gtdVar.h(), iMin * i, gtdVar.h(), 0, itdVar.k * i);
                this.j.flip();
                this.m += (long) iO;
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer2 = this.k;
        this.k = ak0.a;
        return byteBuffer2;
    }

    @Override // defpackage.ak0
    public final void e(yj0 yj0Var) {
        if (b()) {
            wj0 wj0Var = this.d;
            this.f = wj0Var;
            wj0 wj0Var2 = this.e;
            this.g = wj0Var2;
            if (this.h) {
                this.i = new itd(wj0Var.a, wj0Var.b, this.b, this.c, wj0Var2.a, wj0Var.c == 4);
            } else {
                itd itdVar = this.i;
                if (itdVar != null) {
                    itdVar.j = 0;
                    itdVar.k = 0;
                    itdVar.l = 0;
                    itdVar.m = 0;
                    itdVar.n = 0;
                    itdVar.o = 0;
                    itdVar.p = 0;
                    itdVar.q = 0.0d;
                    itdVar.i.flush();
                }
            }
        }
        this.k = ak0.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override // defpackage.ak0
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            itd itdVar = this.i;
            itdVar.getClass();
            this.l += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = itdVar.b;
            gtd gtdVar = itdVar.i;
            int iO = iRemaining / (gtdVar.o() * i);
            gtdVar.p(iO);
            gtdVar.a(iRemaining, byteBuffer);
            itdVar.j += iO;
            itdVar.b();
        }
    }

    @Override // defpackage.ak0
    public final wj0 g(wj0 wj0Var) throws zj0 {
        int i = wj0Var.c;
        if (i != 2 && i != 4) {
            throw new zj0(wj0Var);
        }
        int i2 = wj0Var.a;
        this.d = wj0Var;
        wj0 wj0Var2 = new wj0(i2, wj0Var.b, i);
        this.e = wj0Var2;
        this.h = true;
        return wj0Var2;
    }

    @Override // defpackage.ak0
    public final void h() {
        itd itdVar = this.i;
        if (itdVar != null) {
            int i = itdVar.j;
            float f = itdVar.c;
            float f2 = itdVar.d;
            double d = f / f2;
            double d2 = itdVar.e * f2;
            int i2 = itdVar.o;
            int i3 = itdVar.k + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + itdVar.q) + ((double) itdVar.l)) / d2) + 0.5d));
            itdVar.q = 0.0d;
            gtd gtdVar = itdVar.i;
            int i4 = itdVar.h * 2;
            gtdVar.p(i4 + i);
            gtdVar.c(i * itdVar.b, i4);
            itdVar.j = i4 + itdVar.j;
            itdVar.b();
            if (itdVar.k > i3) {
                itdVar.k = Math.max(i3, 0);
            }
            itdVar.j = 0;
            itdVar.o = 0;
            itdVar.l = 0;
        }
        this.n = true;
    }

    @Override // defpackage.ak0
    public final long i(long j) {
        if (this.m < 1024) {
            return (long) (j / ((double) this.b));
        }
        long j2 = this.l;
        itd itdVar = this.i;
        itdVar.getClass();
        long jO = j2 - ((long) (itdVar.i.o() * (itdVar.j * itdVar.b)));
        int i = this.g.a;
        int i2 = this.f.a;
        long j3 = this.m;
        return i == i2 ? pqf.N(j, j3, jO, RoundingMode.DOWN) : pqf.N(j, j3 * ((long) i2), jO * ((long) i), RoundingMode.DOWN);
    }

    @Override // defpackage.ak0
    public final void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        wj0 wj0Var = wj0.e;
        this.d = wj0Var;
        this.e = wj0Var;
        this.f = wj0Var;
        this.g = wj0Var;
        ByteBuffer byteBuffer = ak0.a;
        this.j = byteBuffer;
        this.k = byteBuffer;
        this.h = false;
        this.i = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
