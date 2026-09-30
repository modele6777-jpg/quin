package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eu1 extends gbe implements l26 {
    final /* synthetic */ tt1 $controller;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu1(tt1 tt1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$controller = tt1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new eu1(this.$controller, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (this.$controller.a() != null) {
                this.label = 1;
                Object objQ = vfh.q(1200L, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$controller.a() != null) {
            tt1 tt1Var = this.$controller;
            if (tt1Var.a() != null) {
                tt1Var.g.setValue(null);
                tt1Var.b(false);
                tt1Var.b.setValue(null);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((eu1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
