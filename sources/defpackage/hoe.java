package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lhoe;", "Ls09;", "Lape;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class hoe extends s09 {
    public final z2f a;
    public final ute b;
    public final jse c;
    public final u47 d;
    public final boolean e;
    public final wo7 f;
    public final dwd g;
    public final boolean v;
    public final t69 w;
    public final b89 x;

    public hoe(z2f z2fVar, ute uteVar, jse jseVar, u47 u47Var, boolean z, wo7 wo7Var, dwd dwdVar, boolean z2, t69 t69Var, b89 b89Var) {
        this.a = z2fVar;
        this.b = uteVar;
        this.c = jseVar;
        this.d = u47Var;
        this.e = z;
        this.f = wo7Var;
        this.g = dwdVar;
        this.v = z2;
        this.w = t69Var;
        this.x = b89Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new ape(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hoe) {
            hoe hoeVar = (hoe) obj;
            if (pa7.t(this.a, hoeVar.a) && pa7.t(this.b, hoeVar.b) && this.c == hoeVar.c && pa7.t(this.d, hoeVar.d) && this.e == hoeVar.e && this.f.equals(hoeVar.f) && pa7.t(this.g, hoeVar.g) && this.v == hoeVar.v && pa7.t(this.w, hoeVar.w) && pa7.t(this.x, hoeVar.x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        u47 u47Var = this.d;
        int iHashCode2 = (this.f.hashCode() + ub3.d(ub3.d((iHashCode + (u47Var == null ? 0 : u47Var.hashCode())) * 31, 31, this.e), 31, false)) * 31;
        dwd dwdVar = this.g;
        int iD = ub3.d((this.w.hashCode() + ub3.d((iHashCode2 + (dwdVar == null ? 0 : dwdVar.hashCode())) * 31, 31, this.v)) * 31, 31, false);
        b89 b89Var = this.x;
        return iD + (b89Var != null ? b89Var.hashCode() : 0);
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.a + ", textLayoutState=" + this.b + ", textFieldSelectionState=" + this.c + ", filter=" + this.d + ", enabled=" + this.e + ", readOnly=false, keyboardOptions=" + this.f + ", keyboardActionHandler=" + this.g + ", singleLine=" + this.v + ", interactionSource=" + this.w + ", isPassword=false, stylusHandwritingTrigger=" + this.x + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        lyd lydVar;
        ape apeVar = (ape) i09Var;
        obe obeVar = apeVar.P0;
        vo5 vo5Var = apeVar.O0;
        boolean z = apeVar.I0;
        z2f z2fVar = apeVar.F0;
        wo7 wo7Var = apeVar.J0;
        jse jseVar = apeVar.H0;
        t69 t69Var = apeVar.M0;
        b89 b89Var = apeVar.N0;
        z2f z2fVar2 = this.a;
        apeVar.F0 = z2fVar2;
        apeVar.G0 = this.b;
        jse jseVar2 = this.c;
        apeVar.H0 = jseVar2;
        boolean z2 = this.e;
        apeVar.I0 = z2;
        wo7 wo7Var2 = this.f;
        apeVar.J0 = wo7Var2;
        apeVar.K0 = this.g;
        apeVar.L0 = this.v;
        t69 t69Var2 = this.w;
        apeVar.M0 = t69Var2;
        b89 b89Var2 = this.x;
        apeVar.N0 = b89Var2;
        if (z2 != z || !pa7.t(z2fVar2, z2fVar) || !wo7Var2.equals(wo7Var) || !pa7.t(b89Var2, b89Var)) {
            if (z2 && (apeVar.q1() || apeVar.W0 != null)) {
                apeVar.t1(false);
            } else if (!z2) {
                apeVar.o1();
            }
        }
        if (z2 != z || z2 != z || wo7Var2.a() != wo7Var.a()) {
            scc.k(apeVar);
        }
        if (jseVar2 != jseVar) {
            obeVar.n1();
            if (apeVar.Y) {
                jseVar2.m = apeVar.X0;
                if (apeVar.q1() && (lydVar = apeVar.T0) != null) {
                    lydVar.h(null);
                    apeVar.T0 = ynb.V(apeVar.Z0(), null, null, new zoe(jseVar2, null), 3);
                }
            }
            jseVar2.l = new koe(apeVar, 2);
        }
        if (!pa7.t(t69Var2, t69Var)) {
            obeVar.n1();
            if (vo5Var.Y) {
                vo5Var.p1(t69Var2);
            }
        }
        if (z2 != z) {
            if (!z2) {
                apeVar.m1(vo5Var);
            } else {
                apeVar.l1(vo5Var);
                vo5Var.p1(t69Var2);
            }
        }
    }
}
