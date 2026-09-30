package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oj3 extends gbe implements l26 {
    final /* synthetic */ jx7 $chartGridState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj3(jx7 jx7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$chartGridState = jx7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new oj3(this.$chartGridState, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jx7 jx7Var = this.$chartGridState;
            this.label = 1;
            Object objI = jx7.i(jx7Var, 0, this);
            bw2 bw2Var = bw2.a;
            if (objI == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oj3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
