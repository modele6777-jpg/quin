package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u77 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ u77(j09 j09Var, String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, x16 x16Var, int i, int i2) {
        this.b = j09Var;
        this.v = str;
        this.w = str2;
        this.x = str3;
        this.y = str4;
        this.c = z;
        this.z = str5;
        this.d = z2;
        this.e = x16Var;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.f;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        Object obj6 = this.w;
        Object obj7 = this.v;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                b87.d(this.b, (String) obj7, (String) obj6, (String) obj5, (String) obj4, this.c, (String) obj3, this.d, this.e, (l46) obj, iP, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                c8b.k(this.b, this.c, (x4d) obj7, (u51) obj6, (q11) obj5, (xw9) obj4, this.d, this.e, (n26) obj3, (l46) obj, iP2, this.g);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ u77(j09 j09Var, boolean z, x4d x4dVar, u51 u51Var, q11 q11Var, xw9 xw9Var, boolean z2, x16 x16Var, n26 n26Var, int i, int i2) {
        this.b = j09Var;
        this.c = z;
        this.v = x4dVar;
        this.w = u51Var;
        this.x = q11Var;
        this.y = xw9Var;
        this.d = z2;
        this.e = x16Var;
        this.z = n26Var;
        this.f = i;
        this.g = i2;
    }
}
