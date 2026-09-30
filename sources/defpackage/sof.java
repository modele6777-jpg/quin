package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sof implements wj5 {
    public final /* synthetic */ wj5 a;

    public sof(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        pof pofVar;
        if (xn2Var instanceof pof) {
            pofVar = (pof) xn2Var;
            int i = pofVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pofVar.label = i - Integer.MIN_VALUE;
            } else {
                pofVar = new pof(this, xn2Var);
            }
        } else {
            pofVar = new pof(this, xn2Var);
        }
        Object obj = pofVar.result;
        int i2 = pofVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            rof rofVar = new rof(xj5Var);
            pofVar.L$0 = null;
            pofVar.L$1 = null;
            pofVar.L$2 = null;
            pofVar.label = 1;
            Object objB = this.a.b(rofVar, pofVar);
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
