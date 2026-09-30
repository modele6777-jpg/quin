package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hi9 extends h36 implements x16 {
    final /* synthetic */ o9 $accountProfileRepository;
    final /* synthetic */ Context $context;
    final /* synthetic */ e89 $isSubmitting$delegate;
    final /* synthetic */ x16 $onSkip;
    final /* synthetic */ g83 $pendingSubmission;
    final /* synthetic */ aw2 $scope;
    final /* synthetic */ gpf $userRequester;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi9(g83 g83Var, aw2 aw2Var, e89 e89Var, Context context, gpf gpfVar, o9 o9Var, x16 x16Var) {
        super(0, oa7.class, "enableAndLeave", "NotificationSettingScreen$enableAndLeave(Lai/askquin/ui/onboard/setnotification/DailyFortuneReminderSubmission;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Ltech/chatmind/api/UserRequester;Lai/askquin/data/AccountProfileRepository;Lkotlin/jvm/functions/Function0;)V", 0);
        this.$pendingSubmission = g83Var;
        this.$scope = aw2Var;
        this.$isSubmitting$delegate = e89Var;
        this.$context = context;
        this.$userRequester = gpfVar;
        this.$accountProfileRepository = o9Var;
        this.$onSkip = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        pa7.m(this.$pendingSubmission, this.$scope, this.$isSubmitting$delegate, this.$context, this.$userRequester, this.$accountProfileRepository, this.$onSkip);
        return wef.a;
    }
}
