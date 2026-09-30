package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t7b implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ mue d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ x16 f;
    public final /* synthetic */ int g;

    public /* synthetic */ t7b(j09 j09Var, String str, mue mueVar, boolean z, x16 x16Var, int i) {
        this.b = j09Var;
        this.c = str;
        this.d = mueVar;
        this.e = z;
        this.f = x16Var;
        this.g = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(this.g | 1);
                c8b.g(this.b, this.c, this.d, this.e, this.f, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(1);
                c8b.f(this.b, this.c, this.d, this.e, this.f, (l46) obj, iP2, this.g);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ t7b(j09 j09Var, String str, mue mueVar, boolean z, x16 x16Var, int i, int i2) {
        this.b = j09Var;
        this.c = str;
        this.d = mueVar;
        this.e = z;
        this.f = x16Var;
        this.g = i2;
    }
}
