package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxn4;", "Ls09;", "Lyn4;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class xn4 extends s09 {
    public final a26 a;

    public xn4(a26 a26Var) {
        this.a = a26Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        yn4 yn4Var = new yn4();
        yn4Var.Z = this.a;
        return yn4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xn4) {
            return this.a == ((xn4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((yn4) i09Var).Z = this.a;
    }
}
