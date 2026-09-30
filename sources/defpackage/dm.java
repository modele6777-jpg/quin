package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dm extends gbe implements l26 {
    final /* synthetic */ boolean $skinReady;
    final /* synthetic */ String $testId;
    final /* synthetic */ mm $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(boolean z, mm mmVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$skinReady = z;
        this.$viewModel = mmVar;
        this.$testId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dm(this.$skinReady, this.$viewModel, this.$testId, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$skinReady) {
            mm mmVar = this.$viewModel;
            String str = this.$testId;
            mmVar.getClass();
            str.getClass();
            wj5 wj5VarA = mmVar.b.a(str);
            js3 js3Var = ga4.a;
            ok8.C(new al5(new kl5(oa7.b0(ym8.x(wj5VarA, hr3.c), 10L, new jm(mmVar, str, null)), new km(mmVar, null), 1), new lm(mmVar, str, null)), hwf.a(mmVar));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        dm dmVar = (dm) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        dmVar.r(wefVar);
        return wefVar;
    }
}
