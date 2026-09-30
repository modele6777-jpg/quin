package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gv0 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jse b;

    public /* synthetic */ gv0(jse jseVar, int i, int i2) {
        this.a = i2;
        this.b = jseVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        jse jseVar = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                tv0.f(jseVar, l46Var, k99.P(1));
                break;
            default:
                tv0.e(jseVar, l46Var, k99.P(1));
                break;
        }
        return wefVar;
    }
}
