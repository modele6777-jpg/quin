package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class do6 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;

    public /* synthetic */ do6(int i, int i2, j09 j09Var) {
        this.a = i2;
        this.b = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        j09 j09Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                no6.t(j09Var, l46Var, k99.P(1));
                break;
            case 1:
                no6.q(j09Var, l46Var, k99.P(1));
                break;
            case 2:
                hy9.c(j09Var, l46Var, k99.P(1));
                break;
            case 3:
                hy9.b(j09Var, l46Var, k99.P(1));
                break;
            case 4:
                hy9.a(j09Var, l46Var, k99.P(1));
                break;
            case 5:
                uyb.a(j09Var, l46Var, k99.P(7));
                break;
            case 6:
                o7c.i(j09Var, l46Var, k99.P(1));
                break;
            case 7:
                b4d.h(j09Var, l46Var, k99.P(1));
                break;
            case 8:
                afc.a(j09Var, l46Var, k99.P(1));
                break;
            case 9:
                q3c.d(j09Var, l46Var, k99.P(1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                q3c.e(j09Var, l46Var, k99.P(55));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                gvd.a(j09Var, l46Var, k99.P(1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                dxd.c(j09Var, l46Var, k99.P(1));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                i3g.a(j09Var, l46Var, k99.P(1));
                break;
            default:
                t4c.p(j09Var, l46Var, k99.P(7));
                break;
        }
        return wefVar;
    }
}
