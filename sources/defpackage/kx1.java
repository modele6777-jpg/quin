package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kx1 {
    public final long a;
    public final long b;

    public kx1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx1)) {
            return false;
        }
        kx1 kx1Var = (kx1) obj;
        long j = kx1Var.a;
        int i = y72.l;
        return faf.a(this.a, j) && faf.a(this.b, kx1Var.b);
    }

    public final int hashCode() {
        int i = y72.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return tec.m("CharacterCounterColors(positiveColor=", y72.h(this.a), ", negativeColor=", y72.h(this.b), ")");
    }
}
