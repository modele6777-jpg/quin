package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yhc extends y4 implements qo7 {
    public final uq3 f1;
    public final gic g1;
    public final qhc h1;
    public final oo5 i1;
    public final pm2 j1;

    public yhc(w31 w31Var, gj5 gj5Var, t69 t69Var, ks9 ks9Var, lu9 lu9Var, zhc zhcVar, boolean z, boolean z2) {
        super(z, t69Var, ks9Var);
        uq3 uq3Var = new uq3(new qh3(new g5b(ohc.c)));
        this.f1 = uq3Var;
        gic gicVar = new gic(zhcVar, lu9Var, gj5Var == null ? uq3Var : gj5Var, ks9Var, z2, this.Y0, this, new rhc(this, 0));
        this.g1 = gicVar;
        qhc qhcVar = new qhc(gicVar, z);
        this.h1 = qhcVar;
        oo5 oo5Var = new oo5(2, 10, null);
        l1(oo5Var);
        this.i1 = oo5Var;
        pm2 pm2Var = new pm2(ks9Var, gicVar, z2, w31Var, new rhc(this, 1));
        l1(pm2Var);
        this.j1 = pm2Var;
        l1(new wc9(qhcVar, this.Y0));
        t31 t31Var = new t31();
        t31Var.Z = pm2Var;
        l1(t31Var);
    }

    public final void G1(w31 w31Var, gj5 gj5Var, t69 t69Var, ks9 ks9Var, lu9 lu9Var, zhc zhcVar, boolean z, boolean z2) {
        boolean z3;
        if (this.H0 != z) {
            this.h1.b = z;
            this.Z0 = null;
            this.a1 = null;
            scc.k(this);
        }
        if (gj5Var == null) {
            gj5Var = this.f1;
        }
        gic gicVar = this.g1;
        boolean z4 = true;
        if (pa7.t(gicVar.a, zhcVar)) {
            z3 = false;
        } else {
            gicVar.a = zhcVar;
            z3 = true;
        }
        gicVar.b = lu9Var;
        ks9 ks9Var2 = gicVar.d;
        if (ks9Var2 != ks9Var) {
            gicVar.d = ks9Var;
            ks9Var2 = ks9Var;
            z3 = true;
        }
        if (gicVar.e != z2) {
            gicVar.e = z2;
        } else {
            z4 = z3;
        }
        gicVar.c = gj5Var;
        gicVar.f = this.Y0;
        pm2 pm2Var = this.j1;
        pm2Var.Z = ks9Var;
        pm2Var.F0 = z2;
        pm2Var.G0 = w31Var;
        z4 z4Var = kj0.b;
        ks9 ks9Var3 = ks9.a;
        if (ks9Var2 != ks9Var3) {
            ks9Var3 = ks9.b;
        }
        F1(z4Var, z, t69Var, ks9Var3, z4);
    }

    @Override // defpackage.qo7
    public final boolean M(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        if (!this.H0 || ((!ko7.a(nk8.q(keyEvent), ko7.D) && !ko7.a(k99.g(keyEvent.getKeyCode()), ko7.C)) || nk8.r(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        boolean z = this.g1.d == ks9.a;
        pm2 pm2Var = this.j1;
        if (z) {
            int iM1 = (int) (pm2Var.m1() & 4294967295L);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(ko7.a(k99.g(keyEvent.getKeyCode()), ko7.C) ? iM1 : -iM1)));
        } else {
            int iM2 = (int) (pm2Var.m1() >> 32);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(ko7.a(k99.g(keyEvent.getKeyCode()), ko7.C) ? iM2 : -iM2)) << 32);
        }
        ynb.V(Z0(), null, null, new vhc(this, jFloatToRawIntBits, null), 3);
        return true;
    }

    @Override // defpackage.qo7
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.yk4
    public final Object p1(wk4 wk4Var, xk4 xk4Var) {
        gic gicVar = this.g1;
        Object objG = gicVar.g(s89.b, new shc(null, wk4Var, gicVar), xk4Var);
        return objG == bw2.a ? objG : wef.a;
    }

    @Override // defpackage.yk4
    public final void v1(wj4 wj4Var) {
        if (this.Y) {
            ynb.V(this.Y0.c(), null, null, new thc(wj4Var, this, null), 3);
        }
    }
}
