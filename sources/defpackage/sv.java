package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sv implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ dd2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ sv(j09 j09Var, dd2 dd2Var, int i, int i2) {
        this.a = i2;
        this.b = j09Var;
        this.c = dd2Var;
        this.d = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        dd2 dd2Var = this.c;
        j09 j09Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vfh.k(j09Var, dd2Var, l46Var, k99.P(i2 | 1));
                break;
            case 1:
                vfh.l(j09Var, dd2Var, l46Var, k99.P(i2 | 1));
                break;
            case 2:
                lt3.d(j09Var, dd2Var, l46Var, k99.P(i2 | 1));
                break;
            case 3:
                fu9.b(j09Var, dd2Var, l46Var, k99.P(i2 | 1));
                break;
            case 4:
                b21.o(j09Var, dd2Var, l46Var, k99.P(i2 | 1));
                break;
            default:
                b21.n(j09Var, dd2Var, l46Var, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }
}
