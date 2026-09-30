package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s31 extends gbe implements l26 {
    final /* synthetic */ x16 $boundsProvider;
    final /* synthetic */ bv7 $childCoordinates;
    final /* synthetic */ x16 $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ t31 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(t31 t31Var, bv7 bv7Var, x16 x16Var, x16 x16Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = t31Var;
        this.$childCoordinates = bv7Var;
        this.$boundsProvider = x16Var;
        this.$parentRect = x16Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        s31 s31Var = new s31(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, xn2Var);
        s31Var.L$0 = obj;
        return s31Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        ynb.V(aw2Var, null, null, new q31(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3);
        return ynb.V(aw2Var, null, null, new r31(this.this$0, this.$parentRect, null), 3);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((s31) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
