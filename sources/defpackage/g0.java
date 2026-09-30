package defpackage;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 extends hn5 implements Runnable {
    public static final /* synthetic */ int z = 0;
    public m88 w;
    public Class x;
    public Object y;

    public g0(m88 m88Var, Class cls, Object obj) {
        this.w = m88Var;
        this.x = cls;
        this.y = obj;
    }

    @Override // defpackage.f2
    public final void d() {
        m88 m88Var = this.w;
        if ((m88Var != null) & (this.a instanceof t1)) {
            m88Var.cancel(q());
        }
        this.w = null;
        this.x = null;
        this.y = null;
    }

    @Override // defpackage.f2
    public final String k() {
        String str;
        m88 m88Var = this.w;
        Class cls = this.x;
        Object obj = this.y;
        String strK = super.k();
        if (m88Var != null) {
            str = "inputFuture=[" + m88Var + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strK != null) {
                return str.concat(strK);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    public abstract Object r(Object obj, Throwable th);

    @Override // java.lang.Runnable
    public final void run() {
        Object objT;
        m88 m88Var = this.w;
        Class cls = this.x;
        Object obj = this.y;
        if (((obj == null) || ((m88Var == null) | (cls == null))) || (this.a instanceof t1)) {
            return;
        }
        this.w = null;
        try {
            th = m88Var instanceof f2 ? ((f2) m88Var).p() : null;
            objT = th == null ? pa7.T(m88Var) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + m88Var.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            m(objT);
            return;
        }
        if (!cls.isInstance(th)) {
            o(m88Var);
            return;
        }
        try {
            Object objR = r(obj, th);
            this.x = null;
            this.y = null;
            s(objR);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                n(th2);
            } finally {
                this.x = null;
                this.y = null;
            }
        }
    }

    public abstract void s(Object obj);
}
