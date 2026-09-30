package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import defpackage.bwe;
import io.sentry.k4;
import io.sentry.q5;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class SystemEventsBreadcrumbsIntegration implements io.sentry.w1, Closeable, f0 {
    public final Context a;
    public volatile h2 b;
    public SentryAndroidOptions c;
    public io.sentry.g1 d;
    public final String[] e;
    public volatile boolean f = false;
    public volatile boolean g = false;
    public volatile IntentFilter v = null;
    public volatile HandlerThread w = null;
    public final AtomicBoolean x = new AtomicBoolean(false);
    public final io.sentry.util.a y = new io.sentry.util.a();
    public g2 z;

    public SystemEventsBreadcrumbsIntegration(Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext == null ? context : applicationContext;
        this.e = strArr;
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        this.c = sentryAndroidOptions;
        this.d = k4.a;
        sentryAndroidOptions.getLogger().i(q5.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.c.isEnableSystemEventBreadcrumbs()));
        if (this.c.isEnableSystemEventBreadcrumbs()) {
            i0.e.b(this);
            if (p0.g()) {
                l(this.d, this.c);
            }
        }
    }

    @Override // io.sentry.android.core.f0
    public final void b() {
        if (this.d == null || this.c == null) {
            return;
        }
        this.g = false;
        l(this.d, this.c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.util.a aVar = this.y;
        aVar.b();
        try {
            this.f = true;
            this.v = null;
            if (this.w != null) {
                this.w.quit();
            }
            this.w = null;
            aVar.close();
            i0.e.u(this);
            SentryAndroidOptions sentryAndroidOptions = this.c;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new bwe(15, this));
                } catch (RejectedExecutionException unused) {
                    u(this.c);
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.c;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().i(q5.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.android.core.f0
    public final void h() {
        SentryAndroidOptions sentryAndroidOptions = this.c;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new bwe(15, this));
        } catch (RejectedExecutionException unused) {
            u(this.c);
        }
    }

    public final void l(io.sentry.g1 g1Var, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f && !this.g && this.b == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new r1(this, g1Var, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().i(q5.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    public final void u(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.a aVar = this.y;
        aVar.b();
        try {
            this.g = true;
            h2 h2Var = this.b;
            this.b = null;
            aVar.close();
            if (h2Var != null) {
                try {
                    this.a.unregisterReceiver(h2Var);
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().c(q5.ERROR, th, "Failed to unregister SystemEventsBroadcastReceiver", new Object[0]);
                }
            }
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
