package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o5f {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(k1f k1fVar, j1f j1fVar) {
        if (this.c > 0) {
            k1fVar.a(this.d, this.e, this.f, this.g, j1fVar);
            this.c = 0;
        }
    }

    public final void b(k1f k1fVar, long j, int i, int i2, int i3, j1f j1fVar) {
        pa7.I("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(k1fVar, j1fVar);
            }
        }
    }

    public final void c(m95 m95Var) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        int i = 0;
        m95Var.o(bArr, 0, 10);
        m95Var.k();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
