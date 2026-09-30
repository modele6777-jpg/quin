package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g2b {
    public final /* synthetic */ int a;
    public final rye b;
    public final d0a c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public g2b(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new rye(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new d0a();
                break;
            default:
                this.b = new rye(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new d0a();
                break;
        }
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(d0a d0aVar) {
        int i = d0aVar.b;
        if (d0aVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        d0aVar.k(bArr, 0, 9);
        d0aVar.M(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        return ((j2 & 3) << 13) | ((((long) bArr[1]) & 255) << 20) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    public final void a(m95 m95Var) {
        int i = this.a;
        d0a d0aVar = this.c;
        switch (i) {
            case 0:
                byte[] bArr = pqf.b;
                d0aVar.K(bArr, bArr.length);
                this.d = true;
                m95Var.k();
                break;
            default:
                byte[] bArr2 = pqf.b;
                d0aVar.K(bArr2, bArr2.length);
                this.d = true;
                m95Var.k();
                break;
        }
    }
}
