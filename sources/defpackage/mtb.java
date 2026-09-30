package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mtb implements ThreadFactory {
    public static final /* synthetic */ mtb b = new mtb(3);
    public final /* synthetic */ int a;

    public /* synthetic */ mtb(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new fh0(runnable, "fonts-androidx", 1);
            case 1:
                return new Thread(runnable, "UpdateListenerExecutor");
            case 2:
                return new Thread(runnable, "AssetPackBackgroundExecutor");
            default:
                Object obj = f8h.j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
