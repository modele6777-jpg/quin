package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class df3 extends gbe implements l26 {
    final /* synthetic */ int $monthIndex;
    final /* synthetic */ j18 $monthsListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df3(j18 j18Var, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.$monthsListState = j18Var;
        this.$monthIndex = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new df3(this.$monthsListState, this.$monthIndex, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (!this.$monthsListState.j.a()) {
                int iJ = this.$monthsListState.e.b.j();
                int i2 = this.$monthIndex;
                if (iJ != i2) {
                    j18 j18Var = this.$monthsListState;
                    this.label = 1;
                    Object objJ = j18Var.j(i2, 0, this);
                    bw2 bw2Var = bw2.a;
                    if (objJ == bw2Var) {
                        return bw2Var;
                    }
                }
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
        return ((df3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
