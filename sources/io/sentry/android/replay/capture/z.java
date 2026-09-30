package io.sentry.android.replay.capture;

import defpackage.a26;
import defpackage.pa7;
import defpackage.t92;
import defpackage.wn7;
import defpackage.xag;
import io.sentry.android.replay.b0;
import io.sentry.g1;
import io.sentry.o2;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.r6;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends i {
    public final q6 v;
    public final g1 w;
    public final io.sentry.transport.f x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(q6 q6Var, g1 g1Var, io.sentry.transport.f fVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        super(q6Var, g1Var, fVar, scheduledExecutorService, scheduledExecutorService2);
        q6Var.getClass();
        fVar.getClass();
        scheduledExecutorService.getClass();
        scheduledExecutorService2.getClass();
        this.v = q6Var;
        this.w = g1Var;
        this.x = fVar;
    }

    @Override // io.sentry.android.replay.capture.i
    public final void a(boolean z, io.sentry.android.replay.n nVar) {
        q6 q6Var = this.v;
        if (q6Var.getSessionReplay().m) {
            q6Var.getLogger().i(q5.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        this.g.set(z);
    }

    @Override // io.sentry.android.replay.capture.i
    public final void g(b0 b0Var) {
        p("onConfigurationChanged", new w(this));
        l(b0Var);
    }

    @Override // io.sentry.android.replay.capture.i
    public final void h(io.sentry.android.replay.q qVar) {
        this.d.submit(new io.sentry.android.replay.util.h(new t92(this, qVar, this.x.getCurrentTimeMillis(), f(), 2), "SessionCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.i
    public final void j() {
        p("pause", new x(this));
    }

    @Override // io.sentry.android.replay.capture.i
    public final void n(int i, io.sentry.protocol.w wVar, r6 r6Var) {
        wVar.getClass();
        super.n(i, wVar, r6Var);
        g1 g1Var = this.w;
        if (g1Var != null) {
            g1Var.n(new xag(14, this));
        }
    }

    @Override // io.sentry.android.replay.capture.i
    public final void o() {
        io.sentry.android.replay.k kVar = this.h;
        p("stop", new y(this, kVar != null ? kVar.l() : null));
        g1 g1Var = this.w;
        if (g1Var != null) {
            g1Var.n(new v(0));
        }
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

    public final void p(String str, a26 a26Var) {
        b0 b0VarF = f();
        if (b0VarF == null) {
            this.v.getLogger().i(q5.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long currentTimeMillis = this.x.getCurrentTimeMillis();
        Date date = (Date) this.j.a(i.u[1], this);
        if (date == null) {
            return;
        }
        long time = currentTimeMillis - date.getTime();
        io.sentry.protocol.w wVarD = d();
        this.d.submit(new io.sentry.android.replay.util.h(new j(this, time, date, wVarD, b0VarF, a26Var, 1), "SessionCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.i
    public final i b() {
        return this;
    }
}
