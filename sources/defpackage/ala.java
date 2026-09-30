package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ala implements wj5 {
    public final /* synthetic */ wc8 a;

    public ala(wc8 wc8Var) {
        this.a = wc8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        xka xkaVar;
        if (xn2Var instanceof xka) {
            xkaVar = (xka) xn2Var;
            int i = xkaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xkaVar.label = i - Integer.MIN_VALUE;
            } else {
                xkaVar = new xka(this, xn2Var);
            }
        } else {
            xkaVar = new xka(this, xn2Var);
        }
        Object obj = xkaVar.result;
        int i2 = xkaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            zka zkaVar = new zka(xj5Var);
            xkaVar.L$0 = null;
            xkaVar.L$1 = null;
            xkaVar.L$2 = null;
            xkaVar.label = 1;
            Object objB = this.a.b(zkaVar, xkaVar);
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
