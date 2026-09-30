package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pcd extends c5 {
    public long a;
    public pl1 b;

    @Override // defpackage.c5
    public final boolean a(b5 b5Var) {
        ncd ncdVar = (ncd) b5Var;
        if (this.a >= 0) {
            return false;
        }
        long j = ncdVar.w;
        if (j < ncdVar.x) {
            ncdVar.x = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.c5
    public final xn2[] b(b5 b5Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((ncd) b5Var).x(j);
    }
}
