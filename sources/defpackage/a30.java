package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a30 {
    public final n07 a;
    public final z6e b;
    public final boolean c;

    public a30(n07 n07Var, z6e z6eVar, boolean z) {
        this.a = n07Var;
        this.b = z6eVar;
        this.c = z;
    }

    public static a30 a(a30 a30Var, n07 n07Var, z6e z6eVar, boolean z, int i) {
        if ((i & 1) != 0) {
            n07Var = a30Var.a;
        }
        if ((i & 2) != 0) {
            z6eVar = a30Var.b;
        }
        if ((i & 4) != 0) {
            z = a30Var.c;
        }
        a30Var.getClass();
        return new a30(n07Var, z6eVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a30)) {
            return false;
        }
        a30 a30Var = (a30) obj;
        return pa7.t(this.a, a30Var.a) && pa7.t(this.b, a30Var.b) && this.c == a30Var.c;
    }

    public final int hashCode() {
        n07 n07Var = this.a;
        int iHashCode = (n07Var == null ? 0 : n07Var.hashCode()) * 31;
        z6e z6eVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (z6eVar != null ? z6eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnnualIntroState(product=");
        sb.append(this.a);
        sb.append(", yearlySubscription=");
        sb.append(this.b);
        sb.append(", hasAccess=");
        return ub3.m(sb, this.c, ")");
    }
}
