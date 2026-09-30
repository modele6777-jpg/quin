package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dad extends gbe implements l26 {
    final /* synthetic */ mmb $controller;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dad(mmb mmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$controller = mmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dad(this.$controller, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            Object obj2 = this.$controller.element;
            if (obj2 == null) {
                pa7.g0("controller");
                throw null;
            }
            this.label = 1;
            Object objL = ((bad) obj2).l(this);
            bw2 bw2Var = bw2.a;
            if (objL == bw2Var) {
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
        return ((dad) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
