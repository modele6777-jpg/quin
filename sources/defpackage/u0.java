package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends gbe implements l26 {
    final /* synthetic */ t69 $interactionSource;
    final /* synthetic */ pta $press;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(xn2 xn2Var, t69 t69Var, pta ptaVar) {
        super(2, xn2Var);
        this.$interactionSource = t69Var;
        this.$press = ptaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new u0(xn2Var, this.$interactionSource, this.$press);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            t69 t69Var = this.$interactionSource;
            pta ptaVar = this.$press;
            this.label = 1;
            Object objA = ((u69) t69Var).a(ptaVar, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
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
        return ((u0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
