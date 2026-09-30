package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bv2 extends gbe implements l26 {
    final /* synthetic */ cre $manager;
    final /* synthetic */ qne $observer;
    final /* synthetic */ tia $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv2(tia tiaVar, qne qneVar, cre creVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_pointerInput = tiaVar;
        this.$observer = qneVar;
        this.$manager = creVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        bv2 bv2Var = new bv2(this.$this_pointerInput, this.$observer, this.$manager, xn2Var);
        bv2Var.L$0 = obj;
        return bv2Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        zu2 zu2Var = new zu2(this.$this_pointerInput, this.$observer, null);
        dw2 dw2Var = dw2.d;
        ynb.V(aw2Var, null, dw2Var, zu2Var, 1);
        ynb.V(aw2Var, null, dw2Var, new av2(this.$this_pointerInput, this.$manager, null), 1);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        bv2 bv2Var = (bv2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        bv2Var.r(wefVar);
        return wefVar;
    }
}
