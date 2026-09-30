package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v83 extends h36 implements x16 {
    final /* synthetic */ o9 $accountProfileRepository;
    final /* synthetic */ Context $context;
    final /* synthetic */ e89 $isSubmitting$delegate;
    final /* synthetic */ x16 $onDismiss;
    final /* synthetic */ a93 $pendingSubmission;
    final /* synthetic */ d83 $promptMode;
    final /* synthetic */ aw2 $scope;
    final /* synthetic */ e89 $step$delegate;
    final /* synthetic */ gpf $userRequester;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v83(a93 a93Var, aw2 aw2Var, e89 e89Var, d83 d83Var, Context context, gpf gpfVar, o9 o9Var, x16 x16Var, e89 e89Var2) {
        super(0, oa7.class, "enableAndShowSuccess", "DailyFortuneReminderTouchpointPopup$enableAndShowSuccess(Lai/askquin/ui/popup/notification/DailyFortuneReminderTouchpointSubmission;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Lai/askquin/ui/popup/notification/DailyFortuneReminderPromptMode;Landroid/content/Context;Ltech/chatmind/api/UserRequester;Lai/askquin/data/AccountProfileRepository;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;)V", 0);
        this.$pendingSubmission = a93Var;
        this.$scope = aw2Var;
        this.$isSubmitting$delegate = e89Var;
        this.$promptMode = d83Var;
        this.$context = context;
        this.$userRequester = gpfVar;
        this.$accountProfileRepository = o9Var;
        this.$onDismiss = x16Var;
        this.$step$delegate = e89Var2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        z83.d(this.$pendingSubmission, this.$scope, this.$isSubmitting$delegate, this.$promptMode, this.$context, this.$userRequester, this.$accountProfileRepository, this.$onDismiss, this.$step$delegate);
        return wef.a;
    }
}
