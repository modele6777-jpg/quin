package defpackage;

import com.adjust.sdk.PackageHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ow9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PackageHandler b;

    public /* synthetic */ ow9(PackageHandler packageHandler, int i) {
        this.a = i;
        this.b = packageHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        PackageHandler packageHandler = this.b;
        switch (i) {
            case 0:
                packageHandler.initI();
                break;
            case 1:
                packageHandler.sendFirstI();
                break;
            case 2:
                packageHandler.logger.verbose("Package handler can send", new Object[0]);
                packageHandler.isSending.set(false);
                packageHandler.sendFirstPackage();
                break;
            case 3:
                packageHandler.flushI();
                break;
            default:
                packageHandler.logger.verbose("Package handler finished waiting to continue", new Object[0]);
                packageHandler.isSending.set(false);
                packageHandler.sendFirstPackage();
                break;
        }
    }
}
