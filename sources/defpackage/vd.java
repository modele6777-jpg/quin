package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAdRevenue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ AdjustAdRevenue c;

    public /* synthetic */ vd(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdjustAdRevenue adjustAdRevenue = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                activityHandler.lambda$trackAdRevenue$41(adjustAdRevenue);
                break;
            default:
                activityHandler.lambda$trackAdRevenue$40(adjustAdRevenue);
                break;
        }
    }
}
