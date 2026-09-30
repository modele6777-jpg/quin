package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fp2 implements xj5 {
    public final /* synthetic */ xj5 a;

    public fp2(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        ep2 ep2Var;
        if (xn2Var instanceof ep2) {
            ep2Var = (ep2) xn2Var;
            int i = ep2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ep2Var.label = i - Integer.MIN_VALUE;
            } else {
                ep2Var = new ep2(this, xn2Var);
            }
        } else {
            ep2Var = new ep2(this, xn2Var);
        }
        Object obj2 = ep2Var.result;
        int i2 = ep2Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            if (((Boolean) obj).booleanValue()) {
                ep2Var.L$0 = null;
                ep2Var.L$1 = null;
                ep2Var.L$2 = null;
                ep2Var.L$3 = null;
                ep2Var.label = 1;
                Object objA = this.a.a(obj, ep2Var);
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
