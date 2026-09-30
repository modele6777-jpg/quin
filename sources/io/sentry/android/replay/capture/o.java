package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import defpackage.a26;
import defpackage.ae1;
import defpackage.cgg;
import defpackage.nzf;
import defpackage.pa7;
import defpackage.s72;
import defpackage.wn7;
import defpackage.xag;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.b0;
import io.sentry.g1;
import io.sentry.o2;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.r6;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends i {
    public final q6 v;
    public final g1 w;
    public final io.sentry.transport.f x;
    public final io.sentry.util.k y;
    public final ArrayList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SentryAndroidOptions sentryAndroidOptions, g1 g1Var, io.sentry.transport.d dVar, io.sentry.util.k kVar, io.sentry.android.replay.util.g gVar, io.sentry.android.replay.util.g gVar2) {
        super(sentryAndroidOptions, g1Var, dVar, gVar, gVar2);
        sentryAndroidOptions.getClass();
        dVar.getClass();
        kVar.getClass();
        gVar.getClass();
        gVar2.getClass();
        this.v = sentryAndroidOptions;
        this.w = g1Var;
        this.x = dVar;
        this.y = kVar;
        this.z = new ArrayList();
    }

    @Override // io.sentry.android.replay.capture.i
    public final void a(boolean z, io.sentry.android.replay.n nVar) {
        io.sentry.android.core.internal.tombstone.b bVarF;
        q6 q6Var = this.v;
        Double d = q6Var.getSessionReplay().e;
        io.sentry.util.k kVar = this.y;
        kVar.getClass();
        if (d == null || d.doubleValue() < kVar.c()) {
            q6Var.getLogger().i(q5.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        g1 g1Var = this.w;
        if (g1Var != null) {
            g1Var.n(new xag(13, this));
        }
        if (z) {
            this.g.set(true);
            q6Var.getLogger().i(q5.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        } else if (g1Var == null || (bVarF = g1Var.f()) == null || !(bVarF.h(io.sentry.p.All) || bVarF.h(io.sentry.p.Replay))) {
            p("capture_replay", new k(this, nVar));
        } else {
            q6Var.getLogger().i(q5.INFO, "Replay is rate-limited, not capturing for event", new Object[0]);
            q6Var.getClientReportRecorder().a(io.sentry.clientreport.d.RATELIMIT_BACKOFF, io.sentry.p.Replay);
        }
    }

    @Override // io.sentry.android.replay.capture.i
    public final i b() {
        io.sentry.android.core.internal.tombstone.b bVarF;
        if (this.g.get()) {
            this.v.getLogger().i(q5.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        g1 g1Var = this.w;
        boolean z = (g1Var == null || (bVarF = g1Var.f()) == null || (!bVarF.h(io.sentry.p.All) && !bVarF.h(io.sentry.p.Replay))) ? false : true;
        q6 q6Var = this.v;
        if (z) {
            q6Var.getLogger().i(q5.DEBUG, "Not converting to session mode, because replay is rate-limited", new Object[0]);
            return this;
        }
        z zVar = new z(q6Var, this.w, this.x, this.d, this.e);
        zVar.l(f());
        zVar.n(e(), d(), r6.BUFFER);
        return zVar;
    }

    @Override // io.sentry.android.replay.capture.i
    public final void g(b0 b0Var) {
        p("configuration_changed", new l(this));
        l(b0Var);
    }

    @Override // io.sentry.android.replay.capture.i
    public final void h(io.sentry.android.replay.q qVar) {
        this.d.submit(new io.sentry.android.replay.util.h(new ae1(this, qVar, this.x.getCurrentTimeMillis(), 5), "BufferCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.i
    public final void i(MotionEvent motionEvent) {
        super.i(motionEvent);
        long currentTimeMillis = this.x.getCurrentTimeMillis() - this.v.getSessionReplay().h;
        ConcurrentLinkedDeque concurrentLinkedDeque = this.q;
        concurrentLinkedDeque.getClass();
        Iterator it = concurrentLinkedDeque.iterator();
        it.getClass();
        while (it.hasNext()) {
            if (((io.sentry.rrweb.b) it.next()).b < currentTimeMillis) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.i
    public final void j() {
        p("pause", new m(this));
    }

    @Override // io.sentry.android.replay.capture.i
    public final void o() {
        io.sentry.android.replay.k kVar = this.h;
        this.d.submit(new io.sentry.android.replay.util.h(new nzf(15, kVar != null ? kVar.l() : null, this), "BufferCaptureStrategy.stop"));
        io.sentry.android.replay.k kVar2 = this.h;
        if (kVar2 != null) {
            kVar2.close();
        }
        this.k.set(0L);
        m(null);
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        wVar.getClass();
        wn7 wn7Var = i.u[3];
        b bVar = this.m;
        bVar.getClass();
        wn7Var.getClass();
        Object andSet = bVar.b.getAndSet(wVar);
        if (pa7.t(andSet, wVar)) {
            return;
        }
        a aVar = new a(andSet, wVar, bVar.d);
        i iVar = bVar.c;
        q6 q6Var = iVar.a;
        if (q6Var.getThreadChecker().c()) {
            iVar.e.submit(new io.sentry.android.replay.util.h(new o2(2, aVar), "CaptureStrategy.runInBackground"));
            return;
        }
        try {
            aVar.invoke();
        } catch (Throwable th) {
            q6Var.getLogger().d(q5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    public final void p(String str, a26 a26Var) {
        Date date;
        b0 b0VarF = f();
        q6 q6Var = this.v;
        if (b0VarF == null) {
            q6Var.getLogger().i(q5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long j = q6Var.getSessionReplay().h;
        long currentTimeMillis = this.x.getCurrentTimeMillis();
        io.sentry.android.replay.k kVar = this.h;
        if (kVar != null) {
            io.sentry.util.a aVar = kVar.f;
            aVar.b();
            try {
                io.sentry.android.replay.l lVar = (io.sentry.android.replay.l) s72.x0(kVar.w);
                Long lValueOf = lVar != null ? Long.valueOf(lVar.b) : null;
                cgg.t(aVar, null);
                if (lValueOf != null) {
                    date = new Date(lValueOf.longValue());
                } else {
                    date = new Date(currentTimeMillis - j);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(aVar, th);
                    throw th2;
                }
            }
        } else {
            date = new Date(currentTimeMillis - j);
        }
        this.d.submit(new io.sentry.android.replay.util.h(new j(this, currentTimeMillis - date.getTime(), date, d(), b0VarF, a26Var, 0), "BufferCaptureStrategy.".concat(str)));
    }
}
