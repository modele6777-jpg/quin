package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eu8 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ dd2 c;

    public /* synthetic */ eu8(j09 j09Var, dd2 dd2Var, int i, int i2) {
        this.a = i2;
        this.b = j09Var;
        this.c = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        dd2 dd2Var = this.c;
        j09 j09Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                gu8.b(j09Var, dd2Var, l46Var, k99.P(49));
                break;
            case 1:
                lmg.J(j09Var, dd2Var, l46Var, k99.P(55));
                break;
            case 2:
                z8c.a(j09Var, dd2Var, l46Var, k99.P(49));
                break;
            case 3:
                eec.d(j09Var, dd2Var, l46Var, k99.P(49));
                break;
            default:
                y8c.g(j09Var, dd2Var, l46Var, k99.P(55));
                break;
        }
        return wefVar;
    }
}
