package com.adjust.sdk;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ ActivityHandler c;

    public /* synthetic */ a(ActivityHandler activityHandler, Object obj, int i) {
        this.a = i;
        this.c = activityHandler;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        ActivityHandler activityHandler = this.c;
        switch (i) {
            case 0:
                ((OnAdidReadListener) obj).onAdidRead(activityHandler.activityState.adid);
                break;
            case 1:
                ((OnAdidReadListener) obj).onAdidRead(activityHandler.activityState.adid);
                break;
            default:
                OnRemoteTriggerListener onRemoteTriggerListener = activityHandler.adjustConfig.onRemoteTriggerListener;
                if (onRemoteTriggerListener != null) {
                    onRemoteTriggerListener.onRemoteTrigger((AdjustRemoteTrigger) obj);
                }
                break;
        }
    }
}
