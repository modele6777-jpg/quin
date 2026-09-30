package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ghf extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $entryReady;
    final /* synthetic */ mhf $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghf(boolean z, Context context, mhf mhfVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$entryReady = z;
        this.$context = context;
        this.$viewModel = mhfVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ghf(this.$entryReady, this.$context, this.$viewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        vb2 vb2VarH;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$entryReady && (vb2VarH = kn2.H(this.$context)) != null) {
            this.$viewModel.M(vb2VarH);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ghf ghfVar = (ghf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ghfVar.r(wefVar);
        return wefVar;
    }
}
