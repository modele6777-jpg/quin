package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ n(f0 f0Var, int i) {
        this.a = i;
        this.b = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        f0 f0Var = this.b;
        switch (i) {
            case 0:
                ((o) f0Var).e(5000L);
                break;
            default:
                ((q) f0Var).e(5000L);
                break;
        }
    }
}
