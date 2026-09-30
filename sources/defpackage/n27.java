package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n27 extends gbe implements l26 {
    /* synthetic */ float F$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        n27 n27Var = new n27(2, xn2Var);
        n27Var.F$0 = ((Number) obj).floatValue();
        return n27Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label == 0) {
            jzb.q(obj);
            return Boolean.valueOf(this.F$0 > 0.0f);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((n27) k((xn2) obj2, Float.valueOf(((Number) obj).floatValue()))).r(wef.a);
    }
}
