package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hw0 extends czb implements l26 {
    final /* synthetic */ iia $pass;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw0(iia iiaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pass = iiaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hw0 hw0Var = new hw0(this.$pass, xn2Var);
        hw0Var.L$0 = obj;
        return hw0Var;
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
        mbe mbeVar = (mbe) this.L$0;
        iia iiaVar = this.$pass;
        this.label = 1;
        Object objJ = ffe.j(mbeVar, iiaVar, this);
        bw2 bw2Var = bw2.a;
        return objJ == bw2Var ? bw2Var : objJ;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hw0) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
