package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jb9 extends gbe implements l26 {
    final /* synthetic */ h0e $currentBackStack$delegate;
    final /* synthetic */ n69 $progress$delegate;
    final /* synthetic */ ltc $transitionState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb9(ltc ltcVar, h0e h0eVar, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transitionState = ltcVar;
        this.$currentBackStack$delegate = h0eVar;
        this.$progress$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jb9(this.$transitionState, this.$currentBackStack$delegate, this.$progress$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (((List) this.$currentBackStack$delegate.getValue()).size() > 1) {
                da9 da9Var = (da9) ((List) this.$currentBackStack$delegate.getValue()).get(((List) this.$currentBackStack$delegate.getValue()).size() - 2);
                ltc ltcVar = this.$transitionState;
                float fJ = ((qz9) this.$progress$delegate).j();
                this.label = 1;
                Object objK = ltcVar.k(fJ, da9Var, this);
                bw2 bw2Var = bw2.a;
                if (objK == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jb9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
