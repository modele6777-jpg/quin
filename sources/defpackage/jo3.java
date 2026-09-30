package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jo3 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public jo3(xj5 xj5Var, isa isaVar, Object obj) {
        this.a = xj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        io3 io3Var;
        if (xn2Var instanceof io3) {
            io3Var = (io3) xn2Var;
            int i = io3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                io3Var.label = i - Integer.MIN_VALUE;
            } else {
                io3Var = new io3(this, xn2Var);
            }
        } else {
            io3Var = new io3(this, xn2Var);
        }
        Object obj2 = io3Var.result;
        int i2 = io3Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            Object objC = ((p79) obj).c(this.b);
            if (objC == null) {
                objC = this.c;
            }
            io3Var.L$0 = null;
            io3Var.L$1 = null;
            io3Var.L$2 = null;
            io3Var.L$3 = null;
            io3Var.label = 1;
            Object objA = this.a.a(objC, io3Var);
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
