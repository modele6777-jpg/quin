package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q30 implements wj5 {
    public final /* synthetic */ yk5 a;

    public q30(yk5 yk5Var) {
        this.a = yk5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        n30 n30Var;
        if (xn2Var instanceof n30) {
            n30Var = (n30) xn2Var;
            int i = n30Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                n30Var.label = i - Integer.MIN_VALUE;
            } else {
                n30Var = new n30(this, xn2Var);
            }
        } else {
            n30Var = new n30(this, xn2Var);
        }
        Object obj = n30Var.result;
        int i2 = n30Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            p30 p30Var = new p30(xj5Var);
            n30Var.L$0 = null;
            n30Var.L$1 = null;
            n30Var.L$2 = null;
            n30Var.label = 1;
            Object objB = this.a.b(p30Var, n30Var);
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
