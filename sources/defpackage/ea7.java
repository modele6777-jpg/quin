package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lea7;", "Ls09;", "Lfa7;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class ea7 extends s09 {
    public final ia7 a;

    public ea7(ia7 ia7Var) {
        this.a = ia7Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        fa7 fa7Var = new fa7(0);
        fa7Var.E0 = this.a;
        fa7Var.F0 = true;
        return fa7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ea7 ea7Var = obj instanceof ea7 ? (ea7) obj : null;
        return ea7Var != null && this.a == ea7Var.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        fa7 fa7Var = (fa7) i09Var;
        fa7Var.E0 = this.a;
        fa7Var.F0 = true;
    }
}
