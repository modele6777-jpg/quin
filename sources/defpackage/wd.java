package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustEvent c;

    public /* synthetic */ wd(ActivityHandler activityHandler, AdjustEvent adjustEvent, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = adjustEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdjustEvent adjustEvent = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                activityHandler.lambda$trackEvent$3(adjustEvent);
                break;
            default:
                activityHandler.lambda$trackEvent$4(adjustEvent);
                break;
        }
    }
}
