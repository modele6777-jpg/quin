package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oge implements ComponentCallbacks2 {
    public final /* synthetic */ int a;

    public /* synthetic */ oge(int i) {
        this.a = i;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int i = this.a;
        configuration.getClass();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                pge pgeVar = pge.a;
                pge.a(true);
                break;
            default:
                fhe.b.e(true);
                break;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        switch (this.a) {
            case 0:
                if (i >= 10) {
                    pge pgeVar = pge.a;
                    pge.a(i < 20);
                }
                break;
            default:
                ws4 ws4Var = fhe.b;
                if (i < 10) {
                    ws4Var.getClass();
                } else {
                    ws4Var.e(i < 20);
                }
                break;
        }
    }
}
