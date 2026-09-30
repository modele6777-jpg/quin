package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp17;", "Ls09;", "Lq17;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class p17 extends s09 {
    public final m77 a;
    public final r17 b;

    public p17(m77 m77Var, r17 r17Var) {
        this.a = m77Var;
        this.b = r17Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        rv3 rv3VarA = this.b.a(this.a);
        q17 q17Var = new q17();
        q17Var.F0 = rv3VarA;
        q17Var.l1(rv3VarA);
        return q17Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p17)) {
            return false;
        }
        p17 p17Var = (p17) obj;
        return pa7.t(this.a, p17Var.a) && pa7.t(this.b, p17Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        q17 q17Var = (q17) i09Var;
        rv3 rv3VarA = this.b.a(this.a);
        q17Var.m1(q17Var.F0);
        q17Var.F0 = rv3VarA;
        q17Var.l1(rv3VarA);
    }
}
