package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class yz4 implements Runnable, Comparable, ta4 {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public yz4(long j) {
        this.a = j;
    }

    @Override // defpackage.ta4
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                ig4 ig4Var = b05.a;
                if (obj == ig4Var) {
                    return;
                }
                zz4 zz4Var = obj instanceof zz4 ? (zz4) obj : null;
                if (zz4Var != null) {
                    synchronized (zz4Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof jwe ? (jwe) obj2 : null) != null) {
                            zz4Var.c(this.b);
                        }
                    }
                }
                this._heap = ig4Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, zz4 zz4Var, a05 a05Var) {
        synchronized (this) {
            if (this._heap == b05.a) {
                return 2;
            }
            synchronized (zz4Var) {
                try {
                    yz4[] yz4VarArr = zz4Var.a;
                    yz4 yz4Var = yz4VarArr != null ? yz4VarArr[0] : null;
                    int i = a05.x;
                    if (ud0.a.getIntVolatile(a05Var, a05.v) == 1) {
                        return 1;
                    }
                    if (yz4Var == null) {
                        zz4Var.c = j;
                    } else {
                        long j2 = yz4Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        long j3 = zz4Var.c;
                        if (j - j3 > 0) {
                            zz4Var.c = j;
                        } else {
                            j = j3;
                        }
                    }
                    if (this.a - j < 0) {
                        this.a = j;
                    }
                    zz4Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((yz4) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(zz4 zz4Var) {
        if (this._heap != b05.a) {
            this._heap = zz4Var;
        } else {
            qc0.j("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.a + ']';
    }
}
