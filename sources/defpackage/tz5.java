package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tz5 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tz5(j09 j09Var, String str, float f, int i, int i2) {
        this.a = 2;
        this.f = j09Var;
        this.c = str;
        this.b = f;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                eb3.t((xw9) obj4, this.b, (dd2) obj3, (l46) obj, iP, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                h7d.a((j09) obj4, this.b, (dd2) obj3, (l46) obj, iP2, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                z7c.f((j09) obj4, (String) obj3, this.b, (l46) obj, iP3, this.e);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ tz5(Object obj, float f, dd2 dd2Var, int i, int i2, int i3) {
        this.a = i3;
        this.f = obj;
        this.b = f;
        this.c = dd2Var;
        this.d = i;
        this.e = i2;
    }
}
