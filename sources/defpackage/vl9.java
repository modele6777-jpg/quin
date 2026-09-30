package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvl9;", "Ls09;", "Lwl9;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class vl9 extends s09 {
    public final a26 a;

    public vl9(a26 a26Var) {
        this.a = a26Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        wl9 wl9Var = new wl9();
        wl9Var.Z = this.a;
        wl9Var.E0 = true;
        return wl9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        vl9 vl9Var = obj instanceof vl9 ? (vl9) obj : null;
        return vl9Var != null && this.a == vl9Var.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        wl9 wl9Var = (wl9) i09Var;
        a26 a26Var = wl9Var.Z;
        a26 a26Var2 = this.a;
        if (a26Var != a26Var2 || !wl9Var.E0) {
            vd0.s0(wl9Var).t0(false);
        }
        wl9Var.Z = a26Var2;
        wl9Var.E0 = true;
    }
}
