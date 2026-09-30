package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ea4 implements Executor {
    public final sv2 a;

    public ea4(sv2 sv2Var) {
        this.a = sv2Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        sv2 sv2Var = this.a;
        nu4 nu4Var = nu4.a;
        if (aa4.c(sv2Var, nu4Var)) {
            aa4.b(sv2Var, nu4Var, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
