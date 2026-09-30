package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import defpackage.ggg;
import io.sentry.q5;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotEventProcessor implements io.sentry.f0 {
    public final SentryAndroidOptions a;
    public final boolean c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final ggg b = new ggg(2000, 3);

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, o0 o0Var, boolean z) {
        this.a = sentryAndroidOptions;
        this.c = z;
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.b.a("Screenshot");
        }
    }

    public final io.sentry.android.replay.viewhierarchy.g a(Activity activity) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            View rootView = (activity.getWindow() == null || activity.getWindow().peekDecorView() == null || activity.getWindow().peekDecorView().getRootView() == null) ? null : activity.getWindow().peekDecorView().getRootView();
            if (rootView == null) {
                return null;
            }
            io.sentry.android.replay.viewhierarchy.g gVarI = io.sentry.config.a.i(rootView, null, sentryAndroidOptions.getScreenshot());
            io.sentry.android.replay.util.l.b(rootView, gVarI, sentryAndroidOptions.getScreenshot(), sentryAndroidOptions.getLogger(), null);
            return gVarI;
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to build view hierarchy", th);
            return null;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0214 */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:138:0x023c A[PHI: r8
  0x023c: PHI (r8v3 android.graphics.Bitmap) = (r8v13 android.graphics.Bitmap), (r8v14 android.graphics.Bitmap), (r8v4 android.graphics.Bitmap) binds: [B:74:0x0171, B:75:0x0173, B:137:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x0165  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // io.sentry.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.i5 h(io.sentry.i5 r17, io.sentry.l0 r18) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.ScreenshotEventProcessor.h(io.sentry.i5, io.sentry.l0):io.sentry.i5");
    }

    @Override // io.sentry.f0
    public final io.sentry.protocol.f0 l(io.sentry.protocol.f0 f0Var, io.sentry.l0 l0Var) {
        return f0Var;
    }
}
