package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f39 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f39(Executor executor, Object obj, int i) {
        this.a = i;
        this.b = executor;
        this.c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Executor executor = this.b;
        switch (i) {
            case 0:
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    ((hn5) this.c).n(e);
                    return;
                }
                break;
            default:
                executor.execute(runnable);
                break;
        }
    }
}
