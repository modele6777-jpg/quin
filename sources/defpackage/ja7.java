package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ja7 extends i09 implements kv7 {
    public final /* synthetic */ int Z;

    @Override // defpackage.kv7
    public int E0(lg8 lg8Var, tn8 tn8Var, int i) {
        switch (this.Z) {
            case 0:
                break;
        }
        return tn8Var.n(i);
    }

    public yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        long jL1 = l1(tn8Var, j);
        if (m1()) {
            jL1 = ll2.e(j, jL1);
        }
        cea ceaVarV = tn8Var.v(jL1);
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new l1(ceaVarV, 10));
    }

    @Override // defpackage.kv7
    public int h(lg8 lg8Var, tn8 tn8Var, int i) {
        switch (this.Z) {
            case 0:
                break;
        }
        return tn8Var.q(i);
    }

    public int i0(lg8 lg8Var, tn8 tn8Var, int i) {
        switch (this.Z) {
            case 0:
                break;
        }
        return tn8Var.b(i);
    }

    public abstract long l1(tn8 tn8Var, long j);

    public abstract boolean m1();

    public int u0(lg8 lg8Var, tn8 tn8Var, int i) {
        switch (this.Z) {
            case 0:
                break;
        }
        return tn8Var.V(i);
    }
}
