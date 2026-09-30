package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gw implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;
    public final /* synthetic */ String b;
    public final /* synthetic */ wh0 c;

    public /* synthetic */ gw(ThreadFactory threadFactory, String str, wh0 wh0Var) {
        this.a = threadFactory;
        this.b = str;
        this.c = wh0Var;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.a.newThread(runnable);
        threadNewThread.getClass();
        threadNewThread.setName(this.b + v4e.W(2, String.valueOf(wh0.b.incrementAndGet(this.c))));
        return threadNewThread;
    }
}
