package defpackage;

import tech.chatmind.api.dailycard.model.DailyCardRequestBody;
import tech.chatmind.api.dailycard.model.DailyCardResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a43 extends gbe implements l26 {
    final /* synthetic */ ma8 $date;
    final /* synthetic */ boolean $requireCharge;
    Object L$0;
    int label;
    final /* synthetic */ d43 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a43(d43 d43Var, ma8 ma8Var, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = d43Var;
        this.$date = ma8Var;
        this.$requireCharge = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new a43(this.this$0, this.$date, this.$requireCharge, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                DailyCardRequestBody dailyCardRequestBody = new DailyCardRequestBody(((mo3) this.this$0.b).a(), this.$date.toString(), this.$requireCharge ? "consume" : null, (String) null, 8, (rp3) null);
                z23 z23Var = this.this$0.a;
                this.L$0 = null;
                this.label = 1;
                obj = z23Var.a(dailyCardRequestBody, this);
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
            DailyCardResponse dailyCardResponse = (DailyCardResponse) ((ServerResponse) obj).getData();
            return new r33(dailyCardResponse.getDate(), dailyCardResponse.getDescription(), dailyCardResponse.getDirection(), dailyCardResponse.getKey(), dailyCardResponse.getQuestion(), dailyCardResponse.getReading(), dailyCardResponse.getTagType(), dailyCardResponse.getTitle());
        } catch (Exception e) {
            ynb.h0(e);
            this.this$0.d().c("Get daily card information error", e);
            return null;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a43) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
