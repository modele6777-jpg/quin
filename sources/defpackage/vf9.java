package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf9 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf9 b;

    public /* synthetic */ vf9(yf9 yf9Var, int i) {
        this.a = i;
        this.b = yf9Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        yf9 yf9Var = this.b;
        switch (i) {
            case 0:
                vl1 vl1Var = yf9Var.g1;
                vl1Var.getClass();
                yf9Var.b1(vl1Var, yf9Var.f1);
                break;
            default:
                yf9 yf9Var2 = yf9Var.N0;
                if (yf9Var2 != null) {
                    yf9Var2.p1();
                }
                break;
        }
        return wefVar;
    }
}
