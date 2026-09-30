package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xx1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ j09 e;

    public /* synthetic */ xx1(int i, int i2, j09 j09Var, boolean z) {
        this.a = 2;
        this.b = i;
        this.d = z;
        this.e = j09Var;
        this.c = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        boolean z = this.d;
        j09 j09Var = this.e;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                kj0.i(k99.P(i3 | 1), i2, (l46) obj, j09Var, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP = k99.P(1);
                ok8.f(this.b, this.c, this.d, this.e, (l46) obj, iP);
                break;
            case 2:
                ((Integer) obj2).getClass();
                zrc.b(i3, k99.P(i2 | 1), (l46) obj, j09Var, z);
                break;
            default:
                ((Integer) obj2).getClass();
                t4c.f(k99.P(i3 | 1), i2, (l46) obj, j09Var, z);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ xx1(int i, int i2, boolean z, j09 j09Var, int i3) {
        this.a = 1;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = j09Var;
    }

    public /* synthetic */ xx1(j09 j09Var, boolean z, int i, int i2, int i3) {
        this.a = i3;
        this.e = j09Var;
        this.d = z;
        this.b = i;
        this.c = i2;
    }
}
