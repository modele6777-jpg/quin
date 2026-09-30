package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lez1;", "Ls09;", "Ldz1;", "material3"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public final class ez1 extends s09 {
    public final wu0 a;

    public ez1(wu0 wu0Var) {
        this.a = wu0Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        dz1 dz1Var = new dz1();
        dz1Var.Z = this.a;
        return dz1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ez1) {
            return this.a == ((ez1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        dz1 dz1Var = (dz1) i09Var;
        dz1Var.Z = this.a;
        scc.k(dz1Var);
    }
}
