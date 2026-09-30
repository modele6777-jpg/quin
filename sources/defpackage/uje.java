package defpackage;

import java.util.List;
import tech.chatmind.api.DrawClarifyingCardRequest;
import tech.chatmind.api.SelectedCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uje extends gbe implements a26 {
    final /* synthetic */ List<SelectedCard> $cards;
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $requestClarifyingCardMessageId;
    int label;
    final /* synthetic */ uke this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uje(uke ukeVar, String str, List list, String str2, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = ukeVar;
        this.$chatId = str;
        this.$cards = list;
        this.$requestClarifyingCardMessageId = str2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new uje(this.this$0, this.$chatId, this.$cards, this.$requestClarifyingCardMessageId, (xn2) obj).r(wef.a);
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
        wie wieVar = this.this$0.b;
        String str = this.$chatId;
        DrawClarifyingCardRequest drawClarifyingCardRequest = new DrawClarifyingCardRequest((String) null, this.$cards, this.$requestClarifyingCardMessageId, 1, (rp3) null);
        this.label = 1;
        Object objF = wieVar.f(str, drawClarifyingCardRequest, this);
        bw2 bw2Var = bw2.a;
        return objF == bw2Var ? bw2Var : objF;
    }
}
