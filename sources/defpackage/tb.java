package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tb implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tb(boolean z, long j, Object obj, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = j;
        this.e = obj;
        this.d = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.d;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                lc.a(k99.P(i2 | 1), this.c, (x16) obj3, (l46) obj, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                kj0.N(this.b, this.c, (j09) obj3, (l46) obj, iP);
                break;
        }
        return wefVar;
    }
}
