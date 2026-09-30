package io.sentry.transport;

import io.sentry.a5;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.b5;
import io.sentry.g5;
import io.sentry.l0;
import io.sentry.n0;
import io.sentry.o7;
import io.sentry.q5;
import io.sentry.y;
import io.sentry.z0;
import io.sentry.z4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements g {
    public final n a;
    public final io.sentry.cache.d b;
    public final SentryAndroidOptions c;
    public final io.sentry.android.core.internal.tombstone.b d;
    public final h e;
    public final e f;
    public volatile b g;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public c(SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.tombstone.b bVar, h hVar, io.sentry.internal.debugmeta.c cVar) {
        int maxQueueSize = sentryAndroidOptions.getMaxQueueSize();
        final io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        final z0 logger = sentryAndroidOptions.getLogger();
        a5 dateProvider = sentryAndroidOptions.getDateProvider();
        n nVar = new n(maxQueueSize, new n0(4), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b) {
                    b bVar2 = (b) runnable;
                    l0 l0Var = bVar2.b;
                    if (!io.sentry.util.b.j(l0Var, io.sentry.hints.d.class)) {
                        envelopeDiskCache.N(bVar2.a, l0Var);
                    }
                    Object objB = l0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.k.class.isInstance(l0Var.b("sentry:typeCheckHint")) && objB != null) {
                        ((io.sentry.hints.k) objB).b(false);
                    }
                    Object objB2 = l0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.h.class.isInstance(l0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                        ((io.sentry.hints.h) objB2).c(true);
                    }
                    logger.i(q5.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        e eVar = new e(sentryAndroidOptions, cVar, bVar);
        this.g = null;
        this.a = nVar;
        io.sentry.cache.d envelopeDiskCache2 = sentryAndroidOptions.getEnvelopeDiskCache();
        io.sentry.util.b.r(envelopeDiskCache2, "envelopeCache is required");
        this.b = envelopeDiskCache2;
        this.c = sentryAndroidOptions;
        this.d = bVar;
        io.sentry.util.b.r(hVar, "transportGate is required");
        this.e = hVar;
        this.f = eVar;
    }

    @Override // io.sentry.transport.g
    public final void a(boolean z) throws IOException {
        this.d.close();
        this.a.shutdown();
        this.c.getLogger().i(q5.DEBUG, "Shutting down", new Object[0]);
        if (z) {
            return;
        }
        try {
            long flushTimeoutMillis = this.c.getFlushTimeoutMillis();
            if (this.a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.c.getLogger().i(q5.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.a.shutdownNow();
            if (this.g != null) {
                this.a.getRejectedExecutionHandler().rejectedExecution(this.g, this.a);
            }
        } catch (InterruptedException unused) {
            this.c.getLogger().i(q5.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        a(false);
    }

    @Override // io.sentry.transport.g
    public final void e(long j) {
        n nVar = this.a;
        try {
            ((p) nVar.e.b).tryAcquireSharedNanos(1, TimeUnit.MILLISECONDS.toNanos(j));
        } catch (InterruptedException e) {
            nVar.c.d(q5.ERROR, "Failed to wait till idle", e);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.g
    public final io.sentry.android.core.internal.tombstone.b f() {
        return this.d;
    }

    @Override // io.sentry.transport.g
    public final boolean g() {
        boolean z;
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d.c;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((io.sentry.p) it.next());
            if (date2 != null && !date.after(date2)) {
                z = true;
                break;
            }
        }
        n nVar = this.a;
        z4 z4Var = nVar.b;
        return (z || (z4Var != null && (nVar.d.a().b(z4Var) > 2000000000L ? 1 : (nVar.d.a().b(z4Var) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }

    @Override // io.sentry.transport.g
    public final void x0(io.sentry.internal.debugmeta.c cVar, l0 l0Var) {
        io.sentry.cache.d dVar;
        boolean z;
        io.sentry.internal.debugmeta.c cVarH;
        List listSingletonList;
        Iterable<g5> iterable = (Iterable) cVar.c;
        boolean zJ = io.sentry.util.b.j(l0Var, io.sentry.hints.d.class);
        SentryAndroidOptions sentryAndroidOptions = this.c;
        io.sentry.cache.d dVar2 = this.b;
        if (zJ) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Captured Envelope is already cached", new Object[0]);
            dVar = i.a;
            z = true;
        } else {
            dVar = dVar2;
            z = false;
        }
        io.sentry.android.core.internal.tombstone.b bVar = this.d;
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) bVar.b;
        ArrayList arrayList = null;
        for (g5 g5Var : iterable) {
            String itemType = g5Var.a.e.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    listSingletonList = Collections.singletonList(io.sentry.p.Attachment);
                    break;
                case "replay_video":
                    listSingletonList = Collections.singletonList(io.sentry.p.Replay);
                    break;
                case "profile_chunk":
                    listSingletonList = Arrays.asList(io.sentry.p.ProfileChunkUi, io.sentry.p.ProfileChunk);
                    break;
                case "profile":
                    listSingletonList = Collections.singletonList(io.sentry.p.Profile);
                    break;
                case "feedback":
                    listSingletonList = Collections.singletonList(io.sentry.p.Feedback);
                    break;
                case "log":
                    listSingletonList = Arrays.asList(io.sentry.p.LogItem, io.sentry.p.LogByte);
                    break;
                case "span":
                    listSingletonList = Collections.singletonList(io.sentry.p.Span);
                    break;
                case "event":
                    listSingletonList = Collections.singletonList(io.sentry.p.Error);
                    break;
                case "trace_metric":
                    listSingletonList = Arrays.asList(io.sentry.p.TraceMetric, io.sentry.p.TraceMetricByte);
                    break;
                case "check_in":
                    listSingletonList = Collections.singletonList(io.sentry.p.Monitor);
                    break;
                case "session":
                    listSingletonList = Collections.singletonList(io.sentry.p.Session);
                    break;
                case "transaction":
                    listSingletonList = Collections.singletonList(io.sentry.p.Transaction);
                    break;
                default:
                    listSingletonList = Collections.singletonList(io.sentry.p.Unknown);
                    break;
            }
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                if (bVar.h((io.sentry.p) it.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(g5Var);
                    sentryAndroidOptions2.getClientReportRecorder().g(io.sentry.clientreport.d.RATELIMIT_BACKOFF, g5Var);
                    break;
                }
            }
        }
        if (arrayList != null) {
            sentryAndroidOptions2.getLogger().i(q5.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (g5 g5Var2 : iterable) {
                if (!arrayList.contains(g5Var2)) {
                    arrayList2.add(g5Var2);
                }
            }
            if (arrayList2.isEmpty()) {
                sentryAndroidOptions2.getLogger().i(q5.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                Object objB = l0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(l0Var.b("sentry:typeCheckHint")) && objB != null) {
                    ((io.sentry.hints.k) objB).b(false);
                }
                Object objB2 = l0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.h.class.isInstance(l0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                    ((io.sentry.hints.h) objB2).c(false);
                }
                Object objB3 = l0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.c.class.isInstance(l0Var.b("sentry:typeCheckHint")) && objB3 != null) {
                    ((io.sentry.hints.c) objB3).a.countDown();
                    sentryAndroidOptions2.getLogger().i(q5.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                cVarH = null;
            } else {
                cVarH = new io.sentry.internal.debugmeta.c((b5) cVar.b, arrayList2);
            }
        } else {
            cVarH = cVar;
        }
        if (cVarH == null) {
            if (z) {
                dVar2.F0(cVar);
                return;
            }
            return;
        }
        if (o7.class.isInstance(l0Var.b("sentry:typeCheckHint"))) {
            cVarH = sentryAndroidOptions.getClientReportRecorder().h(cVarH);
        }
        Future futureSubmit = this.a.submit(new b(this, cVarH, l0Var, dVar));
        if (futureSubmit != null && futureSubmit.isCancelled()) {
            sentryAndroidOptions.getClientReportRecorder().e(io.sentry.clientreport.d.QUEUE_OVERFLOW, cVarH);
            return;
        }
        Object objB4 = l0Var.b("sentry:typeCheckHint");
        if (!y.class.isInstance(l0Var.b("sentry:typeCheckHint")) || objB4 == null) {
            return;
        }
        y yVar = (y) objB4;
        yVar.g.add(yVar.f);
        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Envelope enqueued", new Object[0]);
    }
}
