package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc2 implements l26 {
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ lc2(int i, boolean z, j09 j09Var, x16 x16Var, a26 a26Var, int i2) {
        this.e = i;
        this.c = z;
        this.b = j09Var;
        this.g = x16Var;
        this.d = a26Var;
        this.f = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        wef wefVar = wef.a;
        Object obj3 = this.d;
        Object obj4 = this.g;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                jgb.C((j09) obj5, this.c, (xw9) obj4, (dd2) obj3, (l46) obj, iP, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                j74.p((String) obj4, (j09) obj5, this.c, (dd2) obj3, (l46) obj, iP2, this.f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                ym8.i((j09) obj5, (String) obj4, this.c, (x16) obj3, (l46) obj, iP3, this.f);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                tm7.k(this.c, (k00) obj5, (k00) obj4, (k00) obj3, (l46) obj, iP4, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(this.f | 1);
                d8c.a(this.e, this.c, (j09) obj5, (x16) obj4, (a26) obj3, (l46) obj, iP5);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ lc2(j09 j09Var, String str, boolean z, x16 x16Var, int i, int i2) {
        this.b = j09Var;
        this.g = str;
        this.c = z;
        this.d = x16Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ lc2(j09 j09Var, boolean z, xw9 xw9Var, dd2 dd2Var, int i, int i2) {
        this.b = j09Var;
        this.c = z;
        this.g = xw9Var;
        this.d = dd2Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ lc2(String str, j09 j09Var, boolean z, dd2 dd2Var, int i, int i2) {
        this.g = str;
        this.b = j09Var;
        this.c = z;
        this.d = dd2Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ lc2(boolean z, k00 k00Var, k00 k00Var2, k00 k00Var3, int i, int i2) {
        this.c = z;
        this.b = k00Var;
        this.g = k00Var2;
        this.d = k00Var3;
        this.e = i;
        this.f = i2;
    }
}
