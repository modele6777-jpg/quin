package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t11 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ t11(mic micVar, j09 j09Var, x4d x4dVar, long j, q11 q11Var, int i, int i2) {
        this.e = micVar;
        this.f = j09Var;
        this.g = x4dVar;
        this.b = j;
        this.v = q11Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                pa7.o((ted) obj6, this.b, (x16) obj5, (x16) obj4, (x16) obj3, (l46) obj, iP, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                af1.m((mic) obj6, (j09) obj5, (x4d) obj4, this.b, (q11) obj3, (l46) obj, iP2, this.d);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ t11(ted tedVar, long j, x16 x16Var, x16 x16Var2, x16 x16Var3, int i, int i2) {
        this.e = tedVar;
        this.b = j;
        this.f = x16Var;
        this.g = x16Var2;
        this.v = x16Var3;
        this.c = i;
        this.d = i2;
    }
}
