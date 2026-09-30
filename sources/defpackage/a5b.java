package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a5b implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;

    public /* synthetic */ a5b(a26 a26Var, int i) {
        this.a = i;
        this.b = a26Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        gbd gbdVar = gbd.e;
        wef wefVar = wef.a;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                x1f x1fVar = x1f.a;
                x1f.g(p05.a, m1f.a, new zea(21));
                a26Var.d(o4b.a);
                break;
            case 1:
                a26Var.d(gbdVar);
                break;
            case 2:
                a26Var.d(gbd.a);
                break;
            case 3:
                a26Var.d(gbd.b);
                break;
            case 4:
                a26Var.d(gbd.c);
                break;
            case 5:
                a26Var.d(gbd.d);
                break;
            case 6:
                a26Var.d(gbdVar);
                break;
            case 7:
                a26Var.d(qmd.a);
                break;
            case 8:
                a26Var.d(null);
                break;
            case 9:
                a26Var.d(null);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                a26Var.d(gbdVar);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                a26Var.d(Boolean.FALSE);
                break;
            default:
                a26Var.d(Boolean.TRUE);
                break;
        }
        return wefVar;
    }
}
