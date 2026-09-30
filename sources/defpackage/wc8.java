package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wc8 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ gd8 b;

    public wc8(wj5 wj5Var, gd8 gd8Var) {
        this.a = wj5Var;
        this.b = gd8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        tc8 tc8Var;
        if (xn2Var instanceof tc8) {
            tc8Var = (tc8) xn2Var;
            int i = tc8Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tc8Var.label = i - Integer.MIN_VALUE;
            } else {
                tc8Var = new tc8(this, xn2Var);
            }
        } else {
            tc8Var = new tc8(this, xn2Var);
        }
        Object obj = tc8Var.result;
        int i2 = tc8Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            vc8 vc8Var = new vc8(xj5Var, this.b);
            tc8Var.L$0 = null;
            tc8Var.L$1 = null;
            tc8Var.L$2 = null;
            tc8Var.label = 1;
            Object objB = this.a.b(vc8Var, tc8Var);
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
