package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hz extends gbe implements l26 {
    final /* synthetic */ n3f $childTransition;
    final /* synthetic */ h0e $shouldDisposeBlockUpdated$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(n3f n3fVar, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$childTransition = n3fVar;
        this.$shouldDisposeBlockUpdated$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hz hzVar = new hz(this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, xn2Var);
        hzVar.L$0 = obj;
        return hzVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            xva xvaVar = (xva) this.L$0;
            ybc ybcVarP = jzb.p(new fz(this.$childTransition));
            gz gzVar = new gz(xvaVar, this.$childTransition, this.$shouldDisposeBlockUpdated$delegate, 0);
            this.label = 1;
            Object objB = ybcVarP.b(gzVar, this);
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
        return ((hz) k((xn2) obj2, (xva) obj)).r(wef.a);
    }
}
