package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gf3 extends gbe implements l26 {
    final /* synthetic */ n91 $displayedMonth;
    final /* synthetic */ j18 $monthsListState;
    final /* synthetic */ int $year;
    final /* synthetic */ z67 $yearRange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf3(j18 j18Var, int i, z67 z67Var, n91 n91Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$monthsListState = j18Var;
        this.$year = i;
        this.$yearRange = z67Var;
        this.$displayedMonth = n91Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gf3(this.$monthsListState, this.$year, this.$yearRange, this.$displayedMonth, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            j18 j18Var = this.$monthsListState;
            int i2 = (((this.$year - this.$yearRange.a) * 12) + this.$displayedMonth.b) - 1;
            this.label = 1;
            vea veaVar = j18.y;
            Object objJ = j18Var.j(i2, 0, this);
            bw2 bw2Var = bw2.a;
            if (objJ == bw2Var) {
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
        return ((gf3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
