package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y34 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public y34(wj5 wj5Var, isa isaVar, Object obj) {
        this.a = wj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        v34 v34Var;
        if (xn2Var instanceof v34) {
            v34Var = (v34) xn2Var;
            int i = v34Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                v34Var.label = i - Integer.MIN_VALUE;
            } else {
                v34Var = new v34(this, xn2Var);
            }
        } else {
            v34Var = new v34(this, xn2Var);
        }
        Object obj = v34Var.result;
        int i2 = v34Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            x34 x34Var = new x34(xj5Var, this.b, this.c);
            v34Var.L$0 = null;
            v34Var.L$1 = null;
            v34Var.L$2 = null;
            v34Var.label = 1;
            Object objB = this.a.b(x34Var, v34Var);
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
