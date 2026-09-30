package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oq2 implements xj5 {
    public final /* synthetic */ xj5 a;

    public oq2(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        nq2 nq2Var;
        if (xn2Var instanceof nq2) {
            nq2Var = (nq2) xn2Var;
            int i = nq2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nq2Var.label = i - Integer.MIN_VALUE;
            } else {
                nq2Var = new nq2(this, xn2Var);
            }
        } else {
            nq2Var = new nq2(this, xn2Var);
        }
        Object obj2 = nq2Var.result;
        int i2 = nq2Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            if (((String) obj).length() > 0) {
                nq2Var.L$0 = null;
                nq2Var.L$1 = null;
                nq2Var.L$2 = null;
                nq2Var.L$3 = null;
                nq2Var.label = 1;
                Object objA = this.a.a(obj, nq2Var);
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
