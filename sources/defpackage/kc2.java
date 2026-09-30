package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kc2 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ j09 c;
    public final /* synthetic */ int d;

    public /* synthetic */ kc2(int i, int i2, j09 j09Var) {
        this.a = 1;
        this.b = i;
        this.c = j09Var;
        this.d = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        int i3 = this.b;
        j09 j09Var = this.c;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                jgb.t(k99.P(i3 | 1), i2, l46Var, j09Var);
                break;
            case 1:
                n16.j(i3, k99.P(i2 | 1), l46Var, j09Var);
                break;
            case 2:
                ga5.f(k99.P(i3 | 1), i2, l46Var, j09Var);
                break;
            case 3:
                no6.i(k99.P(i3 | 1), i2, l46Var, j09Var);
                break;
            case 4:
                h7d.h(k99.P(i3 | 1), i2, l46Var, j09Var);
                break;
            default:
                r8c.a(i3, k99.P(i2 | 1), l46Var, j09Var);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ kc2(j09 j09Var, int i, int i2, int i3) {
        this.a = i3;
        this.c = j09Var;
        this.b = i;
        this.d = i2;
    }
}
