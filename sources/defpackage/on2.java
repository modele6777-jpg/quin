package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class on2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ on2(x16 x16Var, boolean z) {
        this.a = 12;
        this.c = x16Var;
        this.b = z;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        p05 p05Var = p05.a;
        wef wefVar = wef.a;
        x16 x16Var = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (z) {
                    x16Var.invoke();
                }
                break;
            case 1:
                if (!z) {
                    x16Var.invoke();
                }
                break;
            case 2:
                if (!z) {
                    x16Var.invoke();
                }
                break;
            case 3:
                if (!z) {
                    x16Var.invoke();
                } else {
                    jcc.k(1, "Unexpected error:1001");
                }
                break;
            case 4:
                if (!z) {
                    x16Var.invoke();
                }
                break;
            case 5:
                if (z) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05Var, new pdc(20), 2);
                }
                x16Var.invoke();
                break;
            case 6:
                if (z) {
                    x1f x1fVar2 = x1f.a;
                    x1f.k(p05Var, new pdc(23), 2);
                }
                x16Var.invoke();
                break;
            case 7:
                if (z) {
                    x1f x1fVar3 = x1f.a;
                    x1f.k(p05Var, new pdc(25), 2);
                }
                x16Var.invoke();
                break;
            case 8:
                if (z) {
                    x1f x1fVar4 = x1f.a;
                    x1f.k(p05Var, new fnc(5), 2);
                }
                x16Var.invoke();
                break;
            case 9:
                if (z) {
                    x1f x1fVar5 = x1f.a;
                    x1f.k(p05Var, new fnc(6), 2);
                }
                x16Var.invoke();
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                if (z) {
                    x1f x1fVar6 = x1f.a;
                    x1f.k(p05Var, new fnc(10), 2);
                }
                x16Var.invoke();
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (z) {
                    x1f x1fVar7 = x1f.a;
                    x1f.k(p05Var, new fnc(12), 2);
                }
                x16Var.invoke();
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                x1f x1fVar8 = x1f.a;
                x1f.k(p05Var, new pi2(z, 8), 2);
                x16Var.invoke();
                break;
            default:
                if (z) {
                    x16Var.invoke();
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ on2(boolean z, x16 x16Var, int i) {
        this.a = i;
        this.b = z;
        this.c = x16Var;
    }
}
