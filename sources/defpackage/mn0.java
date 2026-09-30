package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mn0 extends gbe implements l26 {
    final /* synthetic */ sn0 $this_runCatching;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn0(sn0 sn0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_runCatching = sn0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mn0(this.$this_runCatching, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        fab fabVar = this.$this_runCatching.P0;
        this.label = 1;
        Object objB = ((rab) fabVar).b(this);
        bw2 bw2Var = bw2.a;
        return objB == bw2Var ? bw2Var : objB;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mn0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
