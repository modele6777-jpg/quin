package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wrf extends xrf {
    public final ace X;

    public wrf(ca1 ca1Var, xrf xrfVar, int i, h10 h10Var, t99 t99Var, tt7 tt7Var, boolean z, boolean z2, boolean z3, tt7 tt7Var2, ntd ntdVar, x16 x16Var) {
        super(ca1Var, xrfVar, i, h10Var, t99Var, tt7Var, z, z2, z3, tt7Var2, ntdVar);
        this.X = new ace(x16Var);
    }

    @Override // defpackage.xrf
    public final xrf D0(f36 f36Var, t99 t99Var, int i) {
        h10 annotations = getAnnotations();
        annotations.getClass();
        tt7 type = getType();
        type.getClass();
        return new wrf(f36Var, null, i, annotations, t99Var, type, E0(), this.w, this.x, this.y, ntd.T, new wj7(23, this));
    }
}
