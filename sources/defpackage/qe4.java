package defpackage;

import ai.askquin.ui.conversation.r0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.ReadingResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qe4 extends gbe implements l26 {
    final /* synthetic */ String $cloudScenarioId;
    final /* synthetic */ String $cloudType;
    final /* synthetic */ String $question;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe4(r0 r0Var, String str, String str2, String str3, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$question = str;
        this.$cloudType = str2;
        this.$cloudScenarioId = str3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        qe4 qe4Var = new qe4(this.this$0, this.$question, this.$cloudType, this.$cloudScenarioId, xn2Var);
        qe4Var.L$0 = obj;
        return qe4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [pu4] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ?? arrayList;
        gd4 gd4Var;
        ReadingResponse readingResponse = (ReadingResponse) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            this.this$0.d().e("createReading ans: " + readingResponse + ", q: " + this.$question + ", divinationType=" + this.$cloudType + ", scenarioId=" + this.$cloudScenarioId);
            this.this$0.X1 = Instant.now();
            if (this.this$0.m0()) {
                tj7 tj7Var = tj7.L0;
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("onboarding_divination_question_submit"), tj7Var, 2);
                }
            }
            boolean zIsCanTarot = readingResponse.isCanTarot();
            boolean zIsSuitable = readingResponse.isSuitable();
            List<String> userQuestionRecommendations = readingResponse.getUserQuestionRecommendations();
            if (userQuestionRecommendations != null) {
                String str = this.$question;
                arrayList = new ArrayList();
                for (Object obj2 : userQuestionRecommendations) {
                    String str2 = (String) obj2;
                    if (!v4e.Q(str2) && !str2.equals(str)) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = pu4.a;
            }
            gd4 gd4Var2 = new gd4(zIsCanTarot, zIsSuitable, arrayList, this.$question, readingResponse.getSuggestions(), readingResponse.isAdditionalInfoNeeded(), readingResponse.getAdditionalInfoQuestion(), readingResponse.getNeedsRevision());
            this.this$0.K1(gd4Var2);
            r0 r0Var = this.this$0;
            this.L$0 = readingResponse;
            this.L$1 = gd4Var2;
            this.label = 1;
            obj = r0Var.O0(this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
            gd4Var = gd4Var2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gd4Var = (gd4) this.L$1;
            jzb.q(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        wef wefVar = wef.a;
        if (!zBooleanValue) {
            return wefVar;
        }
        String suggestions = readingResponse.getSuggestions();
        if (suggestions != null) {
            r0 r0Var2 = this.this$0;
            ct8 ct8Var = new ct8(suggestions, null);
            int i2 = r0.j2;
            r0Var2.X0(ct8Var);
        }
        boolean zT = pa7.t(this.$question, this.this$0.f1);
        if ((readingResponse.isCanTarot() && readingResponse.isSuitable()) || zT) {
            this.this$0.v(gd4Var.d);
            return wefVar;
        }
        r0 r0Var3 = this.this$0;
        r0Var3.getClass();
        ConcurrentHashMap concurrentHashMap = xfb.a;
        xfb.i(r0Var3.I0, "question_edit");
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qe4) k((xn2) obj2, (ReadingResponse) obj)).r(wef.a);
    }
}
