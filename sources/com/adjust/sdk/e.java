package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionResponseData b;
    public final /* synthetic */ ActivityHandler c;

    public /* synthetic */ e(ActivityHandler activityHandler, SessionResponseData sessionResponseData, int i) {
        this.a = i;
        this.c = activityHandler;
        this.b = sessionResponseData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnSessionTrackingSucceededListener onSessionTrackingSucceededListener;
        OnSessionTrackingFailedListener onSessionTrackingFailedListener;
        int i = this.a;
        SessionResponseData sessionResponseData = this.b;
        ActivityHandler activityHandler = this.c;
        switch (i) {
            case 0:
                AdjustConfig adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig != null && (onSessionTrackingSucceededListener = adjustConfig.onSessionTrackingSucceededListener) != null) {
                    onSessionTrackingSucceededListener.onSessionTrackingSucceeded(sessionResponseData.getSuccessResponseData());
                }
                break;
            default:
                AdjustConfig adjustConfig2 = activityHandler.adjustConfig;
                if (adjustConfig2 != null && (onSessionTrackingFailedListener = adjustConfig2.onSessionTrackingFailedListener) != null) {
                    onSessionTrackingFailedListener.onSessionTrackingFailed(sessionResponseData.getFailureResponseData());
                }
                break;
        }
    }
}
