package defpackage;

import ai.askquin.ui.annual.AnnualEntry;
import ai.askquin.ui.router.AppRoute;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n7b implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb9 b;

    public /* synthetic */ n7b(cb9 cb9Var, int i) {
        this.a = i;
        this.b = cb9Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        cb9 cb9Var = this.b;
        switch (i) {
            case 0:
                cb9Var.g();
                break;
            case 1:
                cb9Var.g();
                break;
            case 2:
                cb9Var.g();
                break;
            case 3:
                cb9Var.g();
                ka9.e(cb9Var, AppRoute.GiftCardPurchase.INSTANCE, null, 6);
                break;
            case 4:
                cb9Var.g();
                break;
            case 5:
                cb9Var.g();
                break;
            case 6:
                cb9Var.g();
                break;
            case 7:
                ka9.e(cb9Var, AppRoute.GiftCardList.INSTANCE, null, 6);
                break;
            case 8:
                ka9.e(cb9Var, AppRoute.FAQ.INSTANCE, null, 6);
                break;
            case 9:
                cb9Var.g();
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ka9.e(cb9Var, AppRoute.ThemeSelection.INSTANCE, null, 6);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                cb9Var.g();
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                cb9Var.g();
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                cb9Var.g();
                break;
            case 14:
                cb9Var.g();
                break;
            case 15:
                cb9Var.g();
                ka9.e(cb9Var, AppRoute.FAQ.INSTANCE, null, 6);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                cb9Var.g();
                break;
            case 17:
                ka9.h(cb9Var, AppRoute.Main.INSTANCE, false);
                break;
            case 18:
                ka9.e(cb9Var, AnnualEntry.INSTANCE, null, 6);
                break;
            case 19:
                cb9Var.g();
                break;
            case 20:
                cb9Var.g();
                break;
            case 21:
                cb9Var.g();
                break;
            case 22:
                cb9Var.g();
                break;
            case 23:
                cb9Var.g();
                break;
            default:
                cb9Var.g();
                break;
        }
        return wefVar;
    }
}
