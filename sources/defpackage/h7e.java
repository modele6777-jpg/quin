package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h7e extends h36 implements x16 {
    final /* synthetic */ ted $bottomSheetState;
    final /* synthetic */ x16 $onDismiss;
    final /* synthetic */ aw2 $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7e(aw2 aw2Var, x16 x16Var, ted tedVar) {
        super(0, oa7.class, "hide", "SubscriptionExpirationAlertSheet$lambda$1$hide(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;)V", 0);
        this.$scope = aw2Var;
        this.$bottomSheetState = tedVar;
        this.$onDismiss = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        ynb.V(this.$scope, null, null, new j7e(null, this.$onDismiss, this.$bottomSheetState), 3);
        return wef.a;
    }
}
