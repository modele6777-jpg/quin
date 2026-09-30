package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pm5 implements xj5 {
    public final /* synthetic */ xj5 a;

    public pm5(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        om5 om5Var;
        if (xn2Var instanceof om5) {
            om5Var = (om5) xn2Var;
            int i = om5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                om5Var.label = i - Integer.MIN_VALUE;
            } else {
                om5Var = new om5(this, xn2Var);
            }
        } else {
            om5Var = new om5(this, xn2Var);
        }
        Object obj2 = om5Var.result;
        int i2 = om5Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            if (obj != null) {
                om5Var.L$0 = null;
                om5Var.L$1 = null;
                om5Var.L$2 = null;
                om5Var.L$3 = null;
                om5Var.I$0 = 0;
                om5Var.label = 1;
                Object objA = this.a.a(obj, om5Var);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
