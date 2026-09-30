package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ko3 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public ko3(wj5 wj5Var, isa isaVar, Object obj) {
        this.a = wj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        ho3 ho3Var;
        if (xn2Var instanceof ho3) {
            ho3Var = (ho3) xn2Var;
            int i = ho3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ho3Var.label = i - Integer.MIN_VALUE;
            } else {
                ho3Var = new ho3(this, xn2Var);
            }
        } else {
            ho3Var = new ho3(this, xn2Var);
        }
        Object obj = ho3Var.result;
        int i2 = ho3Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            jo3 jo3Var = new jo3(xj5Var, this.b, this.c);
            ho3Var.L$0 = null;
            ho3Var.L$1 = null;
            ho3Var.L$2 = null;
            ho3Var.label = 1;
            Object objB = this.a.b(jo3Var, ho3Var);
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
