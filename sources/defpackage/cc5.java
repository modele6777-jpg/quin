package defpackage;

import java.util.List;
import tech.chatmind.api.FeedbackRequest;
import tech.chatmind.api.Message;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cc5 extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ List<Message> $chatRecord;
    final /* synthetic */ String $other;
    final /* synthetic */ int $starNum;
    final /* synthetic */ List<String> $tags;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ec5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc5(ec5 ec5Var, String str, int i, List list, List list2, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ec5Var;
        this.$chatId = str;
        this.$starNum = i;
        this.$tags = list;
        this.$chatRecord = list2;
        this.$other = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        cc5 cc5Var = new cc5(this.this$0, this.$chatId, this.$starNum, this.$tags, this.$chatRecord, this.$other, xn2Var);
        cc5Var.L$0 = obj;
        return cc5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                ec5 ec5Var = this.this$0;
                FeedbackRequest feedbackRequest = new FeedbackRequest(((mo3) ec5Var.a).a(), this.$chatId, this.$starNum, this.$tags, this.$chatRecord, this.$other);
                nb5 nb5Var = ec5Var.b;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                Object objA = nb5Var.a(feedbackRequest, this);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = Boolean.TRUE;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        ec5 ec5Var2 = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA == null) {
            return dzbVar;
        }
        ynb.h0(thA);
        ec5Var2.d().c("Failed to send feedback", thA);
        return Boolean.FALSE;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cc5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
