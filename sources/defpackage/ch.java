package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ch extends gbe implements l26 {
    final /* synthetic */ e89 $product$delegate;
    final /* synthetic */ gh $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(gh ghVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = ghVar;
        this.$product$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ch(this.$state, this.$product$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object obj2 = null;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        n07 n07Var = (n07) this.$product$delegate.getValue();
        wef wefVar = wef.a;
        if (n07Var != null) {
            return wefVar;
        }
        e89 e89Var = this.$product$delegate;
        gh ghVar = this.$state;
        for (Object obj3 : t72.I(ghVar.b, ghVar.a)) {
            if (((n07) obj3) != null) {
                obj2 = obj3;
                break;
            }
        }
        e89Var.setValue((n07) obj2);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ch chVar = (ch) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        chVar.r(wefVar);
        return wefVar;
    }
}
