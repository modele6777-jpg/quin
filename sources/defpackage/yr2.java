package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yr2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ yr2(s4g s4gVar, e89 e89Var, e89 e89Var2) {
        this.a = 1;
        this.b = e89Var;
        this.c = e89Var2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        e89 e89Var2 = this.b;
        switch (i) {
            case 0:
                lt2.b(e89Var2, e89Var);
                break;
            case 1:
                hs3 hs3Var = xqa.G0;
                Boolean bool = Boolean.TRUE;
                ynb.V(lw2.a, null, null, new n5g(hs3Var.a, bool, null), 3);
                lt2.b(e89Var2, e89Var);
                break;
            case 2:
                e89Var2.setValue(Boolean.FALSE);
                e89Var.setValue(Boolean.TRUE);
                break;
            default:
                String str = (String) e89Var2.getValue();
                w77 w77Var = new w77(e89Var, 18);
                if (str != null) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05(str), w77Var, 2);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ yr2(e89 e89Var, e89 e89Var2, int i) {
        this.a = i;
        this.b = e89Var;
        this.c = e89Var2;
    }
}
