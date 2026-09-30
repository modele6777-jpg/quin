package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vx1 extends gbe implements l26 {
    final /* synthetic */ a26 $onSend;
    final /* synthetic */ use $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx1(xn2 xn2Var, a26 a26Var, use useVar) {
        super(2, xn2Var);
        this.$onSend = a26Var;
        this.$state = useVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vx1(xn2Var, this.$onSend, this.$state);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$onSend.d(this.$state.d().c.toString());
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vx1 vx1Var = (vx1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        vx1Var.r(wefVar);
        return wefVar;
    }
}
