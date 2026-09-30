package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cdh implements edh {
    public static boolean c;
    public final u8e a;
    public final int b = Math.max(5, 10);

    public cdh(u8e u8eVar) {
        this.a = u8eVar;
    }

    @Override // defpackage.edh
    public final void b() {
        synchronized (cdh.class) {
            try {
                if (!c) {
                    mt4 mt4Var = new mt4(this);
                    long j = this.b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    i39 i39Var = (i39) this.a.get();
                    pkd pkdVar = new pkd(this, mt4Var, i39Var, j);
                    i39Var.getClass();
                    s5f s5fVar = new s5f(Executors.callable(pkdVar, null));
                    g39 g39Var = new g39(s5fVar, i39Var.b.schedule(s5fVar, j, timeUnit));
                    g39Var.b(new u36(g39Var, 1), f94.a);
                    c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
