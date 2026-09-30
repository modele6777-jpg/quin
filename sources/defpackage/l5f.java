package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l5f extends lt0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.lt0
    public final wj0 a(wj0 wj0Var) throws zj0 {
        if (!pqf.E(wj0Var.c)) {
            throw new zj0(wj0Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? wj0.e : wj0Var;
    }

    @Override // defpackage.lt0, defpackage.ak0
    public final boolean c() {
        return super.c() && this.n == 0;
    }

    @Override // defpackage.lt0, defpackage.ak0
    public final ByteBuffer d() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            m(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override // defpackage.ak0
    public final void f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferM = m(length);
        int iH = pqf.h(length, 0, this.n);
        byteBufferM.put(this.m, 0, iH);
        int iH2 = pqf.h(length - iH, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iH2);
        byteBufferM.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iH2;
        int i4 = this.n - iH;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iH, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferM.flip();
    }

    @Override // defpackage.ak0
    public final long i(long j) {
        return Math.max(0L, j - pqf.L(this.b.a, this.j + this.i));
    }

    @Override // defpackage.lt0
    public final void j() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.lt0
    public final void k() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // defpackage.lt0
    public final void l() {
        this.m = pqf.b;
    }
}
