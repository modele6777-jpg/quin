package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cx9 implements g7g {
    public final xw9 a;

    public cx9(xw9 xw9Var) {
        this.a = xw9Var;
    }

    @Override // defpackage.g7g
    public final int a(sw3 sw3Var) {
        return sw3Var.D0(this.a.d());
    }

    @Override // defpackage.g7g
    public final int b(sw3 sw3Var, cv7 cv7Var) {
        return sw3Var.D0(this.a.c(cv7Var));
    }

    @Override // defpackage.g7g
    public final int c(sw3 sw3Var) {
        return sw3Var.D0(this.a.a());
    }

    @Override // defpackage.g7g
    public final int d(sw3 sw3Var, cv7 cv7Var) {
        return sw3Var.D0(this.a.b(cv7Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cx9) {
            return pa7.t(((cx9) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        xw9 xw9Var = this.a;
        cv7 cv7Var = cv7.a;
        float fB = xw9Var.b(cv7Var);
        float fD = xw9Var.d();
        float fC = xw9Var.c(cv7Var);
        float fA = xw9Var.a();
        String strC = yi4.c(fB);
        String strC2 = yi4.c(fD);
        return ks0.m(ib8.o("PaddingValues(", strC, ", ", strC2, ", "), yi4.c(fC), ", ", yi4.c(fA), ")");
    }
}
