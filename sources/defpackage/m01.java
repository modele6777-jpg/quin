package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m01 extends m1 {
    public final Thread e;
    public final vz4 f;

    public m01(pv2 pv2Var, Thread thread, vz4 vz4Var) {
        super(pv2Var, true);
        this.e = thread;
        this.f = vz4Var;
    }

    @Override // defpackage.rg7
    public final void f(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.e;
        if (pa7.t(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
