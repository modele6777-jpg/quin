package defpackage;

import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.r0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.AiRecommendResponse;
import tech.chatmind.api.SpreadRecommendationResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class be4 extends gbe implements l26 {
    final /* synthetic */ String $messageId;
    final /* synthetic */ Operation<?> $op;
    final /* synthetic */ ed4 $requisite;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be4(xn2 xn2Var, ed4 ed4Var, r0 r0Var, Operation operation, String str) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$op = operation;
        this.$messageId = str;
        this.$requisite = ed4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        be4 be4Var = new be4(xn2Var, this.$requisite, this.this$0, this.$op, this.$messageId);
        be4Var.L$0 = obj;
        return be4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        AiRecommendResponse aiRecommendResponse = (AiRecommendResponse) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        boolean zIsEmpty = aiRecommendResponse.getSpreads().isEmpty();
        r0 r0Var = this.this$0;
        wef wefVar = wef.a;
        if (zIsEmpty) {
            r0Var.d().b("aiRecommendStage1 returned empty spreads, falling back to old flow");
            r0 r0Var2 = this.this$0;
            Operation<?> operation = this.$op;
            String str = this.$messageId;
            ed4 ed4Var = this.$requisite;
            yt6 yt6Var = r0Var2.d;
            fc4 fc4Var = r0Var2.H0;
            if (fc4Var == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            String str2 = fc4Var.a;
            uke ukeVar = (uke) yt6Var;
            ukeVar.getClass();
            str2.getClass();
            ok8.C(r0.K0(r0Var2.f1(r0Var2.o1(r0Var2.W0(ndc.f(new jke(ukeVar, str2, null))), operation)), new ee4(null, ed4Var, r0Var2, operation, str)), r0Var2.m1);
            return wefVar;
        }
        r0Var.d().e("AI recommend stage1: " + aiRecommendResponse.getSpreads().size() + " spreads, suggested=" + aiRecommendResponse.getSuggestedSpreadIndex());
        this.this$0.b2.setValue(aiRecommendResponse.getSpreads());
        this.this$0.c2.setValue(Integer.valueOf(mh3.o(aiRecommendResponse.getSuggestedSpreadIndex(), 0, t72.E(aiRecommendResponse.getSpreads()))));
        List<SpreadRecommendationResult> spreads = aiRecommendResponse.getSpreads();
        int iIntValue = ((Number) this.this$0.c2.getValue()).intValue();
        boolean zM0 = this.this$0.m0();
        z67 z67Var = ywd.a;
        spreads.getClass();
        int iP = mh3.p(iIntValue, t72.B(spreads));
        if (zM0) {
            Iterator<SpreadRecommendationResult> it = spreads.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (ywd.a(it.next()) == mi.BASIC) {
                    break;
                }
                i++;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iP = numValueOf.intValue();
            }
        }
        this.this$0.d2.setValue(new quc(iP));
        SpreadRecommendationResult spreadRecommendationResult = aiRecommendResponse.getSpreads().get(iP);
        this.this$0.X0(new kt8(this.$messageId, spreadRecommendationResult.getRecommendSpreadReasonDescription()));
        String spreadId = spreadRecommendationResult.getSpreadId();
        String strD = spreadId.length() > 0 ? spreadId : null;
        if (strD == null) {
            int size = spreadRecommendationResult.getPatternData().size();
            ale.a.getClass();
            strD = pzd.g(size).d();
        }
        this.this$0.K1(new zc4(this.$requisite.a(), strD, spreadRecommendationResult.getPatternData(), this.$requisite, null, null, spreadRecommendationResult.getSpreadId(), 48));
        r0 r0Var3 = this.this$0;
        r0Var3.getClass();
        ConcurrentHashMap concurrentHashMap = xfb.a;
        xfb.i(r0Var3.I0, "spread_select");
        this.this$0.t0(spreadRecommendationResult, false);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        be4 be4Var = (be4) k((xn2) obj2, (AiRecommendResponse) obj);
        wef wefVar = wef.a;
        be4Var.r(wefVar);
        return wefVar;
    }
}
