package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vt5 extends gbe implements l26 {
    final /* synthetic */ h0e $latestLoaded$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt5(h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$latestLoaded$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vt5(this.$latestLoaded$delegate, xn2Var);
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
        ybc ybcVarP = jzb.p(new zk1(3, this.$latestLoaded$delegate));
        ut5 ut5Var = new ut5(2, null);
        this.label = 1;
        Object objC = tm7.C(ybcVarP, ut5Var, this);
        bw2 bw2Var = bw2.a;
        return objC == bw2Var ? bw2Var : objC;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vt5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
