package defpackage;

import tech.chatmind.api.BasicRequest;
import tech.chatmind.api.InvitationInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kc7 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ oc7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc7(oc7 oc7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = oc7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        kc7 kc7Var = new kc7(this.this$0, xn2Var);
        kc7Var.L$0 = obj;
        return kc7Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                bc7 bc7Var = this.this$0.d;
                BasicRequest basicRequest = new BasicRequest((String) null, "2511", 1, (rp3) null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = bc7Var.b(basicRequest, this);
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
            dzbVar = (InvitationInfo) obj;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return new ezb(dzbVar);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kc7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
