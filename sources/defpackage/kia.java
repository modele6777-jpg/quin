package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkia;", "Ls09;", "Llia;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class kia extends s09 {
    public final ju a;

    public kia(ju juVar) {
        this.a = juVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new lia(this.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kia) && this.a.equals(((kia) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        lia liaVar = (lia) i09Var;
        ju juVar = liaVar.E0;
        ju juVar2 = this.a;
        if (pa7.t(juVar, juVar2)) {
            return;
        }
        liaVar.E0 = juVar2;
        if (liaVar.F0) {
            liaVar.n1();
        }
    }
}
