package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vc1 extends gbe implements a26 {
    final /* synthetic */ uc1 $captureSequence;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc1(uc1 uc1Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.$captureSequence = uc1Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new vc1(this.$captureSequence, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        uc1 uc1Var = this.$captureSequence;
        this.label = 1;
        Object objS = uc1Var.l.s(this);
        bw2 bw2Var = bw2.a;
        if (objS != bw2Var) {
            objS = wefVar;
        }
        return objS == bw2Var ? bw2Var : wefVar;
    }
}
