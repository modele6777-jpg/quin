package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vl4 extends gbe implements l26 {
    final /* synthetic */ l26 $forEachDelta;
    final /* synthetic */ ks9 $orientation;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yl4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl4(l26 l26Var, yl4 yl4Var, ks9 ks9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$forEachDelta = l26Var;
        this.this$0 = yl4Var;
        this.$orientation = ks9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        vl4 vl4Var = new vl4(this.$forEachDelta, this.this$0, this.$orientation, xn2Var);
        vl4Var.L$0 = obj;
        return vl4Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jo joVar = (jo) this.L$0;
            l26 l26Var = this.$forEachDelta;
            it3 it3Var = new it3(joVar, this.this$0, this.$orientation, 4);
            this.label = 1;
            Object objZ = l26Var.z(it3Var, this);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vl4) k((xn2) obj2, (jo) obj)).r(wef.a);
    }
}
