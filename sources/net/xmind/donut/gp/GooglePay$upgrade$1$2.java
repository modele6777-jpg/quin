package net.xmind.donut.gp;

import defpackage.aw2;
import defpackage.gbe;
import defpackage.jzb;
import defpackage.l26;
import defpackage.lh3;
import defpackage.ox0;
import defpackage.qc0;
import defpackage.sx0;
import defpackage.wef;
import defpackage.xn2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@lh3(c = "net.xmind.donut.gp.GooglePay$upgrade$1$2", f = "GooglePay.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Law2;", "Lwef;", "<anonymous>", "(Law2;)V"}, k = 3, mv = {2, 4, 0})
final class GooglePay$upgrade$1$2 extends gbe implements l26 {
    final /* synthetic */ sx0 $billingParams;
    final /* synthetic */ BillingSession<ox0> $session;
    int label;
    final /* synthetic */ GooglePay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePay$upgrade$1$2(GooglePay googlePay, BillingSession billingSession, sx0 sx0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = googlePay;
        this.$session = billingSession;
        this.$billingParams = sx0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new GooglePay$upgrade$1$2(this.this$0, this.$session, this.$billingParams, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        GooglePay googlePay = this.this$0;
        googlePay.i(this.$session, googlePay.a, this.$billingParams);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        GooglePay$upgrade$1$2 googlePay$upgrade$1$2 = (GooglePay$upgrade$1$2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        googlePay$upgrade$1$2.r(wefVar);
        return wefVar;
    }
}
