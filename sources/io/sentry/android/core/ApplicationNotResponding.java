package io.sentry.android.core;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
final class ApplicationNotResponding extends RuntimeException {
    private static final long serialVersionUID = 252541144579117016L;
    private final Thread thread;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        io.sentry.util.b.r(thread, "Thread must be provided.");
        this.thread = thread;
        setStackTrace(thread.getStackTrace());
    }

    public final Thread a() {
        return this.thread;
    }

    public ApplicationNotResponding(String str) {
        super(str);
        this.thread = null;
    }
}
