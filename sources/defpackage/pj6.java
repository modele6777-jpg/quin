package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pj6 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj6 b;

    public /* synthetic */ pj6(qj6 qj6Var, int i) {
        this.a = i;
        this.b = qj6Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        qj6 qj6Var = this.b;
        switch (i) {
            case 0:
                l9f l9fVar = qj6Var.K0;
                if (l9fVar == null) {
                    throw ub3.e("Font resolution state is not set.");
                }
                l9fVar.getValue();
                return wefVar;
            default:
                l9f l9fVar2 = qj6Var.K0;
                if (l9fVar2 == null) {
                    throw ub3.e("Font resolution state is not set.");
                }
                l9fVar2.getValue();
                return wefVar;
        }
    }
}
