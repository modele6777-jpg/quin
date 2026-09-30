package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Loy;", "S", "Ls09;", "Lty;", "animation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class oy<S> extends s09 {
    public final g3f a;
    public final e89 b;
    public final uy c;

    public oy(g3f g3fVar, e89 e89Var, uy uyVar) {
        this.a = g3fVar;
        this.b = e89Var;
        this.c = uyVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new ty(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oy)) {
            return false;
        }
        oy oyVar = (oy) obj;
        return pa7.t(oyVar.a, this.a) && oyVar.b.equals(this.b);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        g3f g3fVar = this.a;
        return this.b.hashCode() + ((iHashCode + (g3fVar != null ? g3fVar.hashCode() : 0)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ty tyVar = (ty) i09Var;
        tyVar.E0 = this.a;
        tyVar.F0 = this.b;
        tyVar.G0 = this.c;
    }
}
