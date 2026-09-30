package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhhc;", "Ls09;", "Lihc;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class hhc extends s09 {
    public final zhc a;
    public final ks9 b;
    public final boolean c;
    public final gj5 d;
    public final t69 e;
    public final w31 f;
    public final boolean g;
    public final lu9 v;

    public hhc(w31 w31Var, gj5 gj5Var, t69 t69Var, ks9 ks9Var, lu9 lu9Var, zhc zhcVar, boolean z, boolean z2) {
        this.a = zhcVar;
        this.b = ks9Var;
        this.c = z;
        this.d = gj5Var;
        this.e = t69Var;
        this.f = w31Var;
        this.g = z2;
        this.v = lu9Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        ihc ihcVar = new ihc();
        ihcVar.F0 = this.a;
        ihcVar.G0 = this.b;
        ihcVar.H0 = this.c;
        ihcVar.I0 = this.d;
        ihcVar.J0 = this.e;
        ihcVar.K0 = this.f;
        ihcVar.L0 = this.g;
        ihcVar.M0 = this.v;
        return ihcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hhc.class != obj.getClass()) {
            return false;
        }
        hhc hhcVar = (hhc) obj;
        return this.a.equals(hhcVar.a) && this.b == hhcVar.b && this.c == hhcVar.c && pa7.t(this.d, hhcVar.d) && pa7.t(this.e, hhcVar.e) && pa7.t(this.f, hhcVar.f) && this.g == hhcVar.g && pa7.t(this.v, hhcVar.v);
    }

    public final int hashCode() {
        int iD = ub3.d(ub3.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        gj5 gj5Var = this.d;
        int iHashCode = (iD + (gj5Var != null ? gj5Var.hashCode() : 0)) * 31;
        t69 t69Var = this.e;
        int iHashCode2 = (iHashCode + (t69Var != null ? t69Var.hashCode() : 0)) * 31;
        w31 w31Var = this.f;
        int iD2 = ub3.d((iHashCode2 + (w31Var != null ? w31Var.hashCode() : 0)) * 31, 31, this.g);
        lu9 lu9Var = this.v;
        return iD2 + (lu9Var != null ? lu9Var.hashCode() : 0);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ((ihc) i09Var).q1(this.f, this.d, this.e, this.b, this.v, this.a, this.g, this.c);
    }
}
