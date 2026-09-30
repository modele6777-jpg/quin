package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jn1 extends gbe implements a26 {
    int label;
    final /* synthetic */ xn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn1(xn1 xn1Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = xn1Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new jn1(this.this$0, (xn2) obj).r(wef.a);
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
        xn1 xn1Var = this.this$0;
        this.label = 1;
        Object objG = xn1Var.g(this);
        bw2 bw2Var = bw2.a;
        return objG == bw2Var ? bw2Var : objG;
    }
}
