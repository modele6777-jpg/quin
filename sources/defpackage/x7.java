package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x7 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ int e;

    public /* synthetic */ x7(String str, a26 a26Var, x16 x16Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = a26Var;
        this.d = x16Var;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        x16 x16Var = this.d;
        a26 a26Var = this.c;
        String str = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                af1.k(str, a26Var, x16Var, l46Var, k99.P(i2 | 1));
                break;
            default:
                an1.c(str, a26Var, x16Var, l46Var, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }
}
