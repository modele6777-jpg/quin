package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cs0 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ cs0(int i, int i2, x16 x16Var, boolean z, int i3) {
        this.b = i;
        this.c = i2;
        this.d = x16Var;
        this.e = z;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(this.b | 1);
                rxg.a(this.e, this.d, (l46) obj, iP, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(1);
                iec.c(this.b, this.c, this.d, this.e, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ cs0(boolean z, x16 x16Var, int i, int i2) {
        this.e = z;
        this.d = x16Var;
        this.b = i;
        this.c = i2;
    }
}
