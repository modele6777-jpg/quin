package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hb6 extends x57 {
    public final /* synthetic */ ArrayList s;
    public final /* synthetic */ ib6 t;

    public hb6(ArrayList arrayList, ib6 ib6Var) {
        this.s = arrayList;
        this.t = ib6Var;
    }

    @Override // defpackage.x57
    public final void C(ea1 ea1Var) {
        ea1Var.getClass();
        iu9.r(ea1Var, null);
        this.s.add(ea1Var);
    }

    @Override // defpackage.x57
    public final void I(ea1 ea1Var, ea1 ea1Var2) {
        throw new IllegalStateException(("Conflict in scope of " + this.t.b + ": " + ea1Var + " vs " + ea1Var2).toString());
    }
}
