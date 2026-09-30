package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a6a implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ j09 e;
    public final /* synthetic */ int f;

    public /* synthetic */ a6a(String str, boolean z, x16 x16Var, j09 j09Var, int i) {
        this.b = str;
        this.c = z;
        this.d = x16Var;
        this.e = j09Var;
        this.f = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                e6a.b(k99.P(i2 | 1), this.d, (l46) obj, this.e, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                xxb.f(k99.P(i2 | 1), this.d, (l46) obj, this.e, this.b, this.c);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ a6a(String str, boolean z, j09 j09Var, x16 x16Var, int i) {
        this.b = str;
        this.c = z;
        this.e = j09Var;
        this.d = x16Var;
        this.f = i;
    }
}
