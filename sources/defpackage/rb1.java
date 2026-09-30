package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rb1 extends gbe implements l26 {
    final /* synthetic */ String $cameraId;
    int label;
    final /* synthetic */ vb1 this$0;
    final /* synthetic */ ub1 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb1(vb1 vb1Var, String str, ub1 ub1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = vb1Var;
        this.$cameraId = str;
        this.this$1 = ub1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rb1(this.this$0, this.$cameraId, this.this$1, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ka1 ka1Var = this.this$0.d;
            qb1 qb1Var = new qb1(0, this.$cameraId, this.this$1);
            this.label = 1;
            Object objB = ka1Var.b(qb1Var, this);
            bw2 bw2Var = bw2.a;
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
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rb1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
