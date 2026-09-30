package defpackage;

import java.util.List;
import tech.chatmind.api.ReadingFeedbackRequest;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dc5 extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ cfb $entrypoint;
    final /* synthetic */ sfb $feedbackType;
    final /* synthetic */ List<String> $tags;
    final /* synthetic */ String $text;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ ec5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc5(String str, sfb sfbVar, cfb cfbVar, List list, String str2, ec5 ec5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$chatId = str;
        this.$feedbackType = sfbVar;
        this.$entrypoint = cfbVar;
        this.$tags = list;
        this.$text = str2;
        this.this$0 = ec5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        dc5 dc5Var = new dc5(this.$chatId, this.$feedbackType, this.$entrypoint, this.$tags, this.$text, this.this$0, xn2Var);
        dc5Var.L$0 = obj;
        return dc5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        ec5 ec5Var;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                String str = this.$chatId;
                sfb sfbVar = this.$feedbackType;
                cfb cfbVar = this.$entrypoint;
                List<String> list = this.$tags;
                String str2 = this.$text;
                ec5 ec5Var2 = this.this$0;
                ReadingFeedbackRequest readingFeedbackRequest = new ReadingFeedbackRequest(str, sfbVar.a(), cfbVar != null ? cfbVar.a() : null, list, str2);
                ec5Var2.d().e("Submit reading feedback request: chatId=" + str + ", feedbackType=" + sfbVar.a() + ", entrypoint=" + (cfbVar != null ? cfbVar.a() : null) + ", tags=" + list + ", text=" + str2);
                nb5 nb5Var = ec5Var2.b;
                this.L$0 = null;
                this.L$1 = ec5Var2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 1;
                obj = nb5Var.d(readingFeedbackRequest, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
                ec5Var = ec5Var2;
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ec5Var = (ec5) this.L$1;
                jzb.q(obj);
            }
            ServerResponse serverResponse = (ServerResponse) obj;
            ec5Var.d().e("Submit reading feedback response: success=" + serverResponse.getSuccess() + ", errorCode=" + serverResponse.getErrorCode() + ", errorMessage=" + serverResponse.getErrorMessage());
            dzbVar = Boolean.valueOf(serverResponse.getSuccess());
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        ec5 ec5Var3 = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA == null) {
            return dzbVar;
        }
        ynb.h0(thA);
        if (thA instanceof qs6) {
            qs6 qs6Var = (qs6) thA;
            vyb vybVar = qs6Var.a.c;
            String strU = vybVar != null ? vybVar.u() : null;
            ec5Var3.d().c("Submit reading feedback HTTP error: code=" + qs6Var.a() + ", errorBody=" + strU, thA);
        } else {
            ec5Var3.d().c("Submit reading feedback error", thA);
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dc5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
