package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v86 {
    public final long a;
    public final long b;
    public final long c;

    public v86(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v86)) {
            return false;
        }
        v86 v86Var = (v86) obj;
        long j = v86Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && faf.a(this.b, v86Var.b) && faf.a(this.c, v86Var.c);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.c) + ib8.b(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        String strH = y72.h(this.a);
        String strH2 = y72.h(this.b);
        return ks0.l(ib8.o("GiftCardPurchaseColors(backgroundTop=", strH, ", darkBackgroundTop=", strH2, ", accent="), y72.h(this.c), ")");
    }
}
