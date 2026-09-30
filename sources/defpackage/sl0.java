package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sl0 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ sl0(int i, a26 a26Var, j09 j09Var) {
        this.a = 2;
        this.c = a26Var;
        this.b = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        j09 j09Var = this.b;
        a26 a26Var = this.c;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                feg.a(k99.P(7), a26Var, l46Var, j09Var);
                break;
            case 1:
                vd0.s(k99.P(1), a26Var, l46Var, j09Var);
                break;
            default:
                rrb.e(k99.P(1), a26Var, l46Var, j09Var);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ sl0(int i, int i2, a26 a26Var, j09 j09Var) {
        this.a = i2;
        this.b = j09Var;
        this.c = a26Var;
    }
}
