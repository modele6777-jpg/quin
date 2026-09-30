package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tef implements g7g {
    public final g7g a;
    public final g7g b;

    public tef(g7g g7gVar, g7g g7gVar2) {
        this.a = g7gVar;
        this.b = g7gVar2;
    }

    @Override // defpackage.g7g
    public final int a(sw3 sw3Var) {
        return Math.max(this.a.a(sw3Var), this.b.a(sw3Var));
    }

    @Override // defpackage.g7g
    public final int b(sw3 sw3Var, cv7 cv7Var) {
        return Math.max(this.a.b(sw3Var, cv7Var), this.b.b(sw3Var, cv7Var));
    }

    @Override // defpackage.g7g
    public final int c(sw3 sw3Var) {
        return Math.max(this.a.c(sw3Var), this.b.c(sw3Var));
    }

    @Override // defpackage.g7g
    public final int d(sw3 sw3Var, cv7 cv7Var) {
        return Math.max(this.a.d(sw3Var, cv7Var), this.b.d(sw3Var, cv7Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tef)) {
            return false;
        }
        tef tefVar = (tef) obj;
        return pa7.t(tefVar.a, this.a) && pa7.t(tefVar.b, this.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
