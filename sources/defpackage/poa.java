package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class poa implements wj5 {
    public final /* synthetic */ wj5 a;

    public poa(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        moa moaVar;
        if (xn2Var instanceof moa) {
            moaVar = (moa) xn2Var;
            int i = moaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                moaVar.label = i - Integer.MIN_VALUE;
            } else {
                moaVar = new moa(this, xn2Var);
            }
        } else {
            moaVar = new moa(this, xn2Var);
        }
        Object obj = moaVar.result;
        int i2 = moaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            ooa ooaVar = new ooa(xj5Var);
            moaVar.L$0 = null;
            moaVar.L$1 = null;
            moaVar.L$2 = null;
            moaVar.label = 1;
            Object objB = this.a.b(ooaVar, moaVar);
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
