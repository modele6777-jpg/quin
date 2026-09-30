package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh6e;", "Ls09;", "Li6e;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class h6e extends s09 {
    public final cj4 a;

    public h6e(cj4 cj4Var) {
        this.a = cj4Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new i6e(kj0.p, this.a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6e)) {
            return false;
        }
        h6e h6eVar = (h6e) obj;
        ju juVar = kj0.p;
        return juVar.equals(juVar) && pa7.t(this.a, h6eVar.a);
    }

    public final int hashCode() {
        int iD = ub3.d(1022 * 31, 31, false);
        cj4 cj4Var = this.a;
        return iD + (cj4Var != null ? cj4Var.hashCode() : 0);
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + kj0.p + ", overrideDescendants=false, touchBoundsExpansion=" + this.a + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        i6e i6eVar = (i6e) i09Var;
        ju juVar = kj0.p;
        if (!pa7.t(i6eVar.E0, juVar)) {
            i6eVar.E0 = juVar;
            if (i6eVar.F0) {
                i6eVar.n1();
            }
        }
        i6eVar.Z = this.a;
    }
}
