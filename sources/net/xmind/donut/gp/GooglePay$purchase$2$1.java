package net.xmind.donut.gp;

import defpackage.aw2;
import defpackage.bwa;
import defpackage.gbe;
import defpackage.jzb;
import defpackage.l26;
import defpackage.lh3;
import defpackage.ox0;
import defpackage.qc0;
import defpackage.qx0;
import defpackage.szc;
import defpackage.t72;
import defpackage.v71;
import defpackage.vb2;
import defpackage.wef;
import defpackage.xn2;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@lh3(c = "net.xmind.donut.gp.GooglePay$purchase$2$1", f = "GooglePay.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Law2;", "Lwef;", "<anonymous>", "(Law2;)V"}, k = 3, mv = {2, 4, 0})
final class GooglePay$purchase$2$1 extends gbe implements l26 {
    final /* synthetic */ String $id;
    final /* synthetic */ vb2 $it;
    final /* synthetic */ bwa $product;
    final /* synthetic */ BillingSession<ox0> $session;
    int label;
    final /* synthetic */ GooglePay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePay$purchase$2$1(GooglePay googlePay, BillingSession billingSession, vb2 vb2Var, String str, bwa bwaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = googlePay;
        this.$session = billingSession;
        this.$it = vb2Var;
        this.$id = str;
        this.$product = bwaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new GooglePay$purchase$2$1(this.this$0, this.$session, this.$it, this.$id, this.$product, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        GooglePay googlePay = this.this$0;
        BillingSession<ox0> billingSession = this.$session;
        vb2 vb2Var = this.$it;
        szc szcVar = new szc(8, false);
        v71 v71Var = new v71();
        v71Var.b = 0;
        v71Var.a = true;
        szcVar.e = v71Var;
        String str = googlePay.b;
        str.getClass();
        szcVar.b = str;
        String str2 = this.$id;
        if (str2 == null) {
            str2 = this.this$0.b;
            str2.getClass();
        }
        szcVar.c = str2;
        Object objF = this.$product.f();
        objF.getClass();
        szcVar.d = new ArrayList(t72.H((qx0) objF));
        googlePay.i(billingSession, vb2Var, szcVar.B());
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        GooglePay$purchase$2$1 googlePay$purchase$2$1 = (GooglePay$purchase$2$1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        googlePay$purchase$2$1.r(wefVar);
        return wefVar;
    }
}
