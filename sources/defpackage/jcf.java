package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jcf extends gbe implements l26 {
    final /* synthetic */ r0 $divinationViewModel;
    final /* synthetic */ rcf $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcf(xn2 xn2Var, rcf rcfVar, r0 r0Var) {
        super(2, xn2Var);
        this.$viewModel = rcfVar;
        this.$divinationViewModel = r0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jcf(xn2Var, this.$viewModel, this.$divinationViewModel);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        r0 r0Var;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$viewModel.g() != tn4.a && (r0Var = this.$divinationViewModel) != null) {
            ConcurrentHashMap concurrentHashMap = xfb.a;
            xfb.i(r0Var.I0, "draw");
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        jcf jcfVar = (jcf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        jcfVar.r(wefVar);
        return wefVar;
    }
}
