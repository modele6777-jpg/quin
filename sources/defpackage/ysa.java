package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ysa implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ j09 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ysa(String str, x16 x16Var, j09 j09Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = x16Var;
        this.d = j09Var;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        j09 j09Var = this.d;
        x16 x16Var = this.c;
        String str = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                if9.b(k99.P(i2 | 1), x16Var, l46Var, j09Var, str);
                break;
            case 1:
                jzb.d(k99.P(i2 | 1), x16Var, l46Var, j09Var, str);
                break;
            default:
                jzb.e(k99.P(i2 | 1), x16Var, l46Var, j09Var, str);
                break;
        }
        return wefVar;
    }
}
