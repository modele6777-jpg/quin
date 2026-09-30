package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cp6 implements wj5 {
    public final /* synthetic */ wj5 a;

    public cp6(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        zo6 zo6Var;
        if (xn2Var instanceof zo6) {
            zo6Var = (zo6) xn2Var;
            int i = zo6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zo6Var.label = i - Integer.MIN_VALUE;
            } else {
                zo6Var = new zo6(this, xn2Var);
            }
        } else {
            zo6Var = new zo6(this, xn2Var);
        }
        Object obj = zo6Var.result;
        int i2 = zo6Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            bp6 bp6Var = new bp6(xj5Var);
            zo6Var.L$0 = null;
            zo6Var.L$1 = null;
            zo6Var.L$2 = null;
            zo6Var.label = 1;
            Object objB = this.a.b(bp6Var, zo6Var);
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
