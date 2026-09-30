package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j75 implements wj5 {
    public final /* synthetic */ s0e a;

    public j75(s0e s0eVar) {
        this.a = s0eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) {
        g75 g75Var;
        if (xn2Var instanceof g75) {
            g75Var = (g75) xn2Var;
            int i = g75Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                g75Var.label = i - Integer.MIN_VALUE;
            } else {
                g75Var = new g75(this, xn2Var);
            }
        } else {
            g75Var = new g75(this, xn2Var);
        }
        Object obj = g75Var.result;
        int i2 = g75Var.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wef.a;
        }
        jzb.q(obj);
        i75 i75Var = new i75(xj5Var);
        g75Var.L$0 = null;
        g75Var.L$1 = null;
        g75Var.L$2 = null;
        g75Var.label = 1;
        this.a.b(i75Var, g75Var);
        return bw2.a;
    }
}
