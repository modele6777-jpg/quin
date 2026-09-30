package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ r(j09 j09Var, String str, x16 x16Var, int i) {
        this.a = 1;
        this.b = j09Var;
        this.c = str;
        this.d = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        j09 j09Var = this.b;
        x16 x16Var = this.d;
        String str = this.c;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                s.c(k99.P(1), x16Var, l46Var, j09Var, str);
                break;
            case 1:
                jgb.z(k99.P(1), x16Var, l46Var, j09Var, str);
                break;
            case 2:
                vtb.c(k99.P(1), x16Var, l46Var, j09Var, str);
                break;
            default:
                xxb.g(k99.P(1), x16Var, l46Var, j09Var, str);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ r(String str, x16 x16Var, j09 j09Var, int i, int i2) {
        this.a = i2;
        this.c = str;
        this.d = x16Var;
        this.b = j09Var;
    }
}
