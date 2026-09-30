package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q3g extends gbe implements l26 {
    final /* synthetic */ j18 $listState;
    final /* synthetic */ int $selectedIndex;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3g(j18 j18Var, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.$listState = j18Var;
        this.$selectedIndex = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new q3g(this.$listState, this.$selectedIndex, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            int iJ = this.$listState.e.b.j();
            int i2 = this.$selectedIndex;
            if (iJ != i2) {
                j18 j18Var = this.$listState;
                this.label = 1;
                Object objJ = j18Var.j(i2, 0, this);
                bw2 bw2Var = bw2.a;
                if (objJ == bw2Var) {
                    return bw2Var;
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
        return ((q3g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
