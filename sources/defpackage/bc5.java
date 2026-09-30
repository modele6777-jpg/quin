package defpackage;

import tech.chatmind.api.ReadingFeedbackTagsResponse;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bc5 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ec5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc5(ec5 ec5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ec5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        bc5 bc5Var = new bc5(this.this$0, xn2Var);
        bc5Var.L$0 = obj;
        return bc5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        ReadingFeedbackTagsResponse readingFeedbackTagsResponse;
        int i = this.label;
        pu4 pu4Var = pu4.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                nb5 nb5Var = this.this$0.b;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = nb5Var.c(this);
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
            if (!serverResponse.getSuccess() || (readingFeedbackTagsResponse = (ReadingFeedbackTagsResponse) serverResponse.getData()) == null || (dzbVar = readingFeedbackTagsResponse.getTags()) == null) {
                dzbVar = pu4Var;
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        ec5 ec5Var = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA == null) {
            return dzbVar;
        }
        ynb.h0(thA);
        ec5Var.d().c("Failed to load reading feedback tags", thA);
        return pu4Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bc5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
