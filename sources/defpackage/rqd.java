package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rqd implements l26 {
    public final /* synthetic */ l26 a;
    public final /* synthetic */ dd2 b;
    public final /* synthetic */ l26 c;
    public final /* synthetic */ mue d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public rqd(l26 l26Var, dd2 dd2Var, l26 l26Var2, mue mueVar, long j, long j2) {
        this.a = l26Var;
        this.b = dd2Var;
        this.c = l26Var2;
        this.d = mueVar;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            l46Var.f0(-168976609);
            rrb.a(this.b, this.a, this.c, this.d, this.e, this.f, l46Var, 0);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
