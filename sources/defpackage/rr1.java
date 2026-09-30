package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rr1 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ int c;

    public /* synthetic */ rr1(int i, int i2, a26 a26Var) {
        this.a = i2;
        this.b = a26Var;
        this.c = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                a26Var.d(Integer.valueOf(i2));
                break;
            case 1:
                a26Var.d(Integer.valueOf(i2));
                break;
            case 2:
                a26Var.d(Integer.valueOf(i2));
                break;
            case 3:
                a26Var.d(Integer.valueOf(i2));
                break;
            case 4:
                a26Var.d(Integer.valueOf(i2));
                break;
            case 5:
                a26Var.d(Integer.valueOf(i2));
                break;
            case 6:
                a26Var.d(Integer.valueOf(i2));
                break;
            case 7:
                a26Var.d(Integer.valueOf(i2));
                break;
            case 8:
                a26Var.d(Integer.valueOf(i2));
                break;
            case 9:
                a26Var.d(Integer.valueOf(i2));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                a26Var.d(Integer.valueOf(i2));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new xp(i2, 19), 2);
                a26Var.d(Integer.valueOf(i2));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                a26Var.d(Integer.valueOf(i2));
                break;
            default:
                a26Var.d(Integer.valueOf(i2));
                break;
        }
        return wefVar;
    }
}
