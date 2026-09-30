package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c25 implements wj5 {
    public final /* synthetic */ wc8 a;

    public c25(wc8 wc8Var) {
        this.a = wc8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        z15 z15Var;
        if (xn2Var instanceof z15) {
            z15Var = (z15) xn2Var;
            int i = z15Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                z15Var.label = i - Integer.MIN_VALUE;
            } else {
                z15Var = new z15(this, xn2Var);
            }
        } else {
            z15Var = new z15(this, xn2Var);
        }
        Object obj = z15Var.result;
        int i2 = z15Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            b25 b25Var = new b25(xj5Var);
            z15Var.L$0 = null;
            z15Var.L$1 = null;
            z15Var.L$2 = null;
            z15Var.label = 1;
            Object objB = this.a.b(b25Var, z15Var);
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
