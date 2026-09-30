package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bo3 implements wj5 {
    public final /* synthetic */ kl5 a;

    public bo3(kl5 kl5Var) {
        this.a = kl5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        yn3 yn3Var;
        if (xn2Var instanceof yn3) {
            yn3Var = (yn3) xn2Var;
            int i = yn3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                yn3Var.label = i - Integer.MIN_VALUE;
            } else {
                yn3Var = new yn3(this, xn2Var);
            }
        } else {
            yn3Var = new yn3(this, xn2Var);
        }
        Object obj = yn3Var.result;
        int i2 = yn3Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            ao3 ao3Var = new ao3(xj5Var);
            yn3Var.L$0 = null;
            yn3Var.L$1 = null;
            yn3Var.L$2 = null;
            yn3Var.label = 1;
            Object objB = this.a.b(ao3Var, yn3Var);
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
