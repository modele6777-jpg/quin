package defpackage;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z99 implements ThreadFactory {
    public final /* synthetic */ int a;
    public final ThreadFactory b;
    public final Serializable c;

    public z99(ox0 ox0Var) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        ThreadFactory threadFactory = this.b;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                Thread threadNewThread = threadFactory.newThread(new ecc(3, runnable));
                threadNewThread.setName((String) serializable);
                return threadNewThread;
            default:
                Thread threadNewThread2 = threadFactory.newThread(runnable);
                threadNewThread2.setName("PlayBillingLibrary-" + ((AtomicInteger) serializable).getAndIncrement());
                return threadNewThread2;
        }
    }

    public z99(String str) {
        this.a = 0;
        this.b = Executors.defaultThreadFactory();
        this.c = str;
    }
}
