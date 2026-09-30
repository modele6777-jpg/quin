package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s11 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s11(j09 j09Var, long j, float f, dd2 dd2Var, int i, int i2) {
        this.b = j09Var;
        this.d = j;
        this.c = f;
        this.g = dd2Var;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                oa7.b(this.b, this.d, this.c, (dd2) obj3, (l46) obj, iP, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                ((i8c) obj3).n(this.b, this.c, this.d, (l46) obj, iP2, this.f);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ s11(i8c i8cVar, j09 j09Var, float f, long j, int i, int i2) {
        this.g = i8cVar;
        this.b = j09Var;
        this.c = f;
        this.d = j;
        this.e = i;
        this.f = i2;
    }
}
