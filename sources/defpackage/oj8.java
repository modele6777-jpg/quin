package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oj8 extends i09 implements mb6, pn4, wwc, al9 {
    public a26 E0;
    public efa L0;
    public View M0;
    public sw3 N0;
    public dfa O0;
    public mx3 Q0;
    public e77 S0;
    public r41 T0;
    public a26 Z;
    public float F0 = Float.NaN;
    public boolean G0 = true;
    public long H0 = 9205357640488583168L;
    public float I0 = Float.NaN;
    public float J0 = Float.NaN;
    public boolean K0 = true;
    public final vz9 P0 = new vz9(null, qk6.L0);
    public long R0 = 9205357640488583168L;

    public oj8(a26 a26Var, a26 a26Var2, efa efaVar) {
        this.Z = a26Var;
        this.E0 = a26Var2;
        this.L0 = efaVar;
    }

    @Override // defpackage.al9
    public final void A0() {
        if9.C(this, new mj8(this, 0));
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        hxcVar.c(pj8.a, new mj8(this, 1));
    }

    @Override // defpackage.i09
    public final void d1() {
        A0();
        this.T0 = urg.a(0, null, null, 7);
        ynb.V(Z0(), null, dw2.d, new nj8(this, null), 1);
    }

    @Override // defpackage.i09
    public final void e1() {
        dfa dfaVar = this.O0;
        if (dfaVar != null) {
            ((ffa) dfaVar).b();
        }
        this.O0 = null;
    }

    @Override // defpackage.mb6
    public final void l0(yf9 yf9Var) {
        this.P0.setValue(yf9Var);
    }

    public final long l1() {
        mx3 mx3VarB = this.Q0;
        if (mx3VarB == null) {
            mx3VarB = zrd.b(new mj8(this, 2));
            this.Q0 = mx3VarB;
        }
        return ((hl9) mx3VarB.getValue()).a;
    }

    public final void m1() {
        dfa dfaVar = this.O0;
        if (dfaVar != null) {
            ((ffa) dfaVar).b();
        }
        View viewX0 = this.M0;
        if (viewX0 == null) {
            viewX0 = kj0.x0(this);
        }
        View view = viewX0;
        this.M0 = view;
        sw3 sw3Var = this.N0;
        if (sw3Var == null) {
            sw3Var = vd0.s0(this).O0;
        }
        sw3 sw3Var2 = sw3Var;
        this.N0 = sw3Var2;
        this.O0 = this.L0.c(view, this.G0, this.H0, this.I0, this.J0, this.K0, sw3Var2, this.F0);
        o1();
    }

    public final void n1() {
        sw3 sw3Var = this.N0;
        if (sw3Var == null) {
            sw3Var = vd0.s0(this).O0;
            this.N0 = sw3Var;
        }
        long j = ((hl9) this.Z.d(sw3Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & l1()) == 9205357640488583168L) {
            this.R0 = 9205357640488583168L;
            dfa dfaVar = this.O0;
            if (dfaVar != null) {
                ((ffa) dfaVar).b();
                return;
            }
            return;
        }
        this.R0 = hl9.g(l1(), j);
        if (this.O0 == null) {
            m1();
        }
        dfa dfaVar2 = this.O0;
        if (dfaVar2 != null) {
            dfaVar2.a(this.R0, 9205357640488583168L, this.F0);
        }
        o1();
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        ((vv7) im2Var).a();
        r41 r41Var = this.T0;
        if (r41Var != null) {
            r41Var.d(wef.a);
        }
    }

    public final void o1() {
        sw3 sw3Var;
        dfa dfaVar = this.O0;
        if (dfaVar == null || (sw3Var = this.N0) == null) {
            return;
        }
        ffa ffaVar = (ffa) dfaVar;
        if (e77.a(ffaVar.c(), this.S0)) {
            return;
        }
        a26 a26Var = this.E0;
        if (a26Var != null) {
            a26Var.d(new bj4(sw3Var.u(db6.Y0(ffaVar.c()))));
        }
        this.S0 = new e77(ffaVar.c());
    }
}
