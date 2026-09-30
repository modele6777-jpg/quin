package defpackage;

import tech.chatmind.api.ReadingRequest;
import tech.chatmind.api.UserSelectedSpread;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tje extends gbe implements a26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $divinationType;
    final /* synthetic */ String $followsUpTriggerMessageId;
    final /* synthetic */ String $question;
    final /* synthetic */ String $scenarioId;
    final /* synthetic */ UserSelectedSpread $userSelectedSpread;
    int label;
    final /* synthetic */ uke this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tje(uke ukeVar, String str, String str2, String str3, String str4, UserSelectedSpread userSelectedSpread, String str5, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = ukeVar;
        this.$chatId = str;
        this.$question = str2;
        this.$divinationType = str3;
        this.$scenarioId = str4;
        this.$userSelectedSpread = userSelectedSpread;
        this.$followsUpTriggerMessageId = str5;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new tje(this.this$0, this.$chatId, this.$question, this.$divinationType, this.$scenarioId, this.$userSelectedSpread, this.$followsUpTriggerMessageId, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        xie xieVar = this.this$0.a;
        ReadingRequest readingRequest = new ReadingRequest(this.$chatId, this.$question, this.$divinationType, this.$scenarioId, this.$userSelectedSpread, this.$followsUpTriggerMessageId);
        this.label = 1;
        Object objF = xieVar.f(readingRequest, this);
        bw2 bw2Var = bw2.a;
        return objF == bw2Var ? bw2Var : objF;
    }
}
