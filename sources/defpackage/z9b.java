package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z9b implements wj5 {
    public final /* synthetic */ v9b a;

    public z9b(v9b v9bVar) {
        this.a = v9bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        w9b w9bVar;
        if (xn2Var instanceof w9b) {
            w9bVar = (w9b) xn2Var;
            int i = w9bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                w9bVar.label = i - Integer.MIN_VALUE;
            } else {
                w9bVar = new w9b(this, xn2Var);
            }
        } else {
            w9bVar = new w9b(this, xn2Var);
        }
        Object obj = w9bVar.result;
        int i2 = w9bVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            y9b y9bVar = new y9b(xj5Var);
            w9bVar.L$0 = null;
            w9bVar.L$1 = null;
            w9bVar.L$2 = null;
            w9bVar.label = 1;
            Object objB = this.a.b(y9bVar, w9bVar);
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
