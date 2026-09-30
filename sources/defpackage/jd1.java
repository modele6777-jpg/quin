package defpackage;

import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jd1 implements qe1 {
    public final /* synthetic */ CountDownLatch a;
    public final /* synthetic */ sh0 b;
    public final /* synthetic */ Surface c;
    public final /* synthetic */ SurfaceTexture d;

    public jd1(CountDownLatch countDownLatch, sh0 sh0Var, Surface surface, SurfaceTexture surfaceTexture) {
        this.a = countDownLatch;
        this.b = sh0Var;
        this.c = surface;
        this.d = surfaceTexture;
    }

    @Override // defpackage.qe1
    public final void d(re1 re1Var) {
        Log.d("CXCP", "Empty capture session closed");
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qe1
    public final void g(re1 re1Var) throws Exception {
        boolean zIsTerminated;
        Log.d("CXCP", "Empty capture session configured. Closing it");
        if (re1Var instanceof AutoCloseable) {
            re1Var.close();
        } else if (re1Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) re1Var;
            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (re1Var instanceof TypedArray) {
            ((TypedArray) re1Var).recycle();
        } else if (re1Var instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) re1Var).release();
        } else {
            if (!(re1Var instanceof MediaDrm)) {
                cva.s();
                return;
            }
            ((MediaDrm) re1Var).release();
        }
        this.a.countDown();
    }

    @Override // defpackage.qe1
    public final void h(re1 re1Var) {
        Log.d("CXCP", "Empty capture session configure failed");
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
        this.a.countDown();
    }

    @Override // defpackage.g1d
    public final void a() {
    }

    @Override // defpackage.g1d
    public final void b() {
    }

    @Override // defpackage.qe1
    public final void c(re1 re1Var) {
    }

    @Override // defpackage.qe1
    public final void e(re1 re1Var) {
    }

    @Override // defpackage.qe1
    public final void f(re1 re1Var) {
    }
}
