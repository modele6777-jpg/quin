package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ao3 implements xj5 {
    public final /* synthetic */ xj5 a;

    public ao3(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        zn3 zn3Var;
        if (xn2Var instanceof zn3) {
            zn3Var = (zn3) xn2Var;
            int i = zn3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zn3Var.label = i - Integer.MIN_VALUE;
            } else {
                zn3Var = new zn3(this, xn2Var);
            }
        } else {
            zn3Var = new zn3(this, xn2Var);
        }
        Object obj2 = zn3Var.result;
        int i2 = zn3Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            Boolean boolValueOf = Boolean.valueOf(!v4e.Q((String) obj));
            zn3Var.L$0 = null;
            zn3Var.L$1 = null;
            zn3Var.L$2 = null;
            zn3Var.L$3 = null;
            zn3Var.label = 1;
            Object objA = this.a.a(boolValueOf, zn3Var);
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
