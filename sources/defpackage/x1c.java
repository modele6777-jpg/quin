package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x1c extends gbe implements a26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ l26 $mutation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1c(xn2 xn2Var, l26 l26Var, String str) {
        super(1, xn2Var);
        this.$mutation = l26Var;
        this.$accountId = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new x1c((xn2) obj, this.$mutation, this.$accountId).r(wef.a);
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
        l26 l26Var = this.$mutation;
        String str = this.$accountId;
        this.label = 1;
        Object objZ = l26Var.z(str, this);
        bw2 bw2Var = bw2.a;
        return objZ == bw2Var ? bw2Var : objZ;
    }
}
