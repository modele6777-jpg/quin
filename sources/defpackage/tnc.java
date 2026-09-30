package defpackage;

import ai.askquin.qa.capabilities.seasonal.SeasonalQaFixtureState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tnc extends gbe implements l26 {
    final /* synthetic */ SeasonalQaFixtureState $state;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnc(SeasonalQaFixtureState seasonalQaFixtureState, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = seasonalQaFixtureState;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tnc(this.$state, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            hs3 hs3Var = xqa.y;
            String strD = fzc.a.d(SeasonalQaFixtureState.Companion.serializer(), this.$state);
            isa isaVar = hs3Var.a;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object objN = bsa.n(isaVar, strD, this);
            bw2 bw2Var = bw2.a;
            if (objN == bw2Var) {
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
        return ((tnc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
