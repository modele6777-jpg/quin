package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o43 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ o43(String str, j09 j09Var, int i, int i2) {
        this.a = 0;
        this.c = str;
        this.b = j09Var;
        this.d = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        j09 j09Var = this.b;
        String str = this.c;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                dj6.u(k99.P(1), i2, l46Var, j09Var, str);
                break;
            case 1:
                k99.h(k99.P(i2 | 1), l46Var, j09Var, str);
                break;
            case 2:
                ga5.c(k99.P(i2 | 1), l46Var, j09Var, str);
                break;
            case 3:
                x76.d(k99.P(i2 | 1), l46Var, j09Var, str);
                break;
            case 4:
                vpf.h(k99.P(i2 | 1), l46Var, j09Var, str);
                break;
            case 5:
                if9.d(k99.P(i2 | 1), l46Var, j09Var, str);
                break;
            case 6:
                xxb.i(k99.P(i2 | 1), l46Var, j09Var, str);
                break;
            case 7:
                a6c.c(k99.P(i2 | 1), l46Var, j09Var, str);
                break;
            default:
                hfc.a(k99.P(i2 | 1), l46Var, j09Var, str);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ o43(j09 j09Var, String str, int i, int i2) {
        this.a = i2;
        this.b = j09Var;
        this.c = str;
        this.d = i;
    }

    public /* synthetic */ o43(String str, j09 j09Var, int i, int i2, byte b) {
        this.a = i2;
        this.c = str;
        this.b = j09Var;
        this.d = i;
    }
}
