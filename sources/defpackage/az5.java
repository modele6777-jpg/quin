package defpackage;

import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class az5 extends j6 implements nt9 {
    public final int c;
    public final int d;
    public final wh0 e;
    public final /* synthetic */ cz5 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az5(cz5 cz5Var, int i, int i2, wh0 wh0Var) {
        super(5);
        this.f = cz5Var;
        this.c = i;
        this.d = i2;
        this.e = wh0Var;
    }

    @Override // defpackage.nt9
    public final void b(Object obj) {
        int i;
        Object obj2;
        bz5 bz5Var;
        AutoCloseable autoCloseableB;
        boolean zIsTerminated;
        bz5 bz5Var2 = bz5.d;
        rt9 rt9Var = (rt9) (tt9.a(obj) ? obj : null);
        if (rt9Var != null) {
            if (rt9Var instanceof ucd) {
                autoCloseableB = ((ucd) rt9Var).b();
            } else {
                ucd ucdVar = (ucd) rt9Var.H0(job.a.b(ucd.class));
                autoCloseableB = ucdVar != null ? ucdVar.b() : new ucd(rt9Var, new gg7(rt9Var));
            }
            if (!((za2) this.b).R(new tt9(autoCloseableB))) {
                if (autoCloseableB instanceof AutoCloseable) {
                    autoCloseableB.close();
                } else {
                    if (!(autoCloseableB instanceof ExecutorService)) {
                        cva.s();
                        return;
                    }
                    ExecutorService executorService = (ExecutorService) autoCloseableB;
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
                }
            }
        } else {
            za2 za2Var = (za2) this.b;
            if (tt9.a(obj)) {
                i = 1;
            } else {
                i = obj == null ? 2 : ((vt9) obj).a;
            }
            za2Var.R(new tt9(new vt9(i)));
        }
        wh0 wh0Var = this.e;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = wh0.b;
        if (atomicIntegerFieldUpdater.decrementAndGet(wh0Var) == 0) {
            Iterator it = this.f.h.iterator();
            it.getClass();
            if (it.hasNext()) {
                throw kv2.g(it);
            }
            cz5 cz5Var = this.f;
            wh0 wh0Var2 = cz5Var.g;
            wh0Var2.getClass();
            if (atomicIntegerFieldUpdater.decrementAndGet(wh0Var2) != 0) {
                return;
            }
            zh0 zh0Var = cz5Var.f;
            do {
                obj2 = zh0Var.a;
                bz5 bz5Var3 = (bz5) obj2;
                int iOrdinal = bz5Var3.ordinal();
                if (iOrdinal == 0) {
                    bz5Var = bz5.c;
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalStateException("Unexpected frame state for " + cz5Var + "! State is " + bz5Var3 + ' ');
                    }
                    bz5Var = bz5Var2;
                }
            } while (!zh0Var.a(obj2, bz5Var));
            Iterator it2 = cz5Var.h.iterator();
            it2.getClass();
            if (it2.hasNext()) {
                throw kv2.g(it2);
            }
            if (bz5Var == bz5Var2) {
                Iterator it3 = cz5Var.h.iterator();
                it3.getClass();
                if (it3.hasNext()) {
                    throw kv2.g(it3);
                }
            }
        }
    }

    @Override // defpackage.j6
    public final void t() {
        boolean zIsTerminated;
        za2 za2Var = (za2) this.b;
        Object obj = null;
        if (za2Var.L0() && !za2Var.isCancelled()) {
            Object obj2 = ((tt9) za2Var.D()).a;
            if (tt9.a(obj2)) {
                obj = obj2;
            }
        }
        rt9 rt9Var = (ucd) obj;
        if (rt9Var != null) {
            if (rt9Var instanceof AutoCloseable) {
                rt9Var.close();
                return;
            }
            if (!(rt9Var instanceof ExecutorService)) {
                cva.s();
                return;
            }
            ExecutorService executorService = (ExecutorService) rt9Var;
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
