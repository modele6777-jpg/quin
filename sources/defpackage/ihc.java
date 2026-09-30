package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ihc extends sv3 implements ug2, al9 {
    public zhc F0;
    public ks9 G0;
    public boolean H0;
    public gj5 I0;
    public t69 J0;
    public w31 K0;
    public boolean L0;
    public lu9 M0;
    public yhc N0;
    public rv3 O0;
    public ur P0;
    public tr Q0;
    public boolean R0;

    @Override // defpackage.al9
    public final void A0() {
        ur urVar = (ur) eb3.H(this, mu9.a);
        if (pa7.t(urVar, this.P0)) {
            return;
        }
        this.P0 = urVar;
        this.Q0 = null;
        rv3 rv3Var = this.O0;
        if (rv3Var != null) {
            m1(rv3Var);
        }
        this.O0 = null;
        o1();
        yhc yhcVar = this.N0;
        if (yhcVar != null) {
            zhc zhcVar = this.F0;
            ks9 ks9Var = this.G0;
            lu9 lu9Var = this.L0 ? this.Q0 : this.M0;
            yhcVar.G1(this.K0, this.I0, this.J0, ks9Var, lu9Var, zhcVar, this.H0, this.R0);
        }
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.rv3
    public final void b0() {
        boolean zP1 = p1();
        if (this.R0 != zP1) {
            this.R0 = zP1;
            zhc zhcVar = this.F0;
            ks9 ks9Var = this.G0;
            boolean z = this.L0;
            lu9 lu9Var = z ? this.Q0 : this.M0;
            q1(this.K0, this.I0, this.J0, ks9Var, lu9Var, zhcVar, z, this.H0);
        }
    }

    @Override // defpackage.i09
    public final void d1() {
        this.R0 = p1();
        o1();
        if (this.N0 == null) {
            zhc zhcVar = this.F0;
            lu9 lu9Var = this.L0 ? this.Q0 : this.M0;
            yhc yhcVar = new yhc(this.K0, this.I0, this.J0, this.G0, lu9Var, zhcVar, this.H0, this.R0);
            l1(yhcVar);
            this.N0 = yhcVar;
        }
    }

    @Override // defpackage.i09
    public final void e1() {
        rv3 rv3Var = this.O0;
        if (rv3Var != null) {
            m1(rv3Var);
        }
    }

    public final void o1() {
        rv3 rv3Var = this.O0;
        if (rv3Var != null) {
            if (((i09) rv3Var).a.Y) {
                return;
            }
            l1(rv3Var);
            return;
        }
        if (this.L0) {
            if9.C(this, new hla(17, this));
        }
        lu9 lu9Var = this.L0 ? this.Q0 : this.M0;
        if (lu9Var != null) {
            rv3 rv3VarC = lu9Var.c();
            if (((i09) rv3VarC).a.Y) {
                return;
            }
            l1(rv3VarC);
            this.O0 = rv3VarC;
        }
    }

    public final boolean p1() {
        return (this.Y ? vd0.s0(this).P0 : cv7.a) != cv7.b || this.G0 == ks9.a;
    }

    public final void q1(w31 w31Var, gj5 gj5Var, t69 t69Var, ks9 ks9Var, lu9 lu9Var, zhc zhcVar, boolean z, boolean z2) {
        boolean z3;
        this.F0 = zhcVar;
        this.G0 = ks9Var;
        boolean z4 = true;
        if (this.L0 != z) {
            this.L0 = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (pa7.t(this.M0, lu9Var)) {
            z4 = false;
        } else {
            this.M0 = lu9Var;
        }
        if (z3 || (z4 && !z)) {
            rv3 rv3Var = this.O0;
            if (rv3Var != null) {
                m1(rv3Var);
            }
            this.O0 = null;
            o1();
        }
        this.H0 = z2;
        this.I0 = gj5Var;
        this.J0 = t69Var;
        this.K0 = w31Var;
        boolean zP1 = p1();
        this.R0 = zP1;
        yhc yhcVar = this.N0;
        if (yhcVar != null) {
            yhcVar.G1(w31Var, gj5Var, t69Var, ks9Var, this.L0 ? this.Q0 : this.M0, zhcVar, z2, zP1);
        }
    }
}
