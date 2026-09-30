package defpackage;

import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.GooglePay;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jc6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ GooglePay b;
    public final /* synthetic */ BillingSession c;

    public /* synthetic */ jc6(GooglePay googlePay, BillingSession billingSession, int i) {
        this.a = i;
        this.b = googlePay;
        this.c = billingSession;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        y2a y2aVar = y2a.a;
        wef wefVar = wef.a;
        BillingSession billingSession = this.c;
        GooglePay googlePay = this.b;
        switch (i) {
            case 0:
                Exception exc = (Exception) obj;
                int i2 = GooglePay.g;
                exc.getClass();
                if (googlePay.e.b(billingSession)) {
                    googlePay.j("Fail to dispatch product details query: " + exc);
                    googlePay.d.a(y2aVar);
                }
                break;
            default:
                tx0 tx0Var = (tx0) obj;
                int i3 = GooglePay.g;
                tx0Var.getClass();
                if (googlePay.e.b(billingSession)) {
                    googlePay.d().e("res: " + tx0Var.a + ", " + tx0Var.c);
                    googlePay.j("Fail to query product details: " + tx0Var.a + ", " + tx0Var.c);
                    googlePay.d.a(y2aVar);
                }
                break;
        }
        return wefVar;
    }
}
