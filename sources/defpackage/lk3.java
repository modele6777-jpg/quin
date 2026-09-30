package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lk3 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ int c;

    public /* synthetic */ lk3(int i, x16 x16Var) {
        this.a = 9;
        this.c = i;
        this.b = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.b;
        int i2 = this.c;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                zk3.f(x16Var, l46Var, k99.P(i2 | 1));
                break;
            case 1:
                num.getClass();
                i7h.d(x16Var, l46Var, k99.P(i2 | 1));
                break;
            case 2:
                num.intValue();
                kj0.I(x16Var, l46Var, k99.P(i2 | 1));
                break;
            case 3:
                num.intValue();
                kj0.I(x16Var, l46Var, k99.P(i2 | 1));
                break;
            case 4:
                num.intValue();
                eb3.m(x16Var, l46Var, k99.P(i2 | 1));
                break;
            case 5:
                num.intValue();
                pa6.e(x16Var, l46Var, k99.P(i2 | 1));
                break;
            case 6:
                num.intValue();
                b87.c(x16Var, l46Var, k99.P(i2 | 1));
                break;
            case 7:
                num.getClass();
                qn4.q(x16Var, l46Var, k99.P(i2 | 1));
                break;
            case 8:
                num.intValue();
                x57.u(x16Var, l46Var, k99.P(i2 | 1));
                break;
            default:
                int iIntValue = num.intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    xxb.c(i2, x16Var, l46Var, 0);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ lk3(int i, int i2, x16 x16Var) {
        this.a = i2;
        this.b = x16Var;
        this.c = i;
    }
}
