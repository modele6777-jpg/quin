package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p8 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ j09 c;

    public /* synthetic */ p8(j09 j09Var, String str, int i, int i2) {
        this.a = i2;
        this.c = j09Var;
        this.b = str;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        String str = this.b;
        j09 j09Var = this.c;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                x8.c(k99.P(1), l46Var, j09Var, str);
                break;
            case 1:
                jgb.y(k99.P(1), l46Var, j09Var, str);
                break;
            case 2:
                rs0.e(k99.P(1), l46Var, j09Var, str);
                break;
            case 3:
                b21.b(k99.P(1), l46Var, j09Var, str);
                break;
            case 4:
                kj0.x(k99.P(7), l46Var, j09Var, str);
                break;
            case 5:
                kj0.w(k99.P(1), l46Var, j09Var, str);
                break;
            case 6:
                pa7.g(k99.P(1), l46Var, j09Var, str);
                break;
            case 7:
                feg.f(k99.P(49), l46Var, j09Var, str);
                break;
            case 8:
                no6.p(k99.P(49), l46Var, j09Var, str);
                break;
            case 9:
                if9.c(k99.P(1), l46Var, j09Var, str);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                p8c.h(k99.P(49), l46Var, j09Var, str);
                break;
            default:
                v6d.a(k99.P(7), l46Var, j09Var, str);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ p8(String str, j09 j09Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = j09Var;
    }
}
