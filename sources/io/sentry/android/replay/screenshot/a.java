package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.PixelCopy;
import android.view.Surface;
import defpackage.cgg;
import defpackage.lz0;
import io.sentry.android.replay.b0;
import io.sentry.q5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                if (cVar.k.get()) {
                    cVar.c.getLogger().i(q5.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
                    return;
                }
                Picture picture = (Picture) cVar.f.getAndSet(null);
                if (picture == null) {
                    return;
                }
                try {
                    Canvas canvasLockHardwareCanvas = cVar.m.lockHardwareCanvas();
                    try {
                        canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                        picture.draw(canvasLockHardwareCanvas);
                        cVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        if (cVar.e == null) {
                            io.sentry.util.a aVar = cVar.g;
                            aVar.b();
                            try {
                                if (cVar.e == null) {
                                    b0 b0Var = cVar.d;
                                    cVar.e = Bitmap.createBitmap(b0Var.a, b0Var.b, Bitmap.Config.RGB_565);
                                }
                                cgg.t(aVar, null);
                                break;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    cgg.t(aVar, th);
                                    throw th2;
                                }
                            }
                        }
                        if (cVar.k.get()) {
                            cVar.c.getLogger().i(q5.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                            return;
                        }
                        Surface surface = cVar.m;
                        Bitmap bitmap = cVar.e;
                        bitmap.getClass();
                        PixelCopy.request(surface, bitmap, new lz0(1, cVar), cVar.a.l());
                        return;
                    } catch (Throwable th3) {
                        cVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    cVar.c.getLogger().d(q5.ERROR, "Canvas Strategy: picture render failed", th4);
                    cVar.i.set(false);
                    return;
                }
            default:
                Bitmap bitmap2 = cVar.e;
                if (bitmap2 != null) {
                    synchronized (bitmap2) {
                        if (!bitmap2.isRecycled()) {
                            bitmap2.recycle();
                        }
                        break;
                    }
                }
                cVar.m.release();
                cVar.l.release();
                return;
        }
    }
}
