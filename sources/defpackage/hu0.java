package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hu0 implements vha {
    public zp8 F0;
    public au3 H0;
    public boolean Y;
    public boolean Z;
    public final int b;
    public frb d;
    public int e;
    public uha f;
    public ece g;
    public int v;
    public occ w;
    public rr5[] x;
    public long y;
    public long z;
    public final Object a = new Object();
    public final fz3 c = new fz3(7, false);
    public long X = Long.MIN_VALUE;
    public gye E0 = gye.a;
    public long G0 = -9223372036854775807L;

    public hu0(int i) {
        this.b = i;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS | i4;
    }

    public static boolean n(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public final void A(rr5[] rr5VarArr, occ occVar, long j, long j2, zp8 zp8Var) {
        pa7.J(!this.Y);
        this.w = occVar;
        this.F0 = zp8Var;
        G();
        if (this.X == Long.MIN_VALUE) {
            this.X = j;
        }
        this.x = rr5VarArr;
        this.y = j2;
        w(rr5VarArr, j, j2, zp8Var);
    }

    public final void B(long j, boolean z, boolean z2) {
        this.Y = false;
        this.z = j;
        this.X = j;
        if (!z2) {
            occ occVar = this.w;
            occVar.getClass();
            z2 = occVar.e(j - this.y) != 0;
        }
        r(j, z, z2);
    }

    public abstract int D(rr5 rr5Var);

    public int E() {
        return 0;
    }

    public boolean F(long j) {
        return false;
    }

    public final void G() {
        zp8 zp8Var;
        if (this.E0.p() || (zp8Var = this.F0) == null) {
            this.G0 = -9223372036854775807L;
            return;
        }
        int iB = this.E0.b(zp8Var.a);
        if (iB == -1) {
            this.G0 = -9223372036854775807L;
            return;
        }
        this.G0 = this.E0.f(iB, new eye(), false).d;
        int i = zp8Var.b;
        if (i != -1) {
            this.G0 = qf.c.a(i).e[zp8Var.c];
            return;
        }
        int i2 = zp8Var.e;
        if (i2 != -1) {
            qf.c.a(i2).getClass();
            this.G0 = 0L;
        }
    }

    public final g45 g(Exception exc, rr5 rr5Var, boolean z, int i) {
        int iD;
        if (rr5Var == null || this.Z) {
            iD = 4;
        } else {
            this.Z = true;
            try {
                iD = D(rr5Var) & 7;
                this.Z = false;
            } catch (g45 unused) {
                this.Z = false;
                iD = 4;
            } catch (Throwable th) {
                this.Z = false;
                throw th;
            }
        }
        return new g45(1, exc, i, k(), this.e, rr5Var, rr5Var == null ? 4 : iD, this.F0, z);
    }

    public long i(long j, long j2) {
        if (this.v == 1) {
            return (o() || m()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public no8 j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.X == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean o();

    public abstract void p();

    public abstract void r(long j, boolean z, boolean z2);

    public final int y(fz3 fz3Var, tm3 tm3Var, int i) {
        boolean z = (i & 1) != 0;
        occ occVar = this.w;
        occVar.getClass();
        int iC = occVar.c(fz3Var, tm3Var, i);
        if (iC == -4) {
            if (tm3Var.d(4)) {
                if (!z) {
                    this.X = Long.MIN_VALUE;
                }
                return this.Y ? -4 : -3;
            }
            long j = tm3Var.g + this.y;
            tm3Var.g = j;
            if (!z) {
                this.X = Math.max(this.X, j);
                return iC;
            }
        } else if (iC == -5) {
            rr5 rr5Var = (rr5) fz3Var.c;
            rr5Var.getClass();
            long j2 = rr5Var.u;
            if (j2 != Long.MAX_VALUE) {
                qr5 qr5VarA = rr5Var.a();
                qr5VarA.t = j2 + this.y;
                fz3Var.c = new rr5(qr5VarA);
            }
        }
        return iC;
    }

    public abstract void z(long j, long j2);

    public void h() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void C(float f, float f2) {
    }

    @Override // defpackage.vha
    public void d(int i, Object obj) {
    }

    public void q(boolean z, boolean z2) {
    }

    public void w(rr5[] rr5VarArr, long j, long j2, zp8 zp8Var) {
    }
}
