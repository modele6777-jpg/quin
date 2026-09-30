package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ob9 {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public Object e;
    public Object f;

    public static void b(hu0 hu0Var) {
        int i = hu0Var.v;
        if (i == 2) {
            pa7.J(i == 2);
            hu0Var.v = 1;
            hu0Var.v();
        }
    }

    public static boolean k(hu0 hu0Var) {
        return hu0Var.v != 0;
    }

    public static void o(hu0 hu0Var, long j) {
        hu0Var.Y = true;
        if (hu0Var instanceof gue) {
            gue gueVar = (gue) hu0Var;
            pa7.J(gueVar.Y);
            gueVar.a1 = j;
        }
    }

    public void a(hu0 hu0Var, wr3 wr3Var) {
        pa7.J(((hu0) this.e) == hu0Var || ((hu0) this.f) == hu0Var);
        if (k(hu0Var)) {
            if (hu0Var == wr3Var.c) {
                wr3Var.d = null;
                wr3Var.c = null;
                wr3Var.e = true;
            }
            b(hu0Var);
            pa7.J(hu0Var.v == 1);
            hu0Var.c.l();
            hu0Var.v = 0;
            hu0Var.w = null;
            hu0Var.x = null;
            hu0Var.Y = false;
            hu0Var.p();
            hu0Var.F0 = null;
            hu0Var.G0 = -9223372036854775807L;
        }
    }

    public int c() {
        boolean zK = k((hu0) this.e);
        hu0 hu0Var = (hu0) this.f;
        return (zK ? 1 : 0) + ((hu0Var == null || !k(hu0Var)) ? 0 : 1);
    }

    public hu0 d(vp8 vp8Var) {
        occ occVar;
        if (vp8Var == null || (occVar = vp8Var.c[this.a]) == null) {
            return null;
        }
        hu0 hu0Var = (hu0) this.e;
        if (hu0Var.w == occVar) {
            return hu0Var;
        }
        hu0 hu0Var2 = (hu0) this.f;
        if (hu0Var2 == null || hu0Var2.w != occVar) {
            return null;
        }
        return hu0Var2;
    }

    public boolean e(vp8 vp8Var, hu0 hu0Var) {
        int i = this.a;
        if (hu0Var == null) {
            return true;
        }
        occ occVar = vp8Var.c[i];
        occ occVar2 = hu0Var.w;
        if (occVar2 == null) {
            return true;
        }
        if (occVar2 == occVar) {
            if (occVar == null || hu0Var.l()) {
                return true;
            }
            vp8 vp8Var2 = vp8Var.m;
            if (vp8Var.g.f && vp8Var2 != null && vp8Var2.e && ((hu0Var instanceof gue) || (hu0Var instanceof cv8) || hu0Var.X >= vp8Var2.e())) {
                return true;
            }
        }
        for (vp8 vp8Var3 = vp8Var.m; vp8Var3 != null; vp8Var3 = vp8Var3.m) {
            if (Objects.equals(vp8Var3.c[i], hu0Var.w)) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        hu0 hu0Var = (hu0) this.f;
        hu0 hu0Var2 = (hu0) this.e;
        boolean zM = k(hu0Var2) ? hu0Var2.m() : true;
        return (hu0Var == null || hu0Var.v == 0) ? zM : zM & hu0Var.m();
    }

    public boolean g() {
        int i = this.b;
        return i == 2 || i == 4 || i == 3;
    }

    public boolean h(vp8 vp8Var) {
        int i = this.b;
        return ((i == 2 || i == 4) && d(vp8Var) == ((hu0) this.e)) || (this.b == 3 && d(vp8Var) == ((hu0) this.f));
    }

    public boolean i(vp8 vp8Var) {
        return d(vp8Var) != null;
    }

    public boolean j() {
        int i = this.b;
        if (i == 0 || i == 2 || i == 4) {
            return k((hu0) this.e);
        }
        hu0 hu0Var = (hu0) this.f;
        hu0Var.getClass();
        return hu0Var.v != 0;
    }

    public void l(boolean z) {
        if (z) {
            if (this.c) {
                hu0 hu0Var = (hu0) this.e;
                pa7.J(hu0Var.v == 0);
                hu0Var.c.l();
                hu0Var.t();
                this.c = false;
                return;
            }
            return;
        }
        if (this.d) {
            hu0 hu0Var2 = (hu0) this.f;
            hu0Var2.getClass();
            pa7.J(hu0Var2.v == 0);
            hu0Var2.c.l();
            hu0Var2.t();
            this.d = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int m(hu0 hu0Var, vp8 vp8Var, r1f r1fVar, wr3 wr3Var) {
        int i;
        occ[] occVarArr = vp8Var.c;
        hu0 hu0Var2 = (hu0) this.e;
        int i2 = this.a;
        if (hu0Var == null || hu0Var.v == 0 || (hu0Var == hu0Var2 && ((i = this.b) == 2 || i == 4))) {
            return 1;
        }
        if (hu0Var == ((hu0) this.f) && this.b == 3) {
            return 1;
        }
        byte b = hu0Var.w != occVarArr[i2];
        boolean zP = r1fVar.p(i2);
        if (!zP || b != false) {
            if (!hu0Var.Y) {
                n55 n55Var = ((n55[]) r1fVar.c)[i2];
                int length = n55Var != null ? n55Var.length() : 0;
                rr5[] rr5VarArr = new rr5[length];
                for (int i3 = 0; i3 < length; i3++) {
                    n55Var.getClass();
                    rr5VarArr[i3] = n55Var.d(i3);
                }
                occ occVar = occVarArr[i2];
                occVar.getClass();
                hu0Var.A(rr5VarArr, occVar, vp8Var.e(), vp8Var.p, vp8Var.g.a);
                return 3;
            }
            if (!hu0Var.m()) {
                return 0;
            }
            a(hu0Var, wr3Var);
            if (!zP || g()) {
                l(hu0Var == hu0Var2);
                return 1;
            }
        }
        return 1;
    }

    public void n() {
        if (!k((hu0) this.e)) {
            l(true);
        }
        hu0 hu0Var = (hu0) this.f;
        if (hu0Var == null || hu0Var.v != 0) {
            return;
        }
        l(false);
    }

    public void p() {
        int i;
        hu0 hu0Var = (hu0) this.e;
        int i2 = hu0Var.v;
        if (i2 == 1 && this.b != 4) {
            pa7.J(i2 == 1);
            hu0Var.v = 2;
            hu0Var.u();
            return;
        }
        hu0 hu0Var2 = (hu0) this.f;
        if (hu0Var2 == null || (i = hu0Var2.v) != 1 || this.b == 3) {
            return;
        }
        pa7.J(i == 1);
        hu0Var2.v = 2;
        hu0Var2.u();
    }
}
