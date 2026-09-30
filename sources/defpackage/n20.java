package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n20 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ n20(x16 x16Var, x16 x16Var2, x16 x16Var3, int i, int i2) {
        this.a = i2;
        this.b = x16Var;
        this.c = x16Var2;
        this.d = x16Var3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.d;
        x16 x16Var2 = this.c;
        x16 x16Var3 = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                kn2.e(x16Var3, x16Var2, x16Var, l46Var, k99.P(1));
                break;
            case 1:
                bm8.e(x16Var3, x16Var2, x16Var, l46Var, k99.P(1));
                break;
            default:
                q3c.b(x16Var3, x16Var2, x16Var, l46Var, k99.P(1));
                break;
        }
        return wefVar;
    }
}
