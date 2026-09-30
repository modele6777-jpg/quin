package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eh0 implements Runnable {
    public static Handler f;
    public final /* synthetic */ djg e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final ui8 a = new ui8(this, new yg6(1, this));

    public eh0(djg djgVar) {
        this.e = djgVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (eh0.class) {
            try {
                handler = f;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    f = handler;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new v36(this, obj, false, 16));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a();
    }
}
