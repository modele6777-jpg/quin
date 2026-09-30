package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ela implements wj5 {
    public final /* synthetic */ wm5 a;

    public ela(wm5 wm5Var) {
        this.a = wm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        bla blaVar;
        if (xn2Var instanceof bla) {
            blaVar = (bla) xn2Var;
            int i = blaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                blaVar.label = i - Integer.MIN_VALUE;
            } else {
                blaVar = new bla(this, xn2Var);
            }
        } else {
            blaVar = new bla(this, xn2Var);
        }
        Object obj = blaVar.result;
        int i2 = blaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            dla dlaVar = new dla(xj5Var);
            blaVar.L$0 = null;
            blaVar.L$1 = null;
            blaVar.L$2 = null;
            blaVar.label = 1;
            Object objB = this.a.b(dlaVar, blaVar);
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
