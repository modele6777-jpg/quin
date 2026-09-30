package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class av2 extends gbe implements l26 {
    final /* synthetic */ cre $manager;
    final /* synthetic */ tia $this_pointerInput;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av2(tia tiaVar, cre creVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_pointerInput = tiaVar;
        this.$manager = creVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new av2(this.$this_pointerInput, this.$manager, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            tia tiaVar = this.$this_pointerInput;
            su2 su2Var = new su2(this.$manager, 1);
            this.label = 1;
            Object objE = ffe.e(tiaVar, null, null, null, su2Var, this, 7);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
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
        return ((av2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
