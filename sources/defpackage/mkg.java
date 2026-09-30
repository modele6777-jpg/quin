package defpackage;

import android.os.Build;
import io.sentry.android.core.b1;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mkg extends m4 {
    public static final boolean d;
    public static final boolean e;
    public static final boolean f;
    public static final AtomicReference g;
    public static final AtomicLong v;
    public static final ConcurrentLinkedQueue w;
    public volatile m4 c;

    static {
        String str = Build.FINGERPRINT;
        d = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        e = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f = "eng".equals(str3) || "userdebug".equals(str3);
        g = new AtomicReference();
        v = new AtomicLong();
        w = new ConcurrentLinkedQueue();
    }

    public static void B0() {
        while (true) {
            lkg lkgVar = (lkg) w.poll();
            if (lkgVar == null) {
                return;
            }
            v.getAndDecrement();
            mkg mkgVar = lkgVar.a;
            yfh yfhVar = lkgVar.b;
            cgh cghVar = yfhVar.c;
            if ((cghVar != null && Boolean.TRUE.equals(cghVar.r(bgh.g))) || mkgVar.x0(yfhVar.a)) {
                mkgVar.y0(yfhVar);
            }
        }
    }

    @Override // defpackage.m4
    public final boolean x0(Level level) {
        return this.c == null || this.c.x0(level);
    }

    @Override // defpackage.m4
    public final void y0(yfh yfhVar) {
        if (this.c != null) {
            this.c.y0(yfhVar);
            return;
        }
        if (v.incrementAndGet() > 20) {
            w.poll();
            b1.l("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        w.offer(new lkg(this, yfhVar));
        if (this.c != null) {
            B0();
        }
    }

    @Override // defpackage.m4
    public final void z0(RuntimeException runtimeException, yfh yfhVar) {
        if (this.c != null) {
            this.c.z0(runtimeException, yfhVar);
        } else {
            b1.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
