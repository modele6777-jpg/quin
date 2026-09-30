package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mgb implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c4c b;
    public final /* synthetic */ rf0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ mgb(c4c c4cVar, rf0 rf0Var, int i, int i2) {
        this.a = i2;
        this.b = c4cVar;
        this.c = rf0Var;
        this.d = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        rf0 rf0Var = this.c;
        c4c c4cVar = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                oa7.m(c4cVar, rf0Var, l46Var, k99.P(i2 | 1));
                break;
            default:
                drb.a(c4cVar, rf0Var, l46Var, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }
}
