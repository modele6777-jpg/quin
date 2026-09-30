package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl1 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ j09 d;

    public /* synthetic */ zl1(int i, int i2, a26 a26Var, j09 j09Var) {
        this.b = i;
        this.c = a26Var;
        this.d = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        j09 j09Var = this.d;
        a26 a26Var = this.c;
        int i2 = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                nk8.e(k99.P(i2 | 1), a26Var, l46Var, j09Var);
                break;
            default:
                num.getClass();
                af1.v(i2, a26Var, j09Var, l46Var, k99.P(433));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ zl1(int i, a26 a26Var, j09 j09Var) {
        this.d = j09Var;
        this.c = a26Var;
        this.b = i;
    }
}
