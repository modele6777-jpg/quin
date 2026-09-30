package defpackage;

import ai.askquin.ui.draw.model.DrawCardSaves;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lcf extends gbe implements a26 {
    final /* synthetic */ h0e $currentOnResultShown$delegate;
    final /* synthetic */ e89 $isResultSaved$delegate;
    final /* synthetic */ e89 $resultSaveFailed$delegate;
    final /* synthetic */ rcf $viewModel;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcf(h0e h0eVar, rcf rcfVar, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(1, xn2Var);
        this.$currentOnResultShown$delegate = h0eVar;
        this.$viewModel = rcfVar;
        this.$resultSaveFailed$delegate = e89Var;
        this.$isResultSaved$delegate = e89Var2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new lcf(this.$currentOnResultShown$delegate, this.$viewModel, this.$resultSaveFailed$delegate, this.$isResultSaved$delegate, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        e89 e89Var;
        e89 e89Var2;
        e89 e89Var3;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            l26 l26Var = (l26) this.$currentOnResultShown$delegate.getValue();
            if (l26Var != null) {
                rcf rcfVar = this.$viewModel;
                e89 e89Var4 = this.$resultSaveFailed$delegate;
                e89 e89Var5 = this.$isResultSaved$delegate;
                e89Var4.setValue(Boolean.FALSE);
                DrawCardSaves drawCardSavesO = rcfVar.o();
                this.L$0 = e89Var4;
                this.L$1 = e89Var5;
                this.L$2 = null;
                this.L$3 = e89Var5;
                this.label = 1;
                obj = l26Var.z(drawCardSavesO, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
                e89Var = e89Var4;
                e89Var2 = e89Var5;
                e89Var3 = e89Var2;
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e89Var2 = (e89) this.L$3;
        e89Var3 = (e89) this.L$1;
        e89Var = (e89) this.L$0;
        jzb.q(obj);
        Boolean bool = (Boolean) obj;
        bool.getClass();
        e89Var2.setValue(bool);
        e89Var.setValue(Boolean.valueOf(!((Boolean) e89Var3.getValue()).booleanValue()));
        return wef.a;
    }
}
