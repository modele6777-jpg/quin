package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ys6 extends at6 {
    public final /* synthetic */ int d;
    public final x91 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ys6(otb otbVar, hm9 hm9Var, cu2 cu2Var, x91 x91Var, int i) {
        super(otbVar, hm9Var, cu2Var);
        this.d = i;
        this.e = x91Var;
    }

    @Override // defpackage.at6
    public final Object a(fm9 fm9Var, Object[] objArr) {
        int i = this.d;
        x91 x91Var = this.e;
        switch (i) {
            case 0:
                return x91Var.l(fm9Var);
            default:
                u91 u91Var = (u91) x91Var.l(fm9Var);
                xn2 xn2Var = (xn2) objArr[objArr.length - 1];
                try {
                    pl1 pl1Var = new pl1(1, k99.D(xn2Var));
                    pl1Var.v();
                    pl1Var.x(new fs7(u91Var, 2));
                    u91Var.x(new jb1(pl1Var));
                    return pl1Var.t();
                } catch (Exception e) {
                    y7h.O(e, xn2Var);
                    return bw2.a;
                }
        }
    }
}
