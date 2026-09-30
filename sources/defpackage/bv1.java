package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bv1 extends b8e implements Comparable {
    public long y;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        bv1 bv1Var = (bv1) obj;
        if (d(4) != bv1Var.d(4)) {
            return d(4) ? 1 : -1;
        }
        long j = this.g - bv1Var.g;
        if (j == 0) {
            j = this.y - bv1Var.y;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
