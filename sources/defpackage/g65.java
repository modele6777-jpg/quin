package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g65 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public g65(wj5 wj5Var, isa isaVar, Object obj) {
        this.a = wj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        d65 d65Var;
        if (xn2Var instanceof d65) {
            d65Var = (d65) xn2Var;
            int i = d65Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                d65Var.label = i - Integer.MIN_VALUE;
            } else {
                d65Var = new d65(this, xn2Var);
            }
        } else {
            d65Var = new d65(this, xn2Var);
        }
        Object obj = d65Var.result;
        int i2 = d65Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            f65 f65Var = new f65(xj5Var, this.b, this.c);
            d65Var.L$0 = null;
            d65Var.L$1 = null;
            d65Var.L$2 = null;
            d65Var.label = 1;
            Object objB = this.a.b(f65Var, d65Var);
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
