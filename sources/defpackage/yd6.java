package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yd6 {
    public final f99 a = new f99();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) {
        xd6 xd6Var;
        d99 d99Var;
        if (zn2Var instanceof xd6) {
            xd6Var = (xd6) zn2Var;
            int i = xd6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xd6Var.label = i - Integer.MIN_VALUE;
            } else {
                xd6Var = new xd6(this, zn2Var);
            }
        } else {
            xd6Var = new xd6(this, zn2Var);
        }
        Object obj = xd6Var.result;
        int i2 = xd6Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            d99Var = this.a;
            xd6Var.L$0 = d99Var;
            xd6Var.label = 1;
            Object objB = d99Var.b(xd6Var);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d99Var = (d99) xd6Var.L$0;
            jzb.q(obj);
        }
        return new h99(d99Var);
    }
}
