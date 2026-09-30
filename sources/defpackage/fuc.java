package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lfuc;", "Ls09;", "Liuc;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class fuc extends s09 {
    public final boolean a;
    public final t69 b;
    public final r17 c;
    public final boolean d;
    public final boolean e;
    public final i5c f;
    public final x16 g;

    public fuc(boolean z, t69 t69Var, r17 r17Var, boolean z2, boolean z3, i5c i5cVar, x16 x16Var) {
        this.a = z;
        this.b = t69Var;
        this.c = r17Var;
        this.d = z2;
        this.e = z3;
        this.f = i5cVar;
        this.g = x16Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        iuc iucVar = new iuc(this.b, this.c, this.d, this.e, null, this.f, this.g);
        iucVar.b1 = this.a;
        return iucVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fuc.class != obj.getClass()) {
            return false;
        }
        fuc fucVar = (fuc) obj;
        return this.a == fucVar.a && pa7.t(this.b, fucVar.b) && pa7.t(this.c, fucVar.c) && this.d == fucVar.d && this.e == fucVar.e && pa7.t(this.f, fucVar.f) && this.g == fucVar.g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        t69 t69Var = this.b;
        int iHashCode2 = (iHashCode + (t69Var != null ? t69Var.hashCode() : 0)) * 31;
        r17 r17Var = this.c;
        int iD = ub3.d(ub3.d((iHashCode2 + (r17Var != null ? r17Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        i5c i5cVar = this.f;
        return this.g.hashCode() + ((iD + (i5cVar != null ? Integer.hashCode(i5cVar.a) : 0)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        iuc iucVar = (iuc) i09Var;
        boolean z = iucVar.b1;
        boolean z2 = this.a;
        if (z != z2) {
            iucVar.b1 = z2;
            scc.k(iucVar);
        }
        iucVar.B1(this.b, this.c, this.d, this.e, null, this.f, this.g);
    }
}
