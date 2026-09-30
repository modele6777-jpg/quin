package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lm5 extends gbe implements l26 {
    /* synthetic */ int I$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lm5 lm5Var = new lm5(2, xn2Var);
        lm5Var.I$0 = ((Number) obj).intValue();
        return lm5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.I$0;
        if (this.label == 0) {
            jzb.q(obj);
            return Boolean.valueOf(i > 0);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lm5) k((xn2) obj2, Integer.valueOf(((Number) obj).intValue()))).r(wef.a);
    }
}
