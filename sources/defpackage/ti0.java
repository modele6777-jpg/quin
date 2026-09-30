package defpackage;

import com.adjust.sdk.AttributionHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ti0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AttributionHandler b;

    public /* synthetic */ ti0(AttributionHandler attributionHandler, int i) {
        this.a = i;
        this.b = attributionHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AttributionHandler attributionHandler = this.b;
        switch (i) {
            case 0:
                attributionHandler.sendAttributionRequest();
                break;
            case 1:
                attributionHandler.lastInitiatedBy = "sdk";
                attributionHandler.getAttributionI(0L);
                break;
            default:
                attributionHandler.sendAttributionRequestI();
                break;
        }
    }
}
