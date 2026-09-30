package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lf28;", "Ls09;", "Lh28;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final /* data */ class f28 extends s09 {
    public final ys a;
    public final r38 b;
    public final cre c;

    public f28(ys ysVar, r38 r38Var, cre creVar) {
        this.a = ysVar;
        this.b = r38Var;
        this.c = creVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new h28(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f28) {
            f28 f28Var = (f28) obj;
            return pa7.t(this.a, f28Var.a) && this.b == f28Var.b && this.c == f28Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.a + ", legacyTextFieldState=" + this.b + ", textFieldSelectionManager=" + this.c + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) throws Throwable {
        h28 h28Var = (h28) i09Var;
        if (h28Var.Y) {
            h28Var.Z.c();
            h28Var.Z.k(h28Var);
        }
        ys ysVar = this.a;
        h28Var.Z = ysVar;
        if (h28Var.Y) {
            if (ysVar.a != null) {
                l37.c("Expected textInputModifierNode to be null");
            }
            ysVar.a = h28Var;
        }
        h28Var.E0 = this.b;
        h28Var.F0 = this.c;
    }
}
