package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ml5 implements xj5 {
    public final /* synthetic */ imb a;
    public final /* synthetic */ xj5 b;
    public final /* synthetic */ l26 c;

    public ml5(imb imbVar, xj5 xj5Var, l26 l26Var) {
        this.a = imbVar;
        this.b = xj5Var;
        this.c = l26Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        ll5 ll5Var;
        if (xn2Var instanceof ll5) {
            ll5Var = (ll5) xn2Var;
            int i = ll5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ll5Var.label = i - Integer.MIN_VALUE;
            } else {
                ll5Var = new ll5(this, xn2Var);
            }
        } else {
            ll5Var = new ll5(this, xn2Var);
        }
        Object objZ = ll5Var.result;
        int i2 = ll5Var.label;
        xj5 xj5Var = this.b;
        imb imbVar = this.a;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(objZ);
            if (imbVar.element) {
                ll5Var.L$0 = null;
                ll5Var.label = 1;
                if (xj5Var.a(obj, ll5Var) != bw2Var) {
                    return wefVar;
                }
            } else {
                ll5Var.L$0 = obj;
                ll5Var.label = 2;
                objZ = this.c.z(obj, ll5Var);
                if (objZ != bw2Var) {
                }
            }
            return bw2Var;
        }
        if (i2 == 1) {
            jzb.q(objZ);
            return wefVar;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                jzb.q(objZ);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj = ll5Var.L$0;
        jzb.q(objZ);
        if (!((Boolean) objZ).booleanValue()) {
            imbVar.element = true;
            ll5Var.L$0 = null;
            ll5Var.label = 3;
            if (xj5Var.a(obj, ll5Var) == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }
}
