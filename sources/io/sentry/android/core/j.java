package io.sentry.android.core;

import defpackage.bwe;
import io.sentry.l7;
import io.sentry.q3;
import io.sentry.q4;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.t3;
import io.sentry.y5;
import io.sentry.z2;
import io.sentry.z4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements io.sentry.u0, io.sentry.transport.o {
    public final AtomicBoolean E0;
    public z4 F0;
    public volatile boolean G0;
    public boolean H0;
    public boolean I0;
    public int J0;
    public final io.sentry.util.a K0;
    public final io.sentry.util.a L0;
    public io.sentry.protocol.w Y;
    public io.sentry.protocol.w Z;
    public final io.sentry.z0 a;
    public final String b;
    public final int c;
    public final io.sentry.util.e d;
    public final o0 e;
    public final io.sentry.android.core.internal.util.o g;
    public io.sentry.g1 x;
    public Future y;
    public io.sentry.o z;
    public boolean f = false;
    public w v = null;
    public boolean w = false;
    public final ArrayList X = new ArrayList();

    public j(o0 o0Var, io.sentry.android.core.internal.util.o oVar, io.sentry.z0 z0Var, String str, int i, io.sentry.util.e eVar) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        this.Y = wVar;
        this.Z = wVar;
        this.E0 = new AtomicBoolean(false);
        this.F0 = new y5();
        this.G0 = true;
        this.H0 = false;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = new io.sentry.util.a();
        this.L0 = new io.sentry.util.a();
        this.a = z0Var;
        this.g = oVar;
        this.e = o0Var;
        this.b = str;
        this.c = i;
        this.d = eVar;
    }

    @Override // io.sentry.transport.o
    public final void U(io.sentry.android.core.internal.tombstone.b bVar) {
        if (bVar.h(io.sentry.p.All) || bVar.h(io.sentry.p.ProfileChunkUi)) {
            this.a.i(q5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            h(false);
        }
    }

    @Override // io.sentry.u0
    public final void a(boolean z) {
        io.sentry.util.a aVar = this.K0;
        aVar.b();
        try {
            this.J0 = 0;
            this.H0 = true;
            if (z) {
                h(false);
                this.E0.set(true);
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
        io.sentry.util.a aVar = this.K0;
        aVar.b();
        try {
            int i = i.a[t3Var.ordinal()];
            if (i == 1) {
                int i2 = this.J0 - 1;
                this.J0 = i2;
                if (i2 > 0) {
                    aVar.close();
                    return;
                } else {
                    if (i2 < 0) {
                        this.J0 = 0;
                    }
                    this.H0 = true;
                }
            } else if (i == 2) {
                this.H0 = true;
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
        io.sentry.util.a aVar = this.K0;
        aVar.b();
        try {
            if (this.G0) {
                this.I0 = l7Var.b(io.sentry.util.n.a().c());
                this.G0 = false;
            }
            if (!this.I0) {
                this.a.i(q5.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                aVar.close();
                return;
            }
            int i = i.a[t3Var.ordinal()];
            if (i == 1) {
                int i2 = this.J0;
                if (i2 < 0) {
                    this.J0 = 0;
                    i2 = 0;
                }
                this.J0 = i2 + 1;
            } else if (i == 2 && this.w) {
                this.a.i(q5.DEBUG, "Profiler is already running.", new Object[0]);
                aVar.close();
                return;
            }
            if (!this.w) {
                this.a.i(q5.DEBUG, "Started Profiler.", new Object[0]);
                g();
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
        this.G0 = true;
    }

    @Override // io.sentry.u0
    public final io.sentry.protocol.w e() {
        return this.Y;
    }

    public final void f() {
        io.sentry.g1 g1Var = this.x;
        if ((g1Var == null || g1Var == z2.b) && q4.b() != z2.b) {
            this.x = q4.b();
            this.z = q4.b().o().getCompositePerformanceCollector();
            io.sentry.android.core.internal.tombstone.b bVarF = this.x.f();
            if (bVarF != null) {
                ((CopyOnWriteArrayList) bVarF.d).add(this);
            }
        }
    }

    public final void g() {
        f();
        this.e.getClass();
        if (!this.f) {
            this.f = true;
            io.sentry.z0 z0Var = this.a;
            String str = this.b;
            if (str == null) {
                z0Var.i(q5.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i = this.c;
                if (i <= 0) {
                    z0Var.i(q5.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i));
                } else {
                    this.v = new w(str, 1000000 / i, this.g, null, z0Var);
                }
            }
        }
        if (this.v == null) {
            return;
        }
        io.sentry.g1 g1Var = this.x;
        io.sentry.z0 z0Var2 = this.a;
        if (g1Var != null) {
            io.sentry.android.core.internal.tombstone.b bVarF = g1Var.f();
            if (bVarF != null && (bVarF.h(io.sentry.p.All) || bVarF.h(io.sentry.p.ProfileChunkUi))) {
                z0Var2.i(q5.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                h(false);
                return;
            } else {
                if (this.x.o().getConnectionStatusProvider().s0() == io.sentry.r0.DISCONNECTED) {
                    z0Var2.i(q5.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    h(false);
                    return;
                }
                this.F0 = this.x.o().getDateProvider().a();
            }
        } else {
            this.F0 = new y5();
        }
        if (this.v.c() == null) {
            return;
        }
        this.w = true;
        io.sentry.protocol.w wVar = this.Y;
        io.sentry.protocol.w wVar2 = io.sentry.protocol.w.b;
        if (wVar.equals(wVar2)) {
            this.Y = new io.sentry.protocol.w();
        }
        if (this.Z.equals(wVar2)) {
            this.Z = new io.sentry.protocol.w();
        }
        io.sentry.o oVar = this.z;
        if (oVar != null) {
            oVar.a(this.Z.a());
        }
        try {
            this.y = ((io.sentry.k1) this.d.c()).schedule(new bwe(8, this), 60000L);
        } catch (RejectedExecutionException e) {
            z0Var2.d(q5.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e);
            this.H0 = true;
        }
    }

    public final void h(boolean z) {
        f();
        io.sentry.util.a aVar = this.K0;
        aVar.b();
        try {
            Future future = this.y;
            if (future != null) {
                future.cancel(true);
            }
            if (this.v != null && this.w) {
                this.e.getClass();
                io.sentry.o oVar = this.z;
                v vVarA = this.v.a(oVar != null ? oVar.c(this.Z.a()) : null, false);
                io.sentry.z0 z0Var = this.a;
                if (vVarA == null) {
                    z0Var.i(q5.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.util.a aVar2 = this.L0;
                    aVar2.b();
                    try {
                        this.X.add(new q3(this.Y, this.Z, (HashMap) vVarA.e, (File) vVarA.d, this.F0));
                        aVar2.close();
                    } catch (Throwable th) {
                        try {
                            aVar2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                this.w = false;
                this.Z = io.sentry.protocol.w.b;
                io.sentry.g1 g1Var = this.x;
                if (g1Var != null) {
                    q6 q6VarO = g1Var.o();
                    try {
                        q6VarO.getExecutorService().submit(new r1(this, q6VarO, g1Var, 2));
                    } catch (Throwable th3) {
                        q6VarO.getLogger().d(q5.DEBUG, "Failed to send profile chunks.", th3);
                    }
                }
                if (!z || this.H0) {
                    this.Y = io.sentry.protocol.w.b;
                    z0Var.i(q5.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    z0Var.i(q5.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    g();
                }
                aVar.close();
                return;
            }
            io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
            this.Y = wVar;
            this.Z = wVar;
            aVar.close();
        } catch (Throwable th4) {
            try {
                aVar.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }
}
