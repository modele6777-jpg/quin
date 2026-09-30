package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wn9 extends gbe implements l26 {
    final /* synthetic */ h0e $currentOnNext$delegate;
    final /* synthetic */ x48 $lifecycleOwner;
    final /* synthetic */ bo9 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn9(x48 x48Var, bo9 bo9Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$lifecycleOwner = x48Var;
        this.$viewModel = bo9Var;
        this.$currentOnNext$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wn9(this.$lifecycleOwner, this.$viewModel, this.$currentOnNext$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            h48 h48VarK = this.$lifecycleOwner.k();
            whb whbVar = this.$viewModel.w;
            sk3 sk3Var = new sk3(0, this.$viewModel, bo9.class, "consumeNext", "consumeNext()Z", 0, 26);
            zk1 zk1Var = new zk1(10, this.$currentOnNext$delegate);
            this.label = 1;
            Object objO = rrb.o(h48VarK, g48.e, new zn9(whbVar, sk3Var, zk1Var, null), this);
            bw2 bw2Var = bw2.a;
            if (objO == bw2Var) {
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
        return ((wn9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
