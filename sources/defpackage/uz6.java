package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uz6 implements cz6 {
    public final zt8 a;
    public final bz6 b;
    public final gd8 c;

    public uz6(zt8 zt8Var, bz6 bz6Var, gd8 gd8Var) {
        this.a = zt8Var;
        this.b = bz6Var;
        this.c = gd8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) {
        pz6 pz6Var;
        if (zn2Var instanceof pz6) {
            pz6Var = (pz6) zn2Var;
            int i = pz6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pz6Var.label = i - Integer.MIN_VALUE;
            } else {
                pz6Var = new pz6(this, zn2Var);
            }
        } else {
            pz6Var = new pz6(this, zn2Var);
        }
        Object obj = pz6Var.result;
        int i2 = pz6Var.label;
        wef wefVar = wef.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    jzb.q(obj);
                    return wefVar;
                }
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            bz6 bz6Var = this.b;
            pz6Var.label = 1;
            Object objK = urg.K(pz6Var, new tk6(21), bz6Var.a, false, true);
            bw2 bw2Var = bw2.a;
            if (objK != bw2Var) {
                objK = wefVar;
            }
            return objK == bw2Var ? bw2Var : wefVar;
        } catch (Throwable unused) {
        }
    }
}
