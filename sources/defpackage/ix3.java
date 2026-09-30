package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ix3 extends z47 implements kv7 {
    public g7g F0;
    public s8f G0;
    public g7g H0;

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        int iA;
        s8f s8fVar = this.G0;
        g7g g7gVar = this.H0;
        switch (s8fVar.a) {
            case 15:
                iA = g7gVar.a(zn8Var);
                break;
            default:
                iA = g7gVar.c(zn8Var);
                break;
        }
        int i = iA;
        qu4 qu4Var = qu4.a;
        if (i == 0) {
            return zn8Var.n0(0, 0, qu4Var, new to3(3));
        }
        cea ceaVarV = tn8Var.v(kl2.a(j, 0, 0, i, i, 3));
        return zn8Var.n0(ceaVarV.a, i, qu4Var, new l1(ceaVarV, 5));
    }

    @Override // defpackage.z47
    public final void m1() {
        this.H0 = new w25(this.F0, this.Z);
        super.m1();
        rs0.F(this);
    }

    @Override // defpackage.z47
    public final g7g l1(g7g g7gVar) {
        return g7gVar;
    }
}
