package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g25 implements wj5 {
    public final /* synthetic */ wm5 a;

    public g25(wm5 wm5Var) {
        this.a = wm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        d25 d25Var;
        if (xn2Var instanceof d25) {
            d25Var = (d25) xn2Var;
            int i = d25Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                d25Var.label = i - Integer.MIN_VALUE;
            } else {
                d25Var = new d25(this, xn2Var);
            }
        } else {
            d25Var = new d25(this, xn2Var);
        }
        Object obj = d25Var.result;
        int i2 = d25Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            f25 f25Var = new f25(xj5Var);
            d25Var.L$0 = null;
            d25Var.L$1 = null;
            d25Var.L$2 = null;
            d25Var.label = 1;
            Object objB = this.a.b(f25Var, d25Var);
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
