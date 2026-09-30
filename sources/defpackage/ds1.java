package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ds1 extends gbe implements l26 {
    final /* synthetic */ use $jsonState;
    final /* synthetic */ a26 $onJsonChange;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds1(xn2 xn2Var, a26 a26Var, use useVar) {
        super(2, xn2Var);
        this.$onJsonChange = a26Var;
        this.$jsonState = useVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ds1(xn2Var, this.$onJsonChange, this.$jsonState);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            ybc ybcVarP = jzb.p(new zr1(this.$jsonState, 1));
            cs1 cs1Var = new cs1(0, this.$onJsonChange);
            this.label = 1;
            Object objB = ybcVarP.b(new jl5(new kmb(), cs1Var), this);
            bw2 bw2Var = bw2.a;
            if (objB != bw2Var) {
                objB = wefVar;
            }
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ds1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
