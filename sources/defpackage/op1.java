package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class op1 extends gbe implements l26 {
    final /* synthetic */ fy9 $cardCoverPainter;
    final /* synthetic */ qp1 $initialStage;
    final /* synthetic */ e89 $stage$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op1(qp1 qp1Var, fy9 fy9Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$initialStage = qp1Var;
        this.$cardCoverPainter = fy9Var;
        this.$stage$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new op1(this.$initialStage, this.$cardCoverPainter, this.$stage$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        e89 e89Var = this.$stage$delegate;
        wn7[] wn7VarArr = pp1.a;
        qp1 qp1Var = (qp1) e89Var.getValue();
        qp1 qp1Var2 = qp1.a;
        qp1 qp1Var3 = qp1.b;
        if (qp1Var == qp1Var3 && this.$initialStage == qp1Var2) {
            this.$stage$delegate.setValue(qp1Var2);
        } else {
            qp1 qp1Var4 = (qp1) this.$stage$delegate.getValue();
            qp1 qp1Var5 = qp1.c;
            if (qp1Var4 == qp1Var2 && this.$initialStage == qp1Var5) {
                e89 e89Var2 = this.$stage$delegate;
                if (this.$cardCoverPainter != null) {
                    qp1Var3 = qp1Var5;
                }
                e89Var2.setValue(qp1Var3);
            } else if (((qp1) this.$stage$delegate.getValue()) == qp1Var3 && this.$initialStage == qp1Var5 && this.$cardCoverPainter != null) {
                this.$stage$delegate.setValue(qp1Var5);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        op1 op1Var = (op1) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        op1Var.r(wefVar);
        return wefVar;
    }
}
