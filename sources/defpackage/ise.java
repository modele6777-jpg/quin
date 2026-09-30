package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ise extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ise(jse jseVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = jseVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ise iseVar = new ise(this.this$0, xn2Var);
        iseVar.L$0 = obj;
        return iseVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        ynb.V(aw2Var, null, null, new gse(this.this$0, null), 3);
        return ynb.V(aw2Var, null, null, new hse(this.this$0, null), 3);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ise) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
