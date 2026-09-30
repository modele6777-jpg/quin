package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i75 implements xj5 {
    public final /* synthetic */ xj5 a;

    public i75(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        h75 h75Var;
        if (xn2Var instanceof h75) {
            h75Var = (h75) xn2Var;
            int i = h75Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                h75Var.label = i - Integer.MIN_VALUE;
            } else {
                h75Var = new h75(this, xn2Var);
            }
        } else {
            h75Var = new h75(this, xn2Var);
        }
        Object obj2 = h75Var.result;
        int i2 = h75Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            String strName = ((t65) obj).a.getKey().name();
            h75Var.L$0 = null;
            h75Var.L$1 = null;
            h75Var.L$2 = null;
            h75Var.L$3 = null;
            h75Var.label = 1;
            Object objA = this.a.a(strName, h75Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
