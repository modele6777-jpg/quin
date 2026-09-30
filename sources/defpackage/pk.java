package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pk extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        pk pkVar = new pk(2, xn2Var);
        pkVar.L$0 = obj;
        return pkVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        v16 v16Var = (v16) this.L$0;
        if (this.label == 0) {
            jzb.q(obj);
            return Boolean.valueOf(v16Var != null);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pk) k((xn2) obj2, (v16) obj)).r(wef.a);
    }
}
