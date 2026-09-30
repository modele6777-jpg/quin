package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mse extends gbe implements n26 {
    final /* synthetic */ t69 $interactionSource;
    final /* synthetic */ jse $this_defaultDetectTextFieldTapGestures;
    /* synthetic */ long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mse(t69 t69Var, jse jseVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.$interactionSource = t69Var;
        this.$this_defaultDetectTextFieldTapGestures = jseVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        long j = ((hl9) obj2).a;
        mse mseVar = new mse(this.$interactionSource, this.$this_defaultDetectTextFieldTapGestures, (xn2) obj3);
        mseVar.L$0 = (kta) obj;
        mseVar.J$0 = j;
        return mseVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            kta ktaVar = (kta) this.L$0;
            long j = this.J$0;
            t69 t69Var = this.$interactionSource;
            if (t69Var != null) {
                lse lseVar = new lse(ktaVar, this.$this_defaultDetectTextFieldTapGestures, j, t69Var, null);
                this.label = 1;
                Object objO = jgb.O(lseVar, this);
                bw2 bw2Var = bw2.a;
                if (objO == bw2Var) {
                    return bw2Var;
                }
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
}
