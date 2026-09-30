package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u34 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public u34(wj5 wj5Var, isa isaVar, Object obj) {
        this.a = wj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        r34 r34Var;
        if (xn2Var instanceof r34) {
            r34Var = (r34) xn2Var;
            int i = r34Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                r34Var.label = i - Integer.MIN_VALUE;
            } else {
                r34Var = new r34(this, xn2Var);
            }
        } else {
            r34Var = new r34(this, xn2Var);
        }
        Object obj = r34Var.result;
        int i2 = r34Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            t34 t34Var = new t34(xj5Var, this.b, this.c);
            r34Var.L$0 = null;
            r34Var.L$1 = null;
            r34Var.L$2 = null;
            r34Var.label = 1;
            Object objB = this.a.b(t34Var, r34Var);
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
