package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vv9 extends gbe implements l26 {
    final /* synthetic */ h0e $isAtTop$delegate;
    final /* synthetic */ e89 $isExpanded$delegate;
    final /* synthetic */ e89 $wasManuallyExpanded$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv9(h0e h0eVar, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$isAtTop$delegate = h0eVar;
        this.$wasManuallyExpanded$delegate = e89Var;
        this.$isExpanded$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vv9(this.$isAtTop$delegate, this.$wasManuallyExpanded$delegate, this.$isExpanded$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (((Boolean) this.$isAtTop$delegate.getValue()).booleanValue()) {
            this.$wasManuallyExpanded$delegate.setValue(Boolean.FALSE);
        } else if (((Boolean) this.$isExpanded$delegate.getValue()).booleanValue() && !((Boolean) this.$wasManuallyExpanded$delegate.getValue()).booleanValue()) {
            this.$isExpanded$delegate.setValue(Boolean.FALSE);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        vv9 vv9Var = (vv9) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        vv9Var.r(wefVar);
        return wefVar;
    }
}
