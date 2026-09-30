package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class am2 {
    public final int a;
    public final long b;
    public final bm2 c;
    public final oid d;

    public am2(int i, long j, bm2 bm2Var, oid oidVar) {
        this.a = i;
        this.b = j;
        this.c = bm2Var;
        this.d = oidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof am2)) {
            return false;
        }
        am2 am2Var = (am2) obj;
        return this.a == am2Var.a && this.b == am2Var.b && this.c == am2Var.c && pa7.t(this.d, am2Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ib8.b(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        oid oidVar = this.d;
        return iHashCode + (oidVar == null ? 0 : oidVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
