package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cs8 implements l26 {
    public final /* synthetic */ tr8 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dd2 c;

    public cs8(tr8 tr8Var, boolean z, dd2 dd2Var) {
        this.a = tr8Var;
        this.b = z;
        this.c = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 2;
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            l46Var.f0(-864293207);
            l46Var.r(false);
            pr4 pr4Var = em2.a;
            boolean z = this.b;
            tr8 tr8Var = this.a;
            mh3.a(ib8.f(z ? tr8Var.a : tr8Var.d, pr4Var), af1.b0(-893579015, new gr1(this.c, i), l46Var), l46Var, 56);
            l46Var.f0(-863072055);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
