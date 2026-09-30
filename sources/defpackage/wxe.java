package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wxe implements occ {
    public final occ a;
    public final long b;

    public wxe(occ occVar, long j) {
        this.a = occVar;
        this.b = j;
    }

    @Override // defpackage.occ
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.occ
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.occ
    public final int c(fz3 fz3Var, tm3 tm3Var, int i) {
        int iC = this.a.c(fz3Var, tm3Var, i);
        if (iC == -4) {
            tm3Var.g += this.b;
        }
        return iC;
    }

    @Override // defpackage.occ
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.occ
    public final int e(long j) {
        return this.a.e(j - this.b);
    }
}
