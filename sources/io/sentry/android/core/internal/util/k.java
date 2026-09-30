package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.q5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ Window c;

    public /* synthetic */ k(o oVar, Window window, int i) {
        this.a = i;
        this.b = oVar;
        this.c = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o oVar = this.b;
                Window window = this.c;
                if (oVar.b.add(window)) {
                    try {
                        c cVar = oVar.w;
                        l lVar = oVar.x;
                        Handler handler = oVar.d;
                        cVar.getClass();
                        if (lVar != null) {
                            window.addOnFrameMetricsAvailableListener(lVar, handler);
                        }
                    } catch (Throwable th) {
                        oVar.c.d(q5.ERROR, "Failed to add frameMetricsAvailableListener", th);
                        return;
                    }
                }
                break;
            default:
                o oVar2 = this.b;
                Window window2 = this.c;
                try {
                    if (oVar2.b.remove(window2)) {
                        c cVar2 = oVar2.w;
                        l lVar2 = oVar2.x;
                        cVar2.getClass();
                        if (lVar2 != null) {
                            window2.removeOnFrameMetricsAvailableListener(lVar2);
                        }
                    }
                } catch (Throwable th2) {
                    oVar2.c.d(q5.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
                }
                break;
        }
    }
}
