package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ja0 implements wj5 {
    public final /* synthetic */ wc8 a;
    public final /* synthetic */ ka0 b;

    public ja0(wc8 wc8Var, ka0 ka0Var) {
        this.a = wc8Var;
        this.b = ka0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        ga0 ga0Var;
        if (xn2Var instanceof ga0) {
            ga0Var = (ga0) xn2Var;
            int i = ga0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ga0Var.label = i - Integer.MIN_VALUE;
            } else {
                ga0Var = new ga0(this, xn2Var);
            }
        } else {
            ga0Var = new ga0(this, xn2Var);
        }
        Object obj = ga0Var.result;
        int i2 = ga0Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            ia0 ia0Var = new ia0(xj5Var, this.b);
            ga0Var.L$0 = null;
            ga0Var.L$1 = null;
            ga0Var.L$2 = null;
            ga0Var.label = 1;
            Object objB = this.a.b(ia0Var, ga0Var);
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
