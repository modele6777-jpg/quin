package io.sentry.android.core;

import android.os.ProfilingResult;
import android.os.SystemClock;
import defpackage.bwe;
import io.sentry.l7;
import io.sentry.o3;
import io.sentry.q3;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.t3;
import io.sentry.y5;
import io.sentry.z2;
import io.sentry.z4;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements io.sentry.u0, io.sentry.transport.o {
    public boolean E0;
    public int F0;
    public final io.sentry.util.a G0;
    public z4 X;
    public boolean Y;
    public boolean Z;
    public final io.sentry.z0 a;
    public final r b;
    public final s c;
    public final k1 e;
    public io.sentry.g1 g;
    public io.sentry.o v;
    public Future w;
    public io.sentry.protocol.w x;
    public io.sentry.protocol.w y;
    public final AtomicBoolean z;
    public o1 d = null;
    public boolean f = false;

    public l1(io.sentry.z0 z0Var, io.sentry.android.core.internal.util.o oVar, r rVar, s sVar) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        this.x = wVar;
        this.y = wVar;
        this.z = new AtomicBoolean(false);
        this.X = new y5();
        this.Y = true;
        this.Z = false;
        this.E0 = false;
        this.F0 = 0;
        this.G0 = new io.sentry.util.a();
        this.a = z0Var;
        this.e = new k1(oVar);
        this.b = rVar;
        this.c = sVar;
    }

    @Override // io.sentry.transport.o
    public final void U(io.sentry.android.core.internal.tombstone.b bVar) {
        if (bVar.h(io.sentry.p.All) || bVar.h(io.sentry.p.ProfileChunkUi)) {
            io.sentry.util.a aVar = this.G0;
            aVar.b();
            try {
                this.a.i(q5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                i(false);
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.u0
    public final void a(boolean z) {
        io.sentry.util.a aVar = this.G0;
        aVar.b();
        try {
            this.F0 = 0;
            this.Z = true;
            if (z) {
                i(false);
                this.z.set(true);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.u0
    public final void b(t3 t3Var) {
        io.sentry.util.a aVar = this.G0;
        aVar.b();
        try {
            int i = j1.a[t3Var.ordinal()];
            if (i == 1) {
                int i2 = this.F0 - 1;
                this.F0 = i2;
                int iMax = Math.max(0, i2);
                this.F0 = iMax;
                if (iMax > 0) {
                    aVar.close();
                    return;
                }
                this.Z = true;
            } else if (i == 2) {
                this.Z = true;
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.u0
    public final void c(t3 t3Var, l7 l7Var) {
        io.sentry.util.a aVar = this.G0;
        aVar.b();
        try {
            if (this.Y) {
                this.E0 = l7Var.b(io.sentry.util.n.a().c());
                this.Y = false;
            }
            boolean z = this.E0;
            io.sentry.z0 z0Var = this.a;
            if (!z) {
                z0Var.i(q5.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                aVar.close();
                return;
            }
            int i = j1.a[t3Var.ordinal()];
            if (i == 1) {
                this.F0 = Math.max(0, this.F0) + 1;
            } else if (i == 2 && f()) {
                z0Var.i(q5.WARNING, "Unexpected call to startProfiler(MANUAL) while profiler already running. Skipping.", new Object[0]);
                aVar.close();
                return;
            }
            if (!f()) {
                z0Var.i(q5.DEBUG, "Started Profiler.", new Object[0]);
                this.Z = false;
                h();
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.u0
    public final void d() {
        io.sentry.util.a aVar = this.G0;
        aVar.b();
        try {
            this.Y = true;
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.u0
    public final io.sentry.protocol.w e() {
        io.sentry.util.a aVar = this.G0;
        aVar.b();
        try {
            io.sentry.protocol.w wVar = this.x;
            aVar.close();
            return wVar;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean f() {
        io.sentry.util.a aVar = this.G0;
        aVar.b();
        try {
            boolean z = this.f;
            aVar.close();
            return z;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.g1 g() {
        io.sentry.g1 g1Var = this.g;
        if (g1Var != null && g1Var != z2.b) {
            return g1Var;
        }
        io.sentry.g1 g1VarB = q4.b();
        if (g1VarB == z2.b) {
            this.a.i(q5.ERROR, "PerfettoContinuousProfiler: scopes not available. This is unexpected.", new Object[0]);
            return g1VarB;
        }
        this.g = g1VarB;
        this.v = g1VarB.o().getCompositePerformanceCollector();
        io.sentry.android.core.internal.tombstone.b bVarF = g1VarB.f();
        if (bVarF != null) {
            ((CopyOnWriteArrayList) bVarF.d).add(this);
        }
        return this.g;
    }

    public final void h() {
        io.sentry.g1 g1VarG = g();
        io.sentry.android.core.internal.tombstone.b bVarF = g1VarG.f();
        io.sentry.z0 z0Var = this.a;
        if (bVarF != null && (bVarF.h(io.sentry.p.All) || bVarF.h(io.sentry.p.ProfileChunkUi))) {
            z0Var.i(q5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            i(false);
            return;
        }
        if (g1VarG.o().getConnectionStatusProvider().s0() == io.sentry.r0.DISCONNECTED) {
            z0Var.i(q5.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
            i(false);
            return;
        }
        this.X = g1VarG.o().getDateProvider().a();
        o1 o1Var = (o1) this.c.get();
        this.d = o1Var;
        if (!o1Var.c()) {
            z0Var.i(q5.ERROR, "Failed to start Perfetto profiling. PerfettoProfiler.start() returned false.", new Object[0]);
            return;
        }
        this.f = true;
        io.sentry.protocol.w wVar = this.x;
        io.sentry.protocol.w wVar2 = io.sentry.protocol.w.b;
        if (wVar.equals(wVar2)) {
            this.x = new io.sentry.protocol.w();
        }
        if (this.y.equals(wVar2)) {
            this.y = new io.sentry.protocol.w();
        }
        io.sentry.o oVar = this.v;
        String strA = this.y.a();
        k1 k1Var = this.e;
        k1Var.c = oVar;
        k1Var.d = strA;
        k1Var.h = SystemClock.elapsedRealtimeNanos();
        k1Var.e.clear();
        k1Var.f.clear();
        k1Var.g.clear();
        k1Var.b = k1Var.a.b(new u(1, k1Var));
        if (oVar != null) {
            oVar.a(strA);
        }
        try {
            this.w = this.b.b.getExecutorService().schedule(new bwe(12, this), 60000L);
        } catch (RejectedExecutionException e) {
            z0Var.d(q5.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
            this.Z = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [io.sentry.android.core.o1, io.sentry.o, java.lang.String] */
    public final void i(boolean z) {
        io.sentry.g1 g1Var;
        q6 q6Var;
        ?? r2;
        String str;
        o1 o1Var = this.d;
        Future future = this.w;
        if (future != null) {
            future.cancel(false);
        }
        if (o1Var == null || !this.f) {
            io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
            this.x = wVar;
            this.y = wVar;
            return;
        }
        io.sentry.g1 g1VarG = g();
        q6 q6VarO = g1VarG.o();
        k1 k1Var = this.e;
        final HashMap map = new HashMap();
        k1Var.a.c(k1Var.b);
        k1Var.b = null;
        ConcurrentLinkedDeque concurrentLinkedDeque = k1Var.g;
        ConcurrentLinkedDeque concurrentLinkedDeque2 = k1Var.f;
        ConcurrentLinkedDeque concurrentLinkedDeque3 = k1Var.e;
        if (!concurrentLinkedDeque3.isEmpty()) {
            map.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", new ArrayList(concurrentLinkedDeque3)));
        }
        if (!concurrentLinkedDeque2.isEmpty()) {
            map.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", new ArrayList(concurrentLinkedDeque2)));
        }
        if (!concurrentLinkedDeque.isEmpty()) {
            map.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", new ArrayList(concurrentLinkedDeque)));
        }
        io.sentry.o oVar = k1Var.c;
        if (oVar == null || (str = k1Var.d) == null) {
            g1Var = g1VarG;
            q6Var = q6VarO;
            r2 = 0;
        } else {
            List listC = oVar.c(str);
            long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = k1Var.h;
            if (listC != null) {
                ArrayList arrayList = (ArrayList) listC;
                if (arrayList.isEmpty()) {
                    g1Var = g1VarG;
                    q6Var = q6VarO;
                } else {
                    ArrayDeque arrayDeque = new ArrayDeque(arrayList.size());
                    ArrayDeque arrayDeque2 = new ArrayDeque(arrayList.size());
                    ArrayDeque arrayDeque3 = new ArrayDeque(arrayList.size());
                    synchronized (listC) {
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                o3 o3Var = (o3) it.next();
                                io.sentry.g1 g1Var2 = g1VarG;
                                q6 q6Var2 = q6VarO;
                                long j2 = o3Var.g;
                                long j3 = (jElapsedRealtimeNanos - (nanos - j2)) - j;
                                Iterator it2 = it;
                                if (o3Var.b) {
                                    arrayDeque.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j3), Double.valueOf(o3Var.a), j2));
                                }
                                if (o3Var.d) {
                                    arrayDeque2.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j3), Long.valueOf(o3Var.c), j2));
                                }
                                if (o3Var.f) {
                                    arrayDeque3.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j3), Long.valueOf(o3Var.e), j2));
                                }
                                g1VarG = g1Var2;
                                q6VarO = q6Var2;
                                it = it2;
                                jElapsedRealtimeNanos = jElapsedRealtimeNanos;
                                j = j;
                            }
                            g1Var = g1VarG;
                            q6Var = q6VarO;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!arrayDeque.isEmpty()) {
                        map.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque));
                    }
                    if (!arrayDeque2.isEmpty()) {
                        map.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
                    }
                    if (!arrayDeque3.isEmpty()) {
                        map.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque3));
                    }
                }
            } else {
                g1Var = g1VarG;
                q6Var = q6VarO;
            }
            r2 = 0;
        }
        k1Var.c = r2;
        k1Var.d = r2;
        final io.sentry.protocol.w wVar2 = this.x;
        final io.sentry.protocol.w wVar3 = this.y;
        final z4 z4Var = this.X;
        this.f = false;
        this.d = r2;
        io.sentry.protocol.w wVar4 = io.sentry.protocol.w.b;
        this.y = wVar4;
        if (!z || this.Z) {
            this.x = wVar4;
        }
        final boolean z2 = z && !this.Z;
        final io.sentry.g1 g1Var3 = g1Var;
        final q6 q6Var3 = q6Var;
        Consumer consumer = new Consumer() { // from class: io.sentry.android.core.h1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                File file = (File) obj;
                l1 l1Var = this.a;
                io.sentry.z0 z0Var = l1Var.a;
                if (file == null) {
                    z0Var.i(q5.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    q3 q3Var = new q3(wVar2, wVar3, map, file, z4Var);
                    q3Var.f = "application/x-perfetto-trace";
                    io.sentry.g1 g1Var4 = g1Var3;
                    q6 q6Var4 = q6Var3;
                    i1 i1Var = new i1(l1Var, g1Var4, q3Var, q6Var4, 0);
                    try {
                        if (Thread.currentThread().getName().startsWith("SentryExecutorServiceThreadFactory")) {
                            i1Var.run();
                        } else {
                            l1Var.b.b.getExecutorService().submit(i1Var);
                        }
                    } catch (Throwable th2) {
                        q6Var4.getLogger().d(q5.DEBUG, "Failed to send profile chunk.", th2);
                    }
                }
                if (!z2) {
                    z0Var.i(q5.DEBUG, "Profile chunk finished.", new Object[0]);
                    return;
                }
                io.sentry.util.a aVar = l1Var.G0;
                aVar.b();
                try {
                    if (l1Var.f || l1Var.z.get() || l1Var.Z) {
                        z0Var.i(q5.DEBUG, "Profile chunk finished, but profiler was already restarted, closed or stopped. Skipping.", new Object[0]);
                    } else {
                        z0Var.i(q5.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                        l1Var.h();
                    }
                    aVar.close();
                } catch (Throwable th3) {
                    try {
                        aVar.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            }
        };
        if (!o1Var.h) {
            o1Var.a.i(q5.WARNING, "PerfettoProfiler was never started", new Object[0]);
            consumer.accept(null);
            return;
        }
        o1Var.d.cancel();
        synchronized (o1Var.e) {
            try {
                ProfilingResult profilingResult = o1Var.f;
                if (profilingResult != null) {
                    consumer.accept(o1Var.b(profilingResult));
                    return;
                }
                o1Var.g = consumer;
                try {
                    o1Var.b.schedule(new bwe(13, o1Var), 5000L);
                } catch (RejectedExecutionException e) {
                    o1Var.a.d(q5.DEBUG, "Failed to schedule profiling result timeout.", e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
