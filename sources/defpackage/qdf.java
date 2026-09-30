package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qdf extends gbe implements l26 {
    final /* synthetic */ x6d $configuration;
    final /* synthetic */ pad $exportRegistry;
    final /* synthetic */ bad $operationController;
    final /* synthetic */ e89 $pendingGeneratedAction$delegate;
    final /* synthetic */ oad $pendingGenerationStatus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdf(oad oadVar, pad padVar, e89 e89Var, x6d x6dVar, bad badVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pendingGenerationStatus = oadVar;
        this.$exportRegistry = padVar;
        this.$pendingGeneratedAction$delegate = e89Var;
        this.$configuration = x6dVar;
        this.$operationController = badVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qdf(this.$pendingGenerationStatus, this.$exportRegistry, this.$pendingGeneratedAction$delegate, this.$configuration, this.$operationController, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        o6a o6aVar = (o6a) this.$pendingGeneratedAction$delegate.getValue();
        wef wefVar = wef.a;
        if (o6aVar != null) {
            if (this.$pendingGenerationStatus instanceof lad) {
                this.$pendingGeneratedAction$delegate.setValue(null);
                kv2.u(o6aVar instanceof m6a ? R.string.image_save_failed : R.string.share_failed, 0);
                return wefVar;
            }
            if (this.$exportRegistry.d(o6aVar.a())) {
                this.$pendingGeneratedAction$delegate.setValue(null);
                scc.e(this.$configuration, this.$operationController, o6aVar);
                return wefVar;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        qdf qdfVar = (qdf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        qdfVar.r(wefVar);
        return wefVar;
    }
}
