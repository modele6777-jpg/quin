package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cqc implements wj5 {
    public final /* synthetic */ ybc a;

    public cqc(ybc ybcVar) {
        this.a = ybcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        zpc zpcVar;
        if (xn2Var instanceof zpc) {
            zpcVar = (zpc) xn2Var;
            int i = zpcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zpcVar.label = i - Integer.MIN_VALUE;
            } else {
                zpcVar = new zpc(this, xn2Var);
            }
        } else {
            zpcVar = new zpc(this, xn2Var);
        }
        Object obj = zpcVar.result;
        int i2 = zpcVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            bqc bqcVar = new bqc(xj5Var);
            zpcVar.L$0 = null;
            zpcVar.L$1 = null;
            zpcVar.L$2 = null;
            zpcVar.label = 1;
            Object objB = this.a.b(bqcVar, zpcVar);
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
