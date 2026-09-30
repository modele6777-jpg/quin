package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jt1 implements wj5 {
    public final /* synthetic */ wj5 a;

    public jt1(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        gt1 gt1Var;
        if (xn2Var instanceof gt1) {
            gt1Var = (gt1) xn2Var;
            int i = gt1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gt1Var.label = i - Integer.MIN_VALUE;
            } else {
                gt1Var = new gt1(this, xn2Var);
            }
        } else {
            gt1Var = new gt1(this, xn2Var);
        }
        Object obj = gt1Var.result;
        int i2 = gt1Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            it1 it1Var = new it1(xj5Var);
            gt1Var.L$0 = null;
            gt1Var.L$1 = null;
            gt1Var.L$2 = null;
            gt1Var.label = 1;
            Object objB = this.a.b(it1Var, gt1Var);
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
