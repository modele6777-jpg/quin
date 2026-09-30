package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ad2 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ float b;

    public ad2(xj5 xj5Var, float f) {
        this.a = xj5Var;
        this.b = f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        zc2 zc2Var;
        if (xn2Var instanceof zc2) {
            zc2Var = (zc2) xn2Var;
            int i = zc2Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zc2Var.label = i - Integer.MIN_VALUE;
            } else {
                zc2Var = new zc2(this, xn2Var);
            }
        } else {
            zc2Var = new zc2(this, xn2Var);
        }
        Object obj2 = zc2Var.result;
        int i2 = zc2Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            float fIntValue = ((Number) obj).intValue() / this.b;
            if (fIntValue > 1.0f) {
                fIntValue = 1.0f;
            }
            Float f = new Float(fIntValue);
            zc2Var.L$0 = null;
            zc2Var.L$1 = null;
            zc2Var.L$2 = null;
            zc2Var.L$3 = null;
            zc2Var.label = 1;
            Object objA = this.a.a(f, zc2Var);
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
