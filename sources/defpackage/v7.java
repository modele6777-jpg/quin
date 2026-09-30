package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v7 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ v7(x9 x9Var, String str, x16 x16Var, int i, int i2) {
        this.a = i2;
        this.b = x9Var;
        this.c = str;
        this.d = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.d;
        String str = this.c;
        x9 x9Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                af1.b(x9Var, str, x16Var, l46Var, k99.P(9));
                break;
            default:
                an1.a(x9Var, str, x16Var, l46Var, k99.P(9));
                break;
        }
        return wefVar;
    }
}
