package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vfd extends gbe implements l26 {
    final /* synthetic */ int $expectedShuffleCount;
    /* synthetic */ int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfd(int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.$expectedShuffleCount = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        vfd vfdVar = new vfd(this.$expectedShuffleCount, xn2Var);
        vfdVar.I$0 = ((Number) obj).intValue();
        return vfdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.I$0;
        if (this.label == 0) {
            jzb.q(obj);
            return Boolean.valueOf(i >= this.$expectedShuffleCount);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vfd) k((xn2) obj2, Integer.valueOf(((Number) obj).intValue()))).r(wef.a);
    }
}
