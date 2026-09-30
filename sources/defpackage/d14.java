package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d14 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eab b;

    public /* synthetic */ d14(eab eabVar, int i) {
        this.a = i;
        this.b = eabVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        lif lifVar = lif.MonthlyExhausted;
        wef wefVar = wef.a;
        eab eabVar = this.b;
        switch (i) {
            case 0:
                ub3.r(eabVar, lif.Guest, "已 mock ", "普通用户·追问需升级", 0);
                break;
            case 1:
                ub3.r(eabVar, lif.NonSubscriberUsageInUse, "已 mock ", "非订阅·Usage先扣", 0);
                break;
            case 2:
                ub3.r(eabVar, lif.AddonOnlyNoFollowUp, "已 mock ", "订阅过期·追问需续订", 0);
                break;
            case 3:
                ub3.r(eabVar, lif.AddonOnlyExhausted, "已 mock ", "仅剩补给且额度为0", 0);
                break;
            case 4:
                ub3.r(eabVar, lifVar, "已 mock ", "会员且其他额度均已用完", 0);
                break;
            case 5:
                ub3.r(eabVar, lif.PassOnly, "已 mock ", "纯次卡", 0);
                break;
            case 6:
                ub3.r(eabVar, lif.MonthlyActive, "已 mock ", "月卡", 0);
                break;
            case 7:
                ub3.r(eabVar, lif.MonthlyFreeCountInUse, "已 mock ", "月卡·免费次数先用", 0);
                break;
            case 8:
                ub3.r(eabVar, lif.YearlyActive, "已 mock ", "年卡", 0);
                break;
            case 9:
                ub3.r(eabVar, lif.WeeklyActive, "已 mock ", "周卡", 0);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ub3.r(eabVar, lif.MixedPassInUse, "已 mock ", "混合·次卡先用", 0);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ub3.r(eabVar, lif.MixedUsageInUse, "已 mock ", "混合·额度先用", 0);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ub3.r(eabVar, lif.PartiallyUsedAddonStandby, "已 mock ", "额度已用50%·转待用", 0);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ub3.r(eabVar, lif.NonSubscriberCountInUse, "已 mock ", "非订阅·次数先扣", 0);
                break;
            case 14:
                ub3.r(eabVar, lif.DailyLimitCn, "已 mock ", "日限额已达（CN 0:00）", 0);
                break;
            case 15:
                ub3.r(eabVar, lif.DailyLimitUsageFirstWithCounts, "已 mock ", "Usage先用且仍有待用次数，日限额已达", 0);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ub3.r(eabVar, lif.ExpiredSubscriptionAddonDailyLimit, "已 mock ", "订阅过期·有补给·日限额已达", 0);
                break;
            case 17:
                ub3.r(eabVar, lif.DailyLimitGlobal, "已 mock ", "日限额已达（UTC 0:00）", 0);
                break;
            case 18:
                ub3.r(eabVar, lifVar, "已 mock ", "月额度已用完", 0);
                break;
            case 19:
                ub3.r(eabVar, lif.MonthlyExhaustedWithEventBonus, "已 mock ", "月额度用完但活动赠送可用", 0);
                break;
            case 20:
                ub3.r(eabVar, lif.MonthlyExhaustedWithCombinedCounts, "已 mock ", "月额度用完但组合次数可支付2次", 0);
                break;
            case 21:
                ub3.r(eabVar, lif.LastMonthExpireFallback, "已 mock ", "最后一月·到期时间", 0);
                break;
            case 22:
                eabVar.h(null);
                break;
            case 23:
                eabVar.h(u7e.Y);
                break;
            case 24:
                eabVar.h(u7e.y);
                break;
            case 25:
                eabVar.h(u7e.v);
                break;
            case 26:
                eabVar.h(u7e.c);
                break;
            default:
                eabVar.h(u7e.b);
                break;
        }
        return wefVar;
    }
}
