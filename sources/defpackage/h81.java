package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h81 implements sw3 {
    public z41 a = ndb.Q0;
    public kd9 b;

    public final kd9 a(a26 a26Var) {
        return b(new hy0(a26Var, 1));
    }

    public final kd9 b(a26 a26Var) {
        kd9 kd9Var = new kd9(11, false);
        kd9Var.b = a26Var;
        this.b = kd9Var;
        return kd9Var;
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.a.getDensity().getDensity();
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.a.getDensity().h0();
    }
}
