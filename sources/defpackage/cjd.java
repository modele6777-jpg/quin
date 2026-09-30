package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cjd extends gbe implements a26 {
    final /* synthetic */ l26 $randomNewCard;
    final /* synthetic */ e89 $selectedCardIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjd(l26 l26Var, e89 e89Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.$randomNewCard = l26Var;
        this.$selectedCardIndex$delegate = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new cjd(this.$randomNewCard, this.$selectedCardIndex$delegate, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        l26 l26Var = this.$randomNewCard;
        Integer num = (Integer) this.$selectedCardIndex$delegate.getValue();
        if (num == null) {
            qc0.j("Required value was null.");
            return null;
        }
        this.label = 1;
        Object objZ = l26Var.z(num, this);
        bw2 bw2Var = bw2.a;
        return objZ == bw2Var ? bw2Var : objZ;
    }
}
