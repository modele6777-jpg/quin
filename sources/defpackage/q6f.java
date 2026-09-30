package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q6f implements wj5 {
    public final /* synthetic */ whb a;

    public q6f(whb whbVar) {
        this.a = whbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        n6f n6fVar;
        if (xn2Var instanceof n6f) {
            n6fVar = (n6f) xn2Var;
            int i = n6fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                n6fVar.label = i - Integer.MIN_VALUE;
            } else {
                n6fVar = new n6f(this, xn2Var);
            }
        } else {
            n6fVar = new n6f(this, xn2Var);
        }
        Object obj = n6fVar.result;
        int i2 = n6fVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            p6f p6fVar = new p6f(xj5Var);
            n6fVar.L$0 = null;
            n6fVar.L$1 = null;
            n6fVar.L$2 = null;
            n6fVar.label = 1;
            Object objB = this.a.a.b(p6fVar, n6fVar);
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
