package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lj4 extends i09 implements i4f, mj4, zu7 {
    public lj4 E0;
    public mj4 F0;
    public long G0;
    public final a26 Z;

    public lj4(ks2 ks2Var, int i) {
        this.Z = (i & 2) != 0 ? null : ks2Var;
        this.G0 = 0L;
    }

    @Override // defpackage.mj4
    public final void B0(fj4 fj4Var) {
        mj4 mj4Var = this.F0;
        if (mj4Var != null) {
            mj4Var.B0(fj4Var);
            return;
        }
        lj4 lj4Var = this.E0;
        if (lj4Var != null) {
            lj4Var.B0(fj4Var);
        }
    }

    @Override // defpackage.mj4
    public final void C0(fj4 fj4Var) {
        i4f i4fVar;
        lj4 lj4Var;
        lj4 lj4Var2 = this.E0;
        int i = 1;
        if (lj4Var2 == null || !lmg.X(lj4Var2, rxg.G(fj4Var))) {
            if (this.a.Y) {
                mmb mmbVar = new mmb();
                n3d.v(this, new mz0(mmbVar, this, fj4Var, i));
                i4fVar = (i4f) mmbVar.element;
            } else {
                i4fVar = null;
            }
            lj4Var = (lj4) i4fVar;
        } else {
            lj4Var = lj4Var2;
        }
        if (lj4Var != null && lj4Var2 == null) {
            lj4Var.v(fj4Var);
            lj4Var.C0(fj4Var);
            mj4 mj4Var = this.F0;
            if (mj4Var != null) {
                mj4Var.q0(fj4Var);
            }
        } else if (lj4Var == null && lj4Var2 != null) {
            mj4 mj4Var2 = this.F0;
            if (mj4Var2 != null) {
                mj4Var2.v(fj4Var);
                mj4Var2.C0(fj4Var);
            }
            lj4Var2.q0(fj4Var);
        } else if (!pa7.t(lj4Var, lj4Var2)) {
            if (lj4Var != null) {
                lj4Var.v(fj4Var);
                lj4Var.C0(fj4Var);
            }
            if (lj4Var2 != null) {
                lj4Var2.q0(fj4Var);
            }
        } else if (lj4Var != null) {
            lj4Var.C0(fj4Var);
        } else {
            mj4 mj4Var3 = this.F0;
            if (mj4Var3 != null) {
                mj4Var3.C0(fj4Var);
            }
        }
        this.E0 = lj4Var;
    }

    @Override // defpackage.mj4
    public final void J(fj4 fj4Var) {
        ot1 ot1Var = new ot1(21, fj4Var);
        if (ot1Var.d(this) != h4f.a) {
            return;
        }
        n3d.v(this, ot1Var);
    }

    @Override // defpackage.mj4
    public final boolean U0(fj4 fj4Var) {
        lj4 lj4Var = this.E0;
        if (lj4Var != null) {
            return lj4Var.U0(fj4Var);
        }
        mj4 mj4Var = this.F0;
        if (mj4Var != null) {
            return mj4Var.U0(fj4Var);
        }
        return false;
    }

    @Override // defpackage.zu7, defpackage.co8
    public final void a(long j) {
        this.G0 = j;
    }

    @Override // defpackage.i09
    public final void e1() {
        this.F0 = null;
        this.E0 = null;
    }

    @Override // defpackage.i4f
    public final Object q() {
        return hj6.G0;
    }

    @Override // defpackage.mj4
    public final void q0(fj4 fj4Var) {
        mj4 mj4Var = this.F0;
        if (mj4Var != null) {
            mj4Var.q0(fj4Var);
        }
        lj4 lj4Var = this.E0;
        if (lj4Var != null) {
            lj4Var.q0(fj4Var);
        }
        this.E0 = null;
    }

    @Override // defpackage.mj4
    public final void v(fj4 fj4Var) {
        mj4 mj4Var = this.F0;
        if (mj4Var != null) {
            mj4Var.v(fj4Var);
            return;
        }
        lj4 lj4Var = this.E0;
        if (lj4Var != null) {
            lj4Var.v(fj4Var);
        }
    }
}
