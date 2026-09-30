package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h80 implements Executor {
    public final /* synthetic */ int a;
    public final ArrayDeque b;
    public Runnable c;
    public final Object d;
    public final Executor e;

    public h80(Executor executor) {
        this.a = 2;
        executor.getClass();
        this.e = executor;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public final void a() {
        switch (this.a) {
            case 0:
                synchronized (this.d) {
                    try {
                        Runnable runnable = (Runnable) this.b.poll();
                        this.c = runnable;
                        if (runnable != null) {
                            ((g94) this.e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                Runnable runnable2 = (Runnable) this.b.poll();
                this.c = runnable2;
                if (runnable2 != null) {
                    ((ExecutorService) this.e).execute(runnable2);
                    return;
                }
                return;
            default:
                synchronized (this.d) {
                    Object objPoll = this.b.poll();
                    Runnable runnable3 = (Runnable) objPoll;
                    this.c = runnable3;
                    if (objPoll != null) {
                        this.e.execute(runnable3);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                synchronized (this.d) {
                    try {
                        this.b.add(new fe(5, this, runnable));
                        if (this.c == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                synchronized (this.d) {
                    try {
                        this.b.add(new v36(19, this, runnable));
                        if (this.c == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.d) {
                    this.b.offer(new xu8(22, runnable, this));
                    if (this.c == null) {
                        a();
                    }
                    break;
                }
                return;
        }
    }

    public h80(ExecutorService executorService) {
        this.a = 1;
        this.e = executorService;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public h80(g94 g94Var) {
        this.a = 0;
        this.d = new Object();
        this.b = new ArrayDeque();
        this.e = g94Var;
    }
}
