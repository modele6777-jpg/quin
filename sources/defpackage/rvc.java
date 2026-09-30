package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rvc {
    public final sg6 a;
    public final long b;
    public final qvc c;
    public final boolean d;

    public rvc(sg6 sg6Var, long j, qvc qvcVar, boolean z) {
        this.a = sg6Var;
        this.b = j;
        this.c = qvcVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvc)) {
            return false;
        }
        rvc rvcVar = (rvc) obj;
        return this.a == rvcVar.a && hl9.c(this.b, rvcVar.b) && this.c == rvcVar.c && this.d == rvcVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ib8.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + hl9.i(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
