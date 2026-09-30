package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bd2 implements wj5 {
    public final /* synthetic */ ybc a;
    public final /* synthetic */ float b;

    public bd2(ybc ybcVar, float f) {
        this.a = ybcVar;
        this.b = f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        yc2 yc2Var;
        if (xn2Var instanceof yc2) {
            yc2Var = (yc2) xn2Var;
            int i = yc2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                yc2Var.label = i - Integer.MIN_VALUE;
            } else {
                yc2Var = new yc2(this, xn2Var);
            }
        } else {
            yc2Var = new yc2(this, xn2Var);
        }
        Object obj = yc2Var.result;
        int i2 = yc2Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            ad2 ad2Var = new ad2(xj5Var, this.b);
            yc2Var.L$0 = null;
            yc2Var.L$1 = null;
            yc2Var.L$2 = null;
            yc2Var.label = 1;
            Object objB = this.a.b(ad2Var, yc2Var);
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
