package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvye;", "Ls09;", "Lxye;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class vye extends s09 {
    public final boolean a;
    public final t69 b;
    public final r17 c;
    public final boolean d;
    public final boolean e;
    public final i5c f;
    public final a26 g;

    public vye(boolean z, t69 t69Var, r17 r17Var, boolean z2, boolean z3, i5c i5cVar, a26 a26Var) {
        this.a = z;
        this.b = t69Var;
        this.c = r17Var;
        this.d = z2;
        this.e = z3;
        this.f = i5cVar;
        this.g = a26Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new xye(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vye.class != obj.getClass()) {
            return false;
        }
        vye vyeVar = (vye) obj;
        return this.a == vyeVar.a && pa7.t(this.b, vyeVar.b) && pa7.t(this.c, vyeVar.c) && this.d == vyeVar.d && this.e == vyeVar.e && this.f.equals(vyeVar.f) && this.g == vyeVar.g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        t69 t69Var = this.b;
        int iHashCode2 = (iHashCode + (t69Var != null ? t69Var.hashCode() : 0)) * 31;
        r17 r17Var = this.c;
        return this.g.hashCode() + ub3.b(this.f.a, ub3.d(ub3.d((iHashCode2 + (r17Var != null ? r17Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        xye xyeVar = (xye) i09Var;
        boolean z = xyeVar.b1;
        boolean z2 = this.a;
        if (z != z2) {
            xyeVar.b1 = z2;
            scc.k(xyeVar);
        }
        xyeVar.c1 = this.g;
        xyeVar.B1(this.b, this.c, this.d, this.e, null, this.f, xyeVar.d1);
    }
}
