package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wb1 implements sif {
    public final xb1 a;
    public final lkf b;
    public final w92 c;
    public ajf d;

    public wb1(xb1 xb1Var, lkf lkfVar, w92 w92Var) {
        this.a = xb1Var;
        this.b = lkfVar;
        this.c = w92Var;
    }

    @Override // defpackage.sif
    public final void b(ajf ajfVar) {
        this.d = ajfVar;
        if (ajfVar != null) {
            w92 w92Var = this.c;
            xb1 xb1Var = this.a;
            w92Var.b(xb1Var);
            w92Var.a(xb1Var, this.b.e);
            xb1Var.a(ajfVar, false);
        }
    }

    @Override // defpackage.sif
    public final void reset() {
        xb1 xb1Var = this.a;
        synchronized (xb1Var.b) {
            try {
                za2 za2Var = xb1Var.d;
                if (za2Var != null) {
                    xb1Var.d = null;
                    za2Var.i0(new ye1("The camera control has became inactive."));
                }
                za2 za2Var2 = xb1Var.e;
                if (za2Var2 != null) {
                    xb1Var.e = null;
                    za2Var2.i0(new ye1("The camera control has became inactive."));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.b(this.a);
    }
}
