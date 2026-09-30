package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t3g implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ l26 d;
    public final /* synthetic */ j09 e;
    public final /* synthetic */ z67 f;
    public final /* synthetic */ int g;

    public /* synthetic */ t3g(int i, int i2, l26 l26Var, j09 j09Var, z67 z67Var, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = i2;
        this.d = l26Var;
        this.e = j09Var;
        this.f = z67Var;
        this.g = i3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                uyb.i(this.b, this.c, this.d, this.e, this.f, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                uyb.g(this.b, this.c, this.d, this.e, this.f, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }
}
