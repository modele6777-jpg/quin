package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.UsageBilling;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fh extends yu0 {
    public final t7 P0;
    public final fab Q0;
    public final gd8 R0;
    public final String S0;
    public QuotaUsage T0;
    public final vz9 U0;
    public final vz9 V0;

    public fh(t7 t7Var, fab fabVar, gd8 gd8Var, String str) {
        super(t7Var, null);
        this.P0 = t7Var;
        this.Q0 = fabVar;
        this.R0 = gd8Var;
        this.S0 = str;
        this.U0 = q1c.f(null);
        this.V0 = q1c.f(new gh(null, null));
    }

    @Override // defpackage.g4
    public final void M(vb2 vb2Var) {
        if (this.T0 == null) {
            ynb.V(hwf.a(this), null, null, new eh(this, null), 3);
        }
        super.M(vb2Var);
    }

    @Override // defpackage.yu0, defpackage.g4
    /* JADX INFO: renamed from: P */
    public final boolean s(QuotaUsage quotaUsage) {
        LimitedQuota limitedQuotaT;
        List<LimitedQuota> limitedQuotaList;
        LimitedQuota limitedQuotaT2;
        quotaUsage.getClass();
        UsageBilling usageBilling = quotaUsage.getUsageBilling();
        QuotaUsage quotaUsage2 = this.T0;
        UsageBilling usageBilling2 = quotaUsage2 != null ? quotaUsage2.getUsageBilling() : null;
        if (usageBilling != null || usageBilling2 != null) {
            if (pa7.t(usageBilling != null ? usageBilling.getBalances() : null, usageBilling2 != null ? usageBilling2.getBalances() : null)) {
                if (pa7.t(usageBilling != null ? usageBilling.getDailyLimit() : null, usageBilling2 != null ? usageBilling2.getDailyLimit() : null)) {
                    return false;
                }
            }
            return true;
        }
        List<LimitedQuota> limitedQuotaList2 = quotaUsage.getLimitedQuotaList();
        if (limitedQuotaList2 == null || (limitedQuotaT = t4c.t(limitedQuotaList2)) == null) {
            return false;
        }
        QuotaUsage quotaUsage3 = this.T0;
        return quotaUsage3 == null || (limitedQuotaList = quotaUsage3.getLimitedQuotaList()) == null || (limitedQuotaT2 = t4c.t(limitedQuotaList)) == null || !pa7.t(limitedQuotaT.getExpiredAt(), limitedQuotaT2.getExpiredAt()) || limitedQuotaT.getTotalCount() != limitedQuotaT2.getTotalCount();
    }

    @Override // defpackage.g4
    public final void u(Object obj, List list) {
        d().e("AddonPaywall onInAppPurchase called, details=" + list);
        this.U0.setValue(izb.a);
        ynb.V(hwf.a(this), null, null, new dh(this, null), 3);
    }

    @Override // defpackage.g4
    public final void w(ArrayList arrayList) {
        Object obj;
        Object next;
        Iterator it = arrayList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((n07) next).g() != az2.CreditPackA);
        n07 n07Var = (n07) next;
        for (Object obj2 : arrayList) {
            if (((n07) obj2).g() == az2.CreditPackB) {
                obj = obj2;
                break;
            }
        }
        this.V0.setValue(new gh(n07Var, (n07) obj));
    }

    @Override // defpackage.g4
    public final void x(String str, List list) {
        str.getClass();
        x1f x1fVar = x1f.a;
        x1f.k(new r05("paywall_success_discount"), null, 6);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((o07) it.next()).e instanceof az2) {
                x1f x1fVar2 = x1f.a;
                x1f.k(new r05("purchase_succeeded"), new l0(4, str, this), 2);
                return;
            }
        }
    }

    @Override // defpackage.g4
    public final void z() {
    }
}
