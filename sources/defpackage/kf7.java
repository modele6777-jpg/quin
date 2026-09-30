package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kf7 {
    public static final kf7 d = new kf7(csb.STRICT, 6);
    public final csb a;
    public final bu7 b;
    public final csb c;

    public kf7(csb csbVar, int i) {
        this(csbVar, (i & 2) != 0 ? new bu7(1, 0, 0) : null, csbVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf7)) {
            return false;
        }
        kf7 kf7Var = (kf7) obj;
        return this.a == kf7Var.a && pa7.t(this.b, kf7Var.b) && this.c == kf7Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bu7 bu7Var = this.b;
        return this.c.hashCode() + ((iHashCode + (bu7Var == null ? 0 : bu7Var.d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.a + ", sinceVersion=" + this.b + ", reportLevelAfter=" + this.c + ')';
    }

    public kf7(csb csbVar, bu7 bu7Var, csb csbVar2) {
        this.a = csbVar;
        this.b = bu7Var;
        this.c = csbVar2;
    }
}
