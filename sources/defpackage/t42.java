package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t42 implements l26 {
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ m26 w;

    public /* synthetic */ t42(int i, String str, boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, dd2 dd2Var, int i2) {
        this.d = i;
        this.f = str;
        this.c = z;
        this.b = x16Var;
        this.g = x16Var2;
        this.v = x16Var3;
        this.w = dd2Var;
        this.e = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        wef wefVar = wef.a;
        m26 m26Var = this.w;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.b;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(1);
                x57.f((k00) obj6, (j09) obj5, (mue) obj4, this.c, this.d, this.e, (a26) obj3, (a26) m26Var, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                bm8.h((x16) obj6, (j09) obj5, this.c, (cu6) obj4, (x4d) obj3, (l26) m26Var, (l46) obj, iP2, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                c8b.c((j09) obj5, (mue) obj4, this.c, (xw9) obj6, (x16) obj3, (dd2) m26Var, (l46) obj, iP3, this.e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                c8b.d((j09) obj5, (String) obj6, (mue) obj4, this.c, (xw9) obj3, (x16) m26Var, (l46) obj, iP4, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(this.e | 1);
                xxb.d(this.d, (String) obj6, this.c, (x16) obj5, (x16) obj4, (x16) obj3, (dd2) m26Var, (l46) obj, iP5);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ t42(k00 k00Var, j09 j09Var, mue mueVar, boolean z, int i, int i2, a26 a26Var, a26 a26Var2, int i3) {
        this.f = k00Var;
        this.b = j09Var;
        this.g = mueVar;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.v = a26Var;
        this.w = a26Var2;
    }

    public /* synthetic */ t42(x16 x16Var, j09 j09Var, boolean z, cu6 cu6Var, x4d x4dVar, l26 l26Var, int i, int i2) {
        this.f = x16Var;
        this.b = j09Var;
        this.c = z;
        this.g = cu6Var;
        this.v = x4dVar;
        this.w = l26Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ t42(j09 j09Var, mue mueVar, boolean z, xw9 xw9Var, x16 x16Var, dd2 dd2Var, int i, int i2) {
        this.b = j09Var;
        this.g = mueVar;
        this.c = z;
        this.f = xw9Var;
        this.v = x16Var;
        this.w = dd2Var;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ t42(j09 j09Var, String str, mue mueVar, boolean z, xw9 xw9Var, x16 x16Var, int i, int i2) {
        this.b = j09Var;
        this.f = str;
        this.g = mueVar;
        this.c = z;
        this.v = xw9Var;
        this.w = x16Var;
        this.d = i;
        this.e = i2;
    }
}
