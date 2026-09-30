package defpackage;

import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bb extends gbe implements l26 {
    final /* synthetic */ String $phoneNumber;
    int label;
    final /* synthetic */ cb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(cb cbVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = cbVar;
        this.$phoneNumber = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bb(this.this$0, this.$phoneNumber, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        Object obj2;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                cb cbVar = this.this$0;
                String str = this.$phoneNumber;
                d56 d56Var = cbVar.a;
                this.label = 1;
                obj = d56Var.f(str, this);
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
                obj2 = qca.a;
            } else {
                dzbVar = new pca(serverResponse.getErrorCode(), serverResponse.getErrorMessage());
                obj2 = dzbVar;
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        cb cbVar2 = this.this$0;
        Throwable thA = ezb.a(obj2);
        if (thA == null) {
            return (rca) obj2;
        }
        ynb.h0(thA);
        int iQ = xo1.Q(thA);
        cbVar2.d().c("check bind phone error: code=" + iQ, thA);
        String message = thA.getMessage();
        if (message == null) {
            message = "";
        }
        return new pca(iQ, message);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
