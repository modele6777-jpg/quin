package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ny5 implements xsc {
    public final SparseArray a;
    public final SparseArray b;
    public final long c;
    public final long d;
    public final int e;

    public ny5(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i) {
        this.a = sparseArray;
        this.b = sparseArray2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.xsc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.xsc
    public final wsc f(long j) {
        SparseArray sparseArray = this.a;
        int i = this.e;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.b;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            zsc zscVar = new zsc(0L, this.d);
            return new wsc(zscVar, zscVar);
        }
        int iD = pqf.d(jArr, j, true);
        zsc zscVar2 = new zsc(jArr[iD], jArr2[iD]);
        return new wsc(zscVar2, zscVar2);
    }

    @Override // defpackage.xsc
    public final long h() {
        return this.c;
    }
}
