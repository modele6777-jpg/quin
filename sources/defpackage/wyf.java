package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wyf implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;

    public /* synthetic */ wyf(int i, float f, int i2) {
        this.a = 0;
        this.c = i;
        this.b = f;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        float f = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                zyf.f(i2, f, l46Var, k99.P(1));
                break;
            case 1:
                num.intValue();
                zyf.c(f, l46Var, k99.P(i2 | 1));
                break;
            case 2:
                num.intValue();
                h4g.k(f, l46Var, k99.P(i2 | 1));
                break;
            default:
                num.intValue();
                h4g.a(f, l46Var, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ wyf(float f, int i, int i2) {
        this.a = i2;
        this.b = f;
        this.c = i;
    }
}
