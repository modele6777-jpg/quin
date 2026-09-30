package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kd5 implements ax6 {
    public final e1a a;
    public final zd5 b;
    public final String c;
    public final AutoCloseable d;
    public final Object e = new Object();
    public boolean f;
    public yhb g;

    public kd5(e1a e1aVar, zd5 zd5Var, String str, AutoCloseable autoCloseable) {
        this.a = e1aVar;
        this.b = zd5Var;
        this.c = str;
        this.d = autoCloseable;
    }

    @Override // defpackage.ax6
    public final e1a E0() {
        e1a e1aVar;
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            e1aVar = this.a;
        }
        return e1aVar;
    }

    @Override // defpackage.ax6
    public final v41 P0() {
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            yhb yhbVar = this.g;
            if (yhbVar != null) {
                return yhbVar;
            }
            yhb yhbVarO = bzd.o(this.b.h0(this.a));
            this.g = yhbVarO;
            return yhbVarO;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.e) {
            this.f = true;
            yhb yhbVar = this.g;
            if (yhbVar != null) {
                try {
                    yhbVar.close();
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception unused) {
                }
                autoCloseable = this.d;
                if (autoCloseable != null) {
                    try {
                        tec.w(autoCloseable);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                    }
                }
            } else {
                autoCloseable = this.d;
                if (autoCloseable != null) {
                    tec.w(autoCloseable);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.ax6
    public final zd5 getFileSystem() {
        return this.b;
    }

    @Override // defpackage.ax6
    public final urg k() {
        return null;
    }
}
