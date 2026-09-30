package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qgf implements nv2 {
    public final qgf a;
    public final od3 b;

    public qgf(qgf qgfVar, od3 od3Var) {
        this.a = qgfVar;
        this.b = od3Var;
    }

    @Override // defpackage.pv2
    public final /* bridge */ nv2 F0(ov2 ov2Var) {
        return i7h.s(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final /* bridge */ pv2 U(ov2 ov2Var) {
        return i7h.E(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return l26Var.z(obj, this);
    }

    public final void a(od3 od3Var) {
        if (this.b == od3Var) {
            qc0.p("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        qgf qgfVar = this.a;
        if (qgfVar != null) {
            qgfVar.a(od3Var);
        }
    }

    @Override // defpackage.nv2
    public final ov2 getKey() {
        return gec.z;
    }

    @Override // defpackage.pv2
    public final /* bridge */ pv2 p0(pv2 pv2Var) {
        return i7h.I(this, pv2Var);
    }
}
