package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wp1 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ xp1 b;
    public final /* synthetic */ int c;

    public wp1(s0e s0eVar, xp1 xp1Var, int i) {
        this.a = s0eVar;
        this.b = xp1Var;
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        tp1 tp1Var;
        if (xn2Var instanceof tp1) {
            tp1Var = (tp1) xn2Var;
            int i = tp1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tp1Var.label = i - Integer.MIN_VALUE;
            } else {
                tp1Var = new tp1(this, xn2Var);
            }
        } else {
            tp1Var = new tp1(this, xn2Var);
        }
        Object obj = tp1Var.result;
        int i2 = tp1Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            vp1 vp1Var = new vp1(xj5Var, this.b, this.c);
            tp1Var.L$0 = null;
            tp1Var.L$1 = null;
            tp1Var.L$2 = null;
            tp1Var.label = 1;
            Object objB = this.a.b(vp1Var, tp1Var);
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
