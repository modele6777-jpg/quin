package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcv2;", "Ls09;", "Lfv2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class cv2 extends s09 {
    public final w2f a;
    public final zse b;
    public final r38 c;
    public final boolean d;
    public final sl9 e;
    public final cre f;
    public final rx6 g;
    public final fo5 v;

    public cv2(w2f w2fVar, zse zseVar, r38 r38Var, boolean z, sl9 sl9Var, cre creVar, rx6 rx6Var, fo5 fo5Var) {
        this.a = w2fVar;
        this.b = zseVar;
        this.c = r38Var;
        this.d = z;
        this.e = sl9Var;
        this.f = creVar;
        this.g = rx6Var;
        this.v = fo5Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        fv2 fv2Var = new fv2();
        fv2Var.F0 = this.a;
        fv2Var.G0 = this.b;
        fv2Var.H0 = this.c;
        fv2Var.I0 = this.d;
        fv2Var.J0 = this.e;
        cre creVar = this.f;
        fv2Var.K0 = creVar;
        fv2Var.L0 = this.g;
        fv2Var.M0 = this.v;
        creVar.f = new dv2(fv2Var, 4);
        return fv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cv2) {
            cv2 cv2Var = (cv2) obj;
            if (this.a.equals(cv2Var.a) && pa7.t(this.b, cv2Var.b) && this.c == cv2Var.c && this.d == cv2Var.d && this.e.equals(cv2Var.e) && this.f == cv2Var.f && pa7.t(this.g, cv2Var.g) && pa7.t(this.v, cv2Var.v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.v.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ub3.d(ub3.d(ub3.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.d), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=false, enabled=" + this.d + ", isPassword=false, offsetMapping=" + this.e + ", manager=" + this.f + ", imeOptions=" + this.g + ", focusRequester=" + this.v + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        fv2 fv2Var = (fv2) i09Var;
        boolean z = fv2Var.I0;
        rx6 rx6Var = fv2Var.L0;
        cre creVar = fv2Var.K0;
        fv2Var.F0 = this.a;
        zse zseVar = this.b;
        fv2Var.G0 = zseVar;
        fv2Var.H0 = this.c;
        boolean z2 = this.d;
        fv2Var.I0 = z2;
        fv2Var.J0 = this.e;
        cre creVar2 = this.f;
        fv2Var.K0 = creVar2;
        rx6 rx6Var2 = this.g;
        fv2Var.L0 = rx6Var2;
        fv2Var.M0 = this.v;
        if (z2 != z || z2 != z || !pa7.t(rx6Var2, rx6Var) || !eue.d(zseVar.b)) {
            scc.k(fv2Var);
        }
        if (creVar2 != creVar) {
            creVar2.f = new dv2(fv2Var, 0);
        }
    }
}
