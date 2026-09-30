package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpo7;", "Ls09;", "Lro7;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class po7 extends s09 {
    public final a26 a;
    public final a26 b;

    public po7(a26 a26Var, a26 a26Var2) {
        this.a = a26Var;
        this.b = a26Var2;
    }

    @Override // defpackage.s09
    public final i09 create() {
        ro7 ro7Var = new ro7();
        ro7Var.Z = this.a;
        ro7Var.E0 = this.b;
        return ro7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po7)) {
            return false;
        }
        po7 po7Var = (po7) obj;
        return this.a == po7Var.a && this.b == po7Var.b;
    }

    public final int hashCode() {
        a26 a26Var = this.a;
        int iHashCode = (a26Var != null ? a26Var.hashCode() : 0) * 31;
        a26 a26Var2 = this.b;
        return iHashCode + (a26Var2 != null ? a26Var2.hashCode() : 0);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ro7 ro7Var = (ro7) i09Var;
        ro7Var.Z = this.a;
        ro7Var.E0 = this.b;
    }
}
