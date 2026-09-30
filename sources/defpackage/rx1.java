package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx1 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ dd2 d;

    public /* synthetic */ rx1(j09 j09Var, boolean z, dd2 dd2Var, int i) {
        this.b = j09Var;
        this.c = z;
        this.d = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        dd2 dd2Var = this.d;
        boolean z = this.c;
        j09 j09Var = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                jgb.d(k99.P(385), dd2Var, l46Var, j09Var, z);
                break;
            default:
                vd0.l(k99.P(433), dd2Var, l46Var, j09Var, z);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ rx1(boolean z, j09 j09Var, dd2 dd2Var, int i) {
        this.c = z;
        this.b = j09Var;
        this.d = dd2Var;
    }
}
