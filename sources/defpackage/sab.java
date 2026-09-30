package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.CompensateCount;
import tech.chatmind.api.PayAsYouGo;
import tech.chatmind.api.TimesMembership;
import tech.chatmind.api.credits.GuestPassBalance;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;
import tech.chatmind.api.credits.TokenUsage;
import tech.chatmind.api.credits.UsageBilling;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sab implements w56 {
    public static final sab a;
    private static final nyc descriptor;

    static {
        sab sabVar = new sab();
        a = sabVar;
        gia giaVar = new gia("tech.chatmind.api.credits.QuotaUsage", sabVar, 14);
        giaVar.k("subscription", false);
        giaVar.k("token", false);
        giaVar.k("countV2", true);
        giaVar.k("quinCardCount", true);
        giaVar.k("futureTarotCount", true);
        giaVar.k("payAsYouGo", true);
        giaVar.k("compensateCount", true);
        giaVar.k("timesMembership", true);
        giaVar.k("limitedQuotaList", true);
        giaVar.k("neverPurchased", true);
        giaVar.k("hasPurchasedGiftCard", true);
        giaVar.k("hasPurchasedAllTarotCards", true);
        giaVar.k("usageBilling", true);
        giaVar.k("guestPass", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        QuotaUsage quotaUsage = (QuotaUsage) obj;
        quotaUsage.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        QuotaUsage.write$Self$Quin_core_base_api_release(quotaUsage, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = QuotaUsage.$childSerializers;
        GuestPassBalance guestPassBalance = null;
        UsageBilling usageBilling = null;
        Boolean bool = null;
        List list = null;
        boolean z = true;
        TimesMembership timesMembership = null;
        int i = 0;
        SubscriptionInfo subscriptionInfo = null;
        TokenUsage tokenUsage = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        PayAsYouGo payAsYouGo = null;
        CompensateCount compensateCount = null;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    guestPassBalance = guestPassBalance;
                    break;
                case 0:
                    subscriptionInfo = (SubscriptionInfo) zf2VarC.y(nycVar, 0, k7e.a, subscriptionInfo);
                    i |= 1;
                    z = z;
                    guestPassBalance = guestPassBalance;
                    break;
                case 1:
                    tokenUsage = (TokenUsage) zf2VarC.y(nycVar, 1, bze.a, tokenUsage);
                    i |= 2;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                case 2:
                    list2 = (List) zf2VarC.y(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list2);
                    i |= 4;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                case 3:
                    list3 = (List) zf2VarC.y(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list3);
                    i |= 8;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                case 4:
                    list4 = (List) zf2VarC.y(nycVar, 4, (xn7) lw7VarArr[4].getValue(), list4);
                    i |= 16;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                case 5:
                    payAsYouGo = (PayAsYouGo) zf2VarC.y(nycVar, 5, t2a.a, payAsYouGo);
                    i |= 32;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                case 6:
                    compensateCount = (CompensateCount) zf2VarC.y(nycVar, 6, wa2.a, compensateCount);
                    i |= 64;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                case 7:
                    timesMembership = (TimesMembership) zf2VarC.y(nycVar, 7, pye.a, timesMembership);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                case 8:
                    list = (List) zf2VarC.y(nycVar, 8, (xn7) lw7VarArr[8].getValue(), list);
                    i |= 256;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                case 9:
                    bool = (Boolean) zf2VarC.y(nycVar, 9, g11.a, bool);
                    i |= 512;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    z2 = zf2VarC.z(nycVar, 10);
                    i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    z = z;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    z3 = zf2VarC.z(nycVar, 11);
                    i |= 2048;
                    z = z;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    usageBilling = (UsageBilling) zf2VarC.y(nycVar, 12, whf.a, usageBilling);
                    i |= 4096;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    guestPassBalance = (GuestPassBalance) zf2VarC.y(nycVar, 13, nf6.a, guestPassBalance);
                    i |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    z = z;
                    subscriptionInfo = subscriptionInfo;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new QuotaUsage(i, subscriptionInfo, tokenUsage, list2, list3, list4, payAsYouGo, compensateCount, timesMembership, list, bool, z2, z3, usageBilling, guestPassBalance, (xyc) null);
    }

    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = QuotaUsage.$childSerializers;
        xn7 xn7VarF = t72.F(k7e.a);
        xn7 xn7VarF2 = t72.F(bze.a);
        xn7 xn7VarF3 = t72.F((xn7) lw7VarArr[2].getValue());
        xn7 xn7VarF4 = t72.F((xn7) lw7VarArr[3].getValue());
        xn7 xn7VarF5 = t72.F((xn7) lw7VarArr[4].getValue());
        xn7 xn7VarF6 = t72.F(t2a.a);
        xn7 xn7VarF7 = t72.F(wa2.a);
        xn7 xn7VarF8 = t72.F(pye.a);
        xn7 xn7VarF9 = t72.F((xn7) lw7VarArr[8].getValue());
        g11 g11Var = g11.a;
        return new xn7[]{xn7VarF, xn7VarF2, xn7VarF3, xn7VarF4, xn7VarF5, xn7VarF6, xn7VarF7, xn7VarF8, xn7VarF9, t72.F(g11Var), g11Var, g11Var, t72.F(whf.a), t72.F(nf6.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
