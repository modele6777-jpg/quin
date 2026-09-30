package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qp2 extends gbe implements l26 {
    final /* synthetic */ t7 $accountInfoProvider;
    final /* synthetic */ m25 $event;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp2(t7 t7Var, m25 m25Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountInfoProvider = t7Var;
        this.$event = m25Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qp2(this.$accountInfoProvider, this.$event, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((mo3) this.$accountInfoProvider).b()) {
            m25 m25Var = this.$event;
            m25Var.getClass();
            ynb.V(hwf.a(m25Var), null, null, new x05(m25Var, null), 3);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        qp2 qp2Var = (qp2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        qp2Var.r(wefVar);
        return wefVar;
    }
}
