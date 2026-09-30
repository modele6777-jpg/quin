package io.sentry.android.replay;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.ap;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.q5;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements ViewTreeObserver.OnDrawListener {
    public final SentryAndroidOptions a;
    public WeakReference b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final io.sentry.android.replay.screenshot.k e;

    public a0(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, b0 b0Var, i0 i0Var) {
        io.sentry.android.replay.screenshot.k cVar;
        i0Var.getClass();
        this.a = sentryAndroidOptions;
        this.c = new AtomicBoolean(true);
        io.sentry.android.replay.util.b bVar = new io.sentry.android.replay.util.b();
        this.d = new AtomicBoolean(false);
        int i = y.a[sentryAndroidOptions.getSessionReplay().n.ordinal()];
        if (i == 1) {
            cVar = new io.sentry.android.replay.screenshot.c(sentryAndroidOptions, replayIntegration, b0Var, i0Var);
        } else {
            if (i != 2) {
                ap.c();
                throw null;
            }
            cVar = new io.sentry.android.replay.screenshot.j(i0Var, replayIntegration, sentryAndroidOptions, b0Var, bVar, new z(this));
        }
        this.e = cVar;
    }

    public final void a(View view) {
        view.getClass();
        WeakReference weakReference = this.b;
        c(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.b = new WeakReference(view);
        if (view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
            try {
                view.getViewTreeObserver().addOnDrawListener(this);
            } catch (IllegalStateException unused) {
            }
        }
        this.d.set(true);
        this.e.onContentChanged();
    }

    public final void b() {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        boolean z = sentryAndroidOptions.getSessionReplay().m;
        AtomicBoolean atomicBoolean = this.c;
        if (z) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(atomicBoolean.get()));
        }
        if (!atomicBoolean.get()) {
            if (sentryAndroidOptions.getSessionReplay().m) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        boolean z2 = sentryAndroidOptions.getSessionReplay().m;
        io.sentry.android.replay.screenshot.k kVar = this.e;
        AtomicBoolean atomicBoolean2 = this.d;
        if (z2) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(atomicBoolean2.get()), Boolean.valueOf(kVar.a()));
        }
        if (!atomicBoolean2.get()) {
            kVar.c();
            return;
        }
        WeakReference weakReference = this.b;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (io.sentry.config.a.o(view) == null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            atomicBoolean2.set(false);
            kVar.b(view);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(q5.WARNING, "Failed to capture replay recording", th);
        }
    }

    public final void c(View view) {
        this.a.getReplayController().getClass();
        if (view == null || view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
            return;
        }
        try {
            view.getViewTreeObserver().removeOnDrawListener(this);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.c.get()) {
            WeakReference weakReference = this.b;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.a.getLogger().i(q5.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.d.set(true);
                this.e.onContentChanged();
            }
        }
    }
}
