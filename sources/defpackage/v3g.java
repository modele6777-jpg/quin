package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v3g implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l26 b;
    public final /* synthetic */ int c;

    public /* synthetic */ v3g(int i, int i2, l26 l26Var) {
        this.a = i2;
        this.b = l26Var;
        this.c = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        l26 l26Var = this.b;
        Integer num = (Integer) obj;
        num.intValue();
        switch (i) {
            case 0:
                l26Var.z(Integer.valueOf(i2), num);
                break;
            default:
                l26Var.z(Integer.valueOf(i2), num);
                break;
        }
        return wefVar;
    }
}
