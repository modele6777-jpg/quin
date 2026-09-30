package defpackage;

import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.router.AppRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k14 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mma b;
    public final /* synthetic */ ka9 c;

    public /* synthetic */ k14(mma mmaVar, ka9 ka9Var, int i) {
        this.a = i;
        this.b = mmaVar;
        this.c = ka9Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        ka9 ka9Var = this.c;
        mma mmaVar = this.b;
        switch (i) {
            case 0:
                mmaVar.h();
                ka9.h(ka9Var, AppRoute.Main.INSTANCE, false);
                ka9.e(ka9Var, new PaywallRoute.InterceptPaywall("conversation", (String) null, (String) null, (String) null, (String) null, 30, (rp3) null), null, 6);
                break;
            case 1:
                mmaVar.Q(rua.a);
                ka9.h(ka9Var, AppRoute.Main.INSTANCE, false);
                break;
            default:
                mmaVar.Q(xua.a);
                ka9.h(ka9Var, AppRoute.Main.INSTANCE, false);
                break;
        }
        return wefVar;
    }
}
