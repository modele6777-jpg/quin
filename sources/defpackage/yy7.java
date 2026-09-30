package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yy7 extends i09 implements kv7 {
    public static final wy7 G0 = new wy7();
    public ssg E0;
    public ks9 F0;
    public zy7 Z;

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        cea ceaVarV = tn8Var.v(j);
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 11));
    }

    public final boolean l1(uy7 uy7Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.F0 != ks9.a) {
                }
            } else if (i != 1 && i != 2) {
                qc0.p("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (m1(i) ? uy7Var.a > 0 : uy7Var.b < this.Z.a() - 1) {
                return true;
            }
        } else if (this.F0 != ks9.b) {
            if (m1(i)) {
            }
        }
        return false;
    }

    public final boolean m1(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = vd0.s0(this).P0.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            ap.c();
            return false;
        }
        if (i != 4) {
            qc0.p("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = vd0.s0(this).P0.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        ap.c();
        return false;
    }
}
