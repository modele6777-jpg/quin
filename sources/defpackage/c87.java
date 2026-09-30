package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c87 {
    public final n07 a;
    public final z6e b;
    public final z6e c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public c87(n07 n07Var, z6e z6eVar, z6e z6eVar2, int i, boolean z, boolean z2) {
        this.a = n07Var;
        this.b = z6eVar;
        this.c = z6eVar2;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    public static c87 a(c87 c87Var, n07 n07Var, z6e z6eVar, z6e z6eVar2, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            n07Var = c87Var.a;
        }
        n07 n07Var2 = n07Var;
        if ((i & 2) != 0) {
            z6eVar = c87Var.b;
        }
        z6e z6eVar3 = z6eVar;
        if ((i & 4) != 0) {
            z6eVar2 = c87Var.c;
        }
        z6e z6eVar4 = z6eVar2;
        int i2 = c87Var.d;
        if ((i & 16) != 0) {
            z = c87Var.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = c87Var.f;
        }
        c87Var.getClass();
        return new c87(n07Var2, z6eVar3, z6eVar4, i2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c87)) {
            return false;
        }
        c87 c87Var = (c87) obj;
        return pa7.t(this.a, c87Var.a) && pa7.t(this.b, c87Var.b) && pa7.t(this.c, c87Var.c) && this.d == c87Var.d && this.e == c87Var.e && this.f == c87Var.f;
    }

    public final int hashCode() {
        n07 n07Var = this.a;
        int iHashCode = (n07Var == null ? 0 : n07Var.hashCode()) * 31;
        z6e z6eVar = this.b;
        int iHashCode2 = (iHashCode + (z6eVar == null ? 0 : z6eVar.hashCode())) * 31;
        z6e z6eVar2 = this.c;
        return Boolean.hashCode(this.f) + ub3.d(ub3.b(this.d, (iHashCode2 + (z6eVar2 != null ? z6eVar2.hashCode() : 0)) * 31, 31), 31, this.e);
    }

    public final String toString() {
        return "InterceptPaywallUiState(timesCardProduct=" + this.a + ", monthlyProduct=" + this.b + ", annualProduct=" + this.c + ", timesCardPlaceholderCount=" + this.d + ", neverPurchased=" + this.e + ", loadFailed=" + this.f + ")";
    }
}
