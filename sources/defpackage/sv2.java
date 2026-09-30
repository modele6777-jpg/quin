package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sv2 extends n1 implements nv2 {
    public static final rv2 b = new rv2(hj6.Z, new cz1(20));

    public sv2() {
        super(hj6.Z);
    }

    @Override // defpackage.n1, defpackage.pv2
    public final nv2 F0(ov2 ov2Var) {
        nv2 nv2Var;
        ov2Var.getClass();
        if (ov2Var instanceof rv2) {
            rv2 rv2Var = (rv2) ov2Var;
            ov2 ov2Var2 = this.a;
            if ((ov2Var2 == rv2Var || rv2Var.b == ov2Var2) && (nv2Var = (nv2) rv2Var.a.d(this)) != null) {
                return nv2Var;
            }
        } else if (hj6.Z == ov2Var) {
            return this;
        }
        return null;
    }

    @Override // defpackage.n1, defpackage.pv2
    public final pv2 U(ov2 ov2Var) {
        ov2Var.getClass();
        if (ov2Var instanceof rv2) {
            rv2 rv2Var = (rv2) ov2Var;
            ov2 ov2Var2 = this.a;
            if ((ov2Var2 != rv2Var && rv2Var.b != ov2Var2) || ((nv2) rv2Var.a.d(this)) == null) {
                return this;
            }
        } else if (hj6.Z != ov2Var) {
            return this;
        }
        return nu4.a;
    }

    public abstract void Z0(pv2 pv2Var, Runnable runnable);

    public void a1(pv2 pv2Var, Runnable runnable) {
        aa4.b(this, pv2Var, runnable);
    }

    public boolean b1(pv2 pv2Var) {
        return !(this instanceof cbf);
    }

    public sv2 c1(int i) {
        abg.p(i);
        return new n58(this, i);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + mh3.F(this);
    }
}
