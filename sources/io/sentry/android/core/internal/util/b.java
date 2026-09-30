package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import defpackage.k27;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.f0;
import io.sentry.android.core.i0;
import io.sentry.android.core.o0;
import io.sentry.android.core.p0;
import io.sentry.q5;
import io.sentry.r0;
import io.sentry.s0;
import io.sentry.t0;
import io.sentry.z0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements t0, f0 {
    public static volatile ConnectivityManager X;
    public final Context a;
    public final SentryAndroidOptions b;
    public final o0 c;
    public final c d;
    public final ArrayList e;
    public final io.sentry.util.a f;
    public volatile k27 g;
    public volatile NetworkCapabilities v;
    public volatile Network w;
    public volatile long x;
    public final AtomicBoolean y;
    public static final io.sentry.util.a z = new io.sentry.util.a();
    public static final io.sentry.util.a Y = new io.sentry.util.a();
    public static final ArrayList Z = new ArrayList();
    public static final int[] E0 = {1, 0, 3, 2};
    public static final int[] F0 = new int[2];

    public b(Context context, o0 o0Var, SentryAndroidOptions sentryAndroidOptions) {
        c cVar = c.a;
        this.f = new io.sentry.util.a();
        this.x = 0L;
        this.y = new AtomicBoolean(false);
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = sentryAndroidOptions;
        this.c = o0Var;
        this.d = cVar;
        this.e = new ArrayList();
        int[] iArr = F0;
        iArr[0] = 12;
        iArr[1] = 16;
        N(new a(this, 1));
        i0.e.b(this);
    }

    public static ConnectivityManager G(Context context, z0 z0Var) {
        if (X != null) {
            return X;
        }
        io.sentry.util.a aVar = z;
        aVar.b();
        try {
            if (X != null) {
                ConnectivityManager connectivityManager = X;
                aVar.close();
                return connectivityManager;
            }
            X = (ConnectivityManager) context.getSystemService("connectivity");
            if (X == null) {
                z0Var.i(q5.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = X;
            aVar.close();
            return connectivityManager2;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String x(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    @Override // io.sentry.t0
    public final String D() {
        this.d.getClass();
        if (SystemClock.uptimeMillis() - this.x >= 120000) {
            U(null);
        }
        return E();
    }

    public final String E() {
        NetworkCapabilities networkCapabilities = this.v;
        if (networkCapabilities != null) {
            return x(networkCapabilities);
        }
        Context context = this.a;
        z0 logger = this.b.getLogger();
        o0 o0Var = this.c;
        ConnectivityManager connectivityManagerG = G(context, logger);
        if (connectivityManagerG != null) {
            if (!io.sentry.config.a.r(context)) {
                logger.i(q5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                o0Var.getClass();
                Network activeNetwork = connectivityManagerG.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.i(q5.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerG.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.i(q5.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th) {
                logger.d(q5.ERROR, "Failed to retrieve network info", th);
                return null;
            }
        }
        return null;
    }

    @Override // io.sentry.t0
    public final void G0(s0 s0Var) {
        io.sentry.util.a aVar = this.f;
        aVar.b();
        try {
            this.e.remove(s0Var);
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void N(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        try {
            sentryAndroidOptions.getExecutorService().submit(runnable);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "AndroidConnectionStatusProvider submit failed", th);
        }
    }

    public final void R(boolean z2) {
        io.sentry.util.a aVar = this.f;
        aVar.b();
        if (z2) {
            try {
                this.e.clear();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        k27 k27Var = this.g;
        this.g = null;
        if (k27Var != null) {
            Context context = this.a;
            z0 logger = this.b.getLogger();
            ConnectivityManager connectivityManagerG = G(context, logger);
            if (connectivityManagerG != null) {
                try {
                    connectivityManagerG.unregisterNetworkCallback(k27Var);
                } catch (Throwable th3) {
                    logger.d(q5.WARNING, "unregisterNetworkCallback failed", th3);
                }
            }
        }
        this.v = null;
        this.w = null;
        this.x = 0L;
        aVar.close();
        this.b.getLogger().i(q5.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public final void U(NetworkCapabilities networkCapabilities) {
        io.sentry.util.a aVar = this.f;
        aVar.b();
        try {
            if (networkCapabilities != null) {
                this.v = networkCapabilities;
            } else {
                if (!io.sentry.config.a.r(this.a)) {
                    this.b.getLogger().i(q5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.v = null;
                    this.d.getClass();
                    this.x = SystemClock.uptimeMillis();
                    aVar.close();
                    return;
                }
                this.c.getClass();
                ConnectivityManager connectivityManagerG = G(this.a, this.b.getLogger());
                if (connectivityManagerG != null) {
                    Network activeNetwork = connectivityManagerG.getActiveNetwork();
                    this.v = activeNetwork != null ? connectivityManagerG.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.v = null;
                }
            }
            this.d.getClass();
            this.x = SystemClock.uptimeMillis();
            this.b.getLogger().i(q5.DEBUG, "Cache updated - Status: " + u() + ", Type: " + E(), new Object[0]);
        } catch (Throwable th) {
            try {
                this.b.getLogger().d(q5.WARNING, "Failed to update connection status cache", th);
                this.v = null;
                this.d.getClass();
                this.x = SystemClock.uptimeMillis();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        aVar.close();
    }

    @Override // io.sentry.android.core.f0
    public final void b() {
        if (this.g != null) {
            return;
        }
        N(new a(this, 3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        N(new a(this, 0));
    }

    @Override // io.sentry.android.core.f0
    public final void h() {
        if (this.g == null) {
            return;
        }
        N(new a(this, 2));
    }

    public final void l() {
        if (p0.g() && this.g == null) {
            io.sentry.util.a aVar = this.f;
            aVar.b();
            try {
                if (this.g != null) {
                    aVar.close();
                    return;
                }
                k27 k27Var = new k27(3, this);
                Context context = this.a;
                z0 logger = this.b.getLogger();
                this.c.getClass();
                ConnectivityManager connectivityManagerG = G(context, logger);
                if (connectivityManagerG != null) {
                    if (io.sentry.config.a.r(context)) {
                        try {
                            connectivityManagerG.registerDefaultNetworkCallback(k27Var);
                            this.g = k27Var;
                            this.b.getLogger().i(q5.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th) {
                            logger.d(q5.WARNING, "registerDefaultNetworkCallback failed", th);
                            this.b.getLogger().i(q5.WARNING, "Failed to register network callback", new Object[0]);
                        }
                        aVar.close();
                    }
                    logger.i(q5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.b.getLogger().i(q5.WARNING, "Failed to register network callback", new Object[0]);
                aVar.close();
            } catch (Throwable th2) {
                try {
                    aVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.t0
    public final r0 s0() {
        this.d.getClass();
        if (SystemClock.uptimeMillis() - this.x >= 120000) {
            U(null);
        }
        return u();
    }

    public final r0 u() {
        if (this.v != null) {
            NetworkCapabilities networkCapabilities = this.v;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.c.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i : E0) {
                        if (networkCapabilities.hasTransport(i)) {
                            return r0.CONNECTED;
                        }
                    }
                }
            }
            return r0.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerG = G(this.a, this.b.getLogger());
        if (connectivityManagerG == null) {
            return r0.UNKNOWN;
        }
        Context context = this.a;
        z0 logger = this.b.getLogger();
        if (!io.sentry.config.a.r(context)) {
            logger.i(q5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return r0.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerG.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? r0.CONNECTED : r0.DISCONNECTED;
            }
            logger.i(q5.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return r0.DISCONNECTED;
        } catch (Throwable th) {
            logger.d(q5.WARNING, "Could not retrieve Connection Status", th);
            return r0.UNKNOWN;
        }
    }

    @Override // io.sentry.t0
    public final boolean v0(s0 s0Var) {
        io.sentry.util.a aVar = this.f;
        aVar.b();
        try {
            this.e.add(s0Var);
            aVar.close();
            l();
            return this.g != null;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
