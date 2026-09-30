package defpackage;

import tech.chatmind.api.AllRecommendationsResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l5b extends gbe implements l26 {
    int label;
    final /* synthetic */ n5b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5b(n5b n5bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = n5bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new l5b(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                n4b n4bVar = this.this$0.a;
                this.label = 1;
                obj = n4bVar.b(this);
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
                return ((AllRecommendationsResponse) serverResponse.getData()).getQuestionRecommendations();
            }
            return null;
        } catch (Exception e) {
            ynb.h0(e);
            this.this$0.d().c("Failed to get all recommendations", e);
            return null;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l5b) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
