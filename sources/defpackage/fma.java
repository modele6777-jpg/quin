package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fma extends gbe implements l26 {
    final /* synthetic */ mj9 $prompt;
    int label;
    final /* synthetic */ mma this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fma(mj9 mj9Var, mma mmaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$prompt = mj9Var;
        this.this$0 = mmaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fma(this.$prompt, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (this.$prompt.b == d83.b) {
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                ema emaVar = new ema(this.this$0, null);
                this.label = 1;
                Object objP0 = ynb.p0(hr3Var, emaVar, this);
                bw2 bw2Var = bw2.a;
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        this.this$0.G();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fma) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
