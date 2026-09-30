package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.Constants;
import com.adjust.sdk.ReferrerDetails;
import com.adjust.sdk.Reflection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;

    public /* synthetic */ ke(ActivityHandler activityHandler, int i) {
        this.a = i;
        this.b = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                activityHandler.gotOptOutResponseI();
                break;
            case 1:
                activityHandler.foregroundTimerFiredI();
                break;
            case 2:
                activityHandler.backgroundTimerFiredI();
                break;
            case 3:
                activityHandler.foregroundTimerFired();
                break;
            case 4:
                activityHandler.backgroundTimerFired();
                break;
            case 5:
                ReferrerDetails huaweiAdsReferrer = Reflection.getHuaweiAdsReferrer(activityHandler.getContext(), activityHandler.logger);
                if (huaweiAdsReferrer != null) {
                    activityHandler.sendInstallReferrer(huaweiAdsReferrer, Constants.REFERRER_API_HUAWEI_ADS);
                }
                break;
            case 6:
                ReferrerDetails huaweiAppGalleryReferrer = Reflection.getHuaweiAppGalleryReferrer(activityHandler.getContext(), activityHandler.logger);
                if (huaweiAppGalleryReferrer != null) {
                    activityHandler.sendInstallReferrer(huaweiAppGalleryReferrer, Constants.REFERRER_API_HUAWEI_APP_GALLERY);
                }
                break;
            case 7:
                ReferrerDetails samsungReferrer = Reflection.getSamsungReferrer(activityHandler.getContext(), activityHandler.logger);
                if (samsungReferrer != null) {
                    activityHandler.sendInstallReferrer(samsungReferrer, Constants.REFERRER_API_SAMSUNG);
                }
                break;
            case 8:
                ReferrerDetails xiaomiReferrer = Reflection.getXiaomiReferrer(activityHandler.getContext(), activityHandler.logger);
                if (xiaomiReferrer != null) {
                    activityHandler.sendInstallReferrer(xiaomiReferrer, Constants.REFERRER_API_XIAOMI);
                }
                break;
            default:
                ReferrerDetails vivoReferrer = Reflection.getVivoReferrer(activityHandler.getContext(), activityHandler.logger);
                if (vivoReferrer != null) {
                    activityHandler.sendInstallReferrer(vivoReferrer, Constants.REFERRER_API_VIVO);
                }
                break;
        }
    }
}
