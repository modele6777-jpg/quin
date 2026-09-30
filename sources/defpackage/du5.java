package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class du5 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public du5(wj5 wj5Var, isa isaVar, Object obj) {
        this.a = wj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        au5 au5Var;
        if (xn2Var instanceof au5) {
            au5Var = (au5) xn2Var;
            int i = au5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                au5Var.label = i - Integer.MIN_VALUE;
            } else {
                au5Var = new au5(this, xn2Var);
            }
        } else {
            au5Var = new au5(this, xn2Var);
        }
        Object obj = au5Var.result;
        int i2 = au5Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            cu5 cu5Var = new cu5(xj5Var, this.b, this.c);
            au5Var.L$0 = null;
            au5Var.L$1 = null;
            au5Var.L$2 = null;
            au5Var.label = 1;
            Object objB = this.a.b(cu5Var, au5Var);
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
