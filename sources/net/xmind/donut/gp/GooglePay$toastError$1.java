package net.xmind.donut.gp;

import android.widget.Toast;
import defpackage.aw2;
import defpackage.gbe;
import defpackage.jzb;
import defpackage.l26;
import defpackage.lh3;
import defpackage.qc0;
import defpackage.wef;
import defpackage.xn2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@lh3(c = "net.xmind.donut.gp.GooglePay$toastError$1", f = "GooglePay.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Law2;", "Lwef;", "<anonymous>", "(Law2;)V"}, k = 3, mv = {2, 4, 0})
final class GooglePay$toastError$1 extends gbe implements l26 {
    final /* synthetic */ String $msg;
    int label;
    final /* synthetic */ GooglePay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePay$toastError$1(GooglePay googlePay, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = googlePay;
        this.$msg = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new GooglePay$toastError$1(this.this$0, this.$msg, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Toast.makeText(this.this$0.a, this.$msg, 1).show();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        GooglePay$toastError$1 googlePay$toastError$1 = (GooglePay$toastError$1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        googlePay$toastError$1.r(wefVar);
        return wefVar;
    }
}
