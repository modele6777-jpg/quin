package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ft implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public ft() {
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Handler handler = this.b;
        switch (i) {
            case 0:
                handler.post(runnable);
                break;
            case 1:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    pd4.f(handler);
                    break;
                }
                break;
            case 2:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    pd4.f(handler);
                    break;
                }
                break;
            case 3:
                runnable.getClass();
                if (!handler.post(runnable)) {
                    pd4.f(handler);
                    break;
                }
                break;
            default:
                handler.post(runnable);
                break;
        }
    }

    public /* synthetic */ ft(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }

    public ft(Handler handler) {
        this.a = 2;
        handler.getClass();
        this.b = handler;
    }
}
