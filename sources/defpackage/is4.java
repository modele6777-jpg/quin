package defpackage;

import java.util.ArrayList;
import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.GooglePay;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class is4 implements yl2 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ is4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yl2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((yl2) this.b).getClass();
                ((yl2) this.b).accept(obj);
                return;
            case 1:
                nq5 nq5Var = (nq5) obj;
                if (nq5Var == null) {
                    nq5Var = new nq5(-3);
                }
                ((k47) this.b).H(nq5Var);
                return;
            case 2:
                nq5 nq5Var2 = (nq5) obj;
                synchronized (oq5.c) {
                    try {
                        wid widVar = oq5.d;
                        ArrayList arrayList = (ArrayList) widVar.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        widVar.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((yl2) arrayList.get(i)).accept(nq5Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 3:
                ((pl1) this.b).g((kq0) obj);
                return;
            default:
                tx0 tx0Var = (tx0) obj;
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                gi2 gi2Var = (gi2) this.b;
                GooglePay googlePay = (GooglePay) gi2Var.b;
                BillingSession billingSession = (BillingSession) gi2Var.c;
                l26 l26Var = (l26) gi2Var.d;
                int i2 = GooglePay.g;
                tx0Var.getClass();
                if (googlePay.e.b(billingSession)) {
                    l26Var.z(tx0Var, arrayList2);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ is4() {
        this.a = 0;
    }
}
