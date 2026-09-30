package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import defpackage.bwe;
import defpackage.ip3;
import io.sentry.o3;
import io.sentry.q5;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {
    public final File b;
    public final int c;
    public String f;
    public final io.sentry.android.core.internal.util.o g;
    public final io.sentry.util.e l;
    public final io.sentry.z0 m;
    public long a = 0;
    public Future d = null;
    public File e = null;
    public final ArrayDeque h = new ArrayDeque();
    public final ArrayDeque i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();
    public final HashMap k = new HashMap();
    public volatile boolean n = false;
    public final io.sentry.util.a o = new io.sentry.util.a();

    public w(String str, int i, io.sentry.android.core.internal.util.o oVar, io.sentry.util.e eVar, io.sentry.z0 z0Var) {
        io.sentry.util.b.r(str, "TracesFilesDirPath is required");
        this.b = new File(str);
        this.c = i;
        io.sentry.util.b.r(z0Var, "Logger is required");
        this.m = z0Var;
        this.l = eVar;
        this.g = oVar;
    }

    public final v a(List list, boolean z) {
        io.sentry.util.a aVar = this.o;
        aVar.b();
        try {
            if (!this.n) {
                this.m.i(q5.WARNING, "Profiler not running", new Object[0]);
                aVar.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th) {
                try {
                    this.m.d(q5.ERROR, "Error while stopping profiling: ", th);
                } catch (Throwable th2) {
                    this.n = false;
                    throw th2;
                }
            }
            this.n = false;
            this.g.c(this.f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.e == null) {
                this.m.i(q5.ERROR, "Trace file does not exists", new Object[0]);
                aVar.close();
                return null;
            }
            if (!this.i.isEmpty()) {
                this.k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.i));
            }
            if (!this.j.isEmpty()) {
                this.k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.j));
            }
            if (!this.h.isEmpty()) {
                this.k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.h));
            }
            b(list);
            Future future = this.d;
            if (future != null) {
                future.cancel(true);
                this.d = null;
            }
            v vVar = new v(jElapsedRealtimeNanos, elapsedCpuTime, z, this.e, this.k);
            aVar.close();
            return vVar;
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

    public final void b(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        o3 o3Var = (o3) it.next();
                        long j = o3Var.g;
                        long j2 = j + jElapsedRealtimeNanos;
                        if (o3Var.b) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), Double.valueOf(o3Var.a), j));
                        }
                        if (o3Var.d) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), Long.valueOf(o3Var.c), j));
                        }
                        if (o3Var.f) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j2), Long.valueOf(o3Var.e), j));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public final ip3 c() {
        io.sentry.util.a aVar = this.o;
        aVar.b();
        try {
            int i = this.c;
            if (i == 0) {
                this.m.i(q5.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i));
                aVar.close();
                return null;
            }
            if (this.n) {
                this.m.i(q5.WARNING, "Profiling has already started...", new Object[0]);
                aVar.close();
                return null;
            }
            this.e = new File(this.b, io.sentry.config.a.j().concat(".trace"));
            this.k.clear();
            this.h.clear();
            this.i.clear();
            this.j.clear();
            this.f = this.g.b(new u(0, this));
            try {
                io.sentry.util.e eVar = this.l;
                if (eVar != null) {
                    this.d = ((io.sentry.k1) eVar.c()).schedule(new bwe(9, this), 30000L);
                }
            } catch (RejectedExecutionException e) {
                this.m.d(q5.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e);
            }
            this.a = SystemClock.elapsedRealtimeNanos();
            Date date = new Date();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.e.getPath(), 3000000, this.c);
                this.n = true;
                ip3 ip3Var = new ip3(this.a, date, elapsedCpuTime);
                aVar.close();
                return ip3Var;
            } catch (Throwable th) {
                a(null, false);
                this.m.d(q5.ERROR, "Unable to start a profile: ", th);
                this.n = false;
                aVar.close();
                return null;
            }
        } catch (Throwable th2) {
            try {
                aVar.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
