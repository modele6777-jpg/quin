package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class un9 extends czb implements l26 {
    final /* synthetic */ h0e $latestOnEdited$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un9(h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$latestOnEdited$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        un9 un9Var = new un9(this.$latestOnEdited$delegate, xn2Var);
        un9Var.L$0 = obj;
        return un9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        mbe mbeVar = (mbe) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.L$0 = null;
            this.label = 1;
            Object objA = ffe.a(mbeVar, false, iia.a, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        ((x16) this.$latestOnEdited$delegate.getValue()).invoke();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((un9) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
