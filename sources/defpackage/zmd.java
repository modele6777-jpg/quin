package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zmd implements wj5 {
    public final /* synthetic */ wj5 a;

    public zmd(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        wmd wmdVar;
        if (xn2Var instanceof wmd) {
            wmdVar = (wmd) xn2Var;
            int i = wmdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wmdVar.label = i - Integer.MIN_VALUE;
            } else {
                wmdVar = new wmd(this, xn2Var);
            }
        } else {
            wmdVar = new wmd(this, xn2Var);
        }
        Object obj = wmdVar.result;
        int i2 = wmdVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            ymd ymdVar = new ymd(xj5Var);
            wmdVar.L$0 = null;
            wmdVar.L$1 = null;
            wmdVar.L$2 = null;
            wmdVar.label = 1;
            Object objB = this.a.b(ymdVar, wmdVar);
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
