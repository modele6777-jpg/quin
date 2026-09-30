package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mqe extends gbe implements n26 {
    final /* synthetic */ t69 $interactionSource;
    final /* synthetic */ e89 $pressedInteraction;
    final /* synthetic */ aw2 $scope;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqe(aw2 aw2Var, e89 e89Var, t69 t69Var, xn2 xn2Var) {
        super(3, xn2Var);
        this.$scope = aw2Var;
        this.$pressedInteraction = e89Var;
        this.$interactionSource = t69Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        long j = ((hl9) obj2).a;
        mqe mqeVar = new mqe(this.$scope, this.$pressedInteraction, this.$interactionSource, (xn2) obj3);
        mqeVar.L$0 = (kta) obj;
        mqeVar.J$0 = j;
        return mqeVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            kta ktaVar = (kta) this.L$0;
            ynb.V(this.$scope, null, null, new kqe(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3);
            this.label = 1;
            obj = ((nta) ktaVar).d(this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        ynb.V(this.$scope, null, null, new lqe(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3);
        return wef.a;
    }
}
