package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lk5 extends gbe implements l26 {
    final /* synthetic */ wj5 $this_debounceInternal;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk5(wj5 wj5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_debounceInternal = wj5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lk5 lk5Var = new lk5(this.$this_debounceInternal, xn2Var);
        lk5Var.L$0 = obj;
        return lk5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        awa awaVar = (awa) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wj5 wj5Var = this.$this_debounceInternal;
            kk5 kk5Var = new kk5(awaVar);
            this.L$0 = null;
            this.label = 1;
            Object objB = wj5Var.b(kk5Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lk5) k((xn2) obj2, (awa) obj)).r(wef.a);
    }
}
