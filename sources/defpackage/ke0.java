package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ke0 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ke0(j09 j09Var, String str, String str2, int i) {
        this.a = 1;
        this.b = j09Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        j09 j09Var = this.b;
        String str = this.d;
        String str2 = this.c;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ynb.a(k99.P(1), l46Var, j09Var, str2, str);
                break;
            case 1:
                vd0.v(k99.P(7), l46Var, j09Var, str2, str);
                break;
            case 2:
                ynb.n(k99.P(3457), l46Var, j09Var, str2, str);
                break;
            case 3:
                tq.j(k99.P(1), l46Var, j09Var, str2, str);
                break;
            default:
                xxb.h(k99.P(385), l46Var, j09Var, str2, str);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ke0(int i, String str, String str2, j09 j09Var, int i2) {
        this.a = i2;
        this.c = str;
        this.d = str2;
        this.b = j09Var;
    }
}
