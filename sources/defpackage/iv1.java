package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iv1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ iv1(j09 j09Var, boolean z, int i) {
        this.a = 0;
        this.d = j09Var;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        boolean z = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                cgg.h(iP, (l46) obj, (j09) obj3, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                fu6.a(z, (yi) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ym8.g(z, (l26) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                q8b.c(z, (r8b) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                eec.l((bwa) obj3, z, i2, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ iv1(int i, int i2, Object obj, boolean z) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.c = i;
    }

    public /* synthetic */ iv1(bwa bwaVar, boolean z, int i, int i2) {
        this.a = 4;
        this.d = bwaVar;
        this.b = z;
        this.c = i;
    }
}
