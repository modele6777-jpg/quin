package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q6d implements s6d {
    public final long a;

    public q6d(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6d)) {
            return false;
        }
        long j = ((q6d) obj).a;
        int i = y72.l;
        return faf.a(this.a, j) && yi4.b(0.5f, 0.5f);
    }

    public final int hashCode() {
        int i = y72.l;
        return Float.hashCode(0.5f) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return tec.m("InnerStroke(color=", y72.h(this.a), ", width=", yi4.c(0.5f), ")");
    }
}
