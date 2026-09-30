package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b11 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ x01 f;
    public final /* synthetic */ dd2 g;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    public /* synthetic */ b11(j09 j09Var, boolean z, boolean z2, String str, x01 x01Var, dd2 dd2Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = j09Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = x01Var;
        this.g = dd2Var;
        this.v = i;
        this.w = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.v;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                n16.e(this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, iP, this.w);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                n16.c(this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, iP2, this.w);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                n16.f(this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, iP3, this.w);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                n16.d(this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, iP4, this.w);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(i2 | 1);
                n16.b(this.b, this.c, this.d, this.e, this.f, this.g, (l46) obj, iP5, this.w);
                break;
        }
        return wefVar;
    }
}
