package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.Period;
import tech.chatmind.api.PeriodUnit;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;
import tech.chatmind.api.credits.UsageBilling;
import tech.chatmind.api.credits.UsageBillingBalance;
import tech.chatmind.api.credits.UsageBillingDailyLimit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vy8 implements d3b {
    public final q9b a;
    public final Danger b = Danger.STAGING_ONLY;
    public final List c = t72.H(new ParamSpec("scenario", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    public vy8(q9b q9bVar) {
        this.a = q9bVar;
    }

    @Override // defpackage.d3b
    public final Danger b() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Object next;
        Period period;
        PeriodUnit unit;
        UsageBillingDailyLimit dailyLimit;
        nh7 nh7Var = (nh7) ti7Var.get("scenario");
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            String strC = yi7VarI instanceof qi7 ? null : yi7VarI.c();
            if (strC != null) {
                lif.a.getClass();
                String string = v4e.o0(strC).toString();
                Iterator it = lif.N0.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!c5e.v(((lif) next).a(), string, true));
                lif lifVar = (lif) next;
                if (lifVar == null) {
                    return new QaResult.Err(ub3.k("invalid scenario '", strC, "'; expected ", s72.D0(lif.N0, null, null, null, new nd8(21), 31)), "invalid_params");
                }
                q9b q9bVar = this.a;
                eab eabVar = q9bVar instanceof eab ? (eab) q9bVar : null;
                if (eabVar == null) {
                    return new QaResult.Err("QuotaProvider is not QuotaProviderImpl", "unsupported");
                }
                QuotaUsage quotaUsageI = eabVar.i(lifVar);
                UsageBilling usageBilling = quotaUsageI.getUsageBilling();
                iy9 iy9Var = new iy9("scenario", oh7.c(lifVar.a()));
                iy9 iy9Var2 = new iy9("usageEnabled", oh7.a(Boolean.valueOf(usageBilling != null && usageBilling.getEnabled())));
                iy9 iy9Var3 = new iy9("canFollowUp", oh7.a(Boolean.valueOf(usageBilling != null && usageBilling.getCanFollowUp())));
                iy9 iy9Var4 = new iy9("dailyLimitReached", oh7.a(Boolean.valueOf((usageBilling == null || (dailyLimit = usageBilling.getDailyLimit()) == null || !dailyLimit.getReached()) ? false : true)));
                SubscriptionInfo subscription = quotaUsageI.getSubscription();
                String strName = (subscription == null || (period = subscription.getPeriod()) == null || (unit = period.getUnit()) == null) ? null : unit.name();
                if (strName == null) {
                    strName = "";
                }
                iy9 iy9Var5 = new iy9("subscriptionPeriod", oh7.c(strName));
                List<UsageBillingBalance> balances = usageBilling != null ? usageBilling.getBalances() : null;
                if (balances == null) {
                    balances = pu4.a;
                }
                return new QaResult.Ok(new ti7(bm8.H(iy9Var, iy9Var2, iy9Var3, iy9Var4, iy9Var5, new iy9("balanceSources", oh7.c(s72.D0(balances, null, null, null, new nd8(22), 31))))));
            }
        }
        return new QaResult.Err("missing required param 'scenario'", "invalid_params");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "quota.mock-usage-scenario";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.c;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "本地 mock 完整 Usage 场景";
    }
}
