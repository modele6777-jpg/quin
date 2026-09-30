package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cv implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ int e;

    public /* synthetic */ cv(j09 j09Var, x16 x16Var, boolean z, int i) {
        this.a = 0;
        this.b = j09Var;
        this.d = x16Var;
        this.c = z;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        j09 j09Var = this.b;
        x16 x16Var = this.d;
        boolean z = this.c;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                i7h.i(k99.P(i2 | 1), x16Var, l46Var, j09Var, z);
                break;
            case 1:
                num.intValue();
                kj0.r(k99.P(i2 | 1), x16Var, l46Var, j09Var, z);
                break;
            case 2:
                num.getClass();
                ga5.e(k99.P(i2 | 1), x16Var, l46Var, j09Var, z);
                break;
            case 3:
                num.getClass();
                ok8.e(k99.P(i2 | 1), x16Var, l46Var, j09Var, z);
                break;
            default:
                num.getClass();
                v2c.b(k99.P(i2 | 1), x16Var, l46Var, j09Var, z);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ cv(j09 j09Var, boolean z, x16 x16Var, int i, int i2) {
        this.a = i2;
        this.b = j09Var;
        this.c = z;
        this.d = x16Var;
        this.e = i;
    }

    public /* synthetic */ cv(boolean z, x16 x16Var, j09 j09Var, int i) {
        this.a = 4;
        this.c = z;
        this.d = x16Var;
        this.b = j09Var;
        this.e = i;
    }
}
