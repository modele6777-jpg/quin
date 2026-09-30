package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w25 implements g7g {
    public final g7g a;
    public final g7g b;

    public w25(g7g g7gVar, g7g g7gVar2) {
        this.a = g7gVar;
        this.b = g7gVar2;
    }

    @Override // defpackage.g7g
    public final int a(sw3 sw3Var) {
        int iA = this.a.a(sw3Var) - this.b.a(sw3Var);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    @Override // defpackage.g7g
    public final int b(sw3 sw3Var, cv7 cv7Var) {
        int iB = this.a.b(sw3Var, cv7Var) - this.b.b(sw3Var, cv7Var);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    @Override // defpackage.g7g
    public final int c(sw3 sw3Var) {
        int iC = this.a.c(sw3Var) - this.b.c(sw3Var);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    @Override // defpackage.g7g
    public final int d(sw3 sw3Var, cv7 cv7Var) {
        int iD = this.a.d(sw3Var, cv7Var) - this.b.d(sw3Var, cv7Var);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w25)) {
            return false;
        }
        w25 w25Var = (w25) obj;
        return pa7.t(w25Var.a, this.a) && pa7.t(w25Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ")";
    }
}
