package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g81 extends i09 implements al9, z41, pn4 {
    public boolean E0;
    public a26 F0;
    public final h81 Z;

    public g81(h81 h81Var, a26 a26Var) {
        this.Z = h81Var;
        this.F0 = a26Var;
        h81Var.a = this;
    }

    @Override // defpackage.al9
    public final void A0() {
        l1();
    }

    @Override // defpackage.pn4
    public final void V() {
        l1();
    }

    @Override // defpackage.rv3
    public final void b0() {
        l1();
    }

    @Override // defpackage.rv3
    public final void e() {
        l1();
    }

    @Override // defpackage.z41
    public final long f() {
        return db6.Y0(vd0.p0(this, 4).c);
    }

    @Override // defpackage.i09
    public final void f1() {
        l1();
    }

    @Override // defpackage.z41
    public final sw3 getDensity() {
        return vd0.s0(this).O0;
    }

    @Override // defpackage.z41
    public final cv7 getLayoutDirection() {
        return vd0.s0(this).P0;
    }

    public final void l1() {
        this.E0 = false;
        this.Z.b = null;
        qn4.G(this);
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        boolean z = this.E0;
        h81 h81Var = this.Z;
        if (!z) {
            h81Var.b = null;
            if9.C(this, new v6(27, this, h81Var));
            if (h81Var.b == null) {
                throw kv2.d("DrawResult not defined, did you forget to call onDraw?");
            }
            this.E0 = true;
        }
        kd9 kd9Var = h81Var.b;
        kd9Var.getClass();
        ((a26) kd9Var.b).d(im2Var);
    }

    @Override // defpackage.i09
    public final void e1() {
    }
}
