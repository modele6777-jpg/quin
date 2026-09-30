package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e33 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j09 c;

    public /* synthetic */ e33(int i, int i2, j09 j09Var, boolean z) {
        this.a = i2;
        this.b = z;
        this.c = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        j09 j09Var = this.c;
        boolean z = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                db6.b(k99.P(1), l46Var, j09Var, z);
                break;
            default:
                uyb.d(k99.P(1), l46Var, j09Var, z);
                break;
        }
        return wefVar;
    }
}
