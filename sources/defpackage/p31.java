package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p31 extends h36 implements x16 {
    final /* synthetic */ x16 $boundsProvider;
    final /* synthetic */ bv7 $childCoordinates;
    final /* synthetic */ t31 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p31(t31 t31Var, bv7 bv7Var, x16 x16Var) {
        super(0, oa7.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.this$0 = t31Var;
        this.$childCoordinates = bv7Var;
        this.$boundsProvider = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return t31.l1(this.this$0, this.$childCoordinates, this.$boundsProvider);
    }
}
