package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import defpackage.ace;
import defpackage.bwe;
import defpackage.c5e;
import defpackage.cgg;
import defpackage.iy9;
import defpackage.mmb;
import defpackage.nzf;
import defpackage.pa7;
import defpackage.s72;
import defpackage.v4e;
import defpackage.ym8;
import defpackage.z7c;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.g1;
import io.sentry.k1;
import io.sentry.k4;
import io.sentry.o2;
import io.sentry.o5;
import io.sentry.q5;
import io.sentry.r0;
import io.sentry.s0;
import io.sentry.t6;
import io.sentry.u6;
import io.sentry.w1;
import io.sentry.x2;
import io.sentry.x3;
import io.sentry.y3;
import java.io.Closeable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0003\u0006\u0007\u0007¨\u0006\b"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/w1;", "Ljava/io/Closeable;", "Lio/sentry/y3;", "Lio/sentry/s0;", "Lio/sentry/transport/o;", "io/sentry/android/replay/m", "io/sentry/n0", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = z7c.f)
public final class ReplayIntegration implements w1, Closeable, y3, s0, io.sentry.transport.o {
    public static final /* synthetic */ int H0 = 0;
    public final io.sentry.d E0;
    public final io.sentry.util.a F0;
    public final s G0;
    public final AtomicBoolean X;
    public io.sentry.android.replay.capture.i Y;
    public x3 Z;
    public final Context a;
    public final io.sentry.transport.d b;
    public volatile r0 c;
    public SentryAndroidOptions d;
    public g1 e;
    public i0 f;
    public io.sentry.android.replay.gestures.c g;
    public final ace v;
    public final ace w;
    public final ace x;
    public final ace y;
    public final AtomicBoolean z;

    static {
        o5.d().b("maven:io.sentry:sentry-android-replay", "8.53.0");
    }

    public ReplayIntegration(Context context) {
        io.sentry.transport.d dVar = io.sentry.transport.d.a;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = dVar;
        this.c = r0.UNKNOWN;
        this.v = new ace(a.c);
        this.w = new ace(a.d);
        this.x = new ace(new p(this));
        this.y = new ace(new o(this));
        this.z = new AtomicBoolean(false);
        this.X = new AtomicBoolean(false);
        this.Z = x2.a;
        this.E0 = new io.sentry.d(7);
        this.F0 = new io.sentry.util.a();
        s sVar = new s();
        sVar.a = t.INITIAL;
        this.G0 = sVar;
    }

    public final void C0(Bitmap bitmap) {
        bitmap.getClass();
        mmb mmbVar = new mmb();
        g1 g1Var = this.e;
        int i = 1;
        if (g1Var != null) {
            g1Var.n(new io.sentry.android.fragment.c(mmbVar, i));
        }
        io.sentry.android.replay.capture.i iVar = this.Y;
        if (iVar != null) {
            iVar.h(new q(this, bitmap, mmbVar));
        }
        if (pa7.t(Looper.myLooper(), Looper.getMainLooper())) {
            h0();
            return;
        }
        o2 o2Var = new o2(i, this);
        io.sentry.d dVar = this.E0;
        dVar.getClass();
        ((Handler) dVar.b).post(o2Var);
    }

    @Override // io.sentry.y3
    public final void E(io.sentry.protocol.w wVar) {
        io.sentry.android.replay.capture.i iVar;
        wVar.getClass();
        if (!this.z.get() || !p0() || (iVar = this.Y) == null || wVar.equals(io.sentry.protocol.w.b)) {
            return;
        }
        synchronized (iVar.r) {
            if (iVar.s.size() < 100) {
                iVar.s.add(wVar.a());
            }
        }
    }

    public final void F0(int i, int i2) {
        i0 i0Var;
        f0 f0Var;
        a0 a0Var;
        if (this.z.get() && p0()) {
            SentryAndroidOptions sentryAndroidOptions = this.d;
            if (sentryAndroidOptions == null) {
                pa7.g0("options");
                throw null;
            }
            if (sentryAndroidOptions.getSessionReplay().k) {
                Context context = this.a;
                SentryAndroidOptions sentryAndroidOptions2 = this.d;
                if (sentryAndroidOptions2 == null) {
                    pa7.g0("options");
                    throw null;
                }
                u6 sessionReplay = sentryAndroidOptions2.getSessionReplay();
                sessionReplay.getClass();
                context.getClass();
                float f = i2;
                float f2 = f / context.getResources().getDisplayMetrics().density;
                t6 t6Var = sessionReplay.f;
                int iL = ym8.L(f2 * t6Var.sizeScale);
                int i3 = iL % 16;
                Integer numValueOf = Integer.valueOf(i3 <= 8 ? Math.max(16, iL - i3) : iL + (16 - i3));
                float f3 = i;
                int iL2 = ym8.L((f3 / context.getResources().getDisplayMetrics().density) * t6Var.sizeScale);
                int i4 = iL2 % 16;
                iy9 iy9Var = new iy9(numValueOf, Integer.valueOf(i4 <= 8 ? Math.max(16, iL2 - i4) : iL2 + (16 - i4)));
                int iIntValue = ((Number) iy9Var.a()).intValue();
                int iIntValue2 = ((Number) iy9Var.b()).intValue();
                b0 b0Var = new b0(iIntValue2, iIntValue, iIntValue2 / f3, iIntValue / f, sessionReplay.g, t6Var.bitRate);
                if (this.z.get() && p0()) {
                    io.sentry.android.replay.capture.i iVar = this.Y;
                    if (iVar != null) {
                        iVar.g(b0Var);
                    }
                    i0 i0Var2 = this.f;
                    if (i0Var2 != null && i0Var2.f.get()) {
                        if (i0Var2.X == null) {
                            io.sentry.util.a aVar = i0Var2.y;
                            aVar.b();
                            try {
                                if (i0Var2.X == null) {
                                    i0Var2.X = new f0(i0Var2.a, i0Var2.d);
                                }
                                cgg.t(aVar, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    cgg.t(aVar, th);
                                    throw th2;
                                }
                            }
                        }
                        f0 f0Var2 = i0Var2.X;
                        if (f0Var2 != null) {
                            f0Var2.d = b0Var;
                        }
                        f0 f0Var3 = i0Var2.X;
                        if (f0Var3 != null) {
                            f0Var3.c = new a0(i0Var2.a, i0Var2.b, b0Var, i0Var2);
                        }
                        WeakReference weakReference = (WeakReference) s72.H0(i0Var2.g);
                        View view = weakReference != null ? (View) weakReference.get() : null;
                        if (view != null && (f0Var = i0Var2.X) != null && (a0Var = f0Var.c) != null) {
                            a0Var.a(view);
                        }
                        io.sentry.d dVar = i0Var2.d;
                        f0 f0Var4 = i0Var2.X;
                        Handler handler = (Handler) dVar.b;
                        if (f0Var4 != null) {
                            handler.removeCallbacks(f0Var4);
                        }
                        io.sentry.d dVar2 = i0Var2.d;
                        f0 f0Var5 = i0Var2.X;
                        if (!(f0Var5 == null ? false : ((Handler) dVar2.b).postDelayed(f0Var5, 100L))) {
                            i0Var2.a.getLogger().i(q5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                        }
                    }
                    if (this.G0.a != t.PAUSED || (i0Var = this.f) == null) {
                        return;
                    }
                    i0Var.u();
                }
            }
        }
    }

    @Override // io.sentry.y3
    public final void G(c cVar) {
        this.Z = cVar;
    }

    public final void H0() {
        s sVar = this.G0;
        io.sentry.util.a aVar = this.F0;
        aVar.b();
        try {
            if (this.z.get()) {
                t tVar = t.PAUSED;
                if (sVar.a(tVar)) {
                    i0 i0Var = this.f;
                    if (i0Var != null) {
                        i0Var.u();
                    }
                    io.sentry.android.replay.capture.i iVar = this.Y;
                    if (iVar != null) {
                        iVar.j();
                    }
                    sVar.a = tVar;
                    cgg.t(aVar, null);
                    return;
                }
            }
            cgg.t(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    public final void L0() {
        g1 g1Var;
        g1 g1Var2;
        io.sentry.android.core.internal.tombstone.b bVarF;
        io.sentry.android.core.internal.tombstone.b bVarF2;
        io.sentry.util.a aVar = this.F0;
        aVar.b();
        try {
            if (this.z.get()) {
                s sVar = this.G0;
                t tVar = t.RESUMED;
                if (sVar.a(tVar)) {
                    if (!this.X.get() && this.c != r0.DISCONNECTED && (((g1Var = this.e) == null || (bVarF2 = g1Var.f()) == null || !bVarF2.h(io.sentry.p.All)) && ((g1Var2 = this.e) == null || (bVarF = g1Var2.f()) == null || !bVarF.h(io.sentry.p.Replay)))) {
                        s sVar2 = this.G0;
                        sVar2.getClass();
                        sVar2.a = tVar;
                        io.sentry.android.replay.capture.i iVar = this.Y;
                        if (iVar != null) {
                            iVar.m(new Date());
                        }
                        i0 i0Var = this.f;
                        if (i0Var != null) {
                            i0Var.x();
                        }
                        cgg.t(aVar, null);
                        return;
                    }
                    cgg.t(aVar, null);
                    return;
                }
            }
            cgg.t(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.y3
    public final void N() {
        this.X.set(true);
        H0();
    }

    @Override // io.sentry.w1
    public final void R(SentryAndroidOptions sentryAndroidOptions) {
        Double d;
        this.d = sentryAndroidOptions;
        Double d2 = sentryAndroidOptions.getSessionReplay().d;
        if ((d2 == null || d2.doubleValue() <= 0.0d) && ((d = sentryAndroidOptions.getSessionReplay().e) == null || d.doubleValue() <= 0.0d)) {
            sentryAndroidOptions.getLogger().i(q5.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        k4 k4Var = k4.a;
        this.e = k4Var;
        this.f = new i0(sentryAndroidOptions, this, this, this.E0, (io.sentry.android.replay.util.g) this.x.getValue());
        this.g = new io.sentry.android.replay.gestures.c(sentryAndroidOptions, this);
        this.z.set(true);
        sentryAndroidOptions.getConnectionStatusProvider().v0(this);
        io.sentry.android.core.internal.tombstone.b bVarF = k4Var.f();
        if (bVarF != null) {
            ((CopyOnWriteArrayList) bVarF.d).add(this);
        }
        io.sentry.util.b.a("Replay");
        SentryAndroidOptions sentryAndroidOptions2 = this.d;
        if (sentryAndroidOptions2 == null) {
            pa7.g0("options");
            throw null;
        }
        k1 executorService = sentryAndroidOptions2.getExecutorService();
        executorService.getClass();
        SentryAndroidOptions sentryAndroidOptions3 = this.d;
        if (sentryAndroidOptions3 == null) {
            pa7.g0("options");
            throw null;
        }
        try {
            executorService.submit(new nzf(16, new bwe(21, this), sentryAndroidOptions3));
        } catch (Throwable th) {
            sentryAndroidOptions3.getLogger().d(q5.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th);
        }
    }

    @Override // io.sentry.transport.o
    public final void U(io.sentry.android.core.internal.tombstone.b bVar) {
        if (this.Y instanceof io.sentry.android.replay.capture.z) {
            if (bVar.h(io.sentry.p.All) || bVar.h(io.sentry.p.Replay)) {
                H0();
            } else {
                L0();
            }
        }
    }

    @Override // io.sentry.y3
    public final void W(String str) {
        io.sentry.android.replay.capture.i iVar;
        if (!this.z.get() || !p0() || (iVar = this.Y) == null || str.length() <= 0) {
            return;
        }
        synchronized (iVar.r) {
            if (iVar.t.size() < 100) {
                iVar.t.add(str);
            }
        }
    }

    @Override // io.sentry.y3
    public final void b() {
        io.sentry.android.replay.capture.i oVar;
        s sVar = this.G0;
        io.sentry.util.a aVar = this.F0;
        aVar.b();
        try {
            if (!this.z.get()) {
                cgg.t(aVar, null);
                return;
            }
            t tVar = t.STARTED;
            if (!sVar.a(tVar)) {
                SentryAndroidOptions sentryAndroidOptions = this.d;
                if (sentryAndroidOptions == null) {
                    pa7.g0("options");
                    throw null;
                }
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                cgg.t(aVar, null);
                return;
            }
            io.sentry.util.k kVar = (io.sentry.util.k) this.v.getValue();
            SentryAndroidOptions sentryAndroidOptions2 = this.d;
            if (sentryAndroidOptions2 == null) {
                pa7.g0("options");
                throw null;
            }
            Double d = sentryAndroidOptions2.getSessionReplay().d;
            kVar.getClass();
            boolean z = d != null && d.doubleValue() >= kVar.c();
            if (!z) {
                SentryAndroidOptions sentryAndroidOptions3 = this.d;
                if (sentryAndroidOptions3 == null) {
                    pa7.g0("options");
                    throw null;
                }
                Double d2 = sentryAndroidOptions3.getSessionReplay().e;
                if (!(d2 != null && d2.doubleValue() > 0.0d)) {
                    SentryAndroidOptions sentryAndroidOptions4 = this.d;
                    if (sentryAndroidOptions4 == null) {
                        pa7.g0("options");
                        throw null;
                    }
                    sentryAndroidOptions4.getLogger().i(q5.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    cgg.t(aVar, null);
                    return;
                }
            }
            sVar.a = tVar;
            if (z) {
                SentryAndroidOptions sentryAndroidOptions5 = this.d;
                if (sentryAndroidOptions5 == null) {
                    pa7.g0("options");
                    throw null;
                }
                oVar = new io.sentry.android.replay.capture.z(sentryAndroidOptions5, this.e, this.b, (io.sentry.android.replay.util.g) this.x.getValue(), (io.sentry.android.replay.util.g) this.y.getValue());
            } else {
                SentryAndroidOptions sentryAndroidOptions6 = this.d;
                if (sentryAndroidOptions6 == null) {
                    pa7.g0("options");
                    throw null;
                }
                oVar = new io.sentry.android.replay.capture.o(sentryAndroidOptions6, this.e, this.b, (io.sentry.util.k) this.v.getValue(), (io.sentry.android.replay.util.g) this.x.getValue(), (io.sentry.android.replay.util.g) this.y.getValue());
            }
            this.Y = oVar;
            i0 i0Var = this.f;
            if (i0Var != null) {
                i0Var.f.getAndSet(true);
            }
            io.sentry.android.replay.capture.i iVar = this.Y;
            if (iVar != null) {
                iVar.n(0, new io.sentry.protocol.w(), null);
            }
            if (this.f != null) {
                w wVar = ((x) this.w.getValue()).c;
                i0 i0Var2 = this.f;
                i0Var2.getClass();
                wVar.add(i0Var2);
            }
            ((x) this.w.getValue()).c.add(this.g);
            cgg.t(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.android.core.internal.tombstone.b bVarF;
        s sVar = this.G0;
        io.sentry.util.a aVar = this.F0;
        aVar.b();
        try {
            if (this.z.get()) {
                t tVar = t.CLOSED;
                if (sVar.a(tVar)) {
                    SentryAndroidOptions sentryAndroidOptions = this.d;
                    if (sentryAndroidOptions == null) {
                        pa7.g0("options");
                        throw null;
                    }
                    sentryAndroidOptions.getConnectionStatusProvider().G0(this);
                    g1 g1Var = this.e;
                    if (g1Var != null && (bVarF = g1Var.f()) != null) {
                        ((CopyOnWriteArrayList) bVarF.d).remove(this);
                    }
                    stop();
                    i0 i0Var = this.f;
                    if (i0Var != null) {
                        i0Var.close();
                    }
                    this.f = null;
                    ((x) this.w.getValue()).close();
                    sVar.a = tVar;
                    cgg.t(aVar, null);
                    if (this.x.b()) {
                        SentryAndroidOptions sentryAndroidOptions2 = this.d;
                        if (sentryAndroidOptions2 == null) {
                            pa7.g0("options");
                            throw null;
                        }
                        boolean zC = sentryAndroidOptions2.getThreadChecker().c();
                        ace aceVar = this.x;
                        if (zC) {
                            io.sentry.android.replay.util.g gVar = (io.sentry.android.replay.util.g) aceVar.getValue();
                            synchronized (gVar) {
                                if (!gVar.a.isShutdown()) {
                                    gVar.a.shutdown();
                                }
                            }
                        } else {
                            ((io.sentry.android.replay.util.g) aceVar.getValue()).shutdown();
                        }
                    }
                    if (this.y.b()) {
                        SentryAndroidOptions sentryAndroidOptions3 = this.d;
                        if (sentryAndroidOptions3 == null) {
                            pa7.g0("options");
                            throw null;
                        }
                        boolean zC2 = sentryAndroidOptions3.getThreadChecker().c();
                        ace aceVar2 = this.y;
                        if (!zC2) {
                            ((io.sentry.android.replay.util.g) aceVar2.getValue()).shutdown();
                            return;
                        }
                        io.sentry.android.replay.util.g gVar2 = (io.sentry.android.replay.util.g) aceVar2.getValue();
                        synchronized (gVar2) {
                            if (!gVar2.a.isShutdown()) {
                                gVar2.a.shutdown();
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            cgg.t(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.y3
    /* JADX INFO: renamed from: g0, reason: from getter */
    public final x3 getZ() {
        return this.Z;
    }

    @Override // io.sentry.y3
    public final void h(Boolean bool) {
        if (this.z.get() && p0()) {
            io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
            io.sentry.android.replay.capture.i iVar = this.Y;
            if (wVar.equals(iVar != null ? iVar.d() : null)) {
                SentryAndroidOptions sentryAndroidOptions = this.d;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    pa7.g0("options");
                    throw null;
                }
            }
            io.sentry.android.replay.capture.i iVar2 = this.Y;
            if (iVar2 != null) {
                iVar2.a(bool.equals(Boolean.TRUE), new n(this));
            }
            io.sentry.android.replay.capture.i iVar3 = this.Y;
            this.Y = iVar3 != null ? iVar3.b() : null;
        }
    }

    public final void h0() {
        g1 g1Var;
        g1 g1Var2;
        io.sentry.android.core.internal.tombstone.b bVarF;
        io.sentry.android.core.internal.tombstone.b bVarF2;
        if (this.Y instanceof io.sentry.android.replay.capture.z) {
            if (this.c == r0.DISCONNECTED || !(((g1Var = this.e) == null || (bVarF2 = g1Var.f()) == null || !bVarF2.h(io.sentry.p.All)) && ((g1Var2 = this.e) == null || (bVarF = g1Var2.f()) == null || !bVarF.h(io.sentry.p.Replay)))) {
                H0();
            }
        }
    }

    public final void k0(String str) {
        File[] fileArrListFiles;
        SentryAndroidOptions sentryAndroidOptions = this.d;
        if (sentryAndroidOptions == null) {
            pa7.g0("options");
            throw null;
        }
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            name.getClass();
            if (c5e.C(name, "replay_", false) && !v4e.F(name, l().a(), false) && (v4e.Q(str) || !v4e.F(name, str, false))) {
                io.sentry.util.b.g(file);
            }
        }
    }

    @Override // io.sentry.y3
    public final io.sentry.protocol.w l() {
        io.sentry.protocol.w wVarD;
        io.sentry.android.replay.capture.i iVar = this.Y;
        if (iVar != null && (wVarD = iVar.d()) != null) {
            return wVarD;
        }
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        wVar.getClass();
        return wVar;
    }

    public final boolean p0() {
        return this.G0.a.compareTo(t.STARTED) >= 0 && this.G0.a.compareTo(t.STOPPED) < 0;
    }

    @Override // io.sentry.y3
    public final void stop() {
        s sVar = this.G0;
        io.sentry.util.a aVar = this.F0;
        aVar.b();
        try {
            if (this.z.get()) {
                t tVar = t.STOPPED;
                if (sVar.a(tVar)) {
                    if (this.f != null) {
                        w wVar = ((x) this.w.getValue()).c;
                        i0 i0Var = this.f;
                        i0Var.getClass();
                        wVar.remove(i0Var);
                    }
                    ((x) this.w.getValue()).c.remove(this.g);
                    i0 i0Var2 = this.f;
                    if (i0Var2 != null) {
                        i0Var2.reset();
                    }
                    i0 i0Var3 = this.f;
                    if (i0Var3 != null) {
                        i0Var3.E();
                    }
                    io.sentry.android.replay.gestures.c cVar = this.g;
                    if (cVar != null) {
                        cVar.c();
                    }
                    io.sentry.android.replay.capture.i iVar = this.Y;
                    if (iVar != null) {
                        iVar.o();
                    }
                    this.Y = null;
                    sVar.a = tVar;
                    cgg.t(aVar, null);
                    return;
                }
            }
            cgg.t(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.s0
    public final void u(r0 r0Var) {
        r0Var.getClass();
        this.c = r0Var;
        if (this.Y instanceof io.sentry.android.replay.capture.z) {
            if (r0Var == r0.DISCONNECTED) {
                H0();
            } else {
                L0();
            }
        }
    }

    @Override // io.sentry.y3
    public final void x() {
        this.X.set(false);
        L0();
    }
}
