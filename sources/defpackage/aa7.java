package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class aa7 extends AbstractOwnableSynchronizer implements Runnable {
    private final ba7 task;

    public aa7(ba7 ba7Var) {
        this.task = ba7Var;
    }

    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.task.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
