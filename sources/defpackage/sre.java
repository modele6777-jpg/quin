package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sre extends gbe implements l26 {
    final /* synthetic */ tia $this_cursorHandleGestures;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sre(xn2 xn2Var, tia tiaVar, jse jseVar) {
        super(2, xn2Var);
        this.this$0 = jseVar;
        this.$this_cursorHandleGestures = tiaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        sre sreVar = new sre(xn2Var, this.$this_cursorHandleGestures, this.this$0);
        sreVar.L$0 = obj;
        return sreVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        pre preVar = new pre(null, this.$this_cursorHandleGestures, this.this$0);
        dw2 dw2Var = dw2.d;
        ynb.V(aw2Var, null, dw2Var, preVar, 1);
        ynb.V(aw2Var, null, dw2Var, new qre(null, this.$this_cursorHandleGestures, this.this$0), 1);
        return ynb.V(aw2Var, null, dw2Var, new rre(null, this.$this_cursorHandleGestures, this.this$0), 1);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((sre) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
