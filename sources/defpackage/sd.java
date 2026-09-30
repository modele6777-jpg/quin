package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;

    public /* synthetic */ sd(ActivityHandler activityHandler, int i) {
        this.a = i;
        this.b = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                activityHandler.lambda$sendPreinstallReferrer$19();
                break;
            case 1:
                activityHandler.lambda$removeGlobalPartnerParameters$31();
                break;
            case 2:
                activityHandler.lambda$endFirstSessionDelay$48();
                break;
            case 3:
                activityHandler.lambda$sendPreinstallReferrer$18();
                break;
            case 4:
                activityHandler.lambda$sendReftagReferrer$17();
                break;
            case 5:
                activityHandler.lambda$removeGlobalCallbackParameters$29();
                break;
            case 6:
                activityHandler.lambda$gdprForgetMe$34();
                break;
            case 7:
                activityHandler.lambda$gdprForgetMe$35();
                break;
            default:
                activityHandler.lambda$sendReftagReferrer$16();
                break;
        }
    }
}
