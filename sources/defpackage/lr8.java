package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lr8 {
    public static final ct f = ct.d();
    public final ScheduledExecutorService a;
    public final ConcurrentLinkedQueue b;
    public final Runtime c;
    public ScheduledFuture d;
    public long e;

    public lr8() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.d = null;
        this.e = -1L;
        this.a = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.b = new ConcurrentLinkedQueue();
        this.c = runtime;
    }

    public final synchronized void a(long j, oye oyeVar) {
        this.e = j;
        try {
            this.d = this.a.scheduleAtFixedRate(new kr8(this, oyeVar, 0), 0L, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            f.f("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    public final ht b(oye oyeVar) {
        if (oyeVar == null) {
            return null;
        }
        long jB = oyeVar.b() + oyeVar.a;
        gt gtVarR = ht.r();
        gtVarR.i();
        ((ht) gtVarR.b).s(jB);
        Runtime runtime = this.c;
        int iO = jzb.o(v2e.c.a(runtime.totalMemory() - runtime.freeMemory()));
        gtVarR.i();
        ((ht) gtVarR.b).t(iO);
        return (ht) gtVarR.h();
    }
}
