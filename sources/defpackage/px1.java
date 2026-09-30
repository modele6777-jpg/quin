package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class px1 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ dd2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ px1(j09 j09Var, String str, dd2 dd2Var, int i) {
        this.b = j09Var;
        this.c = str;
        this.d = dd2Var;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(385);
                jgb.i(this.c, this.b, this.d, (l46) obj, iP, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                gu8.a(k99.P(this.e | 1), this.d, (l46) obj, this.b, this.c);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ px1(String str, j09 j09Var, dd2 dd2Var, int i, int i2) {
        this.c = str;
        this.b = j09Var;
        this.d = dd2Var;
        this.e = i2;
    }
}
