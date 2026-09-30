package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qu3 implements pv2 {
    public final pv2 a;

    public qu3(pv2 pv2Var) {
        this.a = pv2Var;
    }

    @Override // defpackage.pv2
    public final nv2 F0(ov2 ov2Var) {
        return this.a.F0(ov2Var);
    }

    @Override // defpackage.pv2
    public final pv2 U(ov2 ov2Var) {
        pv2 pv2VarU = this.a.U(ov2Var);
        int i = crf.b;
        hj6 hj6Var = hj6.Z;
        nv2 nv2VarF0 = F0(hj6Var);
        sv2 sv2Var = nv2VarF0 instanceof sv2 ? (sv2) nv2VarF0 : null;
        nv2 nv2VarF1 = pv2VarU.F0(hj6Var);
        sv2 sv2Var2 = nv2VarF1 instanceof sv2 ? (sv2) nv2VarF1 : null;
        if ((sv2Var instanceof ru3) && sv2Var != sv2Var2) {
            ((ru3) sv2Var).d = 0;
        }
        return new qu3(pv2VarU);
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return this.a.V0(l26Var, obj);
    }

    public final boolean equals(Object obj) {
        return pa7.t(this.a, obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.pv2
    public final pv2 p0(pv2 pv2Var) {
        pv2 pv2VarP0 = this.a.p0(pv2Var);
        int i = crf.b;
        hj6 hj6Var = hj6.Z;
        nv2 nv2VarF0 = F0(hj6Var);
        sv2 sv2Var = nv2VarF0 instanceof sv2 ? (sv2) nv2VarF0 : null;
        nv2 nv2VarF1 = pv2VarP0.F0(hj6Var);
        sv2 sv2Var2 = nv2VarF1 instanceof sv2 ? (sv2) nv2VarF1 : null;
        if ((sv2Var instanceof ru3) && sv2Var != sv2Var2) {
            ((ru3) sv2Var).d = 0;
        }
        return new qu3(pv2VarP0);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.a + ")";
    }
}
