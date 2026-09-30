package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b61 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ xw9 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ m26 z;

    public /* synthetic */ b61(x16 x16Var, j09 j09Var, boolean z, x4d x4dVar, u51 u51Var, z51 z51Var, q11 q11Var, xw9 xw9Var, n26 n26Var, int i, int i2) {
        this.a = 0;
        this.e = x16Var;
        this.b = j09Var;
        this.d = z;
        this.v = x4dVar;
        this.w = u51Var;
        this.x = z51Var;
        this.y = q11Var;
        this.c = xw9Var;
        this.z = n26Var;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.f;
        m26 m26Var = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.v;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                cgg.a((x16) obj7, this.b, this.d, (x4d) obj6, (u51) obj5, (z51) obj4, (q11) obj3, this.c, (n26) m26Var, (l46) obj, iP, this.g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                b21.e((sdd) obj6, this.b, this.c, (Integer) obj5, this.d, (a26) obj4, (l26) obj3, (x16) obj7, (dd2) m26Var, (l46) obj, iP2, this.g);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                af1.t(this.b, (j18) obj7, this.c, (tc0) obj6, (kx0) obj5, (gj5) obj4, this.d, (lu9) obj3, (a26) m26Var, (l46) obj, iP3, this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                af1.s(this.b, (j18) obj7, this.c, (wc0) obj6, (xi) obj5, (gj5) obj4, this.d, (lu9) obj3, (a26) m26Var, (l46) obj, iP4, this.g);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ b61(j09 j09Var, j18 j18Var, xw9 xw9Var, Object obj, Object obj2, gj5 gj5Var, boolean z, lu9 lu9Var, a26 a26Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = j09Var;
        this.e = j18Var;
        this.c = xw9Var;
        this.v = obj;
        this.w = obj2;
        this.x = gj5Var;
        this.d = z;
        this.y = lu9Var;
        this.z = a26Var;
        this.f = i;
        this.g = i2;
    }

    public /* synthetic */ b61(sdd sddVar, j09 j09Var, xw9 xw9Var, Integer num, boolean z, a26 a26Var, l26 l26Var, x16 x16Var, dd2 dd2Var, int i, int i2) {
        this.a = 1;
        this.v = sddVar;
        this.b = j09Var;
        this.c = xw9Var;
        this.w = num;
        this.d = z;
        this.x = a26Var;
        this.y = l26Var;
        this.e = x16Var;
        this.z = dd2Var;
        this.f = i;
        this.g = i2;
    }
}
