package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o31 extends i09 {
    public k31 Z;

    public o31(k31 k31Var) {
        this.Z = k31Var;
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.i09
    public final void d1() {
        l1(this.Z);
    }

    @Override // defpackage.i09
    public final void e1() {
        k31 k31Var = this.Z;
        if (k31Var instanceof n31) {
            ((n31) k31Var).a.j(this);
        }
    }

    public final void l1(k31 k31Var) {
        k31 k31Var2 = this.Z;
        if (k31Var2 instanceof n31) {
            ((n31) k31Var2).a.j(this);
        }
        if (k31Var instanceof n31) {
            ((n31) k31Var).a.b(this);
        }
        this.Z = k31Var;
    }
}
