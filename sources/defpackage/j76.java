package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j76 implements z0e {
    public final gle a;

    public j76(gle gleVar) {
        this.a = gleVar;
    }

    @Override // defpackage.z0e
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // defpackage.z0e
    public final boolean b(vp0 vp0Var) {
        int i = vp0Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.c(vp0Var.a);
        return true;
    }
}
