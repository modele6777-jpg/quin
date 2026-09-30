package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hr3 extends c35 implements Executor {
    public static final hr3 c = new hr3();
    public static final sv2 d;

    static {
        fff fffVar = fff.c;
        int i = sce.a;
        if (64 >= i) {
            i = 64;
        }
        d = fffVar.c1(xxb.v(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.sv2
    public final void Z0(pv2 pv2Var, Runnable runnable) {
        d.Z0(pv2Var, runnable);
    }

    @Override // defpackage.sv2
    public final void a1(pv2 pv2Var, Runnable runnable) {
        d.a1(pv2Var, runnable);
    }

    @Override // defpackage.sv2
    public final sv2 c1(int i) {
        return fff.c.c1(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Z0(nu4.a, runnable);
    }

    @Override // defpackage.sv2
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.c35
    public final Executor d1() {
        return this;
    }
}
