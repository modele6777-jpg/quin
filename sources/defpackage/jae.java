package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jae implements AutoCloseable {
    public final d3e a;
    public final h1b b;
    public final bk1 c;
    public final Map d;
    public final Object e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public boolean v;
    public boolean w;

    public jae(d3e d3eVar, vd9 vd9Var, bk1 bk1Var, Map map) {
        vd9Var.getClass();
        map.getClass();
        this.a = d3eVar;
        this.b = vd9Var;
        this.c = bk1Var;
        this.d = map;
        this.e = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((jw6) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.f = linkedHashMap;
        this.g = new LinkedHashMap();
        this.v = true;
    }

    public final void b() {
        Map linkedHashMap;
        synchronized (this.e) {
            linkedHashMap = new LinkedHashMap();
            loop0: for (b3e b3eVar : this.a.c) {
                for (xj1 xj1Var : b3eVar.l) {
                    Surface surface = (Surface) this.f.get(new e3e(xj1Var.a));
                    if (surface == null) {
                        if (!(b3eVar.f != null)) {
                            linkedHashMap = qu4.a;
                            break loop0;
                        }
                    } else {
                        linkedHashMap.put(new e3e(xj1Var.a), surface);
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        gc1 gc1Var = (gc1) this.b.get();
        gc1Var.getClass();
        synchronized (gc1Var.q) {
            if (gc1Var.c()) {
                return;
            }
            gc1Var.A = linkedHashMap;
            qo1 qo1Var = gc1Var.z;
            if (qo1Var != null) {
                qo1Var.j(linkedHashMap);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        synchronized (this.e) {
            if (this.w) {
                return;
            }
            this.w = true;
            this.f.clear();
            List<AutoCloseable> listJ1 = s72.j1(this.g.values());
            this.g.clear();
            for (AutoCloseable autoCloseable : listJ1) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
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
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        cva.s();
                        return;
                    }
                    ((MediaDrm) autoCloseable).release();
                }
            }
        }
    }

    public final void h() {
        synchronized (this.e) {
            try {
                if (this.w) {
                    throw new IllegalStateException("Check failed.");
                }
                for (Surface surface : this.f.values()) {
                    this.g.put(surface, this.c.a(surface));
                }
                this.v = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() throws Exception {
        List<AutoCloseable> listJ1;
        boolean zIsTerminated;
        synchronized (this.e) {
            this.v = false;
            listJ1 = s72.j1(this.g.values());
            this.g.clear();
        }
        for (AutoCloseable autoCloseable : listJ1) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
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
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    cva.s();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }
}
