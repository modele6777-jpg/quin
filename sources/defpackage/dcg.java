package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dcg {
    public static final String a = ff8.n("WorkerWrapper");

    public static final Object a(m88 m88Var, v88 v88Var, gbe gbeVar) throws Throwable {
        Object obj;
        try {
            if (!m88Var.isDone()) {
                pl1 pl1Var = new pl1(1, k99.D(gbeVar));
                pl1Var.v();
                m88Var.b(new v36(20, m88Var, pl1Var), e94.a);
                pl1Var.x(new bdf(4, v88Var, m88Var));
                return pl1Var.t();
            }
            boolean z = false;
            while (true) {
                try {
                    obj = m88Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }
}
