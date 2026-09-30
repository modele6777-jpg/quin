package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dm5 implements xj5 {
    public final /* synthetic */ l26 a;
    public final /* synthetic */ mmb b;

    public dm5(l26 l26Var, mmb mmbVar) {
        this.a = l26Var;
        this.b = mmbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        cm5 cm5Var;
        if (xn2Var instanceof cm5) {
            cm5Var = (cm5) xn2Var;
            int i = cm5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cm5Var.label = i - Integer.MIN_VALUE;
            } else {
                cm5Var = new cm5(this, xn2Var);
            }
        } else {
            cm5Var = new cm5(this, xn2Var);
        }
        Object objZ = cm5Var.result;
        int i2 = cm5Var.label;
        if (i2 == 0) {
            jzb.q(objZ);
            cm5Var.L$0 = null;
            cm5Var.L$1 = null;
            cm5Var.L$2 = obj;
            cm5Var.I$0 = 0;
            cm5Var.label = 1;
            objZ = this.a.z(obj, cm5Var);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = cm5Var.L$2;
            jzb.q(objZ);
        }
        if (!((Boolean) objZ).booleanValue()) {
            return wef.a;
        }
        this.b.element = obj;
        throw new l(this);
    }
}
