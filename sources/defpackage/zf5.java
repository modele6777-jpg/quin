package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zf5 extends k8a {
    public final y46 c;

    public zf5(y46 y46Var) {
        this.c = y46Var;
    }

    @Override // defpackage.k8a
    public final boolean a() {
        y46 y46Var = this.c;
        if (!y46Var.y()) {
            return false;
        }
        if (y46Var.u() > 0 || y46Var.t() > 0) {
            return true;
        }
        return y46Var.x() && y46Var.w().s();
    }
}
