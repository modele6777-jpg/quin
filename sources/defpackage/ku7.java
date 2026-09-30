package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ku7 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ku7(String str, x16 x16Var, boolean z, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = x16Var;
        this.d = z;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.c;
        boolean z = this.d;
        String str = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vfh.a(k99.P(1), x16Var, l46Var, str, z);
                break;
            case 1:
                njb.a(k99.P(1), x16Var, l46Var, str, z);
                break;
            case 2:
                njb.a(k99.P(1), x16Var, l46Var, str, z);
                break;
            case 3:
                xxb.e(k99.P(1), x16Var, l46Var, str, z);
                break;
            case 4:
                xld.e(k99.P(1), x16Var, l46Var, str, z);
                break;
            default:
                xld.d(k99.P(1), x16Var, l46Var, str, z);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ku7(String str, boolean z, x16 x16Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.d = z;
        this.c = x16Var;
    }
}
