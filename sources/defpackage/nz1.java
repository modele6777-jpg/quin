package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nz1 implements xsc {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public nz1(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        long[] jArr = this.e;
        int iD = pqf.d(jArr, j, true);
        long j2 = jArr[iD];
        long[] jArr2 = this.c;
        zsc zscVar = new zsc(j2, jArr2[iD]);
        if (j2 >= j || iD == this.a - 1) {
            return new wsc(zscVar, zscVar);
        }
        int i = iD + 1;
        return new wsc(zscVar, new zsc(jArr[i], jArr2[i]));
    }

    @Override // defpackage.xsc
    public final long h() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
