package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo2 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q7b b;

    public /* synthetic */ oo2(q7b q7bVar, int i, int i2) {
        this.a = i2;
        this.b = q7bVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        q7b q7bVar = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                wq2.h(q7bVar, l46Var, k99.P(1));
                break;
            case 1:
                wq2.i(q7bVar, l46Var, k99.P(1));
                break;
            case 2:
                wq2.i(q7bVar, l46Var, k99.P(1));
                break;
            case 3:
                wq2.j(q7bVar, l46Var, k99.P(1));
                break;
            case 4:
                wq2.f(q7bVar, l46Var, k99.P(1));
                break;
            case 5:
                wq2.n(q7bVar, l46Var, k99.P(1));
                break;
            case 6:
                wq2.b(q7bVar, l46Var, k99.P(1));
                break;
            case 7:
                wq2.k(q7bVar, l46Var, k99.P(1));
                break;
            case 8:
                wq2.d(q7bVar, l46Var, k99.P(1));
                break;
            case 9:
                wq2.d(q7bVar, l46Var, k99.P(1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                wq2.n(q7bVar, l46Var, k99.P(1));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                wq2.m(q7bVar, l46Var, k99.P(1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                wq2.m(q7bVar, l46Var, k99.P(1));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                um6.b(q7bVar, l46Var, k99.P(1));
                break;
            default:
                arb.b(q7bVar, l46Var, k99.P(1));
                break;
        }
        return wefVar;
    }
}
