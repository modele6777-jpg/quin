package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ypa {
    public static fc3 d;
    public static final /* synthetic */ wn7[] b = {new bya(ypa.class)};
    public static final ypa a = new ypa();
    public static final dqa c = k99.L("donut", null, new zea(8), 10);

    public static wj5 b() {
        fc3 fc3Var = d;
        if (fc3Var != null) {
            return fc3Var.getData();
        }
        pa7.g0("store");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(l26 l26Var, xn2 xn2Var) {
        vpa vpaVar;
        if (xn2Var instanceof vpa) {
            vpaVar = (vpa) xn2Var;
            int i = vpaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vpaVar.label = i - Integer.MIN_VALUE;
            } else {
                vpaVar = new vpa(this, xn2Var);
            }
        } else {
            vpaVar = new vpa(this, xn2Var);
        }
        Object obj = vpaVar.result;
        int i2 = vpaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            fc3 fc3Var = d;
            if (fc3Var == null) {
                pa7.g0("store");
                throw null;
            }
            vpaVar.L$0 = null;
            vpaVar.label = 1;
            Object objA = fc3Var.a(new lsa(l26Var, null), vpaVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
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
