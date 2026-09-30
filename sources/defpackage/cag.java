package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cag implements u48 {
    public final /* synthetic */ h48 a;
    public final /* synthetic */ pl1 b;
    public final /* synthetic */ x16 c;

    public cag(h48 h48Var, pl1 pl1Var, x16 x16Var) {
        this.a = h48Var;
        this.b = pl1Var;
        this.c = x16Var;
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        Object dzbVar;
        f48.Companion.getClass();
        f48 f48Var2 = f48.ON_RESUME;
        pl1 pl1Var = this.b;
        h48 h48Var = this.a;
        if (f48Var != f48Var2) {
            if (f48Var == f48.ON_DESTROY) {
                h48Var.b(this);
                pl1Var.g(new dzb(new p48(null)));
                return;
            }
            return;
        }
        h48Var.b(this);
        try {
            dzbVar = this.c.invoke();
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        pl1Var.g(dzbVar);
    }
}
