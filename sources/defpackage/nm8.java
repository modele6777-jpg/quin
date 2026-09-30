package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nm8 implements up8, tp8 {
    public final zp8 a;
    public final long b;
    public final ta0 c;
    public fu0 d;
    public up8 e;
    public tp8 f;
    public long g = -9223372036854775807L;
    public boolean v;

    public nm8(zp8 zp8Var, ta0 ta0Var, long j) {
        this.a = zp8Var;
        this.c = ta0Var;
        this.b = j;
    }

    @Override // defpackage.tp8
    public final void a(up8 up8Var) {
        tp8 tp8Var = this.f;
        String str = pqf.a;
        tp8Var.a(this);
    }

    @Override // defpackage.up8
    public final long b(n55[] n55VarArr, boolean[] zArr, occ[] occVarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.g = -9223372036854775807L;
        up8 up8Var = this.e;
        String str = pqf.a;
        return up8Var.b(n55VarArr, zArr, occVarArr, zArr2, j);
    }

    @Override // defpackage.up8
    public final void c() {
        this.v = true;
        up8 up8Var = this.e;
        if (up8Var != null) {
            up8Var.c();
        }
    }

    @Override // defpackage.eyc
    public final long d() {
        up8 up8Var = this.e;
        String str = pqf.a;
        return up8Var.d();
    }

    @Override // defpackage.up8
    public final long e(long j, ysc yscVar) {
        up8 up8Var = this.e;
        String str = pqf.a;
        return up8Var.e(j, yscVar);
    }

    @Override // defpackage.up8
    public final void f() {
        up8 up8Var = this.e;
        if (up8Var != null) {
            up8Var.f();
            return;
        }
        fu0 fu0Var = this.d;
        if (fu0Var != null) {
            fu0Var.i();
        }
    }

    @Override // defpackage.up8
    public final long g(long j) {
        up8 up8Var = this.e;
        String str = pqf.a;
        return up8Var.g(j);
    }

    @Override // defpackage.up8
    public final void h(long j) {
        up8 up8Var = this.e;
        String str = pqf.a;
        up8Var.h(j);
    }

    @Override // defpackage.eyc
    public final boolean i() {
        up8 up8Var = this.e;
        return up8Var != null && up8Var.i();
    }

    @Override // defpackage.tp8
    public final void j(eyc eycVar) {
        tp8 tp8Var = this.f;
        String str = pqf.a;
        tp8Var.j(this);
    }

    @Override // defpackage.up8
    public final long k() {
        up8 up8Var = this.e;
        String str = pqf.a;
        return up8Var.k();
    }

    @Override // defpackage.up8
    public final void l(tp8 tp8Var, long j) {
        this.f = tp8Var;
        up8 up8Var = this.e;
        if (up8Var != null) {
            long j2 = this.g;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            up8Var.l(this, j2);
        }
    }

    @Override // defpackage.up8
    public final i1f m() {
        up8 up8Var = this.e;
        String str = pqf.a;
        return up8Var.m();
    }

    public final void n(zp8 zp8Var) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        fu0 fu0Var = this.d;
        fu0Var.getClass();
        up8 up8VarA = fu0Var.a(zp8Var, this.c, j);
        this.e = up8VarA;
        if (this.v) {
            up8VarA.c();
        }
        if (this.f != null) {
            this.e.l(this, j);
        }
    }

    @Override // defpackage.eyc
    public final boolean o(da8 da8Var) {
        up8 up8Var = this.e;
        return up8Var != null && up8Var.o(da8Var);
    }

    @Override // defpackage.eyc
    public final long p() {
        up8 up8Var = this.e;
        String str = pqf.a;
        return up8Var.p();
    }

    @Override // defpackage.eyc
    public final void r(long j) {
        up8 up8Var = this.e;
        String str = pqf.a;
        up8Var.r(j);
    }
}
