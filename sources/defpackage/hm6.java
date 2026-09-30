package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hm6 extends h36 implements x16 {
    final /* synthetic */ aw2 $coroutineScope;
    final /* synthetic */ e89 $drawerStateValue$delegate;
    final /* synthetic */ jx $translationY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm6(aw2 aw2Var, jx jxVar, e89 e89Var) {
        super(0, oa7.class, "closeDrawer", "HomeAndHistoryScreen$closeDrawer(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableState;)V", 0);
        this.$coroutineScope = aw2Var;
        this.$translationY = jxVar;
        this.$drawerStateValue$delegate = e89Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        ynb.V(this.$coroutineScope, null, null, new rm6(this.$translationY, this.$drawerStateValue$delegate, null), 3);
        return wef.a;
    }
}
