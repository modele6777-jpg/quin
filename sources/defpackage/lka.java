package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lka implements wj5 {
    public final /* synthetic */ ybc a;

    public lka(ybc ybcVar) {
        this.a = ybcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        ika ikaVar;
        if (xn2Var instanceof ika) {
            ikaVar = (ika) xn2Var;
            int i = ikaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ikaVar.label = i - Integer.MIN_VALUE;
            } else {
                ikaVar = new ika(this, xn2Var);
            }
        } else {
            ikaVar = new ika(this, xn2Var);
        }
        Object obj = ikaVar.result;
        int i2 = ikaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            kka kkaVar = new kka(xj5Var);
            ikaVar.L$0 = null;
            ikaVar.L$1 = null;
            ikaVar.L$2 = null;
            ikaVar.label = 1;
            Object objB = this.a.b(kkaVar, ikaVar);
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
