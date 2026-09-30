package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class da2 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jse b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ dd2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ da2(jse jseVar, boolean z, dd2 dd2Var, int i, int i2) {
        this.a = i2;
        this.b = jseVar;
        this.c = z;
        this.d = dd2Var;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        dd2 dd2Var = this.d;
        boolean z = this.c;
        jse jseVar = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                urg.d(jseVar, z, dd2Var, l46Var, k99.P(i2 | 1));
                break;
            default:
                ynb.f(jseVar, z, dd2Var, l46Var, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }
}
