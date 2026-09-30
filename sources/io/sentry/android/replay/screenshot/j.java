package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.z18;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.b0;
import io.sentry.android.replay.i0;
import io.sentry.android.replay.z;
import io.sentry.q5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements k {
    public final ReplayIntegration a;
    public final SentryAndroidOptions b;
    public final b0 c;
    public final z d;
    public final ScheduledExecutorService e;
    public final io.sentry.d f;
    public final Bitmap g;
    public final lw7 h;
    public final AtomicBoolean i;
    public final io.sentry.android.replay.util.f j;
    public final AtomicBoolean k;
    public final AtomicInteger l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final lw7 o;
    public final lw7 p;
    public final Rect q;
    public final RectF r;
    public final int[] s;
    public final int[] t;

    public j(i0 i0Var, ReplayIntegration replayIntegration, SentryAndroidOptions sentryAndroidOptions, b0 b0Var, io.sentry.android.replay.util.b bVar, z zVar) {
        i0Var.getClass();
        this.a = replayIntegration;
        this.b = sentryAndroidOptions;
        this.c = b0Var;
        this.d = zVar;
        this.e = i0Var.e;
        this.f = i0Var.d;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(b0Var.a, b0Var.b, sentryAndroidOptions.getSessionReplay().o ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        bitmapCreateBitmap.getClass();
        this.g = bitmapCreateBitmap;
        h hVar = new h(this);
        z18 z18Var = z18.c;
        this.h = eb3.N(z18Var, hVar);
        this.i = new AtomicBoolean(false);
        this.j = new io.sentry.android.replay.util.f();
        this.k = new AtomicBoolean(false);
        this.l = new AtomicInteger(0);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = eb3.N(z18Var, g.a);
        this.p = eb3.N(z18Var, new i(this));
        this.q = new Rect();
        this.r = new RectF();
        this.s = new int[2];
        this.t = new int[2];
    }

    public static final void f(AtomicInteger atomicInteger, final j jVar, final View view, final io.sentry.android.core.internal.threaddump.b[] bVarArr, final io.sentry.android.replay.viewhierarchy.g gVar, final int i, final int i2, final boolean z) {
        if (atomicInteger.decrementAndGet() == 0 && jVar.e.submit(new io.sentry.android.replay.util.h(new Runnable() { // from class: io.sentry.android.replay.screenshot.f
            /* JADX WARN: Code duplicated, block: B:18:0x0098  */
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                int i4;
                j jVar2 = this.a;
                int i5 = i;
                int i6 = i2;
                View view2 = view;
                io.sentry.android.replay.viewhierarchy.g gVar2 = gVar;
                boolean z2 = z;
                try {
                    boolean z3 = jVar2.m.get();
                    io.sentry.android.core.internal.threaddump.b[] bVarArr2 = bVarArr;
                    if (!z3 && !jVar2.g.isRecycled()) {
                        int i7 = 0;
                        for (int length = bVarArr2.length; i7 < length; length = length) {
                            io.sentry.android.core.internal.threaddump.b bVar = bVarArr2[i7];
                            if (bVar != null) {
                                Bitmap bitmap = (Bitmap) bVar.c;
                                if (bitmap.isRecycled()) {
                                    i3 = i5;
                                    i4 = i6;
                                } else {
                                    Canvas canvas = (Canvas) jVar2.p.getValue();
                                    Paint paint = (Paint) jVar2.o.getValue();
                                    Rect rect = jVar2.q;
                                    RectF rectF = jVar2.r;
                                    int i8 = bVar.a;
                                    int i9 = bVar.b;
                                    i3 = i5;
                                    b0 b0Var = jVar2.c;
                                    i4 = i6;
                                    float f = b0Var.c;
                                    float f2 = b0Var.d;
                                    canvas.getClass();
                                    paint.getClass();
                                    rect.getClass();
                                    rectF.getClass();
                                    float f3 = (i8 - i3) * f;
                                    float f4 = (i9 - i4) * f2;
                                    rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                    rectF.set(f3, f4, (bitmap.getWidth() * f) + f3, (bitmap.getHeight() * f2) + f4);
                                    canvas.drawBitmap(bitmap, rect, rectF, paint);
                                    bitmap.recycle();
                                }
                            } else {
                                i3 = i5;
                                i4 = i6;
                            }
                            i7++;
                            i5 = i3;
                            i6 = i4;
                        }
                        jVar2.d(view2, gVar2, z2);
                        jVar2.h();
                        return;
                    }
                    jVar2.b.getLogger().i(q5.DEBUG, "PixelCopyStrategy is closed, skipping compositing", new Object[0]);
                    for (io.sentry.android.core.internal.threaddump.b bVar2 : bVarArr2) {
                        if (bVar2 != null) {
                            Bitmap bitmap2 = (Bitmap) bVar2.c;
                            if (!bitmap2.isRecycled()) {
                                bitmap2.recycle();
                            }
                        }
                    }
                    jVar2.h();
                } catch (Throwable th) {
                    jVar2.h();
                    throw th;
                }
            }
        }, "screenshot_recorder.composite")) == null) {
            for (io.sentry.android.core.internal.threaddump.b bVar : bVarArr) {
                if (bVar != null) {
                    Bitmap bitmap = (Bitmap) bVar.c;
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                }
            }
            jVar.h();
        }
    }

    @Override // io.sentry.android.replay.screenshot.k
    public final boolean a() {
        return this.i.get();
    }

    @Override // io.sentry.android.replay.screenshot.k
    public final void b(View view) throws IllegalAccessException {
        Window windowO = io.sentry.config.a.o(view);
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (windowO == null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        int i = 1;
        if (!this.n.compareAndSet(false, true)) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "PixelCopyStrategy capture is already in flight, skipping", new Object[0]);
            this.d.invoke();
            return;
        }
        if (this.m.get()) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "PixelCopyStrategy is closed, not capturing screenshot", new Object[0]);
            h();
            return;
        }
        try {
            this.k.set(false);
            PixelCopy.request(windowO, this.g, new io.sentry.android.core.internal.util.j(i, this, view), (Handler) this.f.b);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(q5.WARNING, "Failed to capture replay recording", th);
            this.l.set(0);
            this.i.set(false);
            h();
        }
    }

    @Override // io.sentry.android.replay.screenshot.k
    public final void c() {
        int i = 1;
        if (this.n.compareAndSet(false, true)) {
            if (!this.i.get() || this.g.isRecycled()) {
                h();
                return;
            }
            if (this.e.submit(new io.sentry.android.replay.util.h(new d(this, i), "PixelCopyStrategy.emit")) == null) {
                h();
            }
        }
    }

    @Override // io.sentry.android.replay.screenshot.k
    public final void close() {
        this.m.set(true);
        this.l.set(0);
        g();
    }

    public final void d(View view, io.sentry.android.replay.viewhierarchy.g gVar, boolean z) {
        boolean z2 = this.m.get();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (!z2) {
            Bitmap bitmap = this.g;
            if (!bitmap.isRecycled()) {
                this.j.b(bitmap, gVar, (Matrix) this.h.getValue());
                sentryAndroidOptions.getReplayController().getClass();
                this.a.C0(bitmap);
                this.i.set(true);
                this.k.set(false);
                if (z) {
                    this.l.set(0);
                    return;
                }
                return;
            }
        }
        sentryAndroidOptions.getLogger().i(q5.DEBUG, "PixelCopyStrategy is closed, skipping masking", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    public final void e(final View view, ArrayList arrayList, final io.sentry.android.replay.viewhierarchy.g gVar, final boolean z) {
        io.sentry.android.core.internal.threaddump.b[] bVarArr;
        final j jVar;
        SurfaceHolder holder;
        j jVar2 = this;
        int[] iArr = jVar2.t;
        int[] iArr2 = jVar2.s;
        view.getLocationOnScreen(iArr2);
        char c = 0;
        int i = iArr2[0];
        int i2 = iArr2[1];
        io.sentry.android.core.internal.threaddump.b[] bVarArr2 = new io.sentry.android.core.internal.threaddump.b[arrayList.size()];
        AtomicInteger atomicInteger = new AtomicInteger(arrayList.size());
        Iterator it = arrayList.iterator();
        final io.sentry.android.core.internal.threaddump.b[] bVarArr3 = bVarArr2;
        final int i3 = 0;
        while (it.hasNext()) {
            int i4 = i3 + 1;
            SurfaceView surfaceView = (SurfaceView) ((io.sentry.android.replay.viewhierarchy.e) it.next()).h.get();
            final Bitmap bitmapCreateBitmap = null;
            Surface surface = (surfaceView == null || (holder = surfaceView.getHolder()) == null) ? null : holder.getSurface();
            if (surfaceView == null || surface == null) {
                jVar2 = this;
            } else {
                if (surface.isValid()) {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                        try {
                            surfaceView.getLocationOnScreen(iArr);
                            try {
                                final int i5 = iArr[c];
                                final int i6 = i;
                                try {
                                    final int i7 = iArr[1];
                                    final int i8 = i2;
                                    final AtomicInteger atomicInteger2 = atomicInteger;
                                    jVar = this;
                                    try {
                                        PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.e
                                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                            public final void onPixelCopyFinished(int i9) {
                                                j jVar3 = this.a;
                                                boolean z2 = jVar3.m.get();
                                                Bitmap bitmap = bitmapCreateBitmap;
                                                io.sentry.android.core.internal.threaddump.b[] bVarArr4 = bVarArr3;
                                                AtomicInteger atomicInteger3 = atomicInteger2;
                                                View view2 = view;
                                                io.sentry.android.replay.viewhierarchy.g gVar2 = gVar;
                                                int i10 = i6;
                                                int i11 = i8;
                                                boolean z3 = z;
                                                if (z2) {
                                                    bitmap.recycle();
                                                    j.f(atomicInteger3, jVar3, view2, bVarArr4, gVar2, i10, i11, z3);
                                                    return;
                                                }
                                                if (i9 == 0) {
                                                    bVarArr4[i3] = new io.sentry.android.core.internal.threaddump.b(bitmap, i5, i7);
                                                } else {
                                                    bitmap.recycle();
                                                    jVar3.b.getLogger().i(q5.INFO, "Failed to capture SurfaceView: %d", Integer.valueOf(i9));
                                                }
                                                j.f(atomicInteger3, jVar3, view2, bVarArr4, gVar2, i10, i11, z3);
                                            }
                                        };
                                        atomicInteger = atomicInteger2;
                                        i = i6;
                                        i2 = i8;
                                        try {
                                            PixelCopy.request(surfaceView, bitmapCreateBitmap, onPixelCopyFinishedListener, (Handler) jVar.f.b);
                                            atomicInteger = atomicInteger;
                                        } catch (Throwable th) {
                                            th = th;
                                            bitmapCreateBitmap = bitmapCreateBitmap;
                                            jVar.b.getLogger().d(q5.WARNING, "Failed to capture SurfaceView", th);
                                            if (bitmapCreateBitmap != null) {
                                                bitmapCreateBitmap.recycle();
                                            }
                                            j jVar3 = jVar;
                                            atomicInteger = atomicInteger;
                                            bVarArr = bVarArr3;
                                            f(atomicInteger, jVar3, view, bVarArr, gVar, i, i2, z);
                                            bVarArr3 = bVarArr;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        atomicInteger = atomicInteger2;
                                        i = i6;
                                        i2 = i8;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    i = i6;
                                    jVar = this;
                                    bitmapCreateBitmap = bitmapCreateBitmap;
                                    jVar.b.getLogger().d(q5.WARNING, "Failed to capture SurfaceView", th);
                                    if (bitmapCreateBitmap != null) {
                                        bitmapCreateBitmap.recycle();
                                    }
                                    j jVar4 = jVar;
                                    atomicInteger = atomicInteger;
                                    bVarArr = bVarArr3;
                                    f(atomicInteger, jVar4, view, bVarArr, gVar, i, i2, z);
                                    bVarArr3 = bVarArr;
                                    c = 0;
                                    jVar2 = this;
                                    i3 = i4;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            atomicInteger = atomicInteger;
                            jVar = jVar2;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        atomicInteger = atomicInteger;
                        jVar = jVar2;
                    }
                    c = 0;
                    jVar2 = this;
                    i3 = i4;
                }
                bVarArr3 = bVarArr;
                c = 0;
                jVar2 = this;
                i3 = i4;
            }
            bVarArr = bVarArr3;
            f(atomicInteger, jVar2, view, bVarArr, gVar, i, i2, z);
            bVarArr3 = bVarArr;
            c = 0;
            jVar2 = this;
            i3 = i4;
        }
    }

    public final void g() {
        int i = 0;
        if (this.n.compareAndSet(false, true)) {
            io.sentry.android.replay.util.h hVar = new io.sentry.android.replay.util.h(new d(this, i), "PixelCopyStrategy.close");
            if (this.e.submit(hVar) == null) {
                hVar.run();
            }
        }
    }

    public final void h() {
        this.n.set(false);
        if (this.m.get()) {
            g();
        }
    }

    @Override // io.sentry.android.replay.screenshot.k
    public final void onContentChanged() {
        this.k.set(true);
    }
}
