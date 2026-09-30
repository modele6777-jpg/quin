package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uk implements wj5 {
    public final /* synthetic */ al5 a;

    public uk(al5 al5Var) {
        this.a = al5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        rk rkVar;
        if (xn2Var instanceof rk) {
            rkVar = (rk) xn2Var;
            int i = rkVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rkVar.label = i - Integer.MIN_VALUE;
            } else {
                rkVar = new rk(this, xn2Var);
            }
        } else {
            rkVar = new rk(this, xn2Var);
        }
        Object obj = rkVar.result;
        int i2 = rkVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            tk tkVar = new tk(xj5Var);
            rkVar.L$0 = null;
            rkVar.L$1 = null;
            rkVar.L$2 = null;
            rkVar.label = 1;
            Object objB = this.a.b(tkVar, rkVar);
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
