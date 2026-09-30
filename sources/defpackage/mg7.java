package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mg7 extends hg7 {
    public final ytc e;
    public final /* synthetic */ rg7 f;

    public mg7(rg7 rg7Var, ytc ytcVar) {
        this.f = rg7Var;
        this.e = ytcVar;
    }

    @Override // defpackage.hg7
    public final boolean m() {
        return false;
    }

    @Override // defpackage.hg7
    public final void n(Throwable th) {
        rg7 rg7Var = this.f;
        Object objK = rg7Var.K();
        if (!(objK instanceof eb2)) {
            objK = sg7.a(objK);
        }
        this.e.i(rg7Var, objK);
    }
}
