package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hl3 implements wj5 {
    public final /* synthetic */ wj5 a;

    public hl3(wj5 wj5Var) {
        this.a = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        el3 el3Var;
        if (xn2Var instanceof el3) {
            el3Var = (el3) xn2Var;
            int i = el3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                el3Var.label = i - Integer.MIN_VALUE;
            } else {
                el3Var = new el3(this, xn2Var);
            }
        } else {
            el3Var = new el3(this, xn2Var);
        }
        Object obj = el3Var.result;
        int i2 = el3Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            gl3 gl3Var = new gl3(xj5Var);
            el3Var.L$0 = null;
            el3Var.L$1 = null;
            el3Var.L$2 = null;
            el3Var.label = 1;
            Object objB = this.a.b(gl3Var, el3Var);
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
