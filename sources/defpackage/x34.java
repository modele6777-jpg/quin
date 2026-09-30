package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x34 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public x34(xj5 xj5Var, isa isaVar, Object obj) {
        this.a = xj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        w34 w34Var;
        if (xn2Var instanceof w34) {
            w34Var = (w34) xn2Var;
            int i = w34Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                w34Var.label = i - Integer.MIN_VALUE;
            } else {
                w34Var = new w34(this, xn2Var);
            }
        } else {
            w34Var = new w34(this, xn2Var);
        }
        Object obj2 = w34Var.result;
        int i2 = w34Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            Object objC = ((p79) obj).c(this.b);
            if (objC == null) {
                objC = this.c;
            }
            w34Var.L$0 = null;
            w34Var.L$1 = null;
            w34Var.L$2 = null;
            w34Var.L$3 = null;
            w34Var.label = 1;
            Object objA = this.a.a(objC, w34Var);
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
