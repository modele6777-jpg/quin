package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ilf implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ awe b;

    public ilf(kcd kcdVar, awe aweVar) {
        this.a = kcdVar;
        this.b = aweVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        flf flfVar;
        if (xn2Var instanceof flf) {
            flfVar = (flf) xn2Var;
            int i = flfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flfVar.label = i - Integer.MIN_VALUE;
            } else {
                flfVar = new flf(this, xn2Var);
            }
        } else {
            flfVar = new flf(this, xn2Var);
        }
        Object obj = flfVar.result;
        int i2 = flfVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            hlf hlfVar = new hlf(xj5Var, this.b);
            flfVar.L$0 = null;
            flfVar.L$1 = null;
            flfVar.L$2 = null;
            flfVar.label = 1;
            Object objB = this.a.b(hlfVar, flfVar);
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
