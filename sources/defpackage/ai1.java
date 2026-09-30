package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ int e;

    public /* synthetic */ ai1(int i, x16 x16Var, x16 x16Var2, x16 x16Var3, int i2) {
        this.a = 2;
        this.e = i;
        this.b = x16Var;
        this.c = x16Var2;
        this.d = x16Var3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        x16 x16Var = this.d;
        x16 x16Var2 = this.c;
        x16 x16Var3 = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                qn4.e(x16Var3, x16Var2, x16Var, (l46) obj, k99.P(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                z7f.d(x16Var3, x16Var2, x16Var, (l46) obj, k99.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iP = k99.P(1);
                d8c.h(this.e, this.b, this.c, this.d, (l46) obj, iP);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ai1(x16 x16Var, x16 x16Var2, x16 x16Var3, int i, int i2) {
        this.a = i2;
        this.b = x16Var;
        this.c = x16Var2;
        this.d = x16Var3;
        this.e = i;
    }
}
