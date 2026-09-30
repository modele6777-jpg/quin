package defpackage;

import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.r0;
import tech.chatmind.api.SpreadRecommendResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ee4 extends gbe implements l26 {
    final /* synthetic */ String $messageId;
    final /* synthetic */ Operation<?> $op;
    final /* synthetic */ ed4 $requisite;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee4(xn2 xn2Var, ed4 ed4Var, r0 r0Var, Operation operation, String str) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$messageId = str;
        this.$op = operation;
        this.$requisite = ed4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        r0 r0Var = this.this$0;
        String str = this.$messageId;
        ee4 ee4Var = new ee4(xn2Var, this.$requisite, r0Var, this.$op, str);
        ee4Var.L$0 = obj;
        return ee4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        SpreadRecommendResponse spreadRecommendResponse = (SpreadRecommendResponse) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String recommendSpreadReason = spreadRecommendResponse.getRecommendSpreadReason();
        if (recommendSpreadReason == null) {
            recommendSpreadReason = "";
        }
        String recommendSpreadId = spreadRecommendResponse.getRecommendSpreadId();
        String str = recommendSpreadId != null ? recommendSpreadId : "";
        this.this$0.d().e("Spread recommend (fallback): spreadId=" + str + ", reason=" + recommendSpreadReason);
        this.this$0.X0(new kt8(this.$messageId, recommendSpreadReason));
        r0 r0Var = this.this$0;
        yt6 yt6Var = r0Var.d;
        fc4 fc4Var = r0Var.H0;
        if (fc4Var == null) {
            pa7.g0("divinationKey");
            throw null;
        }
        String str2 = fc4Var.a;
        uke ukeVar = (uke) yt6Var;
        ukeVar.getClass();
        str2.getClass();
        ok8.C(r0.K0(r0Var.f1(r0Var.o1(new kl5(ndc.f(new xje(ukeVar, str2, str, null)), new ce4(this.this$0, null), 1), this.$op)), new de4(this.this$0, this.$requisite, null)), this.this$0.m1);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ee4 ee4Var = (ee4) k((xn2) obj2, (SpreadRecommendResponse) obj);
        wef wefVar = wef.a;
        ee4Var.r(wefVar);
        return wefVar;
    }
}
