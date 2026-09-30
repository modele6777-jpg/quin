package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ese extends gbe implements l26 {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ tia $this_selectionHandleGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ese(xn2 xn2Var, tia tiaVar, jse jseVar, boolean z) {
        super(2, xn2Var);
        this.this$0 = jseVar;
        this.$this_selectionHandleGestures = tiaVar;
        this.$isStartHandle = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ese eseVar = new ese(xn2Var, this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle);
        eseVar.L$0 = obj;
        return eseVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        bse bseVar = new bse(null, this.$this_selectionHandleGestures, this.this$0);
        dw2 dw2Var = dw2.d;
        ynb.V(aw2Var, null, dw2Var, bseVar, 1);
        ynb.V(aw2Var, null, dw2Var, new cse(null, this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle), 1).E(new lv0(this.this$0, 2));
        return ynb.V(aw2Var, null, dw2Var, new dse(null, this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle), 1);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ese) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
