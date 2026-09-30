package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i5 extends hn5 implements Runnable {
    public static final /* synthetic */ int y = 0;
    public m88 w;
    public Object x;

    public i5(m88 m88Var, Object obj) {
        m88Var.getClass();
        this.w = m88Var;
        this.x = obj;
    }

    public static g5 r(m88 m88Var, sg0 sg0Var, Executor executor) {
        executor.getClass();
        g5 g5Var = new g5(m88Var, sg0Var);
        m88Var.b(g5Var, bzd.G(executor, g5Var));
        return g5Var;
    }

    @Override // defpackage.f2
    public final void d() {
        m88 m88Var = this.w;
        if ((m88Var != null) & (this.a instanceof t1)) {
            m88Var.cancel(q());
        }
        this.w = null;
        this.x = null;
    }

    @Override // defpackage.f2
    public final String k() {
        String str;
        m88 m88Var = this.w;
        Object obj = this.x;
        String strK = super.k();
        if (m88Var != null) {
            str = "inputFuture=[" + m88Var + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strK != null) {
                return str.concat(strK);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        m88 m88Var = this.w;
        Object obj = this.x;
        if (((this.a instanceof t1) | (m88Var == null)) || (obj == null)) {
            return;
        }
        this.w = null;
        if (m88Var.isCancelled()) {
            o(m88Var);
            return;
        }
        try {
            try {
                Object objS = s(obj, pa7.T(m88Var));
                this.x = null;
                t(objS);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    n(th);
                } finally {
                    this.x = null;
                }
            }
        } catch (Error e) {
            n(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            n(e2.getCause());
        } catch (Exception e3) {
            n(e3);
        }
    }

    public abstract Object s(Object obj, Object obj2);

    public abstract void t(Object obj);
}
