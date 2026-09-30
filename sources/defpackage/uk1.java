package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uk1 implements kfe {
    public static final no0 b = new no0("camerax.core.appConfig.cameraFactoryProvider", tf1.class, null);
    public static final no0 c = new no0("camerax.core.appConfig.deviceSurfaceManagerProvider", yc1.class, null);
    public static final no0 d = new no0("camerax.core.appConfig.useCaseConfigFactoryProvider", zc1.class, null);
    public static final no0 e = new no0("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    public static final no0 f = new no0("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    public static final no0 g = new no0("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    public static final no0 v = new no0("camerax.core.appConfig.availableCamerasLimiter", xi1.class, null);
    public static final no0 w = new no0("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    public static final no0 x = new no0("camerax.core.appConfig.cameraProviderInitRetryPolicy", tzb.class, null);
    public static final no0 y = new no0("camerax.core.appConfig.quirksSettings", h9b.class, null);
    public static final no0 z = new no0("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    public final bs9 a;

    public uk1(bs9 bs9Var) {
        this.a = bs9Var;
    }

    public final xi1 d() {
        return (xi1) this.a.a(v, null);
    }

    public final tf1 j() {
        return (tf1) this.a.a(b, null);
    }

    @Override // defpackage.vdb
    public final qh2 k() {
        return this.a;
    }

    public final long m() {
        return ((Long) this.a.a(w, -1L)).longValue();
    }

    public final yc1 n() {
        return (yc1) this.a.a(c, null);
    }

    public final zc1 p() {
        return (zc1) this.a.a(d, null);
    }
}
