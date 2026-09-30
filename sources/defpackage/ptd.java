package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ptd implements ax6 {
    public final zd5 a;
    public final urg b;
    public final Object c = new Object();
    public boolean d;
    public final v41 e;

    public ptd(v41 v41Var, zd5 zd5Var, urg urgVar) {
        this.a = zd5Var;
        this.b = urgVar;
        this.e = v41Var;
    }

    @Override // defpackage.ax6
    public final e1a E0() {
        synchronized (this.c) {
            if (this.d) {
                throw new IllegalStateException("closed");
            }
        }
        return null;
    }

    @Override // defpackage.ax6
    public final v41 P0() {
        v41 v41Var;
        synchronized (this.c) {
            try {
                if (this.d) {
                    throw new IllegalStateException("closed");
                }
                v41Var = this.e;
                if (v41Var == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return v41Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            try {
                this.d = true;
                v41 v41Var = this.e;
                if (v41Var != null) {
                    try {
                        v41Var.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ax6
    public final zd5 getFileSystem() {
        return this.a;
    }

    @Override // defpackage.ax6
    public final urg k() {
        return this.b;
    }
}
