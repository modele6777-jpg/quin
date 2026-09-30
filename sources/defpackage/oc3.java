package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oc3 extends gbe implements l26 {
    final /* synthetic */ i0e $startState;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc3(i0e i0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$startState = i0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        oc3 oc3Var = new oc3(this.$startState, xn2Var);
        oc3Var.L$0 = obj;
        return oc3Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        i0e i0eVar = (i0e) this.L$0;
        return Boolean.valueOf((i0eVar instanceof cb3) && ((cb3) i0eVar).a <= ((cb3) this.$startState).a);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oc3) k((xn2) obj2, (i0e) obj)).r(wef.a);
    }
}
