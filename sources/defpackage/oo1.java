package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 extends gbe implements l26 {
    final /* synthetic */ long $delayMs;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ qo1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo1(long j, qo1 qo1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$delayMs = j;
        this.this$0 = qo1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        oo1 oo1Var = new oo1(this.$delayMs, this.this$0, xn2Var);
        oo1Var.L$0 = obj;
        return oo1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            Log.d("CXCP", "Finalizing " + ((aw2) this.L$0) + " in " + this.$delayMs + " ms");
            long j = this.$delayMs;
            this.label = 1;
            Object objQ = vfh.q(j, this);
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
        this.this$0.m(0L);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oo1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
