package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dse extends gbe implements l26 {
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ tia $this_selectionHandleGestures;
    int label;
    final /* synthetic */ jse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dse(xn2 xn2Var, tia tiaVar, jse jseVar, boolean z) {
        super(2, xn2Var);
        this.this$0 = jseVar;
        this.$this_selectionHandleGestures = tiaVar;
        this.$isStartHandle = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dse(xn2Var, this.$this_selectionHandleGestures, this.this$0, this.$isStartHandle);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jse jseVar = this.this$0;
            tia tiaVar = this.$this_selectionHandleGestures;
            boolean z = this.$isStartHandle;
            this.label = 1;
            Object objG = jseVar.g(tiaVar, z, this);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
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
        return ((dse) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
