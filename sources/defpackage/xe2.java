package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xe2 extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xe2(2, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label == 0) {
            jzb.q(obj);
            return wef.a;
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        xe2 xe2Var = (xe2) k((xn2) obj2, (wj5) obj);
        wef wefVar = wef.a;
        xe2Var.r(wefVar);
        return wefVar;
    }
}
