package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qm8 extends scg {
    public final boolean l;
    public final fye m;
    public final eye n;
    public om8 o;
    public nm8 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public qm8(fu0 fu0Var, boolean z) {
        super(fu0Var);
        this.l = z && fu0Var.h();
        this.m = new fye();
        this.n = new eye();
        gye gyeVarF = fu0Var.f();
        if (gyeVarF == null) {
            this.o = new om8(new pm8(fu0Var.g()), fye.o, om8.e);
        } else {
            this.o = new om8(gyeVarF, null, null);
            this.s = true;
        }
    }

    @Override // defpackage.scg
    public final void A() {
        if (this.l) {
            return;
        }
        this.q = true;
        z();
    }

    @Override // defpackage.fu0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final nm8 a(zp8 zp8Var, ta0 ta0Var, long j) {
        nm8 nm8Var = new nm8(zp8Var, ta0Var, j);
        pa7.J(nm8Var.d == null);
        nm8Var.d = this.k;
        if (!this.r) {
            this.p = nm8Var;
            if (!this.q) {
                this.q = true;
                z();
            }
            return nm8Var;
        }
        Object obj = zp8Var.a;
        if (this.o.d != null && obj.equals(om8.e)) {
            obj = this.o.d;
        }
        nm8Var.n(zp8Var.a(obj));
        return nm8Var;
    }

    public final boolean C(long j) {
        nm8 nm8Var = this.p;
        int iB = this.o.b(nm8Var.a.a);
        if (iB == -1) {
            return false;
        }
        om8 om8Var = this.o;
        eye eyeVar = this.n;
        om8Var.f(iB, eyeVar, false);
        long j2 = eyeVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        nm8Var.g = j;
        return true;
    }

    @Override // defpackage.fu0
    public final void m(up8 up8Var) {
        nm8 nm8Var = (nm8) up8Var;
        if (nm8Var.e != null) {
            fu0 fu0Var = nm8Var.d;
            fu0Var.getClass();
            fu0Var.m(nm8Var.e);
        }
        if (up8Var == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.eg2, defpackage.fu0
    public final void o() {
        this.r = false;
        this.q = false;
        super.o();
    }

    @Override // defpackage.fu0
    public final void r(op8 op8Var) {
        if (this.s) {
            om8 om8Var = this.o;
            gye gyeVar = om8Var.b;
            this.o = new om8(gyeVar instanceof hye ? new hye(((hye) gyeVar).b, op8Var) : new hye(gyeVar, op8Var), om8Var.c, om8Var.d);
        } else {
            this.o = new om8(new pm8(op8Var), fye.o, om8.e);
        }
        this.k.r(op8Var);
    }

    @Override // defpackage.scg
    public final zp8 x(zp8 zp8Var) {
        Object obj = zp8Var.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = om8.e;
        }
        return zp8Var.a(obj);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.scg
    public final void y(gye gyeVar) {
        long j;
        om8 om8Var;
        zp8 zp8VarA;
        om8 om8Var2;
        if (this.r) {
            om8 om8Var3 = this.o;
            this.o = new om8(gyeVar, om8Var3.c, om8Var3.d);
            nm8 nm8Var = this.p;
            if (nm8Var != null) {
                C(nm8Var.g);
            }
        } else {
            if (!gyeVar.p()) {
                fye fyeVar = this.m;
                gyeVar.n(0, fyeVar);
                long j2 = fyeVar.j;
                Object obj = fyeVar.a;
                nm8 nm8Var2 = this.p;
                eye eyeVar = this.n;
                if (nm8Var2 != null) {
                    long j3 = nm8Var2.b;
                    this.o.g(nm8Var2.a.a, eyeVar);
                    long j4 = eyeVar.e + j3;
                    this.o.m(0, fyeVar, 0L);
                    if (j4 != fyeVar.j) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairI = gyeVar.i(fyeVar, eyeVar, 0, j);
                Object obj2 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.s) {
                    om8 om8Var4 = this.o;
                    om8Var = new om8(gyeVar, om8Var4.c, om8Var4.d);
                } else {
                    om8Var = new om8(gyeVar, obj, obj2);
                }
                this.o = om8Var;
                nm8 nm8Var3 = this.p;
                if (nm8Var3 != null && C(jLongValue)) {
                    zp8 zp8Var = nm8Var3.a;
                    Object obj3 = zp8Var.a;
                    if (this.o.d != null && obj3.equals(om8.e)) {
                        obj3 = this.o.d;
                    }
                    zp8VarA = zp8Var.a(obj3);
                }
                this.s = true;
                this.r = true;
                l(this.o);
                if (zp8VarA != null) {
                    nm8 nm8Var4 = this.p;
                    nm8Var4.getClass();
                    nm8Var4.n(zp8VarA);
                }
            }
            if (this.s) {
                om8 om8Var5 = this.o;
                om8Var2 = new om8(gyeVar, om8Var5.c, om8Var5.d);
            } else {
                om8Var2 = new om8(gyeVar, fye.o, om8.e);
            }
            this.o = om8Var2;
        }
        zp8VarA = null;
        this.s = true;
        this.r = true;
        l(this.o);
        if (zp8VarA != null) {
            nm8 nm8Var5 = this.p;
            nm8Var5.getClass();
            nm8Var5.n(zp8VarA);
        }
    }
}
