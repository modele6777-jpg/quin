package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q43 extends gbe implements l26 {
    final /* synthetic */ x16 $onReadingReady;
    final /* synthetic */ d63 $successState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q43(d63 d63Var, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$successState = d63Var;
        this.$onReadingReady = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new q43(this.$successState, this.$onReadingReady, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        x16 x16Var;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$successState != null && (x16Var = this.$onReadingReady) != null) {
            x16Var.invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        q43 q43Var = (q43) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        q43Var.r(wefVar);
        return wefVar;
    }
}
