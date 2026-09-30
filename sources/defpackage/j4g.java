package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j4g implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ted b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ dd2 d;

    public /* synthetic */ j4g(ted tedVar, x16 x16Var, dd2 dd2Var, int i, int i2) {
        this.a = i2;
        this.b = tedVar;
        this.c = x16Var;
        this.d = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        dd2 dd2Var = this.d;
        x16 x16Var = this.c;
        ted tedVar = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                v2c.n(tedVar, x16Var, dd2Var, l46Var, k99.P(385));
                break;
            default:
                t4c.k(tedVar, x16Var, dd2Var, l46Var, k99.P(385));
                break;
        }
        return wefVar;
    }
}
