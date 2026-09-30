package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rwc {
    public final q2g a;
    public final q2g b;

    public rwc(q2g q2gVar, q2g q2gVar2) {
        this.a = q2gVar;
        this.b = q2gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rwc)) {
            return false;
        }
        rwc rwcVar = (rwc) obj;
        return this.a == rwcVar.a && this.b == rwcVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + this.a + ", endAffinity=" + this.b + ")";
    }
}
