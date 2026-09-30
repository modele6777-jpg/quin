package defpackage;

import tech.chatmind.api.account.model.SendCodeResponse;
import tech.chatmind.api.account.model.SendCodeResult;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qa extends gbe implements l26 {
    final /* synthetic */ String $phoneNumber;
    int label;
    final /* synthetic */ cb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa(cb cbVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = cbVar;
        this.$phoneNumber = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qa(this.this$0, this.$phoneNumber, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                cb cbVar = this.this$0;
                String str = this.$phoneNumber;
                d56 d56Var = cbVar.a;
                this.label = 1;
                obj = d56Var.j(str, this);
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
            SendCodeResponse sendCodeResponse = (SendCodeResponse) nullableServerResponse.getData();
            dzbVar = new SendCodeResult(sendCodeResponse != null ? sendCodeResponse.isNewUser() : false, nullableServerResponse.getError(), new Integer(nullableServerResponse.getErrorCode()), nullableServerResponse.getErrorMessage());
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        cb cbVar2 = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA == null) {
            return (SendCodeResult) dzbVar;
        }
        ynb.h0(thA);
        int iQ = xo1.Q(thA);
        cbVar2.d().c("get sms code error: code=" + iQ, thA);
        return new SendCodeResult(false, true, new Integer(iQ), (String) null, 8, (rp3) null);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qa) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
