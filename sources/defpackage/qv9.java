package defpackage;

import ai.askquin.ui.divination.k;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qv9 extends gbe implements l26 {
    final /* synthetic */ Integer $clarifyingCardReturnBottomIndex;
    final /* synthetic */ x16 $onClarifyingCardReturnPositioned;
    final /* synthetic */ j18 $scrollState;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv9(Integer num, j18 j18Var, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$clarifyingCardReturnBottomIndex = num;
        this.$scrollState = j18Var;
        this.$onClarifyingCardReturnPositioned = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qv9(this.$clarifyingCardReturnBottomIndex, this.$scrollState, this.$onClarifyingCardReturnPositioned, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            Integer num = this.$clarifyingCardReturnBottomIndex;
            if (num != null) {
                int iIntValue = num.intValue();
                j18 j18Var = this.$scrollState;
                this.I$0 = iIntValue;
                this.label = 1;
                Object objL = k.l(j18Var, iIntValue, this);
                bw2 bw2Var = bw2.a;
                if (objL == bw2Var) {
                    return bw2Var;
                }
            }
            return wefVar;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$onClarifyingCardReturnPositioned.invoke();
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qv9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
