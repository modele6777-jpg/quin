package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lzb extends hg7 {
    public final jg7 e;

    public lzb(jg7 jg7Var) {
        this.e = jg7Var;
    }

    @Override // defpackage.hg7
    public final boolean m() {
        return false;
    }

    @Override // defpackage.hg7
    public final void n(Throwable th) {
        Object objK = l().K();
        boolean z = objK instanceof eb2;
        jg7 jg7Var = this.e;
        if (z) {
            jg7Var.g(jzb.k(((eb2) objK).a));
        } else {
            jg7Var.g(sg7.a(objK));
        }
    }
}
