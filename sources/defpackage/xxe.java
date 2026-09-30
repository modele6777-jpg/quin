package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xxe implements up8, tp8 {
    public final up8 a;
    public final long b;
    public tp8 c;

    public xxe(up8 up8Var, long j) {
        this.a = up8Var;
        this.b = j;
    }

    @Override // defpackage.tp8
    public final void a(up8 up8Var) {
        tp8 tp8Var = this.c;
        tp8Var.getClass();
        tp8Var.a(this);
    }

    @Override // defpackage.up8
    public final long b(n55[] n55VarArr, boolean[] zArr, occ[] occVarArr, boolean[] zArr2, long j) {
        occ[] occVarArr2 = new occ[occVarArr.length];
        int i = 0;
        while (true) {
            occ occVar = null;
            if (i >= occVarArr.length) {
                break;
            }
            wxe wxeVar = (wxe) occVarArr[i];
            if (wxeVar != null) {
                occVar = wxeVar.a;
            }
            occVarArr2[i] = occVar;
            i++;
        }
        up8 up8Var = this.a;
        long j2 = this.b;
        long jB = up8Var.b(n55VarArr, zArr, occVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < occVarArr.length; i2++) {
            occ occVar2 = occVarArr2[i2];
            if (occVar2 == null) {
                occVarArr[i2] = null;
            } else {
                occ occVar3 = occVarArr[i2];
                if (occVar3 == null || ((wxe) occVar3).a != occVar2) {
                    occVarArr[i2] = new wxe(occVar2, j2);
                }
            }
        }
        return jB + j2;
    }

    @Override // defpackage.up8
    public final void c() {
        String str = pqf.a;
        this.a.c();
    }

    @Override // defpackage.eyc
    public final long d() {
        long jD = this.a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.b;
    }

    @Override // defpackage.up8
    public final long e(long j, ysc yscVar) {
        long j2 = this.b;
        return this.a.e(j - j2, yscVar) + j2;
    }

    @Override // defpackage.up8
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.up8
    public final long g(long j) {
        long j2 = this.b;
        return this.a.g(j - j2) + j2;
    }

    @Override // defpackage.up8
    public final void h(long j) {
        this.a.h(j - this.b);
    }

    @Override // defpackage.eyc
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.tp8
    public final void j(eyc eycVar) {
        tp8 tp8Var = this.c;
        tp8Var.getClass();
        tp8Var.j(this);
    }

    @Override // defpackage.up8
    public final long k() {
        long jK = this.a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.b;
    }

    @Override // defpackage.up8
    public final void l(tp8 tp8Var, long j) {
        this.c = tp8Var;
        this.a.l(this, j - this.b);
    }

    @Override // defpackage.up8
    public final i1f m() {
        return this.a.m();
    }

    @Override // defpackage.eyc
    public final boolean o(da8 da8Var) {
        ca8 ca8Var = new ca8();
        long j = da8Var.a;
        ca8Var.b = da8Var.b;
        ca8Var.c = da8Var.c;
        ca8Var.a = j - this.b;
        return this.a.o(new da8(ca8Var));
    }

    @Override // defpackage.eyc
    public final long p() {
        long jP = this.a.p();
        if (jP == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jP + this.b;
    }

    @Override // defpackage.eyc
    public final void r(long j) {
        this.a.r(j - this.b);
    }
}
