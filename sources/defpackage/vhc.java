package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vhc extends gbe implements l26 {
    final /* synthetic */ long $scrollAmount;
    int label;
    final /* synthetic */ yhc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhc(yhc yhcVar, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = yhcVar;
        this.$scrollAmount = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vhc(this.this$0, this.$scrollAmount, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            gic gicVar = this.this$0.g1;
            uhc uhcVar = new uhc(this.$scrollAmount, null);
            this.label = 1;
            Object objG = gicVar.g(s89.b, uhcVar, this);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
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
        return ((vhc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
