package defpackage;

import ai.askquin.ui.onboard.OnboardProfileSyncRoute;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mo9 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ e89 $failed$delegate;
    final /* synthetic */ cb9 $innerNavController;
    final /* synthetic */ OnboardProfileSyncRoute $route;
    final /* synthetic */ rn9 $viewModel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo9(OnboardProfileSyncRoute onboardProfileSyncRoute, rn9 rn9Var, Context context, cb9 cb9Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$route = onboardProfileSyncRoute;
        this.$viewModel = rn9Var;
        this.$context = context;
        this.$innerNavController = cb9Var;
        this.$failed$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mo9(this.$route, this.$viewModel, this.$context, this.$innerNavController, this.$failed$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (defpackage.bsa.n(r8, "paywall_pending", r7) == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b6, code lost:
    
        if (((defpackage.sn3) r8.d).a(r7) == r6) goto L30;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo9.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mo9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
