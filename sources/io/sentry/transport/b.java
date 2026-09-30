package io.sentry.transport;

import defpackage.ho7;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.l0;
import io.sentry.q5;
import java.io.IOException;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {
    public final io.sentry.internal.debugmeta.c a;
    public final l0 b;
    public final io.sentry.cache.d c;
    public final q d = new q(-1);
    public final /* synthetic */ c e;

    public b(c cVar, io.sentry.internal.debugmeta.c cVar2, l0 l0Var, io.sentry.cache.d dVar) {
        this.e = cVar;
        io.sentry.util.b.r(cVar2, "Envelope is required.");
        this.a = cVar2;
        this.b = l0Var;
        io.sentry.util.b.r(dVar, "EnvelopeCache is required.");
        this.c = dVar;
    }

    public final io.sentry.config.a a() {
        io.sentry.internal.debugmeta.c cVar = this.a;
        ((b5) cVar.b).d = null;
        io.sentry.cache.d dVar = this.c;
        l0 l0Var = this.b;
        boolean zN = dVar.N(cVar, l0Var);
        Object objB = l0Var.b("sentry:typeCheckHint");
        boolean zIsInstance = io.sentry.hints.c.class.isInstance(l0Var.b("sentry:typeCheckHint"));
        c cVar2 = this.e;
        if (zIsInstance && objB != null) {
            io.sentry.hints.c cVar3 = (io.sentry.hints.c) objB;
            SentryAndroidOptions sentryAndroidOptions = cVar2.c;
            if (cVar3.f(((b5) cVar.b).a)) {
                cVar3.a.countDown();
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Disk flush envelope fired", new Object[0]);
            } else {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Not firing envelope flush as there's an ongoing transaction", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = cVar2.c;
        if (!cVar2.e.a()) {
            Object objB2 = l0Var.b("sentry:typeCheckHint");
            boolean zIsInstance2 = io.sentry.hints.h.class.isInstance(l0Var.b("sentry:typeCheckHint"));
            q qVar = this.d;
            if (zIsInstance2 && objB2 != null) {
                ((io.sentry.hints.h) objB2).c(true);
                return qVar;
            }
            if (!zN) {
                io.sentry.util.b.n(io.sentry.hints.h.class, objB2, sentryAndroidOptions2.getLogger());
                sentryAndroidOptions2.getClientReportRecorder().e(io.sentry.clientreport.d.NETWORK_ERROR, cVar);
            }
            return qVar;
        }
        io.sentry.internal.debugmeta.c cVarH = sentryAndroidOptions2.getClientReportRecorder().h(cVar);
        try {
            try {
                ((b5) cVarH.b).d = new Date((long) (sentryAndroidOptions2.getDateProvider().a().d() / 1000000.0d));
                io.sentry.config.a aVarD = cVar2.f.d(cVarH);
                if (aVarD.s()) {
                    dVar.F0(cVar);
                    return aVarD;
                }
                String str = "The transport failed to send the envelope with response code " + aVarD.q();
                sentryAndroidOptions2.getLogger().i(q5.ERROR, str, new Object[0]);
                if (aVarD.q() >= 400) {
                    dVar.F0(cVar);
                    if (aVarD.q() != 429) {
                        sentryAndroidOptions2.getClientReportRecorder().e(io.sentry.clientreport.d.SEND_ERROR, cVarH);
                    }
                }
                throw new IllegalStateException(str);
            } catch (IOException e) {
                e = e;
                Object objB3 = l0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.h.class.isInstance(l0Var.b("sentry:typeCheckHint")) && objB3 != null) {
                    ((io.sentry.hints.h) objB3).c(true);
                } else if (!zN) {
                    io.sentry.util.b.n(io.sentry.hints.h.class, objB3, sentryAndroidOptions2.getLogger());
                    sentryAndroidOptions2.getClientReportRecorder().e(io.sentry.clientreport.d.NETWORK_ERROR, cVarH);
                }
                ho7.r("Sending the event failed.", e);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public final /* synthetic */ void b(io.sentry.config.a aVar, io.sentry.hints.k kVar) {
        this.e.c.getLogger().i(q5.DEBUG, "Marking envelope submission result: %s", Boolean.valueOf(aVar.s()));
        kVar.b(aVar.s());
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.g = this;
        io.sentry.config.a aVarA = this.d;
        try {
            aVarA = a();
            this.e.c.getLogger().i(q5.DEBUG, "Envelope flushed", new Object[0]);
            l0 l0Var = this.b;
            Object objB = l0Var.b("sentry:typeCheckHint");
            if (io.sentry.hints.k.class.isInstance(l0Var.b("sentry:typeCheckHint")) && objB != null) {
                b(aVarA, (io.sentry.hints.k) objB);
            }
            this.e.g = null;
        } catch (Throwable th) {
            try {
                this.e.c.getLogger().c(q5.ERROR, th, "Envelope submission failed", new Object[0]);
                throw th;
            } catch (Throwable th2) {
                l0 l0Var2 = this.b;
                Object objB2 = l0Var2.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(l0Var2.b("sentry:typeCheckHint")) && objB2 != null) {
                    b(aVarA, (io.sentry.hints.k) objB2);
                }
                this.e.g = null;
                throw th2;
            }
        }
    }
}
