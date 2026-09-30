package defpackage;

import java.util.List;
import tech.chatmind.api.common.model.TarotCardRequestBody;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t40 extends gbe implements l26 {
    final /* synthetic */ List<TarotCardRequestBody> $domainCards;
    final /* synthetic */ String $year;
    int label;
    final /* synthetic */ v40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(v40 v40Var, String str, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = v40Var;
        this.$year = str;
        this.$domainCards = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new t40(this.this$0, this.$year, this.$domainCards, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        boolean z = false;
        try {
            if (i == 0) {
                jzb.q(obj);
                c50 c50Var = this.this$0.a;
                String str = this.$year;
                List<TarotCardRequestBody> list = this.$domainCards;
                this.label = 1;
                js3 js3Var = ga4.a;
                obj = ynb.p0(hr3.c, new a50(c50Var, str, list, null), this);
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
            boolean success = serverResponse.getSuccess();
            v40 v40Var = this.this$0;
            if (success) {
                v40Var.d().e("Domain report updated successfully");
                this.this$0.b();
                z = true;
            } else {
                v40Var.d().g("Failed to update domain report: code=" + serverResponse.getErrorCode());
            }
        } catch (Exception e) {
            ynb.h0(e);
            this.this$0.d().c("Error updating domain report", e);
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t40) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
