package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uhc extends gbe implements l26 {
    final /* synthetic */ long $scrollAmount;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhc(long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.$scrollAmount = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        uhc uhcVar = new uhc(this.$scrollAmount, xn2Var);
        uhcVar.L$0 = obj;
        return uhcVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        dic dicVar = (dic) this.L$0;
        long j = this.$scrollAmount;
        gic gicVar = dicVar.a;
        gicVar.d(gicVar.k, j, 1);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        uhc uhcVar = (uhc) k((xn2) obj2, (dic) obj);
        wef wefVar = wef.a;
        uhcVar.r(wefVar);
        return wefVar;
    }
}
