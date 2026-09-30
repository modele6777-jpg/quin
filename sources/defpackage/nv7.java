package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nv7 extends yf9 {
    public static final rt x1;
    public kv7 t1;
    public kl2 u1;
    public lv7 v1;
    public hc0 w1;

    static {
        rt rtVarH = urg.h();
        rtVarH.f(y72.g);
        rtVarH.m(1.0f);
        rtVarH.n(1);
        x1 = rtVarH;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nv7(LayoutNode layoutNode, kv7 kv7Var) {
        super(layoutNode);
        this.t1 = kv7Var;
        this.v1 = layoutNode.w != null ? new lv7(this) : null;
        this.w1 = (((i09) kv7Var).a.c & 512) != 0 ? new hc0(this, (tbd) kv7Var) : null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    public final void K1() {
        boolean z;
        if (this.Y) {
            return;
        }
        t1();
        yf9 yf9Var = this.M0;
        yf9Var.getClass();
        hc0 hc0Var = this.w1;
        if (hc0Var != null) {
            this.v1.getClass();
            if (hc0Var.c) {
                z = false;
            } else {
                long j = this.c;
                lv7 lv7Var = this.v1;
                if (e77.a(j, lv7Var != null ? new e77(lv7Var.T0()) : null)) {
                    long j2 = yf9Var.c;
                    ng8 ng8VarF1 = yf9Var.f1();
                    if (e77.a(j2, ng8VarF1 != null ? new e77(ng8VarF1.T0()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            yf9Var.K0 = z;
        }
        boolean z2 = yf9Var.Z;
        yf9Var.Z = this.Z;
        B0().b();
        yf9Var.Z = z2;
        yf9Var.K0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L1(kv7 kv7Var) {
        if (!kv7Var.equals(this.t1)) {
            if ((((i09) kv7Var).a.c & 512) != 0) {
                tbd tbdVar = (tbd) kv7Var;
                hc0 hc0Var = this.w1;
                if (hc0Var != null) {
                    hc0Var.b = tbdVar;
                } else {
                    hc0Var = new hc0(this, tbdVar);
                }
                this.w1 = hc0Var;
            } else {
                this.w1 = null;
            }
        }
        this.t1 = kv7Var;
    }

    @Override // defpackage.tn8
    public final int V(int i) {
        hc0 hc0Var = this.w1;
        if (hc0Var == null) {
            kv7 kv7Var = this.t1;
            yf9 yf9Var = this.M0;
            yf9Var.getClass();
            return kv7Var.u0(this, yf9Var, i);
        }
        tbd tbdVar = hc0Var.b;
        yf9 yf9Var2 = this.M0;
        yf9Var2.getClass();
        yf9 yf9Var3 = tbdVar.a.v;
        yf9Var3.getClass();
        ng8 ng8VarF1 = yf9Var3.f1();
        ng8VarF1.getClass();
        if (!ng8VarF1.u0()) {
            return yf9Var2.V(i);
        }
        return tbdVar.l1(new ec0(hc0Var, hc0Var.getLayoutDirection()), new gr3(yf9Var2, bg9.a, cg9.b, 2), ll2.b(0, i, 0, 0, 13)).c();
    }

    @Override // defpackage.tn8
    public final int b(int i) {
        hc0 hc0Var = this.w1;
        if (hc0Var == null) {
            kv7 kv7Var = this.t1;
            yf9 yf9Var = this.M0;
            yf9Var.getClass();
            return kv7Var.i0(this, yf9Var, i);
        }
        tbd tbdVar = hc0Var.b;
        yf9 yf9Var2 = this.M0;
        yf9Var2.getClass();
        yf9 yf9Var3 = tbdVar.a.v;
        yf9Var3.getClass();
        ng8 ng8VarF1 = yf9Var3.f1();
        ng8VarF1.getClass();
        if (!ng8VarF1.u0()) {
            return yf9Var2.b(i);
        }
        return tbdVar.l1(new ec0(hc0Var, hc0Var.getLayoutDirection()), new gr3(yf9Var2, bg9.b, cg9.b, 2), ll2.b(0, i, 0, 0, 13)).c();
    }

    @Override // defpackage.cea
    public final void b0(long j, float f, a26 a26Var) {
        if (this.K0) {
            ng8 ng8VarF1 = f1();
            ng8VarF1.getClass();
            y1(ng8VarF1.K0, f, a26Var, null);
        } else {
            y1(j, f, a26Var, null);
        }
        K1();
    }

    @Override // defpackage.yf9
    public final void c1() {
        if (this.v1 == null) {
            this.v1 = new lv7(this);
        }
    }

    @Override // defpackage.yf9, defpackage.cea
    public final void e0(long j, float f, ke6 ke6Var) {
        nv7 nv7Var;
        if (this.K0) {
            ng8 ng8VarF1 = f1();
            ng8VarF1.getClass();
            nv7Var = this;
            nv7Var.y1(ng8VarF1.K0, f, null, ke6Var);
        } else {
            nv7Var = this;
            nv7Var.y1(j, f, null, ke6Var);
        }
        nv7Var.K1();
    }

    @Override // defpackage.yf9
    public final ng8 f1() {
        return this.v1;
    }

    @Override // defpackage.yf9
    public final i09 h1() {
        return ((i09) this.t1).a;
    }

    @Override // defpackage.tn8
    public final int n(int i) {
        hc0 hc0Var = this.w1;
        if (hc0Var == null) {
            kv7 kv7Var = this.t1;
            yf9 yf9Var = this.M0;
            yf9Var.getClass();
            return kv7Var.E0(this, yf9Var, i);
        }
        tbd tbdVar = hc0Var.b;
        yf9 yf9Var2 = this.M0;
        yf9Var2.getClass();
        yf9 yf9Var3 = tbdVar.a.v;
        yf9Var3.getClass();
        ng8 ng8VarF1 = yf9Var3.f1();
        ng8VarF1.getClass();
        if (!ng8VarF1.u0()) {
            return yf9Var2.n(i);
        }
        return tbdVar.l1(new ec0(hc0Var, hc0Var.getLayoutDirection()), new gr3(yf9Var2, bg9.a, cg9.a, 2), ll2.b(0, 0, 0, i, 7)).d();
    }

    @Override // defpackage.lg8
    public final int o0(zi ziVar) {
        lv7 lv7Var = this.v1;
        if (lv7Var == null) {
            return kj0.X(this, ziVar);
        }
        e79 e79Var = lv7Var.O0;
        int iD = e79Var.d(ziVar);
        if (iD >= 0) {
            return e79Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.tn8
    public final int q(int i) {
        hc0 hc0Var = this.w1;
        if (hc0Var == null) {
            kv7 kv7Var = this.t1;
            yf9 yf9Var = this.M0;
            yf9Var.getClass();
            return kv7Var.h(this, yf9Var, i);
        }
        tbd tbdVar = hc0Var.b;
        yf9 yf9Var2 = this.M0;
        yf9Var2.getClass();
        yf9 yf9Var3 = tbdVar.a.v;
        yf9Var3.getClass();
        ng8 ng8VarF1 = yf9Var3.f1();
        ng8VarF1.getClass();
        if (!ng8VarF1.u0()) {
            return yf9Var2.q(i);
        }
        return tbdVar.l1(new ec0(hc0Var, hc0Var.getLayoutDirection()), new gr3(yf9Var2, bg9.b, cg9.a, 2), ll2.b(0, 0, 0, i, 7)).d();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    @Override // defpackage.tn8
    public final cea v(long j) {
        yn8 yn8VarD;
        kl2 kl2Var;
        boolean z;
        if (this.L0) {
            kl2 kl2Var2 = this.u1;
            if (kl2Var2 == null) {
                qc0.j("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            j = kl2Var2.a;
        }
        i0(j);
        hc0 hc0Var = this.w1;
        if (hc0Var != null) {
            tbd tbdVar = hc0Var.b;
            lv7 lv7Var = hc0Var.a.v1;
            lv7Var.getClass();
            yn8 yn8VarB0 = lv7Var.B0();
            yn8VarB0.d();
            yn8VarB0.c();
            boolean z2 = (tbdVar.H0.k() && tbdVar.H0.f().a() && tbdVar.H0.f().b.e()) || (kl2Var = this.u1) == null || j != kl2Var.a;
            hc0Var.c = z2;
            if (!z2) {
                yf9 yf9Var = this.M0;
                yf9Var.getClass();
                yf9Var.L0 = true;
            }
            yf9 yf9Var2 = this.M0;
            yf9Var2.getClass();
            yn8VarD = tbdVar.l1(hc0Var, yf9Var2, j);
            yf9 yf9Var3 = this.M0;
            yf9Var3.getClass();
            yf9Var3.L0 = false;
            int iD = yn8VarD.d();
            lv7 lv7Var2 = this.v1;
            lv7Var2.getClass();
            if (iD == lv7Var2.a) {
                int iC = yn8VarD.c();
                lv7 lv7Var3 = this.v1;
                lv7Var3.getClass();
                z = iC == lv7Var3.b;
            }
            if (!hc0Var.c) {
                yf9 yf9Var4 = this.M0;
                yf9Var4.getClass();
                long j2 = yf9Var4.c;
                yf9 yf9Var5 = this.M0;
                yf9Var5.getClass();
                ng8 ng8VarF1 = yf9Var5.f1();
                if (e77.a(j2, ng8VarF1 != null ? new e77(ng8VarF1.T0()) : null) && !z) {
                    yn8VarD = new mv7(yn8VarD, this);
                }
            }
        } else {
            kv7 kv7Var = this.t1;
            yf9 yf9Var6 = this.M0;
            yf9Var6.getClass();
            yn8VarD = kv7Var.d(this, yf9Var6, j);
        }
        B1(yn8VarD);
        s1();
        return this;
    }

    @Override // defpackage.yf9
    public final void x1(vl1 vl1Var, ke6 ke6Var) {
        yf9 yf9Var;
        yf9 yf9Var2 = this.M0;
        yf9Var2.getClass();
        yf9Var2.a1(vl1Var, ke6Var);
        if (!wv7.a(this.J0).getShowLayoutBounds() || (yf9Var = this.M0) == null) {
            return;
        }
        if (e77.b(this.c, yf9Var.c) && w67.b(yf9Var.W0, 0L)) {
            return;
        }
        long j = this.c;
        vl1Var.s(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, x1);
    }
}
