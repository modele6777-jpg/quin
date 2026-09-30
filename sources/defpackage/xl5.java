package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xl5 implements xj5 {
    public final /* synthetic */ n26 a;
    public final /* synthetic */ xj5 b;

    public xl5(n26 n26Var, xj5 xj5Var) {
        this.a = n26Var;
        this.b = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        wl5 wl5Var;
        if (xn2Var instanceof wl5) {
            wl5Var = (wl5) xn2Var;
            int i = wl5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wl5Var.label = i - Integer.MIN_VALUE;
            } else {
                wl5Var = new wl5(this, xn2Var);
            }
        } else {
            wl5Var = new wl5(this, xn2Var);
        }
        Object objM = wl5Var.result;
        int i2 = wl5Var.label;
        if (i2 == 0) {
            jzb.q(objM);
            wl5Var.L$0 = null;
            wl5Var.L$1 = null;
            wl5Var.L$2 = null;
            wl5Var.I$0 = 0;
            wl5Var.label = 1;
            objM = this.a.m(this.b, obj, wl5Var);
            bw2 bw2Var = bw2.a;
            if (objM == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objM);
        }
        if (((Boolean) objM).booleanValue()) {
            return wef.a;
        }
        throw new l(this);
    }
}
