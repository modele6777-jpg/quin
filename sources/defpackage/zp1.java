package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zp1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;

    public /* synthetic */ zp1(int i, int i2, int i3, j09 j09Var, int i4) {
        this.a = 0;
        this.b = i;
        this.c = i2;
        this.e = i3;
        this.d = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        int i3 = this.c;
        int i4 = this.b;
        wef wefVar = wef.a;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(1);
                uq1.i(this.b, this.c, this.e, (j09) obj3, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                dj6.o(i4, i3, (j09) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                no6.j(i4, i3, (j09) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                z83.k(i4, i3, (l26) obj3, (l46) obj, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ zp1(int i, int i2, int i3, int i4, Object obj) {
        this.a = i4;
        this.b = i;
        this.c = i2;
        this.d = obj;
        this.e = i3;
    }
}
