package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik3 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ik3(String str, x16 x16Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = x16Var;
        this.d = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        x16 x16Var = this.c;
        String str = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.intValue();
                zk3.e(str, x16Var, l46Var, k99.P(i2 | 1));
                break;
            default:
                num.getClass();
                j74.n(str, x16Var, l46Var, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }
}
