package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class to5 extends gbe implements l26 {
    final /* synthetic */ ta4 $handler;
    final /* synthetic */ l77 $interaction;
    final /* synthetic */ t69 $this_emitWithFallback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to5(t69 t69Var, l77 l77Var, ta4 ta4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_emitWithFallback = t69Var;
        this.$interaction = l77Var;
        this.$handler = ta4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new to5(this.$this_emitWithFallback, this.$interaction, this.$handler, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            t69 t69Var = this.$this_emitWithFallback;
            l77 l77Var = this.$interaction;
            this.label = 1;
            Object objA = ((u69) t69Var).a(l77Var, this);
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
        ta4 ta4Var = this.$handler;
        if (ta4Var != null) {
            ta4Var.a();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((to5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
