package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jef {
    public final cv6 a;
    public final j09 b;
    public final j09 c;
    public final long d;

    public jef(cv6 cv6Var, j09 j09Var, j09 j09Var2, long j) {
        this.a = cv6Var;
        this.b = j09Var;
        this.c = j09Var2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jef)) {
            return false;
        }
        jef jefVar = (jef) obj;
        if (!pa7.t(this.a, jefVar.a) || !this.b.equals(jefVar.b) || !this.c.equals(jefVar.c)) {
            return false;
        }
        long j = jefVar.d;
        int i = y72.l;
        return faf.a(this.d, j);
    }

    public final int hashCode() {
        cv6 cv6Var = this.a;
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((cv6Var == null ? 0 : cv6Var.hashCode()) * 31)) * 31)) * 31;
        int i = y72.l;
        return Long.hashCode(this.d) + iHashCode;
    }

    public final String toString() {
        return "UnifiedShareVisuals(backdropImage=" + this.a + ", sourceHazeModifier=" + this.b + ", materialHazeModifier=" + this.c + ", actionSectionBackground=" + y72.h(this.d) + ")";
    }
}
