package defpackage;

import tech.chatmind.api.message.model.InAppMessageList;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class au8 extends gbe implements l26 {
    final /* synthetic */ String $timeAt;
    int label;
    final /* synthetic */ bu8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au8(bu8 bu8Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = bu8Var;
        this.$timeAt = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new au8(this.this$0, this.$timeAt, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        pu4 pu4Var = pu4.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                bu8 bu8Var = this.this$0;
                String str = this.$timeAt;
                pt8 pt8Var = bu8Var.a;
                if (str == null) {
                    str = "";
                }
                String strD = vd8.d();
                this.label = 1;
                obj = pt8Var.a(str, strD, this);
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
            dzbVar = serverResponse.getSuccess() ? ((InAppMessageList) serverResponse.getData()).getMessages() : pu4Var;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return ezb.a(dzbVar) == null ? dzbVar : pu4Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((au8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
