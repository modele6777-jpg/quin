package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z1 extends urg {
    @Override // defpackage.urg
    public final void N(e2 e2Var, e2 e2Var2) {
        e2Var.b = e2Var2;
    }

    @Override // defpackage.urg
    public final void O(e2 e2Var, Thread thread) {
        e2Var.a = thread;
    }

    @Override // defpackage.urg
    public final boolean l(f2 f2Var, w1 w1Var, w1 w1Var2) {
        synchronized (f2Var) {
            try {
                if (f2Var.b != w1Var) {
                    return false;
                }
                f2Var.b = w1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.urg
    public final boolean m(f2 f2Var, Object obj, Object obj2) {
        synchronized (f2Var) {
            try {
                if (f2Var.a != obj) {
                    return false;
                }
                f2Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.urg
    public final boolean n(f2 f2Var, e2 e2Var, e2 e2Var2) {
        synchronized (f2Var) {
            try {
                if (f2Var.c != e2Var) {
                    return false;
                }
                f2Var.c = e2Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.urg
    public final w1 x(f2 f2Var) {
        w1 w1Var;
        w1 w1Var2 = w1.d;
        synchronized (f2Var) {
            try {
                w1Var = f2Var.b;
                if (w1Var != w1Var2) {
                    f2Var.b = w1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w1Var;
    }

    @Override // defpackage.urg
    public final e2 y(f2 f2Var) {
        e2 e2Var;
        e2 e2Var2 = e2.c;
        synchronized (f2Var) {
            try {
                e2Var = f2Var.c;
                if (e2Var != e2Var2) {
                    f2Var.c = e2Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e2Var;
    }
}
