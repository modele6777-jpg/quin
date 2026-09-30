package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wbb implements wj5 {
    public final /* synthetic */ ucb a;

    public wbb(ucb ucbVar) {
        this.a = ucbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        tbb tbbVar;
        if (xn2Var instanceof tbb) {
            tbbVar = (tbb) xn2Var;
            int i = tbbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbbVar.label = i - Integer.MIN_VALUE;
            } else {
                tbbVar = new tbb(this, xn2Var);
            }
        } else {
            tbbVar = new tbb(this, xn2Var);
        }
        Object obj = tbbVar.result;
        int i2 = tbbVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            vbb vbbVar = new vbb(xj5Var);
            tbbVar.L$0 = null;
            tbbVar.L$1 = null;
            tbbVar.L$2 = null;
            tbbVar.label = 1;
            Object objB = this.a.b(vbbVar, tbbVar);
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
