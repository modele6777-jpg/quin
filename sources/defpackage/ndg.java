package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lndg;", "Ls09;", "Lpdg;", "animation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class ndg extends s09 {
    public final float a;
    public final Object b;

    public ndg(float f, Object obj) {
        this.a = f;
        this.b = obj;
    }

    @Override // defpackage.s09
    public final i09 create() {
        pdg pdgVar = new pdg();
        pdgVar.Z = this.a;
        pdgVar.E0 = this.b;
        return pdgVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ndg)) {
            return false;
        }
        ndg ndgVar = (ndg) obj;
        return ndgVar.a == this.a && pa7.t(ndgVar.b, this.b);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        pdg pdgVar = (pdg) i09Var;
        pdgVar.Z = this.a;
        pdgVar.E0 = this.b;
    }
}
