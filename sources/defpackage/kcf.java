package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kcf extends gbe implements l26 {
    final /* synthetic */ r0 $divinationViewModel;
    final /* synthetic */ egd $shuffleState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcf(egd egdVar, r0 r0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$shuffleState = egdVar;
        this.$divinationViewModel = r0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kcf(this.$shuffleState, this.$divinationViewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        r0 r0Var;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if ((this.$shuffleState.a() == hgd.e || this.$shuffleState.a() == hgd.d) && (r0Var = this.$divinationViewModel) != null) {
            ConcurrentHashMap concurrentHashMap = xfb.a;
            xfb.i(r0Var.I0, "cut");
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        kcf kcfVar = (kcf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        kcfVar.r(wefVar);
        return wefVar;
    }
}
