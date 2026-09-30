package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventResponseData b;
    public final /* synthetic */ ActivityHandler c;

    public /* synthetic */ d(ActivityHandler activityHandler, EventResponseData eventResponseData, int i) {
        this.a = i;
        this.c = activityHandler;
        this.b = eventResponseData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnEventTrackingSucceededListener onEventTrackingSucceededListener;
        OnEventTrackingFailedListener onEventTrackingFailedListener;
        int i = this.a;
        EventResponseData eventResponseData = this.b;
        ActivityHandler activityHandler = this.c;
        switch (i) {
            case 0:
                AdjustConfig adjustConfig = activityHandler.adjustConfig;
                if (adjustConfig != null && (onEventTrackingSucceededListener = adjustConfig.onEventTrackingSucceededListener) != null) {
                    onEventTrackingSucceededListener.onEventTrackingSucceeded(eventResponseData.getSuccessResponseData());
                }
                break;
            default:
                AdjustConfig adjustConfig2 = activityHandler.adjustConfig;
                if (adjustConfig2 != null && (onEventTrackingFailedListener = adjustConfig2.onEventTrackingFailedListener) != null) {
                    onEventTrackingFailedListener.onEventTrackingFailed(eventResponseData.getFailureResponseData());
                }
                break;
        }
    }
}
