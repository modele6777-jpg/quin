package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iq6 implements wj5 {
    public final /* synthetic */ wj5 a;

    public iq6(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        fq6 fq6Var;
        if (xn2Var instanceof fq6) {
            fq6Var = (fq6) xn2Var;
            int i = fq6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fq6Var.label = i - Integer.MIN_VALUE;
            } else {
                fq6Var = new fq6(this, xn2Var);
            }
        } else {
            fq6Var = new fq6(this, xn2Var);
        }
        Object obj = fq6Var.result;
        int i2 = fq6Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            hq6 hq6Var = new hq6(xj5Var);
            fq6Var.L$0 = null;
            fq6Var.L$1 = null;
            fq6Var.L$2 = null;
            fq6Var.label = 1;
            Object objB = this.a.b(hq6Var, fq6Var);
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
