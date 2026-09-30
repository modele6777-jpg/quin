package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gd extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gd gdVar = new gd(2, xn2Var);
        gdVar.L$0 = obj;
        return gdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        yi1 yi1Var = (yi1) this.L$0;
        return Boolean.valueOf((yi1Var instanceof cj1) || (yi1Var instanceof bj1));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gd) k((xn2) obj2, (yi1) obj)).r(wef.a);
    }
}
