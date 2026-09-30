package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vn extends gbe implements l26 {
    final /* synthetic */ n26 $block;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(lo loVar, xn2 xn2Var, n26 n26Var) {
        super(2, xn2Var);
        this.$block = n26Var;
        this.this$0 = loVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        vn vnVar = new vn(this.this$0, xn2Var, this.$block);
        vnVar.L$0 = obj;
        return vnVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            jl8 jl8Var = (jl8) this.L$0;
            n26 n26Var = this.$block;
            go goVar = this.this$0.m;
            this.label = 1;
            Object objM = n26Var.m(goVar, jl8Var, this);
            bw2 bw2Var = bw2.a;
            if (objM == bw2Var) {
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
        return ((vn) k((xn2) obj2, (jl8) obj)).r(wef.a);
    }
}
