package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.GooglePay;
import net.xmind.donut.gp.StoreInAppPurchaseResultsKt;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kc6 implements q2b {
    public final /* synthetic */ int a;
    public final /* synthetic */ GooglePay b;
    public final /* synthetic */ BillingSession c;

    public /* synthetic */ kc6(GooglePay googlePay, BillingSession billingSession, int i) {
        this.a = i;
        this.b = googlePay;
        this.c = billingSession;
    }

    @Override // defpackage.q2b
    public final void a(tx0 tx0Var, List list) {
        String str;
        int i = this.a;
        BillingSession billingSession = this.c;
        GooglePay googlePay = this.b;
        switch (i) {
            case 0:
                int i2 = GooglePay.g;
                tx0Var.getClass();
                list.getClass();
                if (googlePay.e.b(billingSession)) {
                    googlePay.e(tx0Var, list);
                }
                break;
            default:
                int i3 = GooglePay.g;
                tx0Var.getClass();
                list.getClass();
                if (googlePay.e.b(billingSession) && tx0Var.a == 0 && (str = googlePay.b) != null) {
                    ArrayList arrayListA = StoreInAppPurchaseResultsKt.a(str, list, true);
                    l3a l3aVar = googlePay.d;
                    Iterator it = arrayListA.iterator();
                    while (it.hasNext()) {
                        l3aVar.a((h3a) it.next());
                    }
                    break;
                }
                break;
        }
    }
}
