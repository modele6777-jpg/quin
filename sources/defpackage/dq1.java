package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dq1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ dq1(int i, int i2) {
        this.a = 2;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        int i3 = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                uq1.h(i3, i2, l46Var, k99.P(1));
                break;
            case 1:
                num.getClass();
                z83.j(i3, i2, l46Var, k99.P(1));
                break;
            case 2:
                num.intValue();
                o5c.d(i3, k99.P(i2 | 1), l46Var);
                break;
            default:
                num.getClass();
                zyf.e(i3, i2, l46Var, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ dq1(int i, int i2, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = i2;
    }
}
