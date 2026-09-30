package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhx3;", "Ls09;", "Lix3;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class hx3 extends s09 {
    public final g7g a;
    public final s8f b;

    public hx3(g7g g7gVar, s8f s8fVar) {
        this.a = g7gVar;
        this.b = s8fVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        ix3 ix3Var = new ix3();
        ix3Var.F0 = this.a;
        ix3Var.G0 = this.b;
        ix3Var.H0 = m93.l;
        return ix3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx3)) {
            return false;
        }
        hx3 hx3Var = (hx3) obj;
        return pa7.t(this.a, hx3Var.a) && this.b == hx3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ix3 ix3Var = (ix3) i09Var;
        g7g g7gVar = ix3Var.F0;
        g7g g7gVar2 = this.a;
        boolean zT = pa7.t(g7gVar, g7gVar2);
        s8f s8fVar = this.b;
        if (zT && s8fVar == ix3Var.G0) {
            return;
        }
        ix3Var.F0 = g7gVar2;
        ix3Var.G0 = s8fVar;
        ix3Var.H0 = new w25(g7gVar2, ix3Var.Z);
        rs0.F(ix3Var);
    }
}
