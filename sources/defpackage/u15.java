package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u15 implements wj5 {
    public final /* synthetic */ m15 a;
    public final /* synthetic */ m25 b;

    public u15(m15 m15Var, m25 m25Var) {
        this.a = m15Var;
        this.b = m25Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        r15 r15Var;
        if (xn2Var instanceof r15) {
            r15Var = (r15) xn2Var;
            int i = r15Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                r15Var.label = i - Integer.MIN_VALUE;
            } else {
                r15Var = new r15(this, xn2Var);
            }
        } else {
            r15Var = new r15(this, xn2Var);
        }
        Object obj = r15Var.result;
        int i2 = r15Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            t15 t15Var = new t15(xj5Var, this.b);
            r15Var.L$0 = null;
            r15Var.L$1 = null;
            r15Var.L$2 = null;
            r15Var.label = 1;
            Object objB = this.a.b(t15Var, r15Var);
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
