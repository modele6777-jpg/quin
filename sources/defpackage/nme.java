package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nme {
    public final k00 a;
    public k00 b;
    public boolean c = false;
    public f59 d = null;

    public nme(k00 k00Var, k00 k00Var2) {
        this.a = k00Var;
        this.b = k00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nme)) {
            return false;
        }
        nme nmeVar = (nme) obj;
        return pa7.t(this.a, nmeVar.a) && pa7.t(this.b, nmeVar.b) && this.c == nmeVar.c && pa7.t(this.d, nmeVar.d);
    }

    public final int hashCode() {
        int iD = ub3.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        f59 f59Var = this.d;
        return iD + (f59Var == null ? 0 : f59Var.hashCode());
    }

    public final String toString() {
        k00 k00Var = this.b;
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) k00Var) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
