package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nm2 extends gbe implements l26 {
    final /* synthetic */ dg7 $animationJob;
    final /* synthetic */ lgf $animationState;
    final /* synthetic */ w31 $bringIntoViewSpec;
    final /* synthetic */ long $viewportAdjustmentForReverseScroll;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pm2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm2(lgf lgfVar, pm2 pm2Var, w31 w31Var, long j, dg7 dg7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$animationState = lgfVar;
        this.this$0 = pm2Var;
        this.$bringIntoViewSpec = w31Var;
        this.$viewportAdjustmentForReverseScroll = j;
        this.$animationJob = dg7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nm2 nm2Var = new nm2(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, this.$animationJob, xn2Var);
        nm2Var.L$0 = obj;
        return nm2Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            dic dicVar = (dic) this.L$0;
            this.$animationState.e = this.this$0.l1(this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll);
            lgf lgfVar = this.$animationState;
            pm2 pm2Var = this.this$0;
            w6 w6Var = new w6(pm2Var, lgfVar, this.$animationJob, dicVar);
            j8 j8Var = new j8(pm2Var, lgfVar, this.$bringIntoViewSpec, 11);
            this.label = 1;
            Object objA = lgfVar.a(w6Var, j8Var, this);
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
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nm2) k((xn2) obj2, (dic) obj)).r(wef.a);
    }
}
