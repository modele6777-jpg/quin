package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ln08;", "Ls09;", "Lr08;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class n08 extends s09 {
    public final x16 a;
    public final k08 b;
    public final ks9 c;
    public final boolean d;

    public n08(x16 x16Var, k08 k08Var, ks9 ks9Var, boolean z) {
        this.a = x16Var;
        this.b = k08Var;
        this.c = ks9Var;
        this.d = z;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new r08(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n08)) {
            return false;
        }
        n08 n08Var = (n08) obj;
        return this.a == n08Var.a && pa7.t(this.b, n08Var.b) && this.c == n08Var.c && this.d == n08Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ub3.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        r08 r08Var = (r08) i09Var;
        r08Var.Z = this.a;
        r08Var.E0 = this.b;
        ks9 ks9Var = r08Var.F0;
        ks9 ks9Var2 = this.c;
        if (ks9Var != ks9Var2) {
            r08Var.F0 = ks9Var2;
            scc.k(r08Var);
        }
        boolean z = r08Var.G0;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        r08Var.G0 = z2;
        r08Var.l1();
        scc.k(r08Var);
    }
}
