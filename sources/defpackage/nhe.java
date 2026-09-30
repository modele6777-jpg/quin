package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nhe {
    public static final Handler a;

    static {
        HandlerThread handlerThread = new HandlerThread("TarotBoxThumbnailBake");
        handlerThread.setDaemon(true);
        handlerThread.start();
        a = new Handler(handlerThread.getLooper());
    }

    public static void a(Object obj, x16 x16Var) {
        a.postAtTime(new wp(7, x16Var), obj, SystemClock.uptimeMillis());
    }
}
