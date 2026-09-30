package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pna extends gbe implements l26 {
    final /* synthetic */ e89 $state;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pna(e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        pna pnaVar = new pna(this.$state, xn2Var);
        pnaVar.L$0 = obj;
        return pnaVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object obj2 = this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$state.setValue(obj2);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        pna pnaVar = (pna) k((xn2) obj2, obj);
        wef wefVar = wef.a;
        pnaVar.r(wefVar);
        return wefVar;
    }
}
