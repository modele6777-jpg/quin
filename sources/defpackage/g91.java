package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g91 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ g91(j09 j09Var, t2g t2gVar, boolean z, boolean z2, xw9 xw9Var, dd2 dd2Var, int i) {
        this.a = 0;
        this.e = j09Var;
        this.f = t2gVar;
        this.b = z;
        this.c = z2;
        this.g = xw9Var;
        this.v = dd2Var;
        this.d = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                vd0.G((j09) obj6, (t2g) obj5, this.b, this.c, (xw9) obj4, (dd2) obj3, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iP2 = k99.P(i2 | 1);
                ap5.b((String) obj6, this.b, (x16) obj5, (String) obj4, this.c, (x16) obj3, (l46) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                ym8.f((j09) obj6, this.b, this.c, (x16) obj5, (n26) obj4, (dd2) obj3, (l46) obj, iP3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                wbe.b((j09) obj6, this.b, this.c, (vbe) obj5, (m77) obj4, (x4d) obj3, (l46) obj, iP4);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ g91(j09 j09Var, boolean z, boolean z2, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.e = j09Var;
        this.b = z;
        this.c = z2;
        this.f = obj;
        this.g = obj2;
        this.v = obj3;
        this.d = i;
    }

    public /* synthetic */ g91(String str, boolean z, x16 x16Var, String str2, boolean z2, x16 x16Var2, int i) {
        this.a = 1;
        this.e = str;
        this.b = z;
        this.f = x16Var;
        this.g = str2;
        this.c = z2;
        this.v = x16Var2;
        this.d = i;
    }
}
