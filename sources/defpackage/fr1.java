package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fr1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ m26 w;

    public /* synthetic */ fr1(sdd sddVar, j09 j09Var, int i, oz ozVar, a26 a26Var, l26 l26Var, x16 x16Var, int i2) {
        this.a = 1;
        this.e = sddVar;
        this.b = j09Var;
        this.c = i;
        this.f = ozVar;
        this.g = a26Var;
        this.v = l26Var;
        this.w = x16Var;
        this.d = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        wef wefVar = wef.a;
        m26 m26Var = this.w;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                bzd.d(this.b, (x4d) obj6, (rp1) obj5, (cr1) obj4, (q11) obj3, (dd2) m26Var, (l46) obj, iP, this.d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(this.d | 1);
                g21.c((sdd) obj6, this.b, this.c, (oz) obj5, (a26) obj4, (l26) obj3, (x16) m26Var, (l46) obj, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                t4c.e(this.b, (String) obj6, (x6d) obj5, (n26) obj4, (x16) obj3, (dd2) m26Var, (l46) obj, iP3, this.d);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ fr1(j09 j09Var, Object obj, Object obj2, Object obj3, Object obj4, dd2 dd2Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = j09Var;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.v = obj4;
        this.w = dd2Var;
        this.c = i;
        this.d = i2;
    }
}
