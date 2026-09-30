package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u13 {
    public final y3b a;
    public final boolean b;

    public u13(y3b y3bVar, boolean z) {
        this.a = y3bVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u13) {
            u13 u13Var = (u13) obj;
            if (u13Var.a.equals(this.a) && u13Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
