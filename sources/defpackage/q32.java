package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.QaResult;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.CountV2;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.UsageBilling;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q32 implements d3b {
    public final q9b a;
    public final fab b;
    public final Danger c = Danger.STAGING_ONLY;

    public q32(q9b q9bVar, fab fabVar) {
        this.a = q9bVar;
        this.b = fabVar;
    }

    @Override // defpackage.d3b
    public final Danger b() {
        return this.c;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        List<UsageBillingBalance> list = pu4.a;
        q9b q9bVar = this.a;
        eab eabVar = q9bVar instanceof eab ? (eab) q9bVar : null;
        if (eabVar == null) {
            return new QaResult.Err("QuotaProvider is not QuotaProviderImpl", "unsupported");
        }
        boolean z = false;
        if (eabVar.c) {
            eabVar.l(eabVar.d, false);
        } else {
            eabVar.b = null;
        }
        QuotaUsage quotaUsage = (QuotaUsage) z5c.I(nu4.a, new p32(this, null));
        if (quotaUsage == null) {
            return new QaResult.Err("quota refresh returned no signed-in usage", "refresh_failed");
        }
        Iterable<CountV2> countV2 = quotaUsage.getCountV2();
        if (countV2 == null) {
            countV2 = list;
        }
        int i = 0;
        for (CountV2 countV3 : countV2) {
            int totalCount = countV3.getTotalCount() - countV3.getUsedCount();
            if (totalCount < 0) {
                totalCount = 0;
            }
            i += totalCount;
        }
        iy9 iy9Var = new iy9("readingCountRemaining", oh7.b(Integer.valueOf(i)));
        UsageBilling usageBilling = quotaUsage.getUsageBilling();
        if (usageBilling != null && usageBilling.getEnabled()) {
            z = true;
        }
        iy9 iy9Var2 = new iy9("usageEnabled", oh7.a(Boolean.valueOf(z)));
        UsageBilling usageBilling2 = quotaUsage.getUsageBilling();
        List<UsageBillingBalance> balances = usageBilling2 != null ? usageBilling2.getBalances() : null;
        if (balances != null) {
            list = balances;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((UsageBillingBalance) obj).isAvailable()) {
                arrayList.add(obj);
            }
        }
        return new QaResult.Ok(new ti7(bm8.H(iy9Var, iy9Var2, new iy9("activeBalanceSources", oh7.c(s72.D0(arrayList, null, null, null, new cz1(3), 31))), new iy9("hasSubscription", oh7.a(Boolean.valueOf(quotaUsage.getHasSubscription()))))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "quota.clear-local-mock";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "清除本地 Usage mock 并刷新额度";
    }
}
