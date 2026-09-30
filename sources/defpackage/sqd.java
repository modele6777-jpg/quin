package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sqd implements l26 {
    public final /* synthetic */ l26 a;
    public final /* synthetic */ dd2 b;
    public final /* synthetic */ l26 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public sqd(l26 l26Var, dd2 dd2Var, l26 l26Var2, long j, long j2) {
        this.a = l26Var;
        this.b = dd2Var;
        this.c = l26Var2;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            mh3.a(nte.a.a(r9f.a(bm8.L, l46Var)), af1.b0(969655473, new rqd(this.a, this.b, this.c, r9f.a(bm8.I, l46Var), this.d, this.e), l46Var), l46Var, 56);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
