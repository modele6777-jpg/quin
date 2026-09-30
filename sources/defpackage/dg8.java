package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dg8 extends bg8 implements c62 {
    public static final dg8 d = new dg8(1, 0);

    public dg8(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // defpackage.c62
    public final Comparable c() {
        return Long.valueOf(this.a);
    }

    @Override // defpackage.c62
    public final Comparable d() {
        return Long.valueOf(this.b);
    }

    @Override // defpackage.bg8
    public final boolean equals(Object obj) {
        if (!(obj instanceof dg8)) {
            return false;
        }
        if (isEmpty() && ((dg8) obj).isEmpty()) {
            return true;
        }
        dg8 dg8Var = (dg8) obj;
        return this.a == dg8Var.a && this.b == dg8Var.b;
    }

    @Override // defpackage.bg8
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.bg8, defpackage.c62
    public final boolean isEmpty() {
        return this.a > this.b;
    }

    @Override // defpackage.bg8
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
