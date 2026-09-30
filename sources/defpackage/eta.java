package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eta implements d3b {
    public final q9b a;
    public final t7 b;
    public final k86 c;
    public final Danger d = Danger.STAGING_ONLY;
    public final List e = t72.H(new ParamSpec("scenario", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    public eta(q9b q9bVar, t7 t7Var, k86 k86Var) {
        this.a = q9bVar;
        this.b = t7Var;
        this.c = k86Var;
    }

    @Override // defpackage.d3b
    public final Danger b() {
        return this.d;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) throws Throwable {
        Object next;
        nh7 nh7Var = (nh7) ti7Var.get("scenario");
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            String strC = yi7VarI instanceof qi7 ? null : yi7VarI.c();
            if (strC != null) {
                j86.a.getClass();
                Iterator it = j86.c.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!c5e.v(((j86) next).c(), v4e.o0(strC).toString(), true));
                j86 j86Var = (j86) next;
                if (j86Var == null) {
                    return new QaResult.Err(ub3.k("invalid scenario '", strC, "'; expected ", s72.D0(j86.c, null, null, null, new zea(11), 31)), "invalid_params");
                }
                t7 t7Var = this.b;
                if (!((mo3) t7Var).b()) {
                    return new QaResult.Err("no signed-in account", "no_account");
                }
                q9b q9bVar = this.a;
                eab eabVar = q9bVar instanceof eab ? (eab) q9bVar : null;
                if (eabVar == null) {
                    return new QaResult.Err("QuotaProvider is not QuotaProviderImpl", "unsupported");
                }
                k86 k86Var = this.c;
                js3 js3Var = ga4.a;
                z5c.I(hr3.c, new oqa((pqa) k86Var, null));
                boolean zB = j86Var.b();
                boolean zA = j86Var.a();
                w57 w57VarA = z57.a.a();
                qfc qfcVar = ar4.b;
                gr4 gr4Var = gr4.DAYS;
                QuotaUsage quotaUsageC = zB ? eab.c(eabVar, u7e.b, UsageBillingBalance.SOURCE_VIP_MONTH, w57VarA.d(y41.T(30, gr4Var)).toString(), w57VarA.d(y41.T(365, gr4Var)).toString(), null, null, null, null, 1008) : eab.a(eabVar, null, null, null, 7);
                eabVar.l(quotaUsageC.copy((16382 & 1) != 0 ? quotaUsageC.subscription : null, (16382 & 2) != 0 ? quotaUsageC.token : null, (16382 & 4) != 0 ? quotaUsageC.countV2 : null, (16382 & 8) != 0 ? quotaUsageC.quinCardCount : null, (16382 & 16) != 0 ? quotaUsageC.futureTarotCount : null, (16382 & 32) != 0 ? quotaUsageC.payAsYouGo : null, (16382 & 64) != 0 ? quotaUsageC.compensateCount : null, (16382 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? quotaUsageC.timesMembership : null, (16382 & 256) != 0 ? quotaUsageC.limitedQuotaList : null, (16382 & 512) != 0 ? quotaUsageC.neverPurchased : null, (16382 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? quotaUsageC.hasPurchasedGiftCard : zA, (16382 & 2048) != 0 ? quotaUsageC.hasPurchasedAllTarotCards : false, (16382 & 4096) != 0 ? quotaUsageC.usageBilling : null, (16382 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? quotaUsageC.guestPass : null), true);
                return new QaResult.Ok(bzd.w(q9bVar, t7Var, k86Var, j86Var.c()));
            }
        }
        return new QaResult.Err("missing required param 'scenario'", "invalid_params");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.prepare-gift-card-guide";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.e;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "准备礼品卡会员引导资格场景";
    }
}
