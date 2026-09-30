package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zu2 extends gbe implements l26 {
    final /* synthetic */ qne $observer;
    final /* synthetic */ tia $this_pointerInput;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu2(tia tiaVar, qne qneVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_pointerInput = tiaVar;
        this.$observer = qneVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zu2(this.$this_pointerInput, this.$observer, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            tia tiaVar = this.$this_pointerInput;
            qne qneVar = this.$observer;
            this.label = 1;
            Object objW = xo1.w(tiaVar, qneVar, this);
            bw2 bw2Var = bw2.a;
            if (objW == bw2Var) {
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
        return ((zu2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
