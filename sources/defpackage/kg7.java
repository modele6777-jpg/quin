package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kg7 extends hg7 {
    public final rg7 e;
    public final lg7 f;
    public final yy1 g;
    public final Object v;

    public kg7(rg7 rg7Var, lg7 lg7Var, yy1 yy1Var, Object obj) {
        this.e = rg7Var;
        this.f = lg7Var;
        this.g = yy1Var;
        this.v = obj;
    }

    @Override // defpackage.hg7
    public final boolean m() {
        return false;
    }

    @Override // defpackage.hg7
    public final void n(Throwable th) {
        yy1 yy1Var = this.g;
        yy1 yy1VarV = rg7.V(yy1Var);
        rg7 rg7Var = this.e;
        lg7 lg7Var = this.f;
        Object obj = this.v;
        if (yy1VarV == null || !rg7Var.f0(lg7Var, yy1VarV, obj)) {
            lg7Var.a.e(new e78(2), 2);
            yy1 yy1VarV2 = rg7.V(yy1Var);
            if (yy1VarV2 == null || !rg7Var.f0(lg7Var, yy1VarV2, obj)) {
                rg7Var.f(rg7Var.C(lg7Var, obj));
            }
        }
    }
}
