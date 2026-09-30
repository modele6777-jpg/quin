package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nna implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public nna(xj5 xj5Var, isa isaVar, Object obj) {
        this.a = xj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        mna mnaVar;
        if (xn2Var instanceof mna) {
            mnaVar = (mna) xn2Var;
            int i = mnaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mnaVar.label = i - Integer.MIN_VALUE;
            } else {
                mnaVar = new mna(this, xn2Var);
            }
        } else {
            mnaVar = new mna(this, xn2Var);
        }
        Object obj2 = mnaVar.result;
        int i2 = mnaVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            Object objC = ((p79) obj).c(this.b);
            if (objC == null) {
                objC = this.c;
            }
            mnaVar.L$0 = null;
            mnaVar.L$1 = null;
            mnaVar.L$2 = null;
            mnaVar.L$3 = null;
            mnaVar.label = 1;
            Object objA = this.a.a(objC, mnaVar);
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
