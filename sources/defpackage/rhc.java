package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rhc implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yhc b;

    public /* synthetic */ rhc(yhc yhcVar, int i) {
        this.a = i;
        this.b = yhcVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        yhc yhcVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(yhcVar.Y);
            default:
                oo5 oo5Var = yhcVar.i1;
                if (!oo5Var.a.Y) {
                    return null;
                }
                ko5 ko5VarQ1 = oo5Var.q1();
                if (!ko5VarQ1.a()) {
                    return null;
                }
                if (ko5VarQ1.b()) {
                    return oo5Var.o1(null);
                }
                oo5 oo5VarG = ((bo5) vd0.t0(oo5Var).getFocusOwner()).g();
                if (oo5VarG != null) {
                    return oo5VarG.o1(vd0.r0(oo5Var));
                }
                return null;
        }
    }
}
