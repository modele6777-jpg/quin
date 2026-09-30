package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f52 implements up8, tp8 {
    public final up8 a;
    public tp8 b;
    public e52[] c = new e52[0];
    public long d;
    public boolean e;
    public boolean f;
    public long g;
    public long v;
    public long w;
    public h52 x;

    public f52(up8 up8Var, boolean z, long j, long j2, int i) {
        this.a = up8Var;
        this.d = z ? j : -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.v = j;
        this.w = j2;
    }

    @Override // defpackage.tp8
    public final void a(up8 up8Var) {
        if (this.x != null) {
            return;
        }
        tp8 tp8Var = this.b;
        tp8Var.getClass();
        tp8Var.a(this);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    @Override // defpackage.up8
    public final long b(n55[] n55VarArr, boolean[] zArr, occ[] occVarArr, boolean[] zArr2, long j) {
        boolean z;
        boolean z2;
        n55 n55Var;
        this.c = new e52[occVarArr.length];
        occ[] occVarArr2 = new occ[occVarArr.length];
        int i = 0;
        while (true) {
            occ occVar = null;
            if (i >= occVarArr.length) {
                break;
            }
            e52[] e52VarArr = this.c;
            e52 e52Var = (e52) occVarArr[i];
            e52VarArr[i] = e52Var;
            if (e52Var != null) {
                occVar = e52Var.a;
            }
            occVarArr2[i] = occVar;
            i++;
        }
        long jB = this.a.b(n55VarArr, zArr, occVarArr2, zArr2, j);
        long j2 = this.w;
        long jMax = Math.max(jB, j);
        if (j2 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j2);
        }
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= occVarArr.length) {
                break;
            }
            occ occVar2 = occVarArr2[i2];
            e52[] e52VarArr2 = this.c;
            if (occVar2 == null) {
                e52VarArr2[i2] = null;
            } else {
                e52 e52Var2 = e52VarArr2[i2];
                if (e52Var2 == null || e52Var2.a != occVar2) {
                    if (n()) {
                        if (jB < j) {
                            z2 = true;
                        } else if (jB == 0 || (n55Var = n55VarArr[i2]) == null) {
                            z2 = false;
                        } else {
                            rr5 rr5VarH = n55Var.h();
                            z2 = !qv8.a(rr5VarH.p, rr5VarH.l);
                        }
                        z = z2;
                    }
                    e52[] e52VarArr3 = this.c;
                    occ occVar3 = occVarArr2[i2];
                    occVar3.getClass();
                    e52VarArr3[i2] = new e52(this, occVar3, z);
                    z3 |= z;
                }
            }
            occVarArr[i2] = this.c[i2];
            i2++;
        }
        this.d = z3 ? jMax : -9223372036854775807L;
        if (this.f) {
            this.e = true;
        }
        return jMax;
    }

    @Override // defpackage.up8
    public final void c() {
        this.f = true;
        this.a.c();
    }

    @Override // defpackage.eyc
    public final long d() {
        long jD = this.a.d();
        if (jD != Long.MIN_VALUE) {
            long j = this.w;
            if (j == Long.MIN_VALUE || jD < j) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.up8
    public final long e(long j, ysc yscVar) {
        long j2 = this.v;
        if (j == j2) {
            return j2;
        }
        long jI = pqf.i(yscVar.a, 0L, j - j2);
        long j3 = yscVar.b;
        long j4 = this.w;
        long jI2 = pqf.i(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (jI != yscVar.a || jI2 != yscVar.b) {
            yscVar = new ysc(jI, jI2);
        }
        return this.a.e(j, yscVar);
    }

    @Override // defpackage.up8
    public final void f() throws h52 {
        h52 h52Var = this.x;
        if (h52Var != null) {
            throw h52Var;
        }
        this.a.f();
    }

    @Override // defpackage.up8
    public final long g(long j) {
        this.d = -9223372036854775807L;
        for (e52 e52Var : this.c) {
            if (e52Var != null) {
                e52Var.c = false;
            }
        }
        long jG = this.a.g(j);
        long j2 = this.v;
        long j3 = this.w;
        long jMax = Math.max(jG, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.up8
    public final void h(long j) {
        this.a.h(j);
    }

    @Override // defpackage.eyc
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.tp8
    public final void j(eyc eycVar) {
        tp8 tp8Var = this.b;
        tp8Var.getClass();
        tp8Var.j(this);
    }

    @Override // defpackage.up8
    public final long k() {
        if (n()) {
            this.e = true;
            long j = this.d;
            this.d = -9223372036854775807L;
            this.g = j;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j;
        }
        long jK2 = this.a.k();
        if (jK2 != -9223372036854775807L) {
            long j2 = this.v;
            long j3 = this.w;
            long jMax = Math.max(jK2, j2);
            if (j3 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j3);
            }
            if (jMax != this.g) {
                this.g = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.up8
    public final void l(tp8 tp8Var, long j) {
        this.b = tp8Var;
        this.a.l(this, j);
    }

    @Override // defpackage.up8
    public final i1f m() {
        return this.a.m();
    }

    public final boolean n() {
        return (this.d == -9223372036854775807L || this.e) ? false : true;
    }

    @Override // defpackage.eyc
    public final boolean o(da8 da8Var) {
        return this.a.o(da8Var);
    }

    @Override // defpackage.eyc
    public final long p() {
        long jP = this.a.p();
        if (jP != Long.MIN_VALUE) {
            long j = this.w;
            if (j == Long.MIN_VALUE || jP < j) {
                return jP;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.eyc
    public final void r(long j) {
        this.a.r(j);
    }
}
