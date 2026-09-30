package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.account.model.SignWithPhoneRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ya extends gbe implements l26 {
    final /* synthetic */ String $code;
    final /* synthetic */ String $phoneNumber;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ cb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(cb cbVar, String str, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = cbVar;
        this.$phoneNumber = str;
        this.$code = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ya(this.this$0, this.$phoneNumber, this.$code, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        Object objB;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            cb cbVar = this.this$0;
            this.label = 1;
            int i2 = cb.b;
            objB = cbVar.b(this);
            if (objB != bw2Var) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return obj;
        }
        jzb.q(obj);
        objB = ((ezb) obj).b();
        cb cbVar2 = this.this$0;
        Throwable thA = ezb.a(objB);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            int i3 = cb.b;
            return cbVar2.e(thA, false);
        }
        SignWithPhoneRequestBody signWithPhoneRequestBody = new SignWithPhoneRequestBody(this.$phoneNumber, this.$code, (String) objB, false, false, 24, (rp3) null);
        cb cbVar3 = this.this$0;
        xa xaVar = new xa(cbVar3, signWithPhoneRequestBody, null);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        int i4 = cb.b;
        Object objC = cbVar3.c(true, xaVar, this);
        return objC == bw2Var ? bw2Var : objC;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ya) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
