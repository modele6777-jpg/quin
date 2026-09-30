package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q6b extends gbe implements l26 {
    final /* synthetic */ long $id;
    final /* synthetic */ w6b $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6b(w6b w6bVar, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = w6bVar;
        this.$id = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new q6b(this.$viewModel, this.$id, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        w6b w6bVar = this.$viewModel;
        long j = this.$id;
        w6bVar.getClass();
        a62 a62VarA = hwf.a(w6bVar);
        js3 js3Var = ga4.a;
        ynb.V(a62VarA, hr3.c, null, new v6b(w6bVar, j, null), 2);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        q6b q6bVar = (q6b) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        q6bVar.r(wefVar);
        return wefVar;
    }
}
