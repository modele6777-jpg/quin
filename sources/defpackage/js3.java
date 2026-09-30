package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class js3 extends c35 {
    public static final js3 d;
    public zv2 c;

    static {
        int i = lle.c;
        int i2 = lle.d;
        long j = lle.e;
        String str = lle.a;
        js3 js3Var = new js3();
        js3Var.c = new zv2(i, i2, j, str);
        d = js3Var;
    }

    @Override // defpackage.sv2
    public final void Z0(pv2 pv2Var, Runnable runnable) {
        zv2.l(this.c, runnable, 6);
    }

    @Override // defpackage.sv2
    public final void a1(pv2 pv2Var, Runnable runnable) {
        zv2.l(this.c, runnable, 2);
    }

    @Override // defpackage.sv2
    public final sv2 c1(int i) {
        abg.p(i);
        return i >= lle.c ? this : super.c1(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.c35
    public final Executor d1() {
        return this.c;
    }

    @Override // defpackage.sv2
    public final String toString() {
        return "Dispatchers.Default";
    }
}
