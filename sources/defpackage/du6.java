package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class du6 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ du6(long j, x16 x16Var, a26 a26Var, x16 x16Var2, int i, int i2) {
        this.a = 2;
        this.d = j;
        this.g = x16Var;
        this.b = a26Var;
        this.c = x16Var2;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                gu6.a((gx6) obj5, (String) obj4, (j09) obj3, this.d, (l46) obj, iP, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                gu6.b((fy9) obj5, (String) obj4, (j09) obj3, this.d, (l46) obj, iP2, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                d8c.g(this.d, (x16) obj5, (a26) obj4, (x16) obj3, (l46) obj, iP3, this.f);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ du6(Object obj, String str, j09 j09Var, long j, int i, int i2, int i3) {
        this.a = i3;
        this.g = obj;
        this.b = str;
        this.c = j09Var;
        this.d = j;
        this.e = i;
        this.f = i2;
    }
}
