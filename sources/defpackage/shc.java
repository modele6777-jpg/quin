package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class shc extends gbe implements l26 {
    final /* synthetic */ l26 $forEachDelta;
    final /* synthetic */ gic $this_with;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shc(xn2 xn2Var, l26 l26Var, gic gicVar) {
        super(2, xn2Var);
        this.$forEachDelta = l26Var;
        this.$this_with = gicVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        shc shcVar = new shc(xn2Var, this.$forEachDelta, this.$this_with);
        shcVar.L$0 = obj;
        return shcVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            dic dicVar = (dic) this.L$0;
            l26 l26Var = this.$forEachDelta;
            h6b h6bVar = new h6b(11, dicVar, this.$this_with);
            this.label = 1;
            Object objZ = l26Var.z(h6bVar, this);
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
        return ((shc) k((xn2) obj2, (dic) obj)).r(wef.a);
    }
}
