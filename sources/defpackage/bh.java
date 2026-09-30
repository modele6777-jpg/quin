package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bh extends gbe implements l26 {
    final /* synthetic */ x16 $onSuccess;
    final /* synthetic */ fh $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(fh fhVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$vm = fhVar;
        this.$onSuccess = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bh(this.$vm, this.$onSuccess, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        izb izbVar = (izb) this.$vm.U0.getValue();
        if ((izbVar == null ? -1 : ah.a[izbVar.ordinal()]) == 1) {
            this.$onSuccess.invoke();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        bh bhVar = (bh) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        bhVar.r(wefVar);
        return wefVar;
    }
}
