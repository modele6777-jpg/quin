package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lp2 extends gbe implements l26 {
    final /* synthetic */ h0e $automaticPopupsSuppressed$delegate;
    final /* synthetic */ h0e $currentBackStackEntry$delegate;
    final /* synthetic */ e89 $homeTargetLanded$delegate;
    final /* synthetic */ boolean $isOnHome;
    final /* synthetic */ Uri $pendingAppLink;
    final /* synthetic */ mma $popupManager;
    final /* synthetic */ e89 $targetsHome$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp2(Uri uri, boolean z, mma mmaVar, h0e h0eVar, h0e h0eVar2, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pendingAppLink = uri;
        this.$isOnHome = z;
        this.$popupManager = mmaVar;
        this.$automaticPopupsSuppressed$delegate = h0eVar;
        this.$currentBackStackEntry$delegate = h0eVar2;
        this.$targetsHome$delegate = e89Var;
        this.$homeTargetLanded$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lp2(this.$pendingAppLink, this.$isOnHome, this.$popupManager, this.$automaticPopupsSuppressed$delegate, this.$currentBackStackEntry$delegate, this.$targetsHome$delegate, this.$homeTargetLanded$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        boolean zBooleanValue = ((Boolean) this.$automaticPopupsSuppressed$delegate.getValue()).booleanValue();
        wef wefVar = wef.a;
        if (zBooleanValue && this.$pendingAppLink == null && ((da9) this.$currentBackStackEntry$delegate.getValue()) != null) {
            if (((Boolean) this.$targetsHome$delegate.getValue()).booleanValue() && this.$isOnHome) {
                this.$homeTargetLanded$delegate.setValue(Boolean.TRUE);
                return wefVar;
            }
            boolean z = this.$isOnHome;
            boolean zBooleanValue2 = ((Boolean) this.$targetsHome$delegate.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) this.$homeTargetLanded$delegate.getValue()).booleanValue();
            if (!zBooleanValue2 ? !z : !(!zBooleanValue3 || z)) {
                this.$popupManager.O();
                e89 e89Var = this.$targetsHome$delegate;
                Boolean bool = Boolean.FALSE;
                e89Var.setValue(bool);
                this.$homeTargetLanded$delegate.setValue(bool);
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        lp2 lp2Var = (lp2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        lp2Var.r(wefVar);
        return wefVar;
    }
}
