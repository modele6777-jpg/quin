package defpackage;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ggc extends h36 implements x16 {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Activity.ScreenCaptureCallback $callback;
    final /* synthetic */ imb $registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggc(imb imbVar, Activity activity, yfc yfcVar) {
        super(0, oa7.class, "unregister", "observeScreenCaptureCallback$unregister(Lkotlin/jvm/internal/Ref$BooleanRef;Landroid/app/Activity;Landroid/app/Activity$ScreenCaptureCallback;)V", 0);
        this.$registered = imbVar;
        this.$activity = activity;
        this.$callback = yfcVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        hgc.H(this.$registered, this.$activity, this.$callback);
        return wef.a;
    }
}
