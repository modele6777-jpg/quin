package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wsb implements wj5 {
    public final /* synthetic */ ssb a;

    public wsb(ssb ssbVar) {
        this.a = ssbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        tsb tsbVar;
        if (xn2Var instanceof tsb) {
            tsbVar = (tsb) xn2Var;
            int i = tsbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tsbVar.label = i - Integer.MIN_VALUE;
            } else {
                tsbVar = new tsb(this, xn2Var);
            }
        } else {
            tsbVar = new tsb(this, xn2Var);
        }
        Object obj = tsbVar.result;
        int i2 = tsbVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            vsb vsbVar = new vsb(xj5Var);
            tsbVar.L$0 = null;
            tsbVar.L$1 = null;
            tsbVar.L$2 = null;
            tsbVar.label = 1;
            Object objB = this.a.b(vsbVar, tsbVar);
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
