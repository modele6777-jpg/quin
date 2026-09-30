package defpackage;

import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class si5 extends gbe implements l26 {
    final /* synthetic */ ya2 $onApplyCompletedSignal;
    final /* synthetic */ long $timeoutMillis;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si5(ya2 ya2Var, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onApplyCompletedSignal = ya2Var;
        this.$timeoutMillis = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new si5(this.$onApplyCompletedSignal, this.$timeoutMillis, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "applyScreenFlash: Waiting for ScreenFlashListener to be completed");
            }
            ya2 ya2Var = this.$onApplyCompletedSignal;
            long j = this.$timeoutMillis;
            this.label = 1;
            obj = lmg.P(ya2Var, j, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            long j2 = this.$timeoutMillis;
            if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "applyScreenFlash: ScreenFlashListener completion timed out after " + j2 + " ms");
            }
        } else if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "applyScreenFlash: ScreenFlashListener completed");
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((si5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
