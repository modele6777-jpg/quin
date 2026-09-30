package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lt implements l26 {
    public final /* synthetic */ j09 a;
    public final /* synthetic */ o89 b;
    public final /* synthetic */ e89 c;
    public final /* synthetic */ ghc d;
    public final /* synthetic */ x4d e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ dd2 v;

    public lt(j09 j09Var, o89 o89Var, e89 e89Var, ghc ghcVar, x4d x4dVar, long j, float f, dd2 dd2Var) {
        this.a = j09Var;
        this.b = o89Var;
        this.c = e89Var;
        this.d = ghcVar;
        this.e = x4dVar;
        this.f = j;
        this.g = f;
        this.v = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            g21.k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, l46Var, 384);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
