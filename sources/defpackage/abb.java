package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.CompensateCount;
import tech.chatmind.api.GuestPassResponse;
import tech.chatmind.api.PayAsYouGo;
import tech.chatmind.api.QuotaUsageResponse;
import tech.chatmind.api.SubscriptionData;
import tech.chatmind.api.TimesMembership;
import tech.chatmind.api.TokenData;
import tech.chatmind.api.UsageBillingResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class abb implements w56 {
    public static final abb a;
    private static final nyc descriptor;

    static {
        abb abbVar = new abb();
        a = abbVar;
        gia giaVar = new gia("tech.chatmind.api.QuotaUsageResponse", abbVar, 14);
        giaVar.k("subscription", false);
        giaVar.k("countV2", false);
        giaVar.k("quinCardCount", false);
        giaVar.k("futureTarotCount", false);
        giaVar.k("token", false);
        giaVar.k("payAsYouGo", false);
        giaVar.k("compensateCount", false);
        giaVar.k("timesMembership", false);
        giaVar.k("limitedQuotaList", false);
        giaVar.k("neverPurchased", false);
        giaVar.k("hasPurchasedGiftCard", true);
        giaVar.k("hasPurchasedAllTarotCards", true);
        giaVar.k("usageBilling", true);
        giaVar.k("guestPass", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        QuotaUsageResponse quotaUsageResponse = (QuotaUsageResponse) obj;
        quotaUsageResponse.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        QuotaUsageResponse.write$Self$Quin_core_base_api_release(quotaUsageResponse, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        lw7[] lw7VarArr;
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr2 = QuotaUsageResponse.$childSerializers;
        GuestPassResponse guestPassResponse = null;
        UsageBillingResponse usageBillingResponse = null;
        List list = null;
        boolean z = true;
        TimesMembership timesMembership = null;
        int i = 0;
        SubscriptionData subscriptionData = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        TokenData tokenData = null;
        PayAsYouGo payAsYouGo = null;
        CompensateCount compensateCount = null;
        int i2 = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    i2 = 1;
                    break;
                case 0:
                    subscriptionData = (SubscriptionData) zf2VarC.y(nycVar, 0, d7e.a, subscriptionData);
                    i |= 1;
                    lw7VarArr2 = lw7VarArr2;
                    z = z;
                    i2 = 1;
                    break;
                case 1:
                    lw7VarArr = lw7VarArr2;
                    list2 = (List) zf2VarC.s(nycVar, i2, (xn7) lw7VarArr[i2].getValue(), list2);
                    i |= 2;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 2:
                    lw7VarArr = lw7VarArr2;
                    list3 = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list3);
                    i |= 4;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 3:
                    lw7VarArr = lw7VarArr2;
                    list4 = (List) zf2VarC.s(nycVar, 3, (xn7) lw7VarArr[3].getValue(), list4);
                    i |= 8;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 4:
                    lw7VarArr = lw7VarArr2;
                    tokenData = (TokenData) zf2VarC.y(nycVar, 4, zye.a, tokenData);
                    i |= 16;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 5:
                    lw7VarArr = lw7VarArr2;
                    payAsYouGo = (PayAsYouGo) zf2VarC.s(nycVar, 5, t2a.a, payAsYouGo);
                    i |= 32;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 6:
                    lw7VarArr = lw7VarArr2;
                    compensateCount = (CompensateCount) zf2VarC.y(nycVar, 6, wa2.a, compensateCount);
                    i |= 64;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 7:
                    lw7VarArr = lw7VarArr2;
                    timesMembership = (TimesMembership) zf2VarC.y(nycVar, 7, pye.a, timesMembership);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 8:
                    lw7VarArr = lw7VarArr2;
                    list = (List) zf2VarC.y(nycVar, 8, (xn7) lw7VarArr[8].getValue(), list);
                    i |= 256;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case 9:
                    z2 = zf2VarC.z(nycVar, 9);
                    i |= 512;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    z3 = zf2VarC.z(nycVar, 10);
                    i |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    z4 = zf2VarC.z(nycVar, 11);
                    i |= 2048;
                    lw7VarArr2 = lw7VarArr2;
                    break;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    lw7VarArr = lw7VarArr2;
                    usageBillingResponse = (UsageBillingResponse) zf2VarC.y(nycVar, 12, gif.a, usageBillingResponse);
                    i |= 4096;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    lw7VarArr = lw7VarArr2;
                    guestPassResponse = (GuestPassResponse) zf2VarC.y(nycVar, 13, cg6.a, guestPassResponse);
                    i |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    lw7VarArr2 = lw7VarArr;
                    z = z;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new QuotaUsageResponse(i, subscriptionData, list2, list3, list4, tokenData, payAsYouGo, compensateCount, timesMembership, list, z2, z3, z4, usageBillingResponse, guestPassResponse, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = QuotaUsageResponse.$childSerializers;
        g11 g11Var = g11.a;
        return new xn7[]{t72.F(d7e.a), lw7VarArr[1].getValue(), lw7VarArr[2].getValue(), lw7VarArr[3].getValue(), t72.F(zye.a), t2a.a, t72.F(wa2.a), t72.F(pye.a), t72.F((xn7) lw7VarArr[8].getValue()), g11Var, g11Var, g11Var, t72.F(gif.a), t72.F(cg6.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
