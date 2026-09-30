package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mk implements wj5 {
    public final /* synthetic */ wj5 a;

    public mk(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        jk jkVar;
        if (xn2Var instanceof jk) {
            jkVar = (jk) xn2Var;
            int i = jkVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jkVar.label = i - Integer.MIN_VALUE;
            } else {
                jkVar = new jk(this, xn2Var);
            }
        } else {
            jkVar = new jk(this, xn2Var);
        }
        Object obj = jkVar.result;
        int i2 = jkVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            lk lkVar = new lk(xj5Var);
            jkVar.L$0 = null;
            jkVar.L$1 = null;
            jkVar.L$2 = null;
            jkVar.label = 1;
            Object objB = this.a.b(lkVar, jkVar);
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
