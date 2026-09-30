package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aef extends gbe implements l26 {
    final /* synthetic */ s69 $expandedScrollOffset$delegate;
    /* synthetic */ int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aef(s69 s69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$expandedScrollOffset$delegate = s69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        aef aefVar = new aef(this.$expandedScrollOffset$delegate, xn2Var);
        aefVar.I$0 = ((Number) obj).intValue();
        return aefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.I$0;
        if (this.label == 0) {
            jzb.q(obj);
            return Boolean.valueOf(i >= ((sz9) this.$expandedScrollOffset$delegate).j());
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((aef) k((xn2) obj2, Integer.valueOf(((Number) obj).intValue()))).r(wef.a);
    }
}
