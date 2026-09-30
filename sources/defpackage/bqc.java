package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bqc implements xj5 {
    public final /* synthetic */ xj5 a;

    public bqc(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        aqc aqcVar;
        if (xn2Var instanceof aqc) {
            aqcVar = (aqc) xn2Var;
            int i = aqcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqcVar.label = i - Integer.MIN_VALUE;
            } else {
                aqcVar = new aqc(this, xn2Var);
            }
        } else {
            aqcVar = new aqc(this, xn2Var);
        }
        Object obj2 = aqcVar.result;
        int i2 = aqcVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            lpc lpcVar = new lpc((upc) obj);
            aqcVar.L$0 = null;
            aqcVar.L$1 = null;
            aqcVar.L$2 = null;
            aqcVar.L$3 = null;
            aqcVar.label = 1;
            Object objA = this.a.a(lpcVar, aqcVar);
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
