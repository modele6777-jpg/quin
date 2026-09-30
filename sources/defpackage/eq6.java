package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eq6 implements wj5 {
    public final /* synthetic */ wc8 a;

    public eq6(wc8 wc8Var) {
        this.a = wc8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        bq6 bq6Var;
        if (xn2Var instanceof bq6) {
            bq6Var = (bq6) xn2Var;
            int i = bq6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bq6Var.label = i - Integer.MIN_VALUE;
            } else {
                bq6Var = new bq6(this, xn2Var);
            }
        } else {
            bq6Var = new bq6(this, xn2Var);
        }
        Object obj = bq6Var.result;
        int i2 = bq6Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            dq6 dq6Var = new dq6(xj5Var);
            bq6Var.L$0 = null;
            bq6Var.L$1 = null;
            bq6Var.L$2 = null;
            bq6Var.label = 1;
            Object objB = this.a.b(dq6Var, bq6Var);
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
