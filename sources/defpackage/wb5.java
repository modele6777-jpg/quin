package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wb5 extends gbe implements l26 {
    final /* synthetic */ int $i;
    final /* synthetic */ a26 $onRatingChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb5(a26 a26Var, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onRatingChanged = a26Var;
        this.$i = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wb5(this.$onRatingChanged, this.$i, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$onRatingChanged.d(new Integer(this.$i));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        wb5 wb5Var = (wb5) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        wb5Var.r(wefVar);
        return wefVar;
    }
}
