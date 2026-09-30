package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s5f extends hn5 implements RunnableFuture {
    public volatile ba7 w;

    public s5f(Callable callable) {
        this.w = new r5f(this, callable);
    }

    @Override // defpackage.f2
    public final void d() {
        ba7 ba7Var;
        if (q() && (ba7Var = this.w) != null) {
            mt4 mt4Var = ba7.b;
            mt4 mt4Var2 = ba7.a;
            Runnable runnable = (Runnable) ba7Var.get();
            if (runnable instanceof Thread) {
                aa7 aa7Var = new aa7(ba7Var);
                aa7Var.a(Thread.currentThread());
                if (ba7Var.compareAndSet(runnable, aa7Var)) {
                    try {
                        ((Thread) runnable).interrupt();
                        if (((Runnable) ba7Var.getAndSet(mt4Var2)) == mt4Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) ba7Var.getAndSet(mt4Var2)) == mt4Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.w = null;
    }

    @Override // defpackage.f2
    public final String k() {
        ba7 ba7Var = this.w;
        if (ba7Var == null) {
            return super.k();
        }
        return "task=[" + ba7Var + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        ba7 ba7Var = this.w;
        if (ba7Var != null) {
            ba7Var.run();
        }
        this.w = null;
    }
}
