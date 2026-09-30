package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y7 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ use c;

    public /* synthetic */ y7(use useVar, a26 a26Var) {
        this.a = 0;
        this.c = useVar;
        this.b = a26Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        use useVar = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                String string = useVar.d().c.toString();
                if (!v4e.Q(string)) {
                    a26Var.d(string);
                }
                break;
            case 1:
                a26Var.d(useVar.d().c.toString());
                break;
            case 2:
                a26Var.d(useVar.d().c.toString());
                break;
            case 3:
                a26Var.d(useVar.d().c.toString());
                break;
            default:
                a26Var.d(useVar.d().c.toString());
                break;
        }
        return wefVar;
    }

    public /* synthetic */ y7(a26 a26Var, use useVar, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = useVar;
    }
}
