package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnce;", "Ls09;", "Loce;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class nce extends s09 {
    public final a26 a;

    public nce(a26 a26Var) {
        this.a = a26Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        oce oceVar = new oce(m93.l);
        oceVar.G0 = this.a;
        return oceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nce) {
            return this.a == ((nce) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        oce oceVar = (oce) i09Var;
        a26 a26Var = oceVar.G0;
        a26 a26Var2 = this.a;
        if (a26Var != a26Var2) {
            oceVar.G0 = a26Var2;
            m8g m8gVar = oceVar.H0;
            if (m8gVar != null) {
                g7g g7gVar = (g7g) a26Var2.d(m8gVar);
                if (pa7.t(g7gVar, oceVar.F0)) {
                    return;
                }
                oceVar.F0 = g7gVar;
                oceVar.m1();
            }
        }
    }
}
