package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eu6 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ eu6(long j, long j2, boolean z, dd2 dd2Var, int i) {
        this.b = j;
        this.c = j2;
        this.d = z;
        this.f = dd2Var;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                fu6.c((j09) obj3, this.b, this.d, this.c, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                xce.b(this.b, this.c, this.d, (dd2) obj3, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ eu6(j09 j09Var, long j, boolean z, long j2, int i) {
        this.f = j09Var;
        this.b = j;
        this.d = z;
        this.c = j2;
        this.e = i;
    }
}
