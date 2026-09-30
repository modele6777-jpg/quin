package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lvsf;", "Ls09;", "Lysf;", "animation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final /* data */ class vsf extends s09 {
    public final p3f a;
    public final g3f b;
    public final bx4 c;
    public final e45 d;
    public final scd e;

    public vsf(p3f p3fVar, g3f g3fVar, bx4 bx4Var, e45 e45Var, scd scdVar) {
        this.a = p3fVar;
        this.b = g3fVar;
        this.c = bx4Var;
        this.d = e45Var;
        this.e = scdVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        ysf ysfVar = new ysf();
        ysfVar.Z = this.b;
        ysfVar.E0 = this.c;
        ysfVar.F0 = this.d;
        ysfVar.G0 = this.e;
        return ysfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vsf) {
            vsf vsfVar = (vsf) obj;
            return this.a == vsfVar.a && pa7.t(this.b, vsfVar.b) && this.c.equals(vsfVar.c) && pa7.t(this.d, vsfVar.d) && this.e == vsfVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VeilModifierElement(transition=" + this.a + ", veilAnimation=" + this.b + ", enter=" + this.c + ", exit=" + this.d + ", mutableTransformState=" + this.e + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ysf ysfVar = (ysf) i09Var;
        ysfVar.getClass();
        ysfVar.Z = this.b;
        ysfVar.E0 = this.c;
        ysfVar.F0 = this.d;
        ysfVar.G0 = this.e;
    }
}
