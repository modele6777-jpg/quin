package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustDeeplink;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustDeeplink c;
    public final /* synthetic */ long d;

    public /* synthetic */ ee(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = adjustDeeplink;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.d;
        AdjustDeeplink adjustDeeplink = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                activityHandler.lambda$processDeeplink$13(adjustDeeplink, j);
                break;
            case 1:
                activityHandler.lambda$processDeeplink$12(adjustDeeplink, j);
                break;
            case 2:
                activityHandler.lambda$processAndResolveDeeplink$14(adjustDeeplink, j);
                break;
            default:
                activityHandler.lambda$processAndResolveDeeplink$15(adjustDeeplink, j);
                break;
        }
    }
}
