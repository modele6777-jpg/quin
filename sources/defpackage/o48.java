package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o48 implements u48, aw2 {
    public final h48 a;
    public final pv2 b;

    public o48(h48 h48Var, pv2 pv2Var) {
        pv2Var.getClass();
        this.a = h48Var;
        this.b = pv2Var;
        if (((a58) h48Var).i == g48.a) {
            tq.n(pv2Var, null);
        }
    }

    @Override // defpackage.aw2
    public final pv2 getCoroutineContext() {
        return this.b;
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        h48 h48Var = this.a;
        if (((a58) h48Var).i.compareTo(g48.a) <= 0) {
            h48Var.b(this);
            tq.n(this.b, null);
        }
    }
}
