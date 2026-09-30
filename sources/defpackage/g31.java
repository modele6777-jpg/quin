package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg31;", "Ls09;", "Lj31;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class g31 extends s09 {
    public final uw a;

    public g31(uw uwVar) {
        this.a = uwVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new j31(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g31) {
            return this.a == ((g31) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        j31 j31Var = (j31) i09Var;
        uw uwVar = this.a;
        j31Var.Z = uwVar;
        if (j31Var.Y) {
            uwVar.d(j31Var.E0);
        }
    }
}
