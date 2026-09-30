package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;

    public /* synthetic */ c(ActivityHandler activityHandler, int i) {
        this.a = i;
        this.b = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LicenseData licenseRequiredData;
        OnAttributionChangedListener onAttributionChangedListener;
        OnThirdPartySharingSettingsChangedListener onThirdPartySharingSettingsChangedListener;
        int i = this.a;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                ReferrerDetails metaReferrer = Reflection.getMetaReferrer(activityHandler.getContext(), activityHandler.adjustConfig.fbAppId, activityHandler.logger);
                if (metaReferrer != null) {
                    activityHandler.sendInstallReferrer(metaReferrer, Constants.REFERRER_API_META);
                }
                break;
            case 1:
                if (!SharedPreferencesManager.getDefaultInstance(activityHandler.getContext()).getLicenseVerificationTracked() && (licenseRequiredData = Reflection.getLicenseRequiredData(activityHandler.getContext(), activityHandler.logger, activityHandler.deviceInfo.appInstallTime)) != null) {
                    activityHandler.sendLicenseVerificationData(licenseRequiredData);
                }
                break;
            case 2:
                AdjustConfig adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig != null && (onAttributionChangedListener = adjustConfig.onAttributionChangedListener) != null) {
                    onAttributionChangedListener.onAttributionChanged(activityHandler.attribution);
                }
                break;
            default:
                AdjustConfig adjustConfig2 = activityHandler.adjustConfig;
                if (adjustConfig2 != null && (onThirdPartySharingSettingsChangedListener = adjustConfig2.onThirdPartySharingSettingsChangedListener) != null) {
                    onThirdPartySharingSettingsChangedListener.onThirdPartySharingSettingsChanged(activityHandler.thirdPartySharingResult);
                }
                break;
        }
    }
}
