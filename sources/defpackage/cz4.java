package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ cz4(int i, String str, String str2, j09 j09Var, int i2) {
        this.a = 2;
        this.e = i;
        this.c = str;
        this.d = str2;
        this.b = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        String str = this.d;
        String str2 = this.c;
        j09 j09Var = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                k99.p(k99.P(i2 | 1), (l46) obj, j09Var, str2, str);
                break;
            case 1:
                ((Integer) obj2).getClass();
                k99.p(k99.P(i2 | 1), (l46) obj, j09Var, str2, str);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP = k99.P(1);
                hkg.M(this.e, this.c, this.d, this.b, (l46) obj, iP);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ cz4(j09 j09Var, String str, String str2, int i, int i2) {
        this.a = i2;
        this.b = j09Var;
        this.c = str;
        this.d = str2;
        this.e = i;
    }
}
