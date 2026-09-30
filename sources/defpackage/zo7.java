package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zo7 extends gbe implements a26 {
    final /* synthetic */ a26 $operation;
    final /* synthetic */ ya2 $result;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo7(ya2 ya2Var, xn2 xn2Var, a26 a26Var) {
        super(1, xn2Var);
        this.$result = ya2Var;
        this.$operation = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new zo7(this.$result, (xn2) obj, this.$operation).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ya2 ya2Var;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                ya2Var = this.$result;
                a26 a26Var = this.$operation;
                this.L$0 = ya2Var;
                this.label = 1;
                obj = a26Var.d(this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ya2Var = (ya2) this.L$0;
                jzb.q(obj);
            }
            ((za2) ya2Var).R(obj);
        } catch (Throwable th) {
            ((za2) this.$result).i0(th);
        }
        return wef.a;
    }
}
