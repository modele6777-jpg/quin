package io.sentry.exception;

import io.sentry.protocol.o;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends RuntimeException {
    private static final long serialVersionUID = 142345454265713915L;
    private final o exceptionMechanism;
    private final boolean snapshot;
    private final Thread thread;
    private final Throwable throwable;

    public a(o oVar, Throwable th, Thread thread, boolean z) {
        this.exceptionMechanism = oVar;
        io.sentry.util.b.r(th, "Throwable is required.");
        this.throwable = th;
        this.thread = thread;
        this.snapshot = z;
    }

    public final o a() {
        return this.exceptionMechanism;
    }

    public final Thread b() {
        return this.thread;
    }

    public final Throwable c() {
        return this.throwable;
    }

    public final boolean d() {
        return this.snapshot;
    }
}
