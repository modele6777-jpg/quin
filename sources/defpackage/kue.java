package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kue {
    public final String a;
    public String b;
    public boolean c = false;
    public ry9 d = null;

    public kue(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kue)) {
            return false;
        }
        kue kueVar = (kue) obj;
        return pa7.t(this.a, kueVar.a) && pa7.t(this.b, kueVar.b) && this.c == kueVar.c && pa7.t(this.d, kueVar.d);
    }

    public final int hashCode() {
        int iD = ub3.d(ub3.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ry9 ry9Var = this.d;
        return iD + (ry9Var == null ? 0 : ry9Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
