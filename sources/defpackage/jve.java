package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jve implements wj5 {
    public final /* synthetic */ wj5 a;

    public jve(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        gve gveVar;
        if (xn2Var instanceof gve) {
            gveVar = (gve) xn2Var;
            int i = gveVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gveVar.label = i - Integer.MIN_VALUE;
            } else {
                gveVar = new gve(this, xn2Var);
            }
        } else {
            gveVar = new gve(this, xn2Var);
        }
        Object obj = gveVar.result;
        int i2 = gveVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            ive iveVar = new ive(xj5Var);
            gveVar.L$0 = null;
            gveVar.L$1 = null;
            gveVar.L$2 = null;
            gveVar.label = 1;
            Object objB = this.a.b(iveVar, gveVar);
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
