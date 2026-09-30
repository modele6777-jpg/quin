package io.sentry;

import defpackage.jv2;
import defpackage.nzf;
import defpackage.qc0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j4 implements g1 {
    public final e1 a;
    public final e1 b;
    public final e1 c;
    public final o d;
    public final n e;
    public final i0 f;
    public final i0 g;

    public j4(e1 e1Var, e1 e1Var2, e1 e1Var3) {
        this.e = new n(e1Var3, e1Var2, e1Var, 0);
        this.a = e1Var;
        this.b = e1Var2;
        this.c = e1Var3;
        q6 q6VarO = o();
        io.sentry.util.b.r(q6VarO, "SentryOptions is required.");
        if (q6VarO.getDsn() == null || q6VarO.getDsn().isEmpty()) {
            qc0.j("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
            throw null;
        }
        this.d = q6VarO.getCompositePerformanceCollector();
        this.f = new i0(this);
        this.g = new i0(this);
    }

    @Override // io.sentry.g1
    public final g1 A(String str) {
        return new j4(this.a.clone(), this.b.clone(), this.c);
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w B(io.sentry.protocol.k kVar) {
        e1 e1Var = this.e;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'captureFeedback' call is a no-op.", new Object[0]);
            return wVar;
        }
        if (kVar.a.isEmpty()) {
            o().getLogger().i(q5.WARNING, "captureFeedback called with empty message.", new Object[0]);
            return wVar;
        }
        try {
            return e1Var.A().j(kVar, e1Var);
        } catch (Throwable th) {
            o().getLogger().d(q5.ERROR, "Error while capturing feedback: " + kVar.a, th);
            return wVar;
        }
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w C(i5 i5Var, l0 l0Var) {
        e1 e1Var = this.e;
        io.sentry.protocol.w wVarL = io.sentry.protocol.w.b;
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return wVarL;
        }
        try {
            e1Var.E(i5Var);
            wVarL = e1Var.A().l(i5Var, e1Var, l0Var);
            e1Var.J(wVarL);
            return wVarL;
        } catch (Throwable th) {
            o().getLogger().d(q5.ERROR, "Error while capturing event with id: " + i5Var.a, th);
            return wVarL;
        }
    }

    @Override // io.sentry.g1
    public final void a(boolean z) {
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (w1 w1Var : o().getIntegrations()) {
                if (w1Var instanceof Closeable) {
                    try {
                        ((Closeable) w1Var).close();
                    } catch (Throwable th) {
                        o().getLogger().i(q5.WARNING, "Failed to close the integration {}.", w1Var, th);
                    }
                }
            }
            for (f0 f0Var : o().getEventProcessors()) {
                if (f0Var instanceof Closeable) {
                    try {
                        ((Closeable) f0Var).close();
                    } catch (Throwable th2) {
                        o().getLogger().i(q5.WARNING, "Failed to close the event processor {}.", f0Var, th2);
                    }
                }
            }
            boolean zIsEnabled = isEnabled();
            n nVar = this.e;
            if (zIsEnabled) {
                try {
                    nVar.e(null).clear();
                } catch (Throwable th3) {
                    o().getLogger().d(q5.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                o().getLogger().i(q5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            i4 i4Var = i4.ISOLATION;
            if (isEnabled()) {
                try {
                    nVar.e(i4Var).clear();
                } catch (Throwable th4) {
                    o().getLogger().d(q5.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                o().getLogger().i(q5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            o().getBackpressureMonitor().close();
            o().getTransactionProfiler().close();
            o().getContinuousProfiler().a(true);
            o().getCompositePerformanceCollector().close();
            o().getConnectionStatusProvider().close();
            if (!z) {
                o().getTimerExecutorService().a(o().getShutdownTimeoutMillis());
            }
            k1 executorService = o().getExecutorService();
            if (z) {
                try {
                    executorService.submit(new nzf(2, this, executorService));
                } catch (RejectedExecutionException e) {
                    o().getLogger().d(q5.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e);
                    executorService.a(o().getShutdownTimeoutMillis());
                }
            } else {
                executorService.a(o().getShutdownTimeoutMillis());
            }
            i4 i4Var2 = i4.CURRENT;
            if (isEnabled()) {
                try {
                    nVar.e(i4Var2).A().a(z);
                } catch (Throwable th5) {
                    o().getLogger().d(q5.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                o().getLogger().i(q5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            i4 i4Var3 = i4.ISOLATION;
            if (isEnabled()) {
                try {
                    nVar.e(i4Var3).A().a(z);
                } catch (Throwable th6) {
                    o().getLogger().d(q5.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                o().getLogger().i(q5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            i4 i4Var4 = i4.GLOBAL;
            if (!isEnabled()) {
                o().getLogger().i(q5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                nVar.e(i4Var4).A().a(z);
            } catch (Throwable th7) {
                o().getLogger().d(q5.ERROR, "Error in the 'configureScope' callback.", th7);
            }
        } catch (Throwable th8) {
            o().getLogger().d(q5.ERROR, "Error while closing the Scopes.", th8);
        }
    }

    @Override // io.sentry.g1
    public final o1 b() {
        if (isEnabled()) {
            return this.e.b();
        }
        o().getLogger().i(q5.WARNING, "Instance is disabled and this 'getSpan' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.g1
    public final void c(io.sentry.protocol.i0 i0Var) {
        if (isEnabled()) {
            this.e.c(i0Var);
        } else {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'setUser' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.g1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final y0 m24clone() {
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new p0((j4) A("scopes clone"));
    }

    @Override // io.sentry.g1
    public final void d(Throwable th, d7 d7Var, String str) {
        this.e.d(th, d7Var, str);
    }

    @Override // io.sentry.g1
    public final void e(long j) {
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.e.A().e(j);
        } catch (Throwable th) {
            o().getLogger().d(q5.ERROR, "Error in the 'client.flush'.", th);
        }
    }

    @Override // io.sentry.g1
    public final io.sentry.android.core.internal.tombstone.b f() {
        return this.e.A().f();
    }

    @Override // io.sentry.g1
    public final boolean g() {
        return this.e.A().g();
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, l0 l0Var) {
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            io.sentry.protocol.w wVarH = this.e.A().h(cVar, l0Var);
            return wVarH != null ? wVarH : wVar;
        } catch (Throwable th) {
            o().getLogger().d(q5.ERROR, "Error while capturing envelope.", th);
            return wVar;
        }
    }

    @Override // io.sentry.g1
    public final void i(g gVar, l0 l0Var) {
        if (isEnabled()) {
            this.e.i(gVar, l0Var);
        } else {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.g1
    public final boolean isEnabled() {
        return this.e.A().isEnabled();
    }

    @Override // io.sentry.g1
    public final void j(g gVar) {
        i(gVar, new l0());
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w k(r3 r3Var) {
        io.sentry.util.b.r(r3Var, "profilingContinuousData is required");
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            return this.e.A().k(r3Var);
        } catch (Throwable th) {
            o().getLogger().d(q5.ERROR, "Error while capturing profile chunk with id: " + r3Var.c, th);
            return wVar;
        }
    }

    @Override // io.sentry.g1
    public final q1 m(m7 m7Var, n7 n7Var) {
        Double dValueOf;
        m7Var.w = (String) n7Var.d;
        boolean zIsEnabled = isEnabled();
        boolean z = false;
        q1 q1VarA = i3.a;
        if (!zIsEnabled) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (io.sentry.util.o.a(m7Var.w, o().getIgnoredSpanOrigins())) {
            o().getLogger().i(q5.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", m7Var.w);
        } else if (!o().getInstrumenter().equals(m7Var.z)) {
            o().getLogger().i(q5.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", m7Var.z, o().getInstrumenter());
        } else if (o().isTracingEnabled()) {
            c cVar = m7Var.X;
            if (cVar == null || (dValueOf = cVar.d) == null) {
                Double d = ((c) this.e.x().e).d;
                dValueOf = Double.valueOf(d == null ? 0.0d : d.doubleValue());
            }
            w3 w3VarA = o().getInternalTracesSampler().a(new io.sentry.internal.debugmeta.c(m7Var, dValueOf, z, 4));
            Boolean bool = (Boolean) w3VarA.a;
            m7Var.a(w3VarA);
            p1 spanFactory = o().getSpanFactory();
            if (bool.booleanValue() && o().isContinuousProfilingEnabled()) {
                t3 profileLifecycle = o().getProfileLifecycle();
                t3 t3Var = t3.TRACE;
                if (profileLifecycle == t3Var && m7Var.Z.equals(io.sentry.protocol.w.b)) {
                    o().getContinuousProfiler().c(t3Var, o().getInternalTracesSampler());
                }
            }
            q1VarA = spanFactory.a(m7Var, this, n7Var, this.d);
            if (bool.booleanValue() && ((Boolean) w3VarA.d).booleanValue()) {
                r1 transactionProfiler = o().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.e(q1VarA);
                } else if (n7Var.e) {
                    transactionProfiler.e(q1VarA);
                }
            }
        } else {
            o().getLogger().i(q5.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (f4.ON == ((f4) n7Var.c)) {
            q1VarA.n();
        }
        return q1VarA;
    }

    @Override // io.sentry.g1
    public final void n(g4 g4Var) {
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            g4Var.g(this.e.e(null));
        } catch (Throwable th) {
            o().getLogger().d(q5.ERROR, "Error in the 'configureScope' callback.", th);
        }
    }

    @Override // io.sentry.g1
    public final q6 o() {
        return ((e1) this.e.b).o();
    }

    @Override // io.sentry.g1
    public final q1 p() {
        if (isEnabled()) {
            return this.e.p();
        }
        o().getLogger().i(q5.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.g1
    public final void q() {
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        n nVar = this.e;
        c7 c7VarQ = nVar.q();
        if (c7VarQ != null) {
            nVar.A().b(c7VarQ, io.sentry.util.b.f(new io.sentry.hints.j()));
        }
    }

    @Override // io.sentry.g1
    public final void r() {
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        n nVar = this.e;
        io.sentry.internal.debugmeta.c cVarR = nVar.r();
        if (cVarR == null) {
            o().getLogger().i(q5.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        c7 c7Var = (c7) cVarR.b;
        if (c7Var != null) {
            nVar.A().b(c7Var, io.sentry.util.b.f(new io.sentry.hints.j()));
        }
        nVar.A().b((c7) cVarR.c, io.sentry.util.b.f(new io.sentry.hints.j()));
    }

    @Override // io.sentry.g1
    public final io.sentry.logger.a t() {
        return this.f;
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w u(s6 s6Var, l0 l0Var) {
        e1 e1Var = this.e;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return wVar;
        }
        try {
            return e1Var.A().c(s6Var, e1Var, l0Var);
        } catch (Throwable th) {
            o().getLogger().d(q5.ERROR, "Error while capturing replay", th);
            return wVar;
        }
    }

    @Override // io.sentry.g1
    public final e1 v() {
        return this.c;
    }

    @Override // io.sentry.g1
    public final e1 w() {
        return this.a;
    }

    @Override // io.sentry.g1
    public final x0 x() {
        return this.g;
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w y(Exception exc, l0 l0Var, jv2 jv2Var) {
        e1 e1VarClone;
        io.sentry.protocol.w wVarL = io.sentry.protocol.w.b;
        boolean zIsEnabled = isEnabled();
        n nVar = this.e;
        if (zIsEnabled) {
            try {
                i5 i5Var = new i5(exc);
                nVar.E(i5Var);
                if (jv2Var != null) {
                    try {
                        e1VarClone = nVar.clone();
                        jv2Var.g(e1VarClone);
                    } catch (Throwable th) {
                        o().getLogger().d(q5.ERROR, "Error in the 'ScopeCallback' callback.", th);
                        e1VarClone = nVar;
                    }
                    wVarL = nVar.A().l(i5Var, e1VarClone, l0Var);
                } else {
                    e1VarClone = nVar;
                    wVarL = nVar.A().l(i5Var, e1VarClone, l0Var);
                }
            } catch (Throwable th2) {
                o().getLogger().d(q5.ERROR, "Error while capturing exception: " + exc.getMessage(), th2);
            }
        } else {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        }
        nVar.J(wVarL);
        return wVarL;
    }

    @Override // io.sentry.g1
    public final io.sentry.protocol.w z(io.sentry.protocol.f0 f0Var, k7 k7Var, l0 l0Var, u3 u3Var) {
        io.sentry.protocol.f0 f0Var2;
        e1 e1Var = this.e;
        ArrayList arrayList = f0Var.H0;
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        if (!isEnabled()) {
            o().getLogger().i(q5.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return wVar;
        }
        if (f0Var.G0 == null) {
            o().getLogger().i(q5.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", f0Var.a);
            return wVar;
        }
        Boolean bool = Boolean.TRUE;
        e7 e7VarJ = f0Var.b.j();
        w3 w3Var = e7VarJ == null ? null : e7VarJ.d;
        if (!bool.equals(Boolean.valueOf(w3Var != null ? ((Boolean) w3Var.a).booleanValue() : false))) {
            o().getLogger().i(q5.DEBUG, "Transaction %s was dropped due to sampling decision.", f0Var.a);
            if (o().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.f clientReportRecorder = o().getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.BACKPRESSURE;
                clientReportRecorder.a(dVar, p.Transaction);
                o().getClientReportRecorder().f(dVar, p.Span, arrayList.size() + 1);
                return wVar;
            }
            io.sentry.clientreport.f clientReportRecorder2 = o().getClientReportRecorder();
            io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.SAMPLE_RATE;
            clientReportRecorder2.a(dVar2, p.Transaction);
            o().getClientReportRecorder().f(dVar2, p.Span, arrayList.size() + 1);
            return wVar;
        }
        try {
            f0Var2 = f0Var;
            try {
                return e1Var.A().i(f0Var2, k7Var, e1Var, l0Var, u3Var);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                o().getLogger().d(q5.ERROR, "Error while capturing transaction with id: " + f0Var2.a, th2);
                return wVar;
            }
        } catch (Throwable th3) {
            th = th3;
            f0Var2 = f0Var;
        }
    }
}
