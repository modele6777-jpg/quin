package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ex8 extends gbe implements l26 {
    final /* synthetic */ h0e $batch$delegate;
    final /* synthetic */ e89 $storageWarning$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex8(h0e h0eVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$batch$delegate = h0eVar;
        this.$storageWarning$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ex8(this.$batch$delegate, this.$storageWarning$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$storageWarning$delegate.setValue(Boolean.valueOf(((sw8) this.$batch$delegate.getValue()).c));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ex8 ex8Var = (ex8) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ex8Var.r(wefVar);
        return wefVar;
    }
}
