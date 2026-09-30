package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kk8 implements l26 {
    public final /* synthetic */ int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ j09 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ mue w;
    public final /* synthetic */ y72 x;
    public final /* synthetic */ xw9 y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ kk8(String str, x16 x16Var, j09 j09Var, float f, float f2, float f3, boolean z, mue mueVar, y72 y72Var, xw9 xw9Var, boolean z2, int i, int i2, int i3) {
        this.a = i3;
        this.b = str;
        this.c = x16Var;
        this.d = j09Var;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.v = z;
        this.w = mueVar;
        this.x = y72Var;
        this.y = xw9Var;
        this.z = z2;
        this.X = i;
        this.Y = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.Y;
        int i3 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i3 | 1);
                int iP2 = k99.P(i2);
                pa7.h(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, (l46) obj, iP, iP2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i3 | 1);
                int iP4 = k99.P(i2);
                tm7.h(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, (l46) obj, iP3, iP4);
                break;
        }
        return wefVar;
    }
}
