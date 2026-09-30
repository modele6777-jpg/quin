package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n84 extends gbe implements l26 {
    final /* synthetic */ q84 $dialogNavigator;
    final /* synthetic */ jsd $dialogsToDispose;
    final /* synthetic */ h0e $transitionInProgress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n84(h0e h0eVar, q84 q84Var, jsd jsdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transitionInProgress$delegate = h0eVar;
        this.$dialogNavigator = q84Var;
        this.$dialogsToDispose = jsdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new n84(this.$transitionInProgress$delegate, this.$dialogNavigator, this.$dialogsToDispose, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Set<da9> set = (Set) this.$transitionInProgress$delegate.getValue();
        q84 q84Var = this.$dialogNavigator;
        jsd jsdVar = this.$dialogsToDispose;
        for (da9 da9Var : set) {
            if (!((List) q84Var.b().e.a.getValue()).contains(da9Var) && !jsdVar.contains(da9Var)) {
                q84Var.b().c(da9Var);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        n84 n84Var = (n84) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        n84Var.r(wefVar);
        return wefVar;
    }
}
