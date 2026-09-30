package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ipf extends gbe implements l26 {
    int label;
    final /* synthetic */ npf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipf(npf npfVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = npfVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ipf(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        int i = this.label;
        boolean success = false;
        try {
            if (i == 0) {
                jzb.q(obj);
                vkf vkfVar = this.this$0.a;
                this.label = 1;
                obj = vkfVar.a(this);
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
            if (tgc.k(serverResponse)) {
                npf npfVar = this.this$0;
                int i2 = npf.c;
                npfVar.b("Failed to delete user");
            } else {
                success = serverResponse.getSuccess();
            }
        } catch (Exception e) {
            npf npfVar2 = this.this$0;
            int i3 = npf.c;
            npfVar2.getClass();
            if (e instanceof CancellationException) {
                throw e;
            }
            ynb.h0(e);
            if (tgc.j(e, false)) {
                npfVar2.b("Failed to delete user");
            } else {
                npfVar2.d().c("Failed to delete user", e);
            }
        }
        return Boolean.valueOf(success);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ipf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
