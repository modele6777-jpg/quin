package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lsse;", "Ls09;", "Ltse;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final class sse extends s09 {
    public final mue a;

    public sse(mue mueVar) {
        this.a = mueVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new tse(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sse)) {
            return false;
        }
        return pa7.t(this.a, ((sse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        tse tseVar = (tse) i09Var;
        tseVar.getClass();
        mue mueVarK = a6c.k(this.a, vd0.s0(tseVar).P0);
        tseVar.l1(mueVarK, (xp5) eb3.H(tseVar, zg2.k));
        rse rseVar = tseVar.F0;
        if (rseVar == null) {
            throw ub3.e("Min size state is not set.");
        }
        rse.a(rseVar, null, null, mueVarK, 23);
        rs0.F(tseVar);
    }
}
