package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f57 implements xw9 {
    public final g7g a;
    public final sw3 b;

    public f57(g7g g7gVar, sw3 sw3Var) {
        this.a = g7gVar;
        this.b = sw3Var;
    }

    @Override // defpackage.xw9
    public final float a() {
        g7g g7gVar = this.a;
        sw3 sw3Var = this.b;
        return sw3Var.Z(g7gVar.c(sw3Var));
    }

    @Override // defpackage.xw9
    public final float b(cv7 cv7Var) {
        g7g g7gVar = this.a;
        sw3 sw3Var = this.b;
        return sw3Var.Z(g7gVar.d(sw3Var, cv7Var));
    }

    @Override // defpackage.xw9
    public final float c(cv7 cv7Var) {
        g7g g7gVar = this.a;
        sw3 sw3Var = this.b;
        return sw3Var.Z(g7gVar.b(sw3Var, cv7Var));
    }

    @Override // defpackage.xw9
    public final float d() {
        g7g g7gVar = this.a;
        sw3 sw3Var = this.b;
        return sw3Var.Z(g7gVar.a(sw3Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f57)) {
            return false;
        }
        f57 f57Var = (f57) obj;
        return pa7.t(this.a, f57Var.a) && pa7.t(this.b, f57Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
