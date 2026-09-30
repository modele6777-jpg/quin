package defpackage;

import tech.chatmind.api.CloudMixedDeckSnapshot;
import tech.chatmind.api.SubmitSpreadRequest;
import tech.chatmind.api.UserSelectedSpread;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tke extends gbe implements a26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ CloudMixedDeckSnapshot $mixedDeckSnapshot;
    final /* synthetic */ UserSelectedSpread $userSelectedSpread;
    int label;
    final /* synthetic */ uke this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tke(uke ukeVar, String str, UserSelectedSpread userSelectedSpread, CloudMixedDeckSnapshot cloudMixedDeckSnapshot, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = ukeVar;
        this.$chatId = str;
        this.$userSelectedSpread = userSelectedSpread;
        this.$mixedDeckSnapshot = cloudMixedDeckSnapshot;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new tke(this.this$0, this.$chatId, this.$userSelectedSpread, this.$mixedDeckSnapshot, (xn2) obj).r(wef.a);
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
        String str = this.$chatId;
        SubmitSpreadRequest submitSpreadRequest = new SubmitSpreadRequest(this.$userSelectedSpread, this.$mixedDeckSnapshot);
        this.label = 1;
        Object objA = xieVar.a(str, submitSpreadRequest, this);
        bw2 bw2Var = bw2.a;
        return objA == bw2Var ? bw2Var : objA;
    }
}
