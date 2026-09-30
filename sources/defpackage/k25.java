package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k25 implements wj5 {
    public final /* synthetic */ g25 a;
    public final /* synthetic */ m25 b;

    public k25(g25 g25Var, m25 m25Var) {
        this.a = g25Var;
        this.b = m25Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        h25 h25Var;
        if (xn2Var instanceof h25) {
            h25Var = (h25) xn2Var;
            int i = h25Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h25Var.label = i - Integer.MIN_VALUE;
            } else {
                h25Var = new h25(this, xn2Var);
            }
        } else {
            h25Var = new h25(this, xn2Var);
        }
        Object obj = h25Var.result;
        int i2 = h25Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            j25 j25Var = new j25(xj5Var, this.b);
            h25Var.L$0 = null;
            h25Var.L$1 = null;
            h25Var.L$2 = null;
            h25Var.label = 1;
            Object objB = this.a.b(j25Var, h25Var);
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
