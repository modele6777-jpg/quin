package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yfd extends czb implements l26 {
    private /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        yfd yfdVar = new yfd(2, xn2Var);
        yfdVar.L$0 = obj;
        return yfdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        mbe mbeVar = (mbe) this.L$0;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.L$0 = null;
        this.label = 1;
        Object objJ = ffe.j(mbeVar, iia.b, this);
        bw2 bw2Var = bw2.a;
        return objJ == bw2Var ? bw2Var : objJ;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yfd) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
