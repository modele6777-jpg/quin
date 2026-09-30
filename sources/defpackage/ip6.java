package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ip6 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    int label;
    final /* synthetic */ kq6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip6(kq6 kq6Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kq6Var;
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ip6(this.this$0, this.$accountId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.label = 1;
            Object objQ = vfh.q(3000L, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        if (pa7.t(this.this$0.K0, this.$accountId)) {
            this.this$0.f();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ip6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
