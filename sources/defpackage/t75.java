package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t75 implements wj5 {
    public final /* synthetic */ wm5 a;

    public t75(wm5 wm5Var) {
        this.a = wm5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        q75 q75Var;
        if (xn2Var instanceof q75) {
            q75Var = (q75) xn2Var;
            int i = q75Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                q75Var.label = i - Integer.MIN_VALUE;
            } else {
                q75Var = new q75(this, xn2Var);
            }
        } else {
            q75Var = new q75(this, xn2Var);
        }
        Object obj = q75Var.result;
        int i2 = q75Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            s75 s75Var = new s75(xj5Var);
            q75Var.L$0 = null;
            q75Var.L$1 = null;
            q75Var.L$2 = null;
            q75Var.label = 1;
            Object objB = this.a.b(s75Var, q75Var);
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
