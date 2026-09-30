package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l07 implements wj5 {
    public final /* synthetic */ oz6 a;

    public l07(oz6 oz6Var) {
        this.a = oz6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        i07 i07Var;
        if (xn2Var instanceof i07) {
            i07Var = (i07) xn2Var;
            int i = i07Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                i07Var.label = i - Integer.MIN_VALUE;
            } else {
                i07Var = new i07(this, xn2Var);
            }
        } else {
            i07Var = new i07(this, xn2Var);
        }
        Object obj = i07Var.result;
        int i2 = i07Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            k07 k07Var = new k07(xj5Var);
            i07Var.L$0 = null;
            i07Var.L$1 = null;
            i07Var.L$2 = null;
            i07Var.label = 1;
            Object objB = this.a.b(k07Var, i07Var);
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
