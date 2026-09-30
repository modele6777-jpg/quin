package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxv4;", "Ls09;", "Lax4;", "animation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class xv4 extends s09 {
    public final p3f a;
    public final g3f b;
    public final g3f c;
    public final g3f d;
    public final bx4 e;
    public final e45 f;
    public final scd g;
    public final x16 v;
    public final yv4 w;

    public xv4(p3f p3fVar, g3f g3fVar, g3f g3fVar2, g3f g3fVar3, bx4 bx4Var, e45 e45Var, scd scdVar, x16 x16Var, yv4 yv4Var) {
        this.a = p3fVar;
        this.b = g3fVar;
        this.c = g3fVar2;
        this.d = g3fVar3;
        this.e = bx4Var;
        this.f = e45Var;
        this.g = scdVar;
        this.v = x16Var;
        this.w = yv4Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new ax4(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xv4)) {
            return false;
        }
        xv4 xv4Var = (xv4) obj;
        return xv4Var.a == this.a && pa7.t(xv4Var.b, this.b) && pa7.t(xv4Var.c, this.c) && pa7.t(xv4Var.d, this.d) && xv4Var.e.equals(this.e) && pa7.t(xv4Var.f, this.f) && xv4Var.g == this.g && xv4Var.v == this.v && pa7.t(xv4Var.w, this.w);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        g3f g3fVar = this.b;
        int iHashCode2 = (iHashCode + (g3fVar != null ? g3fVar.hashCode() : 0)) * 31;
        g3f g3fVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (g3fVar2 != null ? g3fVar2.hashCode() : 0)) * 31;
        g3f g3fVar3 = this.d;
        return this.g.hashCode() + (this.w.hashCode() * 31) + ((this.v.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode3 + (g3fVar3 != null ? g3fVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ax4 ax4Var = (ax4) i09Var;
        ax4Var.E0 = this.a;
        ax4Var.F0 = this.b;
        ax4Var.G0 = this.c;
        ax4Var.H0 = this.d;
        ax4Var.I0 = this.e;
        ax4Var.J0 = this.f;
        ax4Var.K0 = this.g;
        ax4Var.L0 = this.v;
        ax4Var.M0 = this.w;
    }
}
