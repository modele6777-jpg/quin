package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o75 implements wj5 {
    public final /* synthetic */ wc8 a;

    public o75(wc8 wc8Var) {
        this.a = wc8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        l75 l75Var;
        if (xn2Var instanceof l75) {
            l75Var = (l75) xn2Var;
            int i = l75Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                l75Var.label = i - Integer.MIN_VALUE;
            } else {
                l75Var = new l75(this, xn2Var);
            }
        } else {
            l75Var = new l75(this, xn2Var);
        }
        Object obj = l75Var.result;
        int i2 = l75Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            n75 n75Var = new n75(xj5Var);
            l75Var.L$0 = null;
            l75Var.L$1 = null;
            l75Var.L$2 = null;
            l75Var.label = 1;
            Object objB = this.a.b(n75Var, l75Var);
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
