package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vh4 implements wj5 {
    public final /* synthetic */ yk5 a;

    public vh4(yk5 yk5Var) {
        this.a = yk5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        ph4 ph4Var;
        if (xn2Var instanceof ph4) {
            ph4Var = (ph4) xn2Var;
            int i = ph4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ph4Var.label = i - Integer.MIN_VALUE;
            } else {
                ph4Var = new ph4(this, xn2Var);
            }
        } else {
            ph4Var = new ph4(this, xn2Var);
        }
        Object obj = ph4Var.result;
        int i2 = ph4Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            th4 th4Var = new th4(xj5Var);
            ph4Var.L$0 = null;
            ph4Var.L$1 = null;
            ph4Var.L$2 = null;
            ph4Var.label = 1;
            Object objB = this.a.b(th4Var, ph4Var);
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
