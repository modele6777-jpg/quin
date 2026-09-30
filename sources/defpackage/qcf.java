package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qcf extends gbe implements l26 {
    final /* synthetic */ tn4 $currentStep;
    final /* synthetic */ e89 $delayedVisible$delegate;
    final /* synthetic */ boolean $isSelected;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcf(tn4 tn4Var, boolean z, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$currentStep = tn4Var;
        this.$isSelected = z;
        this.$delayedVisible$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qcf(this.$currentStep, this.$isSelected, this.$delayedVisible$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            tn4 tn4Var = this.$currentStep;
            tn4 tn4Var2 = tn4.b;
            if (tn4Var == tn4Var2 && !this.$isSelected) {
                this.label = 1;
                Object objQ = vfh.q(100L, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
            } else if (tn4Var != tn4Var2) {
                this.$delayedVisible$delegate.setValue(Boolean.FALSE);
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$delayedVisible$delegate.setValue(Boolean.TRUE);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qcf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
