package defpackage;

import android.content.res.TypedArray;
import android.media.Image;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ucd implements rt9 {
    public final rt9 a;
    public final gg7 b;
    public final sh0 c = vpf.m(false);

    public ucd(rt9 rt9Var, gg7 gg7Var) {
        this.a = rt9Var;
        this.b = gg7Var;
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        if (this.c.b()) {
            return null;
        }
        kob kobVar = job.a;
        if (em7Var.equals(kobVar.b(ucd.class)) || em7Var.equals(kobVar.b(rt9.class)) || em7Var.equals(kobVar.b(kx6.class))) {
            return this;
        }
        if (!em7Var.equals(kobVar.b(Image.class))) {
            return this.a.H0(em7Var);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0009  */
    public final ucd b() {
        int i;
        int i2;
        ucd ucdVar;
        if (this.c.b()) {
            ucdVar = null;
        } else {
            gg7 gg7Var = this.b;
            wh0 wh0Var = (wh0) gg7Var.c;
            do {
                i = wh0Var.a;
                i2 = i == 0 ? 0 : i + 1;
            } while (!wh0.b.compareAndSet(wh0Var, i, i2));
            if ((i2 != 0 ? (rt9) gg7Var.b : null) != null) {
                ucdVar = new ucd(this.a, this.b);
            } else {
                ucdVar = null;
            }
        }
        if (ucdVar != null) {
            return ucdVar;
        }
        qc0.p("Required value was null.");
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        if (this.c.a()) {
            gg7 gg7Var = this.b;
            if (wh0.b.decrementAndGet((wh0) gg7Var.c) == 0) {
                ((h62) zh0.b.getAndSet((zh0) gg7Var.d, null)).getClass();
                AutoCloseable autoCloseable = (rt9) gg7Var.b;
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                        return;
                    }
                    if (!(autoCloseable instanceof ExecutorService)) {
                        if (autoCloseable instanceof TypedArray) {
                            ((TypedArray) autoCloseable).recycle();
                            return;
                        }
                        if (autoCloseable instanceof MediaMetadataRetriever) {
                            ((MediaMetadataRetriever) autoCloseable).release();
                            return;
                        } else if (autoCloseable instanceof MediaDrm) {
                            ((MediaDrm) autoCloseable).release();
                            return;
                        } else {
                            cva.s();
                            return;
                        }
                    }
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        return;
                    }
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
            }
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
