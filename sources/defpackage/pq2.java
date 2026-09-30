package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pq2 implements wj5 {
    public final /* synthetic */ wj5 a;

    public pq2(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        mq2 mq2Var;
        if (xn2Var instanceof mq2) {
            mq2Var = (mq2) xn2Var;
            int i = mq2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mq2Var.label = i - Integer.MIN_VALUE;
            } else {
                mq2Var = new mq2(this, xn2Var);
            }
        } else {
            mq2Var = new mq2(this, xn2Var);
        }
        Object obj = mq2Var.result;
        int i2 = mq2Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            oq2 oq2Var = new oq2(xj5Var);
            mq2Var.L$0 = null;
            mq2Var.L$1 = null;
            mq2Var.L$2 = null;
            mq2Var.label = 1;
            Object objB = this.a.b(oq2Var, mq2Var);
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
