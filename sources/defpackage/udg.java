package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class udg {
    public final iy9 a;
    public final iy9 b;
    public final vdg c;

    public udg(iy9 iy9Var, iy9 iy9Var2, vdg vdgVar) {
        vdgVar.getClass();
        this.a = iy9Var;
        this.b = iy9Var2;
        this.c = vdgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udg)) {
            return false;
        }
        udg udgVar = (udg) obj;
        return this.a.equals(udgVar.a) && this.b.equals(udgVar.b) && this.c == udgVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ZodiacRange(start=" + this.a + ", end=" + this.b + ", sign=" + this.c + ")";
    }
}
