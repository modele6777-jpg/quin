package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d1b implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ mue c;
    public final /* synthetic */ l26 d;
    public final /* synthetic */ int e;

    public /* synthetic */ d1b(long j, mue mueVar, l26 l26Var, int i, int i2) {
        this.a = i2;
        this.b = j;
        this.c = mueVar;
        this.d = l26Var;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iP = k99.P(i2 | 1);
                cgg.l(this.b, this.c, this.d, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                iec.b(this.b, this.c, this.d, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }
}
