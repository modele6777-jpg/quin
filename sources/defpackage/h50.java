package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h50 implements xj5 {
    public final /* synthetic */ xj5 a;

    public h50(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        g50 g50Var;
        if (xn2Var instanceof g50) {
            g50Var = (g50) xn2Var;
            int i = g50Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                g50Var.label = i - Integer.MIN_VALUE;
            } else {
                g50Var = new g50(this, xn2Var);
            }
        } else {
            g50Var = new g50(this, xn2Var);
        }
        Object obj2 = g50Var.result;
        int i2 = g50Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            f30 f30Var = (f30) obj;
            v50 v50Var = f30Var != null ? f30Var.d : null;
            g50Var.L$0 = null;
            g50Var.L$1 = null;
            g50Var.L$2 = null;
            g50Var.L$3 = null;
            g50Var.label = 1;
            Object objA = this.a.a(v50Var, g50Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
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
