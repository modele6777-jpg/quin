package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.AiRecommendInterpretResponse;
import tech.chatmind.api.AiRecommendResponse;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.SpreadRecommendationResult;
import tech.chatmind.api.TarotReadingHistory;
import tech.chatmind.api.TarotReadingSpreadHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ge4 extends gbe implements l26 {
    final /* synthetic */ SpreadRecommendationResult $spread;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge4(r0 r0Var, SpreadRecommendationResult spreadRecommendationResult, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$spread = spreadRecommendationResult;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ge4 ge4Var = new ge4(this.this$0, this.$spread, xn2Var);
        ge4Var.L$0 = obj;
        return ge4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        TarotReadingSpreadHistory spread;
        AiRecommendResponse aiRecommendedSpreads;
        List<SpreadRecommendationResult> spreads;
        Object next;
        List<PatternData> patternData;
        oyb oybVar = (oyb) this.L$0;
        int i = this.label;
        List<PatternData> list = null;
        if (i == 0) {
            jzb.q(obj);
            if (oybVar instanceof nyb) {
                r0 r0Var = this.this$0;
                String spreadId = this.$spread.getSpreadId();
                List<PatternData> patternData2 = ((AiRecommendInterpretResponse) ((nyb) oybVar).a).getPatternData();
                int i2 = r0.j2;
                r0Var.h(spreadId, patternData2);
            } else if (oybVar instanceof kyb) {
                Throwable th = ((kyb) oybVar).a;
                boolean zC = zf4.c(th);
                r0 r0Var2 = this.this$0;
                if (zC) {
                    r0Var2.d().g("AI recommend stage 2 already exists for " + this.$spread.getSpreadId() + "; refreshing");
                    r0 r0Var3 = this.this$0;
                    this.L$0 = oybVar;
                    this.label = 1;
                    obj = r0Var3.z0(this);
                    bw2 bw2Var = bw2.a;
                    if (obj == bw2Var) {
                        return bw2Var;
                    }
                } else {
                    kv2.A("aiRecommendStage2 failed for ", this.$spread.getSpreadId(), r0Var2.d(), th);
                    if (pa7.t(this.this$0.f2, this.$spread.getSpreadId())) {
                        this.this$0.v1(new e(th));
                    }
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        TarotReadingHistory tarotReadingHistory = (TarotReadingHistory) obj;
        if (tarotReadingHistory != null && (spread = tarotReadingHistory.getSpread()) != null && (aiRecommendedSpreads = spread.getAiRecommendedSpreads()) != null && (spreads = aiRecommendedSpreads.getSpreads()) != null) {
            SpreadRecommendationResult spreadRecommendationResult = this.$spread;
            Iterator<T> it = spreads.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!pa7.t(((SpreadRecommendationResult) next).getSpreadId(), spreadRecommendationResult.getSpreadId()));
            SpreadRecommendationResult spreadRecommendationResult2 = (SpreadRecommendationResult) next;
            if (spreadRecommendationResult2 != null && (patternData = spreadRecommendationResult2.getPatternData()) != null && !patternData.isEmpty()) {
                list = patternData;
            }
        }
        r0 r0Var4 = this.this$0;
        if (list != null) {
            String spreadId2 = this.$spread.getSpreadId();
            int i3 = r0.j2;
            r0Var4.h(spreadId2, list);
        } else if (pa7.t(r0Var4.f2, this.$spread.getSpreadId())) {
            this.this$0.v1(new e(((kyb) oybVar).a));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ge4) k((xn2) obj2, (oyb) obj)).r(wef.a);
    }
}
