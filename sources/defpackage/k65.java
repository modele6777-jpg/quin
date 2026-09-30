package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k65 implements wj5 {
    public final /* synthetic */ g65 a;
    public final /* synthetic */ l65 b;

    public k65(g65 g65Var, l65 l65Var) {
        this.a = g65Var;
        this.b = l65Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        h65 h65Var;
        if (xn2Var instanceof h65) {
            h65Var = (h65) xn2Var;
            int i = h65Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h65Var.label = i - Integer.MIN_VALUE;
            } else {
                h65Var = new h65(this, xn2Var);
            }
        } else {
            h65Var = new h65(this, xn2Var);
        }
        Object obj = h65Var.result;
        int i2 = h65Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            j65 j65Var = new j65(xj5Var, this.b);
            h65Var.L$0 = null;
            h65Var.L$1 = null;
            h65Var.L$2 = null;
            h65Var.label = 1;
            Object objB = this.a.b(j65Var, h65Var);
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
