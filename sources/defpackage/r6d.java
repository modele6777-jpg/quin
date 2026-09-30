package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r6d implements s6d {
    public final long a;

    public r6d(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6d)) {
            return false;
        }
        long j = ((r6d) obj).a;
        int i = y72.l;
        return faf.a(this.a, j) && yi4.b(2.0f, 2.0f);
    }

    public final int hashCode() {
        int i = y72.l;
        return Float.hashCode(2.0f) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return tec.m("OuterPlate(color=", y72.h(this.a), ", inset=", yi4.c(2.0f), ")");
    }
}
