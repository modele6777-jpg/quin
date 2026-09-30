package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ String c;

    public /* synthetic */ yd(ActivityHandler activityHandler, String str, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                activityHandler.lambda$setExternalDeviceIdInDelay$51(str);
                break;
            case 1:
                activityHandler.lambda$removeGlobalPartnerParameter$27(str);
                break;
            default:
                activityHandler.lambda$removeGlobalCallbackParameter$25(str);
                break;
        }
    }
}
