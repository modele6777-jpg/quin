package defpackage;

import tech.chatmind.api.SpreadRecommendResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jke extends gbe implements a26 {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ uke this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jke(uke ukeVar, String str, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = ukeVar;
        this.$chatId = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new jke(this.this$0, this.$chatId, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            wie wieVar = this.this$0.b;
            String str = this.$chatId;
            this.label = 1;
            obj = wieVar.c(str, this);
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
            SpreadRecommendResponse spreadRecommendResponse = (SpreadRecommendResponse) serverResponse.getData();
            if ((spreadRecommendResponse != null ? spreadRecommendResponse.getRecommendSpreadId() : null) == null) {
                qc0.j("recommendSpreadId is null");
                return null;
            }
            SpreadRecommendResponse spreadRecommendResponse2 = (SpreadRecommendResponse) serverResponse.getData();
            if ((spreadRecommendResponse2 != null ? spreadRecommendResponse2.getRecommendSpreadReason() : null) == null) {
                qc0.j("recommendSpreadReason is null");
                return null;
            }
        }
        return obj;
    }
}
