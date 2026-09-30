package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v66 implements z0e {
    public final wqf a;
    public final gle b;

    public v66(wqf wqfVar, gle gleVar) {
        this.a = wqfVar;
        this.b = gleVar;
    }

    @Override // defpackage.z0e
    public final boolean a(Exception exc) {
        this.b.b(exc);
        return true;
    }

    @Override // defpackage.z0e
    public final boolean b(vp0 vp0Var) {
        if (vp0Var.b == 4 && !this.a.a(vp0Var)) {
            String str = vp0Var.c;
            if (str != null) {
                this.b.a(new ip0(str, vp0Var.e, vp0Var.f));
                return true;
            }
            r82.g("Null token");
        }
        return false;
    }
}
