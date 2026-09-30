package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qm4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a26 d;
    public final /* synthetic */ int e;

    public /* synthetic */ qm4(j09 j09Var, boolean z, a26 a26Var, int i, int i2) {
        this.a = i2;
        this.b = j09Var;
        this.c = z;
        this.d = a26Var;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        a26 a26Var = this.d;
        boolean z = this.c;
        j09 j09Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                vd0.i(k99.P(i2 | 1), a26Var, l46Var, j09Var, z);
                break;
            case 1:
                p6d.f(k99.P(i2 | 1), a26Var, l46Var, j09Var, z);
                break;
            default:
                dec.c(k99.P(i2 | 1), a26Var, l46Var, j09Var, z);
                break;
        }
        return wefVar;
    }
}
