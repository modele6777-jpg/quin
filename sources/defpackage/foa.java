package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class foa extends h36 implements x16 {
    final /* synthetic */ az1 $childReadingTrackingContext;
    final /* synthetic */ Context $context;
    final /* synthetic */ yk8 $permissionLauncher;
    final /* synthetic */ soa $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foa(Context context, soa soaVar, az1 az1Var, yk8 yk8Var) {
        super(0, oa7.class, "requestRecordingPermission", "PostDrawInfoScreen$requestRecordingPermission(Landroid/content/Context;Lai/askquin/ui/draw/PostDrawInfoViewModel;Lai/askquin/ui/divination/followup/ChildReadingTrackingContext;Landroidx/activity/compose/ManagedActivityResultLauncher;)V", 0);
        this.$context = context;
        this.$viewModel = soaVar;
        this.$childReadingTrackingContext = az1Var;
        this.$permissionLauncher = yk8Var;
    }

    @Override // defpackage.x16
    public final Object invoke() throws Exception {
        Context context = this.$context;
        soa soaVar = this.$viewModel;
        az1 az1Var = this.$childReadingTrackingContext;
        yk8 yk8Var = this.$permissionLauncher;
        if (bp.c(context, "android.permission.RECORD_AUDIO") == 0) {
            soaVar.l(az1Var);
        } else {
            yk8Var.y("android.permission.RECORD_AUDIO", null);
        }
        return wef.a;
    }
}
