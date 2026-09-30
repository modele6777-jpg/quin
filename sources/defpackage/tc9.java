package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ltc9;", "Ls09;", "Lwc9;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class tc9 extends s09 {
    public final pc9 a;
    public final sc9 b;

    public tc9(pc9 pc9Var, sc9 sc9Var) {
        this.a = pc9Var;
        this.b = sc9Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new wc9(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tc9)) {
            return false;
        }
        tc9 tc9Var = (tc9) obj;
        return pa7.t(tc9Var.a, this.a) && pa7.t(tc9Var.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        sc9 sc9Var = this.b;
        return iHashCode + (sc9Var != null ? sc9Var.hashCode() : 0);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        wc9 wc9Var = (wc9) i09Var;
        wc9Var.Z = this.a;
        sc9 sc9Var = wc9Var.E0;
        if (sc9Var.a == wc9Var) {
            sc9Var.a = null;
            sc9Var.d = null;
            sc9Var.c = x57.n;
        }
        sc9 sc9Var2 = this.b;
        if (sc9Var2 == null) {
            sc9Var = new sc9();
            wc9Var.E0 = sc9Var;
        } else if (sc9Var2 != sc9Var) {
            wc9Var.E0 = sc9Var2;
            sc9Var = sc9Var2;
        }
        if (wc9Var.Y) {
            sc9Var.a = wc9Var;
            sc9Var.b = null;
            wc9Var.F0 = null;
            sc9Var.c = new zv6(20, wc9Var);
            sc9Var.d = wc9Var.Z0();
        }
    }
}
