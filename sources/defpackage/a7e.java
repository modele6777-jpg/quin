package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a7e extends gbe implements l26 {
    final /* synthetic */ gh6 $haptic;
    final /* synthetic */ fcb $ratingConditionManager;
    final /* synthetic */ boolean $showWeComQrCode;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7e(gh6 gh6Var, fcb fcbVar, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.$haptic = gh6Var;
        this.$ratingConditionManager = fcbVar;
        this.$showWeComQrCode = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new a7e(this.$haptic, this.$ratingConditionManager, this.$showWeComQrCode, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$haptic.b(hh6.b);
        fcb fcbVar = this.$ratingConditionManager;
        fcbVar.getClass();
        fcbVar.a(new ybb(1, null));
        if (this.$showWeComQrCode) {
            x1f x1fVar = x1f.a;
            x1f.g(new r05("popup_view"), m1f.c, new znd(15));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        a7e a7eVar = (a7e) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        a7eVar.r(wefVar);
        return wefVar;
    }
}
