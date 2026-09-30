package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lle {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final af8 f;

    static {
        String property;
        int i = sce.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = xxb.u(100000L, "kotlinx.coroutines.scheduler.resolution.ns", 1L, Long.MAX_VALUE);
        int i2 = sce.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = xxb.v(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = xxb.v(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(xxb.u(60L, "kotlinx.coroutines.scheduler.keep.alive.sec", 1L, Long.MAX_VALUE));
        f = af8.I0;
    }
}
