package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fc1 extends gbe implements l26 {
    final /* synthetic */ long $delayMs;
    int label;
    final /* synthetic */ gc1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc1(long j, gc1 gc1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$delayMs = j;
        this.this$0 = gc1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fc1(this.$delayMs, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            long j = this.$delayMs;
            this.label = 1;
            if (vfh.q(j, this) == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        gc1 gc1Var = this.this$0;
        synchronized (gc1Var.q) {
            if (!gc1Var.c() && !gc1Var.s.equals(gf1.v) && !gc1Var.s.equals(gf1.u)) {
                Log.d("CXCP", "Restarting " + gc1Var + "...");
                gc1Var.f.h();
                gc1Var.f();
                gc1Var.e();
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fc1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
