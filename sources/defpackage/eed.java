package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leed;", "Ls09;", "Lged;", "animation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final /* data */ class eed extends s09 {
    public final xdd a;

    public eed(xdd xddVar) {
        this.a = xddVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        ged gedVar = new ged();
        gedVar.Z = this.a;
        return gedVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eed) && pa7.t(this.a, ((eed) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.a + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ged gedVar = (ged) i09Var;
        xdd xddVar = gedVar.Z;
        xdd xddVar2 = this.a;
        if (!pa7.t(xddVar2, xddVar)) {
            if9.C(gedVar, xddVar2.d);
        }
        gedVar.Z = xddVar2;
    }
}
