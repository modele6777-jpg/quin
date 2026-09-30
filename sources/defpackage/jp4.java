package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jp4 extends gbe implements l26 {
    final /* synthetic */ ft1 $cardReturnTransition;
    final /* synthetic */ e89 $returnPhase$delegate;
    final /* synthetic */ e89 $returningCardIndex$delegate;
    final /* synthetic */ sdd $this_DrawnCardLayout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp4(ft1 ft1Var, sdd sddVar, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$cardReturnTransition = ft1Var;
        this.$this_DrawnCardLayout = sddVar;
        this.$returningCardIndex$delegate = e89Var;
        this.$returnPhase$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jp4(this.$cardReturnTransition, this.$this_DrawnCardLayout, this.$returningCardIndex$delegate, this.$returnPhase$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ft1 ft1Var = this.$cardReturnTransition;
            if ((ft1Var != null ? ft1Var.b : null) == et1.a) {
                ip4 ip4Var = new ip4(this.$this_DrawnCardLayout, null);
                this.label = 1;
                Object objS = rs0.S(1200L, ip4Var, this);
                bw2 bw2Var = bw2.a;
                if (objS == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((Integer) this.$returningCardIndex$delegate.getValue()) != null) {
            this.$returnPhase$delegate.setValue(et1.b);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jp4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
