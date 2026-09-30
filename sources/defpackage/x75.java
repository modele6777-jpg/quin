package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x75 implements l26 {
    public final /* synthetic */ y75 a;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ o89 d;
    public final /* synthetic */ e89 e;
    public final /* synthetic */ ghc f;
    public final /* synthetic */ x4d g;
    public final /* synthetic */ long v;
    public final /* synthetic */ float w;
    public final /* synthetic */ dd2 x;

    public x75(y75 y75Var, j09 j09Var, boolean z, o89 o89Var, e89 e89Var, ghc ghcVar, x4d x4dVar, long j, float f, dd2 dd2Var) {
        this.a = y75Var;
        this.b = j09Var;
        this.c = z;
        this.d = o89Var;
        this.e = e89Var;
        this.f = ghcVar;
        this.g = x4dVar;
        this.v = j;
        this.w = f;
        this.x = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            y75 y75Var = this.a;
            g21.k(jgb.Z(this.b, new sg(this.c, y75Var.c, y75Var.d)), this.d, this.e, this.f, this.g, this.v, this.w, this.x, l46Var, 384);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
