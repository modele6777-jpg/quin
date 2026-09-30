package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ejd implements pm3 {
    public final djd a;
    public final tm3[] e;
    public final um3[] f;
    public int g;
    public int h;
    public tm3 i;
    public rm3 j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public ejd(tm3[] tm3VarArr, um3[] um3VarArr) {
        this.e = tm3VarArr;
        this.g = tm3VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = g();
        }
        this.f = um3VarArr;
        this.h = um3VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = h();
        }
        djd djdVar = new djd(this);
        this.a = djdVar;
        djdVar.start();
    }

    @Override // defpackage.pm3
    public final void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.pm3
    public final void b(long j) {
        synchronized (this.b) {
            try {
                pa7.J(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pm3
    public final Object e() {
        tm3 tm3Var;
        synchronized (this.b) {
            try {
                rm3 rm3Var = this.j;
                if (rm3Var != null) {
                    throw rm3Var;
                }
                pa7.J(this.i == null);
                int i = this.g;
                if (i == 0) {
                    tm3Var = null;
                } else {
                    tm3[] tm3VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    tm3Var = tm3VarArr[i2];
                }
                this.i = tm3Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tm3Var;
    }

    @Override // defpackage.pm3
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                tm3 tm3Var = this.i;
                if (tm3Var != null) {
                    tm3Var.e();
                    tm3[] tm3VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    tm3VarArr[i] = tm3Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    tm3 tm3Var2 = (tm3) this.c.removeFirst();
                    tm3Var2.e();
                    tm3[] tm3VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    tm3VarArr2[i2] = tm3Var2;
                }
                while (!this.d.isEmpty()) {
                    ((um3) this.d.removeFirst()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract tm3 g();

    public abstract um3 h();

    public abstract rm3 i(Throwable th);

    public abstract rm3 j(tm3 tm3Var, um3 um3Var, boolean z);

    public final boolean k() {
        boolean z;
        rm3 rm3VarI;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            tm3 tm3Var = (tm3) this.c.removeFirst();
            um3[] um3VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            um3 um3Var = um3VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (tm3Var.d(4)) {
                um3Var.a(4);
            } else {
                um3Var.c = tm3Var.g;
                if (tm3Var.d(134217728)) {
                    um3Var.a(134217728);
                }
                long j = tm3Var.g;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    um3Var.d = true;
                }
                try {
                    rm3VarI = j(tm3Var, um3Var, z2);
                } catch (OutOfMemoryError e) {
                    rm3VarI = i(e);
                } catch (RuntimeException e2) {
                    rm3VarI = i(e2);
                }
                if (rm3VarI != null) {
                    synchronized (this.b) {
                        this.j = rm3VarI;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || um3Var.d) {
                        um3Var.g();
                    } else {
                        this.d.addLast(um3Var);
                    }
                    tm3Var.e();
                    tm3[] tm3VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    tm3VarArr[i2] = tm3Var;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    @Override // defpackage.pm3
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final um3 d() {
        synchronized (this.b) {
            try {
                rm3 rm3Var = this.j;
                if (rm3Var != null) {
                    throw rm3Var;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (um3) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pm3
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void f(tm3 tm3Var) {
        synchronized (this.b) {
            try {
                rm3 rm3Var = this.j;
                if (rm3Var != null) {
                    throw rm3Var;
                }
                pa7.A(tm3Var == this.i);
                this.c.addLast(tm3Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(um3 um3Var) {
        synchronized (this.b) {
            um3Var.e();
            um3[] um3VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            um3VarArr[i] = um3Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }
}
