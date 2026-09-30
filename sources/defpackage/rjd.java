package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rjd implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ rjd(j09 j09Var, int i, boolean z, n26 n26Var, n26 n26Var2, int i2, a26 a26Var, int i3, int i4) {
        this.b = j09Var;
        this.e = i;
        this.d = z;
        this.w = n26Var;
        this.x = n26Var2;
        this.f = i2;
        this.c = a26Var;
        this.g = i3;
        this.v = i4;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.g;
        Object obj3 = this.x;
        Object obj4 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                scc.b(this.b, this.e, this.d, (n26) obj4, (n26) obj3, this.f, this.c, (l46) obj, iP, this.v);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                rrb.f((c4c) obj4, (m4c) obj3, this.b, this.c, this.d, this.e, this.f, (l46) obj, iP2, this.v);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ rjd(c4c c4cVar, m4c m4cVar, j09 j09Var, a26 a26Var, boolean z, int i, int i2, int i3, int i4) {
        this.w = c4cVar;
        this.x = m4cVar;
        this.b = j09Var;
        this.c = a26Var;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.v = i4;
    }
}
