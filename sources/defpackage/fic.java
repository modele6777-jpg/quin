package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fic extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fic(xn2 xn2Var, l26 l26Var, gic gicVar) {
        super(2, xn2Var);
        this.this$0 = gicVar;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        fic ficVar = new fic(xn2Var, this.$block, this.this$0);
        ficVar.L$0 = obj;
        return ficVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            fhc fhcVar = (fhc) this.L$0;
            gic gicVar = this.this$0;
            gicVar.k = fhcVar;
            l26 l26Var = this.$block;
            dic dicVar = gicVar.l;
            this.label = 1;
            Object objZ = l26Var.z(dicVar, this);
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
        return ((fic) k((xn2) obj2, (fhc) obj)).r(wef.a);
    }
}
