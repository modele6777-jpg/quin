package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ca5 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ca5(j09 j09Var, x16 x16Var, int i, int i2) {
        this.a = 2;
        this.b = j09Var;
        this.c = x16Var;
        this.d = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        x16 x16Var = this.c;
        j09 j09Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ga5.d(k99.P(i2 | 1), x16Var, l46Var, j09Var);
                break;
            case 1:
                bzd.g(k99.P(i2 | 1), x16Var, l46Var, j09Var);
                break;
            default:
                vtb.i(j09Var, x16Var, l46Var, k99.P(1), i2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ca5(j09 j09Var, x16 x16Var, int i, int i2, byte b) {
        this.a = i2;
        this.b = j09Var;
        this.c = x16Var;
        this.d = i;
    }
}
