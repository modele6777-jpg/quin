package defpackage;

import com.adjust.sdk.ActivityHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActivityHandler b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;

    public /* synthetic */ ie(ActivityHandler activityHandler, boolean z, String str, int i) {
        this.a = i;
        this.b = activityHandler;
        this.c = z;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        boolean z = this.c;
        ActivityHandler activityHandler = this.b;
        switch (i) {
            case 0:
                activityHandler.lambda$setPushToken$33(z, str);
                break;
            default:
                activityHandler.lambda$setPushToken$32(z, str);
                break;
        }
    }
}
