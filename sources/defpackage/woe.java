package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class woe extends gbe implements l26 {
    final /* synthetic */ tia $this_SuspendingPointerInputModifierNode;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ape this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woe(ape apeVar, tia tiaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = apeVar;
        this.$this_SuspendingPointerInputModifierNode = tiaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        woe woeVar = new woe(this.this$0, this.$this_SuspendingPointerInputModifierNode, xn2Var);
        woeVar.L$0 = obj;
        return woeVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        ape apeVar = this.this$0;
        jse jseVar = apeVar.H0;
        tia tiaVar = this.$this_SuspendingPointerInputModifierNode;
        ykc ykcVar = new ykc(21, jseVar, apeVar);
        toe toeVar = new toe(null, tiaVar, jseVar);
        dw2 dw2Var = dw2.d;
        ynb.V(aw2Var, null, dw2Var, toeVar, 1);
        ynb.V(aw2Var, null, dw2Var, new uoe(apeVar, jseVar, tiaVar, ykcVar, null), 1);
        ynb.V(aw2Var, null, dw2Var, new voe(jseVar, tiaVar, ykcVar, null), 1);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        woe woeVar = (woe) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        woeVar.r(wefVar);
        return wefVar;
    }
}
