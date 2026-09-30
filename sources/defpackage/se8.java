package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class se8 extends yu0 {
    public static final /* synthetic */ int V0 = 0;
    public final t7 P0;
    public final q9b Q0;
    public final fab R0;
    public final gba S0;
    public final s0e T0;
    public final whb U0;

    public se8(t7 t7Var, q9b q9bVar, fab fabVar, gba gbaVar) {
        super(t7Var, hwa.b);
        this.P0 = t7Var;
        this.Q0 = q9bVar;
        this.R0 = fabVar;
        this.S0 = gbaVar;
        s0e s0eVarA = t0e.a(new nsb(null, null, null, false, false));
        this.T0 = s0eVarA;
        this.U0 = if9.n(s0eVarA);
    }

    @Override // defpackage.yu0, defpackage.g4
    /* JADX INFO: renamed from: P */
    public final boolean s(QuotaUsage quotaUsage) {
        quotaUsage.getClass();
        return quotaUsage.getTestReportCount() > 0;
    }

    public final void Q(QuotaUsage quotaUsage) {
        s0e s0eVar;
        Object value;
        if (quotaUsage == null && (quotaUsage = ((eab) this.Q0).b()) == null) {
            return;
        }
        do {
            s0eVar = this.T0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, nsb.a((nsb) value, null, null, null, quotaUsage.getHasSubscription(), quotaUsage.getTestReportCount() > 0, 7)));
    }

    @Override // defpackage.g4
    public final void u(Object obj, List list) {
        d().e("onInAppPurchase: " + list);
        Q((QuotaUsage) obj);
    }

    @Override // defpackage.g4
    public final void w(ArrayList arrayList) {
        Object obj;
        Object next;
        s0e s0eVar;
        Object value;
        d().e("onInAppPurchasePricesUpdate: " + arrayList);
        Iterator it = arrayList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((n07) next).g() != e56.EXAM_DISCOUNT);
        n07 n07Var = (n07) next;
        for (Object obj2 : arrayList) {
            if (((n07) obj2).g() == e56.EXAM) {
                obj = obj2;
                break;
            }
        }
        n07 n07Var2 = (n07) obj;
        if (n07Var == null || n07Var2 == null) {
            return;
        }
        do {
            s0eVar = this.T0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, nsb.a((nsb) value, new iwa(n07Var, n07Var2), null, null, false, false, 30)));
    }

    @Override // defpackage.g4
    public final void x(String str, List list) {
        str.getClass();
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p07 p07Var = ((o07) it.next()).e;
            if (p07Var == e56.EXAM || p07Var == e56.EXAM_DISCOUNT) {
                x1f x1fVar = x1f.a;
                x1f.k(new r05("purchase_succeeded"), new bt5(str, 9), 2);
                return;
            }
        }
    }

    @Override // defpackage.g4
    public final void z() {
        d().b("onPricesUpdateFailed");
    }
}
