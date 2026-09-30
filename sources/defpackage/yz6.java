package defpackage;

import ai.askquin.data.InAppMessageUiModel;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yz6 extends gbe implements l26 {
    final /* synthetic */ v07 $ledger;
    final /* synthetic */ j18 $listState;
    final /* synthetic */ e89 $pageReported$delegate;
    final /* synthetic */ g07 $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz6(g07 g07Var, e89 e89Var, j18 j18Var, v07 v07Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = g07Var;
        this.$pageReported$delegate = e89Var;
        this.$listState = j18Var;
        this.$ledger = v07Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yz6(this.$state, this.$pageReported$delegate, this.$listState, this.$ledger, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (!((Boolean) this.$pageReported$delegate.getValue()).booleanValue() && !pa7.t(this.$state, e07.a)) {
                this.$pageReported$delegate.setValue(Boolean.TRUE);
                x1f x1fVar = x1f.a;
                x1f.h("page_view", m1f.a, new za6(10, this.$state));
            }
            g07 g07Var = this.$state;
            f07 f07Var = g07Var instanceof f07 ? (f07) g07Var : null;
            List list = f07Var != null ? f07Var.a : null;
            if (list == null) {
                list = pu4.a;
            }
            int iF = bm8.F(t72.u(list, 10));
            if (iF < 16) {
                iF = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
            for (Object obj2 : list) {
                linkedHashMap.put(((InAppMessageUiModel) obj2).getMessageId(), obj2);
            }
            ybc ybcVarP = jzb.p(new te3(this.$listState, 2));
            qb1 qb1Var = new qb1(5, linkedHashMap, this.$ledger);
            this.L$0 = null;
            this.label = 1;
            Object objB = ybcVarP.b(qb1Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
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
        return ((yz6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
