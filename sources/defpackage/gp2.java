package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gp2 implements wj5 {
    public final /* synthetic */ ybc a;

    public gp2(ybc ybcVar) {
        this.a = ybcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        dp2 dp2Var;
        if (xn2Var instanceof dp2) {
            dp2Var = (dp2) xn2Var;
            int i = dp2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dp2Var.label = i - Integer.MIN_VALUE;
            } else {
                dp2Var = new dp2(this, xn2Var);
            }
        } else {
            dp2Var = new dp2(this, xn2Var);
        }
        Object obj = dp2Var.result;
        int i2 = dp2Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            fp2 fp2Var = new fp2(xj5Var);
            dp2Var.L$0 = null;
            dp2Var.L$1 = null;
            dp2Var.L$2 = null;
            dp2Var.label = 1;
            Object objB = this.a.b(fp2Var, dp2Var);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
