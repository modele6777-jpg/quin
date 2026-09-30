package defpackage;

import tech.chatmind.api.ReadingFeedbackData;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ac5 extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ec5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac5(ec5 ec5Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ec5Var;
        this.$chatId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ac5 ac5Var = new ac5(this.this$0, this.$chatId, xn2Var);
        ac5Var.L$0 = obj;
        return ac5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                ec5 ec5Var = this.this$0;
                String str = this.$chatId;
                nb5 nb5Var = ec5Var.b;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = nb5Var.b(str, this);
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
            NullableServerResponse nullableServerResponse = (NullableServerResponse) obj;
            dzbVar = nullableServerResponse.getSuccess() ? (ReadingFeedbackData) nullableServerResponse.getData() : null;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        ec5 ec5Var2 = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA == null) {
            return dzbVar;
        }
        ynb.h0(thA);
        ec5Var2.d().c("Failed to load reading feedback", thA);
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ac5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
