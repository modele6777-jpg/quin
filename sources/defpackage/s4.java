package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s4 extends jgb {
    @Override // defpackage.jgb
    public final boolean J(u4 u4Var, q4 q4Var, q4 q4Var2) {
        synchronized (u4Var) {
            try {
                if (u4Var.b != q4Var) {
                    return false;
                }
                u4Var.b = q4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jgb
    public final boolean K(u4 u4Var, Object obj, Object obj2) {
        synchronized (u4Var) {
            try {
                if (u4Var.a != obj) {
                    return false;
                }
                u4Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jgb
    public final boolean L(u4 u4Var, t4 t4Var, t4 t4Var2) {
        synchronized (u4Var) {
            try {
                if (u4Var.c != t4Var) {
                    return false;
                }
                u4Var.c = t4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jgb
    public final void e0(t4 t4Var, t4 t4Var2) {
        t4Var.b = t4Var2;
    }

    @Override // defpackage.jgb
    public final void f0(t4 t4Var, Thread thread) {
        t4Var.a = thread;
    }
}
