package defpackage;

import tech.chatmind.api.SpreadInterpretRequest;
import tech.chatmind.api.SpreadInterpretResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xje extends gbe implements a26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $spreadId;
    int label;
    final /* synthetic */ uke this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xje(uke ukeVar, String str, String str2, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = ukeVar;
        this.$chatId = str;
        this.$spreadId = str2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new xje(this.this$0, this.$chatId, this.$spreadId, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wie wieVar = this.this$0.b;
            String str = this.$chatId;
            SpreadInterpretRequest spreadInterpretRequest = new SpreadInterpretRequest(this.$spreadId);
            this.label = 1;
            obj = wieVar.g(str, spreadInterpretRequest, this);
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
        ServerResponse serverResponse = (ServerResponse) obj;
        if (serverResponse.getSuccess()) {
            SpreadInterpretResponse spreadInterpretResponse = (SpreadInterpretResponse) serverResponse.getData();
            if ((spreadInterpretResponse != null ? spreadInterpretResponse.getSpreadId() : null) == null) {
                qc0.j("interpretSpread spreadId is null");
                return null;
            }
            SpreadInterpretResponse spreadInterpretResponse2 = (SpreadInterpretResponse) serverResponse.getData();
            if ((spreadInterpretResponse2 != null ? spreadInterpretResponse2.getGeneratedSpread() : null) == null) {
                qc0.j("interpretSpread generatedSpread is null");
                return null;
            }
        }
        return obj;
    }
}
