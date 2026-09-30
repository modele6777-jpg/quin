package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lc57;", "Ls09;", "Le57;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class c57 extends s09 {
    public final g7g a;

    public c57(g7g g7gVar) {
        this.a = g7gVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new e57(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c57) {
            return pa7.t(((c57) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        e57 e57Var = (e57) i09Var;
        g7g g7gVar = e57Var.F0;
        g7g g7gVar2 = this.a;
        if (pa7.t(g7gVar2, g7gVar)) {
            return;
        }
        e57Var.F0 = g7gVar2;
        e57Var.m1();
    }
}
