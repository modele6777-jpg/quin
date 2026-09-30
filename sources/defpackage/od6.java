package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class od6 extends gbe implements l26 {
    final /* synthetic */ vd6 $processor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od6(vd6 vd6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$processor = vd6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new od6(this.$processor, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            vd6 vd6Var = this.$processor;
            this.label = 1;
            vd6Var.b();
            bw2 bw2Var = bw2.a;
            if (wefVar == bw2Var) {
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
        return ((od6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
