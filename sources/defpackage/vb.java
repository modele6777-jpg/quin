package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vb implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ vb(j09 j09Var, String str, int i, int i2, int i3) {
        this.a = 1;
        this.f = j09Var;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        int i3 = this.d;
        wef wefVar = wef.a;
        Object obj3 = this.f;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                lc.b(this.c, this.d, (String) obj4, (fb) obj3, (l46) obj, iP);
                break;
            case 1:
                j09 j09Var = (j09) obj3;
                String str = (String) obj4;
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i3 | 1);
                jgb.s(this.c, iP2, this.e, (l46) obj, j09Var, str);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                xj3.p(this.c, this.d, (y72) obj4, (j09) obj3, (l46) obj, iP3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i3 | 1);
                o5c.b((kkc) obj4, this.c, (j09) obj3, (l46) obj, iP4, this.e);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ vb(int i, int i2, Object obj, Object obj2, int i3, int i4) {
        this.a = i4;
        this.c = i;
        this.d = i2;
        this.b = obj;
        this.f = obj2;
        this.e = i3;
    }

    public /* synthetic */ vb(kkc kkcVar, int i, j09 j09Var, int i2, int i3) {
        this.a = 3;
        this.b = kkcVar;
        this.c = i;
        this.f = j09Var;
        this.d = i2;
        this.e = i3;
    }
}
