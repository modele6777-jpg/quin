package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sv5 extends gbe implements l26 {
    final /* synthetic */ yic $campaign;
    final /* synthetic */ Context $context;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv5(Context context, yic yicVar, BroadcastReceiver.PendingResult pendingResult, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$campaign = yicVar;
        this.$pendingResult = pendingResult;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new sv5(this.$context, this.$campaign, this.$pendingResult, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                qv5 qv5Var = qv5.a;
                Context context = this.$context;
                yic yicVar = this.$campaign;
                this.label = 1;
                obj = qv5Var.g(context, yicVar, true, this);
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
            ((Boolean) obj).getClass();
            this.$pendingResult.finish();
            return wef.a;
        } catch (Throwable th) {
            this.$pendingResult.finish();
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((sv5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
