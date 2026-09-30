package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dt5 implements l26 {
    public final /* synthetic */ j09 X;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ mic b;
    public final /* synthetic */ ju5 c;
    public final /* synthetic */ a26 d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ x16 f;
    public final /* synthetic */ x16 g;
    public final /* synthetic */ x16 v;
    public final /* synthetic */ x16 w;
    public final /* synthetic */ x16 x;
    public final /* synthetic */ x16 y;
    public final /* synthetic */ x16 z;

    public /* synthetic */ dt5(mic micVar, ju5 ju5Var, a26 a26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, x16 x16Var6, x16 x16Var7, x16 x16Var8, j09 j09Var) {
        this.b = micVar;
        this.c = ju5Var;
        this.d = a26Var;
        this.e = x16Var;
        this.f = x16Var2;
        this.g = x16Var3;
        this.v = x16Var4;
        this.w = x16Var5;
        this.x = x16Var6;
        this.y = x16Var7;
        this.z = x16Var8;
        this.X = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    kj0.o(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, l46Var, 64);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                kj0.o(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, (l46) obj, k99.P(65));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ dt5(mic micVar, ju5 ju5Var, a26 a26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, x16 x16Var6, x16 x16Var7, x16 x16Var8, j09 j09Var, int i) {
        this.b = micVar;
        this.c = ju5Var;
        this.d = a26Var;
        this.e = x16Var;
        this.f = x16Var2;
        this.g = x16Var3;
        this.v = x16Var4;
        this.w = x16Var5;
        this.x = x16Var6;
        this.y = x16Var7;
        this.z = x16Var8;
        this.X = j09Var;
    }
}
