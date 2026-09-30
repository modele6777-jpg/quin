package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class om2 extends gbe implements l26 {
    final /* synthetic */ lgf $animationState;
    final /* synthetic */ w31 $bringIntoViewSpec;
    final /* synthetic */ long $viewportAdjustmentForReverseScroll;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ pm2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om2(pm2 pm2Var, lgf lgfVar, w31 w31Var, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = pm2Var;
        this.$animationState = lgfVar;
        this.$bringIntoViewSpec = w31Var;
        this.$viewportAdjustmentForReverseScroll = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        om2 om2Var = new om2(this.this$0, this.$animationState, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, xn2Var);
        om2Var.L$0 = obj;
        return om2Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        CancellationException cancellationException = null;
        try {
            try {
                if (i == 0) {
                    jzb.q(obj);
                    dg7 dg7VarZ = tq.z(((aw2) this.L$0).getCoroutineContext());
                    pm2 pm2Var = this.this$0;
                    pm2Var.L0 = true;
                    gic gicVar = pm2Var.E0;
                    s89 s89Var = s89.a;
                    nm2 nm2Var = new nm2(this.$animationState, pm2Var, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, dg7VarZ, null);
                    this.label = 1;
                    Object objG = gicVar.g(s89Var, nm2Var, this);
                    bw2 bw2Var = bw2.a;
                    if (objG == bw2Var) {
                        return bw2Var;
                    }
                } else {
                    if (i != 1) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jzb.q(obj);
                }
                this.this$0.I0.N();
                pm2 pm2Var2 = this.this$0;
                pm2Var2.L0 = false;
                pm2Var2.I0.i(null);
                this.this$0.J0 = false;
                return wef.a;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            pm2 pm2Var3 = this.this$0;
            pm2Var3.L0 = false;
            pm2Var3.I0.i(cancellationException);
            this.this$0.J0 = false;
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((om2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
