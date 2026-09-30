package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.View;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.z18;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.b0;
import io.sentry.android.replay.i0;
import io.sentry.q5;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements k {
    public final i0 a;
    public final ReplayIntegration b;
    public final SentryAndroidOptions c;
    public final b0 d;
    public volatile Bitmap e;
    public final AtomicReference f;
    public final io.sentry.util.a g;
    public final lw7 h;
    public final AtomicBoolean i;
    public final l j;
    public final AtomicBoolean k;
    public final SurfaceTexture l;
    public final Surface m;
    public final a n;

    public c(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, b0 b0Var, i0 i0Var) {
        i0Var.getClass();
        this.a = i0Var;
        this.b = replayIntegration;
        this.c = sentryAndroidOptions;
        this.d = b0Var;
        this.f = new AtomicReference(null);
        this.g = new io.sentry.util.a();
        this.h = eb3.N(z18.c, new b(this));
        this.i = new AtomicBoolean(false);
        this.j = new l();
        this.k = new AtomicBoolean(false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(false);
        surfaceTexture.setDefaultBufferSize(b0Var.a, b0Var.b);
        this.l = surfaceTexture;
        this.m = new Surface(surfaceTexture);
        io.sentry.util.b.a("ReplayCanvasStrategy");
        this.n = new a(this, 0);
    }

    @Override // io.sentry.android.replay.screenshot.k
    public final boolean a() {
        return this.i.get();
    }

    @Override // io.sentry.android.replay.screenshot.k
    public final void b(View view) {
        AtomicBoolean atomicBoolean = this.k;
        if (atomicBoolean.get()) {
            return;
        }
        Picture picture = new Picture();
        b0 b0Var = this.d;
        Canvas canvasBeginRecording = picture.beginRecording(b0Var.a, b0Var.b);
        canvasBeginRecording.getClass();
        l lVar = this.j;
        lVar.getClass();
        lVar.a = canvasBeginRecording;
        lVar.setMatrix((Matrix) this.h.getValue());
        view.draw(lVar);
        picture.endRecording();
        if (atomicBoolean.get()) {
            return;
        }
        this.f.set(picture);
        d(this.a.l(), new io.sentry.android.replay.util.h(this.n, "screenshot_recorder.canvas"));
    }

    @Override // io.sentry.android.replay.screenshot.k
    public final void c() {
        Bitmap bitmap;
        if (!this.i.get() || (bitmap = this.e) == null || bitmap.isRecycled()) {
            return;
        }
        this.b.C0(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.k
    public final void close() {
        this.k.set(true);
        d(this.a.l(), new io.sentry.android.replay.util.h(new a(this, 1), "CanvasStrategy.close"));
        this.f.getAndSet(null);
    }

    public final void d(Handler handler, io.sentry.android.replay.util.h hVar) {
        try {
            handler.post(hVar);
        } catch (Throwable th) {
            this.c.getLogger().d(q5.ERROR, "Canvas Strategy: failed to post runnable ".concat(hVar.a), th);
        }
    }

    @Override // io.sentry.android.replay.screenshot.k
    public final void onContentChanged() {
    }
}
