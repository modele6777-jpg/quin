package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n1 implements nv2 {
    public final ov2 a;

    public n1(ov2 ov2Var) {
        this.a = ov2Var;
    }

    @Override // defpackage.pv2
    public /* bridge */ nv2 F0(ov2 ov2Var) {
        return i7h.s(this, ov2Var);
    }

    @Override // defpackage.pv2
    public /* bridge */ pv2 U(ov2 ov2Var) {
        return i7h.E(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return l26Var.z(obj, this);
    }

    @Override // defpackage.nv2
    public final ov2 getKey() {
        return this.a;
    }

    @Override // defpackage.pv2
    public final /* bridge */ pv2 p0(pv2 pv2Var) {
        return i7h.I(this, pv2Var);
    }
}
