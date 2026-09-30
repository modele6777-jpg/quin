package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qm1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh1 b;

    public /* synthetic */ qm1(gh1 gh1Var, int i) {
        this.a = i;
        this.b = gh1Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        boolean zT;
        int i = this.a;
        gh1 gh1Var = this.b;
        switch (i) {
            case 0:
                zT = oa7.T(gh1Var);
                break;
            default:
                xg1 xg1Var = yg1.o;
                yg1 yg1Var = gh1Var.b;
                xg1Var.getClass();
                zT = xg1.c(yg1Var);
                break;
        }
        return Boolean.valueOf(zT);
    }
}
