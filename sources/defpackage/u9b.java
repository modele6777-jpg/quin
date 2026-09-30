package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class u9b implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public u9b(xj5 xj5Var, isa isaVar, Object obj) {
        this.a = xj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        t9b t9bVar;
        if (xn2Var instanceof t9b) {
            t9bVar = (t9b) xn2Var;
            int i = t9bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                t9bVar.label = i - Integer.MIN_VALUE;
            } else {
                t9bVar = new t9b(this, xn2Var);
            }
        } else {
            t9bVar = new t9b(this, xn2Var);
        }
        Object obj2 = t9bVar.result;
        int i2 = t9bVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            Object objC = ((p79) obj).c(this.b);
            if (objC == null) {
                objC = this.c;
            }
            t9bVar.L$0 = null;
            t9bVar.L$1 = null;
            t9bVar.L$2 = null;
            t9bVar.L$3 = null;
            t9bVar.label = 1;
            Object objA = this.a.a(objC, t9bVar);
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
