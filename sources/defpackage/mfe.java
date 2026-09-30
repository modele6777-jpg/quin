package defpackage;

import java.util.List;
import tech.chatmind.api.Message;
import tech.chatmind.api.QuestionRequest;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mfe extends gbe implements a26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ List<Message> $messages;
    final /* synthetic */ String $patternId;
    final /* synthetic */ String $question;
    int label;
    final /* synthetic */ sfe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfe(sfe sfeVar, String str, String str2, List list, String str3, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = sfeVar;
        this.$chatId = str;
        this.$question = str2;
        this.$messages = list;
        this.$patternId = str3;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new mfe(this.this$0, this.$chatId, this.$question, this.$messages, this.$patternId, (xn2) obj).r(wef.a);
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
        sfe sfeVar = this.this$0;
        lfe lfeVar = sfeVar.d;
        QuestionRequest questionRequest = new QuestionRequest("v4", this.$chatId, ((mo3) sfeVar.a).a(), this.$question, this.$messages, this.$patternId);
        this.label = 1;
        Object objC = lfeVar.c(questionRequest, this);
        bw2 bw2Var = bw2.a;
        return objC == bw2Var ? bw2Var : objC;
    }
}
