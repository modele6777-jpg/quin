package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxne;", "Ls09;", "Leoe;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class xne extends s09 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final ute d;
    public final z2f e;
    public final jse f;
    public final b41 g;
    public final boolean v;
    public final ghc w;
    public final ks9 x;
    public final tze y;
    public final rfa z;

    public xne(boolean z, boolean z2, boolean z3, ute uteVar, z2f z2fVar, jse jseVar, b41 b41Var, boolean z4, ghc ghcVar, ks9 ks9Var, tze tzeVar, rfa rfaVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = uteVar;
        this.e = z2fVar;
        this.f = jseVar;
        this.g = b41Var;
        this.v = z4;
        this.w = ghcVar;
        this.x = ks9Var;
        this.y = tzeVar;
        this.z = rfaVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new eoe(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xne) {
            xne xneVar = (xne) obj;
            if (this.a == xneVar.a && this.b == xneVar.b && this.c == xneVar.c && pa7.t(this.d, xneVar.d) && pa7.t(this.e, xneVar.e) && this.f == xneVar.f && pa7.t(this.g, xneVar.g) && this.v == xneVar.v && pa7.t(this.w, xneVar.w) && this.x == xneVar.x && pa7.t(this.y, xneVar.y) && pa7.t(this.z, xneVar.z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ub3.d((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ub3.d(ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31)) * 31, 31, this.v)) * 31)) * 31)) * 31;
        rfa rfaVar = this.z;
        return iHashCode + (rfaVar == null ? 0 : rfaVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbP = ib8.p("TextFieldCoreModifier(isFocused=", ", isDragHovered=", ", isTouchDragInProgress=", this.a, this.b);
        sbP.append(this.c);
        sbP.append(", textLayoutState=");
        sbP.append(this.d);
        sbP.append(", textFieldState=");
        sbP.append(this.e);
        sbP.append(", textFieldSelectionState=");
        sbP.append(this.f);
        sbP.append(", cursorBrush=");
        sbP.append(this.g);
        sbP.append(", writeable=");
        sbP.append(this.v);
        sbP.append(", scrollState=");
        sbP.append(this.w);
        sbP.append(", orientation=");
        sbP.append(this.x);
        sbP.append(", toolbarRequester=");
        sbP.append(this.y);
        sbP.append(", platformSelectionBehaviors=");
        sbP.append(this.z);
        sbP.append(")");
        return sbP.toString();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        dg7 dg7Var;
        eoe eoeVar = (eoe) i09Var;
        boolean zO1 = eoeVar.o1();
        boolean z = eoeVar.F0;
        z2f z2fVar = eoeVar.I0;
        ute uteVar = eoeVar.H0;
        jse jseVar = eoeVar.J0;
        ghc ghcVar = eoeVar.M0;
        boolean z2 = this.a;
        eoeVar.F0 = z2;
        jse jseVar2 = this.f;
        jseVar2.h = z2;
        boolean z3 = this.b;
        eoeVar.G0 = z3;
        ute uteVar2 = this.d;
        eoeVar.H0 = uteVar2;
        z2f z2fVar2 = this.e;
        eoeVar.I0 = z2fVar2;
        eoeVar.J0 = jseVar2;
        eoeVar.K0 = this.g;
        eoeVar.L0 = this.v;
        ghc ghcVar2 = this.w;
        eoeVar.M0 = ghcVar2;
        eoeVar.N0 = this.x;
        tze tzeVar = this.y;
        eoeVar.O0 = tzeVar;
        eoeVar.P0 = this.z;
        eoeVar.W0.o1(z2fVar2, jseVar2, uteVar2, z2 || z3 || this.c);
        lne lneVar = eoeVar.X0;
        lneVar.F0.a = null;
        lneVar.F0 = tzeVar;
        tzeVar.a = lneVar;
        tzeVar.b = lneVar.Y ? sze.c : sze.b;
        if (!eoeVar.o1()) {
            lyd lydVar = eoeVar.R0;
            if (lydVar != null) {
                lydVar.h(null);
            }
            eoeVar.R0 = null;
            g13 g13Var = eoeVar.Q0;
            if (g13Var != null && (dg7Var = (dg7) g13Var.b.getAndSet(null)) != null) {
                dg7Var.h(null);
            }
        } else if (!z || !pa7.t(z2fVar, z2fVar2) || !zO1) {
            eoeVar.p1();
        }
        if (pa7.t(z2fVar, z2fVar2) && pa7.t(uteVar, uteVar2) && pa7.t(jseVar, jseVar2) && pa7.t(ghcVar, ghcVar2)) {
            return;
        }
        rs0.F(eoeVar);
    }
}
