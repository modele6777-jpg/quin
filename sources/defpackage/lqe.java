package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lqe extends gbe implements l26 {
    final /* synthetic */ t69 $interactionSource;
    final /* synthetic */ e89 $pressedInteraction;
    final /* synthetic */ boolean $success;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqe(e89 e89Var, boolean z, t69 t69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pressedInteraction = e89Var;
        this.$success = z;
        this.$interactionSource = t69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lqe(this.$pressedInteraction, this.$success, this.$interactionSource, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        e89 e89Var;
        e89 e89Var2;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            pta ptaVar = (pta) this.$pressedInteraction.getValue();
            if (ptaVar != null) {
                boolean z = this.$success;
                t69 t69Var = this.$interactionSource;
                e89Var = this.$pressedInteraction;
                l77 qtaVar = z ? new qta(ptaVar) : new ota(ptaVar);
                if (t69Var != null) {
                    this.L$0 = e89Var;
                    this.label = 1;
                    Object objA = ((u69) t69Var).a(qtaVar, this);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                    e89Var2 = e89Var;
                }
                e89Var.setValue(null);
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e89Var2 = (e89) this.L$0;
        jzb.q(obj);
        e89Var = e89Var2;
        e89Var.setValue(null);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lqe) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
