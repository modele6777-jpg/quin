package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yaa implements xj5 {
    public final /* synthetic */ xj5 a;

    public yaa(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        xaa xaaVar;
        if (xn2Var instanceof xaa) {
            xaaVar = (xaa) xn2Var;
            int i = xaaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xaaVar.label = i - Integer.MIN_VALUE;
            } else {
                xaaVar = new xaa(this, xn2Var);
            }
        } else {
            xaaVar = new xaa(this, xn2Var);
        }
        Object obj2 = xaaVar.result;
        int i2 = xaaVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            String str = (String) obj;
            Object uaaVar = str == null ? taa.a : new uaa(str);
            xaaVar.L$0 = null;
            xaaVar.L$1 = null;
            xaaVar.L$2 = null;
            xaaVar.L$3 = null;
            xaaVar.label = 1;
            Object objA = this.a.a(uaaVar, xaaVar);
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
