package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vo5 extends sv3 implements wwc, mb6, ug2, al9, i4f {
    public static final y25 L0 = new y25(3);
    public t69 F0;
    public final a26 G0;
    public rn5 H0;
    public a08 I0;
    public yf9 J0;
    public final oo5 K0;

    public vo5(t69 t69Var, int i, a26 a26Var) {
        this.F0 = t69Var;
        this.G0 = a26Var;
        oo5 oo5Var = new oo5(i, 10, new gl(2, this, vo5.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 14));
        l1(oo5Var);
        this.K0 = oo5Var;
    }

    @Override // defpackage.al9
    public final void A0() {
        mmb mmbVar = new mmb();
        if9.C(this, new jt3(20, mmbVar, this));
        a08 a08Var = (a08) mmbVar.element;
        if (this.K0.q1().b()) {
            a08 a08Var2 = this.I0;
            if (a08Var2 != null) {
                a08Var2.b();
            }
            if (a08Var != null) {
                a08Var.a();
            } else {
                a08Var = null;
            }
            this.I0 = a08Var;
        }
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        boolean zB = this.K0.q1().b();
        wn7[] wn7VarArr = exc.a;
        gxc gxcVar = cxc.l;
        wn7 wn7Var = exc.a[4];
        Boolean boolValueOf = Boolean.valueOf(zB);
        gxcVar.getClass();
        hxcVar.c(gxcVar, boolValueOf);
        hxcVar.c(swc.w, new f6(null, new sk3(0, this, vo5.class, "requestFocus", "requestFocus()Z", 0, 11)));
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.i09
    public final void f1() {
        a08 a08Var = this.I0;
        if (a08Var != null) {
            a08Var.b();
        }
        this.I0 = null;
    }

    @Override // defpackage.mb6
    public final void l0(yf9 yf9Var) {
        this.J0 = yf9Var;
        if (this.K0.q1().b()) {
            boolean z = yf9Var.h1().Y;
            eu4 eu4Var = wo5.Z;
            if (!z) {
                if (this.Y) {
                    n3d.i(this, eu4Var);
                }
            } else {
                yf9 yf9Var2 = this.J0;
                if (yf9Var2 != null && yf9Var2.h1().Y && this.Y) {
                    n3d.i(this, eu4Var);
                }
            }
        }
    }

    public final void o1(t69 t69Var, l77 l77Var) {
        if (!this.Y) {
            ((u69) t69Var).b(l77Var);
        } else {
            dg7 dg7Var = (dg7) ((qn2) Z0()).a.F0(ndb.Y0);
            ynb.V(Z0(), null, null, new to5(t69Var, l77Var, dg7Var != null ? dg7Var.E(new so5(0, t69Var, l77Var)) : null, null), 3);
        }
    }

    public final void p1(t69 t69Var) {
        rn5 rn5Var;
        if (pa7.t(this.F0, t69Var)) {
            return;
        }
        t69 t69Var2 = this.F0;
        if (t69Var2 != null && (rn5Var = this.H0) != null) {
            ((u69) t69Var2).b(new sn5(rn5Var));
        }
        this.H0 = null;
        this.F0 = t69Var;
    }

    @Override // defpackage.i4f
    public final Object q() {
        return L0;
    }

    public vo5(t69 t69Var, loe loeVar, int i) {
        this(t69Var, 1, (i & 4) != 0 ? null : loeVar);
    }
}
