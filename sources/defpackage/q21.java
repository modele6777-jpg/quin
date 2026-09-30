package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq21;", "Ls09;", "Lr21;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class q21 extends s09 {
    public final yi a;
    public final boolean b;

    public q21(yi yiVar, boolean z) {
        this.a = yiVar;
        this.b = z;
    }

    @Override // defpackage.s09
    public final i09 create() {
        r21 r21Var = new r21();
        r21Var.Z = this.a;
        r21Var.E0 = this.b;
        return r21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        q21 q21Var = obj instanceof q21 ? (q21) obj : null;
        return q21Var != null && pa7.t(this.a, q21Var.a) && this.b == q21Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        r21 r21Var = (r21) i09Var;
        r21Var.Z = this.a;
        r21Var.E0 = this.b;
    }
}
