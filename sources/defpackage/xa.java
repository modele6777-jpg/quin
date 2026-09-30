package defpackage;

import tech.chatmind.api.account.model.SignWithPhoneRequestBody;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xa extends gbe implements a26 {
    final /* synthetic */ SignWithPhoneRequestBody $reqBody;
    int label;
    final /* synthetic */ cb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(cb cbVar, SignWithPhoneRequestBody signWithPhoneRequestBody, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = cbVar;
        this.$reqBody = signWithPhoneRequestBody;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new xa(this.this$0, this.$reqBody, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        d56 d56Var = this.this$0.a;
        SignWithPhoneRequestBody signWithPhoneRequestBody = this.$reqBody;
        this.label = 1;
        Object objB = d56Var.b(signWithPhoneRequestBody, this);
        bw2 bw2Var = bw2.a;
        return objB == bw2Var ? bw2Var : objB;
    }
}
