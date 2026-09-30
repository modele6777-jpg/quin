package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zwa implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ j09 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long v;
    public final /* synthetic */ int w;

    public /* synthetic */ zwa(int i, int i2, j09 j09Var, float f, float f2, long j, long j2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = j09Var;
        this.e = f;
        this.f = f2;
        this.g = j;
        this.v = j2;
        this.w = i3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(this.c | 1);
                axa.a(this.e, this.f, this.b, iP, this.w, this.g, this.v, (l46) obj, this.d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(this.w | 1);
                xo1.f(this.e, this.f, this.b, this.c, iP2, this.g, this.v, (l46) obj, this.d);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ zwa(j09 j09Var, long j, float f, long j2, int i, float f2, int i2, int i3) {
        this.d = j09Var;
        this.g = j;
        this.e = f;
        this.v = j2;
        this.b = i;
        this.f = f2;
        this.c = i2;
        this.w = i3;
    }
}
