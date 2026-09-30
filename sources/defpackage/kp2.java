package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kp2 extends gbe implements l26 {
    final /* synthetic */ t7 $accountInfoProvider;
    final /* synthetic */ Context $context;
    final /* synthetic */ e89 $homeTargetLanded$delegate;
    final /* synthetic */ a26 $navigator;
    final /* synthetic */ Uri $pendingAppLink;
    final /* synthetic */ mma $popupManager;
    final /* synthetic */ e89 $targetsHome$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp2(Uri uri, mma mmaVar, t7 t7Var, Context context, a26 a26Var, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pendingAppLink = uri;
        this.$popupManager = mmaVar;
        this.$accountInfoProvider = t7Var;
        this.$context = context;
        this.$navigator = a26Var;
        this.$targetsHome$delegate = e89Var;
        this.$homeTargetLanded$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kp2(this.$pendingAppLink, this.$popupManager, this.$accountInfoProvider, this.$context, this.$navigator, this.$targetsHome$delegate, this.$homeTargetLanded$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Uri uri = this.$pendingAppLink;
        wef wefVar = wef.a;
        if (uri == null) {
            return wefVar;
        }
        dsc.b.setValue(Boolean.TRUE);
        String string = this.$pendingAppLink.toString();
        string.getClass();
        boolean zF = v4e.F(string, "/app/index", false);
        mma mmaVar = this.$popupManager;
        if (zF) {
            mmaVar.O();
        } else {
            mmaVar.R();
        }
        y41.N(this.$accountInfoProvider, this.$context, new iv0(this.$navigator, this.$targetsHome$delegate, this.$homeTargetLanded$delegate, 1), 2);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        kp2 kp2Var = (kp2) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        kp2Var.r(wefVar);
        return wefVar;
    }
}
