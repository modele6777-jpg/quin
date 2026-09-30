package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dn4 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ isa b;
    public final /* synthetic */ Object c;

    public dn4(wj5 wj5Var, isa isaVar, Object obj) {
        this.a = wj5Var;
        this.b = isaVar;
        this.c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        an4 an4Var;
        if (xn2Var instanceof an4) {
            an4Var = (an4) xn2Var;
            int i = an4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                an4Var.label = i - Integer.MIN_VALUE;
            } else {
                an4Var = new an4(this, xn2Var);
            }
        } else {
            an4Var = new an4(this, xn2Var);
        }
        Object obj = an4Var.result;
        int i2 = an4Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            cn4 cn4Var = new cn4(xj5Var, this.b, this.c);
            an4Var.L$0 = null;
            an4Var.L$1 = null;
            an4Var.L$2 = null;
            an4Var.label = 1;
            Object objB = this.a.b(cn4Var, an4Var);
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
