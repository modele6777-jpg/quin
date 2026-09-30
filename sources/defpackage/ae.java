package defpackage;

import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.OnIsEnabledListener;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ae implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ OnIsEnabledListener c;

    public /* synthetic */ ae(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        OnIsEnabledListener onIsEnabledListener = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                activityHandler.lambda$isEnabled$9(onIsEnabledListener);
                break;
            case 1:
                activityHandler.lambda$isEnabled$11(onIsEnabledListener);
                break;
            default:
                activityHandler.lambda$isEnabled$10(onIsEnabledListener);
                break;
        }
    }
}
