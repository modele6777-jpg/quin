package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luef;", "Ls09;", "Lvef;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class uef extends s09 {
    public final rh5 a;

    public uef(rh5 rh5Var) {
        this.a = rh5Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        vef vefVar = new vef();
        vefVar.F0 = this.a;
        return vefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uef) {
            return ((uef) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        vef vefVar = (vef) i09Var;
        rh5 rh5Var = vefVar.F0;
        rh5 rh5Var2 = this.a;
        if (rh5Var2.equals(rh5Var)) {
            return;
        }
        vefVar.F0 = rh5Var2;
        vefVar.m1();
    }
}
