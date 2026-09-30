package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustPlayStoreSubscription;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustPlayStoreSubscription c;

    public /* synthetic */ zd(ActivityHandler activityHandler, AdjustPlayStoreSubscription adjustPlayStoreSubscription, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = adjustPlayStoreSubscription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdjustPlayStoreSubscription adjustPlayStoreSubscription = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                activityHandler.lambda$trackPlayStoreSubscription$42(adjustPlayStoreSubscription);
                break;
            default:
                activityHandler.lambda$trackPlayStoreSubscription$43(adjustPlayStoreSubscription);
                break;
        }
    }
}
