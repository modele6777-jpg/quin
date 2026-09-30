package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ks6 implements rsd {
    public IOException X;
    public final int a;
    public final ds6 b;
    public final yx0 c;
    public long d;
    public long e;
    public final ArrayDeque f;
    public boolean g;
    public final is6 v;
    public final hs6 w;
    public final js6 x;
    public final js6 y;
    public ay4 z;

    public ks6(int i, ds6 ds6Var, boolean z, boolean z2, si6 si6Var) {
        ds6Var.getClass();
        this.a = i;
        this.b = ds6Var;
        this.c = new yx0(i);
        this.e = ds6Var.G0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f = arrayDeque;
        this.v = new is6(this, ds6Var.F0.a(), z2);
        this.w = new hs6(this, z);
        this.x = new js6(this);
        this.y = new js6(this);
        if (si6Var == null) {
            if (h()) {
                return;
            }
            qc0.p("remotely-initiated streams should have headers");
            throw null;
        }
        if (h()) {
            qc0.p("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(si6Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z;
        boolean zI;
        TimeZone timeZone = keg.a;
        synchronized (this) {
            try {
                is6 is6Var = this.v;
                if (is6Var.b || !is6Var.e) {
                    z = false;
                } else {
                    hs6 hs6Var = this.w;
                    if (hs6Var.a || hs6Var.c) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zI = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(ay4.CANCEL, null);
        } else {
            if (zI) {
                return;
            }
            this.b.l(this.a);
        }
    }

    public final void b() throws IOException {
        hs6 hs6Var = this.w;
        if (hs6Var.c) {
            yg5.m("stream closed");
            return;
        }
        if (hs6Var.a) {
            yg5.m("stream finished");
            return;
        }
        if (g() != null) {
            IOException iOException = this.X;
            if (iOException != null) {
                throw iOException;
            }
            ay4 ay4VarG = g();
            ay4VarG.getClass();
            throw new i3e(ay4VarG);
        }
    }

    public final void c(ay4 ay4Var, IOException iOException) {
        if (d(ay4Var, iOException)) {
            ds6 ds6Var = this.b;
            ds6Var.getClass();
            ds6Var.L0.G(this.a, ay4Var);
        }
    }

    public final boolean d(ay4 ay4Var, IOException iOException) {
        TimeZone timeZone = keg.a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.z = ay4Var;
            this.X = iOException;
            notifyAll();
            if (this.v.b && this.w.a) {
                return false;
            }
            this.b.l(this.a);
            return true;
        }
    }

    @Override // defpackage.rsd
    public final mtd e() {
        return this.v;
    }

    public final void f(ay4 ay4Var) {
        if (d(ay4Var, null)) {
            this.b.G(this.a, ay4Var);
        }
    }

    public final ay4 g() {
        ay4 ay4Var;
        synchronized (this) {
            ay4Var = this.z;
        }
        return ay4Var;
    }

    public final boolean h() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                is6 is6Var = this.v;
                if (is6Var.b || is6Var.e) {
                    hs6 hs6Var = this.w;
                    if ((hs6Var.a || hs6Var.c) && this.g) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(si6 si6Var, boolean z) {
        boolean zI;
        si6Var.getClass();
        TimeZone timeZone = keg.a;
        synchronized (this) {
            try {
                if (this.g && si6Var.c(":status") == null && si6Var.c(":method") == null) {
                    this.v.getClass();
                } else {
                    this.g = true;
                    this.f.add(si6Var);
                }
                if (z) {
                    this.v.b = true;
                }
                zI = i();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zI) {
            return;
        }
        this.b.l(this.a);
    }

    @Override // defpackage.rsd
    public final wkd r0() {
        return this.w;
    }
}
