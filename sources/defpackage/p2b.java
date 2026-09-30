package defpackage;

import com.adjust.sdk.PurchaseVerificationHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p2b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PurchaseVerificationHandler b;

    public /* synthetic */ p2b(PurchaseVerificationHandler purchaseVerificationHandler, int i) {
        this.a = i;
        this.b = purchaseVerificationHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PurchaseVerificationHandler purchaseVerificationHandler = this.b;
        switch (i) {
            case 0:
                purchaseVerificationHandler.sendNextPurchaseVerificationPackageI();
                break;
            default:
                purchaseVerificationHandler.lastPackageRetryInMilli = 0L;
                purchaseVerificationHandler.sendNextPurchaseVerificationPackage();
                break;
        }
    }
}
