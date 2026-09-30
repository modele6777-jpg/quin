package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pb implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ int c;

    public /* synthetic */ pb(j09 j09Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = j09Var;
        switch (i3) {
            case 2:
                this.c = i2;
                break;
            default:
                this.c = i;
                break;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        j09 j09Var = this.b;
        int i2 = this.c;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                lc.t(i2, k99.P(1), l46Var, j09Var);
                break;
            case 1:
                num.getClass();
                qk2.c(i2, k99.P(7), l46Var, j09Var);
                break;
            case 2:
                num.getClass();
                fr.b(k99.P(1), i2, l46Var, j09Var);
                break;
            case 3:
                num.intValue();
                s21.a(j09Var, l46Var, k99.P(i2 | 1));
                break;
            case 4:
                num.getClass();
                hy9.d(i2, k99.P(1), l46Var, j09Var);
                break;
            case 5:
                num.getClass();
                rxg.u(j09Var, l46Var, k99.P(i2 | 1));
                break;
            case 6:
                num.getClass();
                jlc.a(i2, k99.P(49), l46Var, j09Var);
                break;
            case 7:
                num.getClass();
                b4d.b(i2, k99.P(49), l46Var, j09Var);
                break;
            case 8:
                num.getClass();
                eec.e(j09Var, l46Var, k99.P(i2 | 1));
                break;
            case 9:
                num.getClass();
                gvd.c(i2, k99.P(1), l46Var, j09Var);
                break;
            default:
                num.getClass();
                t4c.a(i2, k99.P(7), l46Var, j09Var);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ pb(j09 j09Var, int i, int i2, byte b) {
        this.a = i2;
        this.b = j09Var;
        this.c = i;
    }

    public /* synthetic */ pb(int i, j09 j09Var, int i2, int i3) {
        this.a = i3;
        this.c = i;
        this.b = j09Var;
    }
}
