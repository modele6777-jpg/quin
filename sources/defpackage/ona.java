package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ona implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public ona(wj5 wj5Var, isa isaVar, Object obj) {
        this.a = wj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        lna lnaVar;
        if (xn2Var instanceof lna) {
            lnaVar = (lna) xn2Var;
            int i = lnaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lnaVar.label = i - Integer.MIN_VALUE;
            } else {
                lnaVar = new lna(this, xn2Var);
            }
        } else {
            lnaVar = new lna(this, xn2Var);
        }
        Object obj = lnaVar.result;
        int i2 = lnaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            nna nnaVar = new nna(xj5Var, this.b, this.c);
            lnaVar.L$0 = null;
            lnaVar.L$1 = null;
            lnaVar.L$2 = null;
            lnaVar.label = 1;
            Object objB = this.a.b(nnaVar, lnaVar);
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
