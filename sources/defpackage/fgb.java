package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fgb extends gbe implements l26 {
    final /* synthetic */ cgb $exposure;
    int label;
    final /* synthetic */ ggb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgb(xn2 xn2Var, cgb cgbVar, ggb ggbVar) {
        super(2, xn2Var);
        this.this$0 = ggbVar;
        this.$exposure = cgbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fgb(xn2Var, this.$exposure, this.this$0);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            l26 l26Var = this.this$0.a;
            String str = this.$exposure.a;
            this.label = 1;
            obj = l26Var.z(str, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        wef wefVar = wef.a;
        if (!zBooleanValue) {
            return wefVar;
        }
        this.this$0.b.d(this.$exposure);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fgb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
