package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lzz9;", "Ls09;", "Lyz9;", "material3"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final class zz9 extends s09 {
    public final w6 a;

    public zz9(w6 w6Var) {
        this.a = w6Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        yz9 yz9Var = new yz9();
        yz9Var.Z = this.a;
        return yz9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zz9) {
            return this.a == ((zz9) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        yz9 yz9Var = (yz9) i09Var;
        yz9Var.Z = this.a;
        scc.k(yz9Var);
    }
}
