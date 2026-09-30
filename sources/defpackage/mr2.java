package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.quickdecision.QuickDecisionDetailRoute;
import ai.askquin.ui.router.AppRoute;
import ai.askquin.ui.router.GiftCardFixtureScenario;
import ai.askquin.ui.router.GiftCardPerspective;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinGraphEntryRoute;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb9 b;

    public /* synthetic */ mr2(cb9 cb9Var, int i) {
        this.a = i;
        this.b = cb9Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        boolean z = false;
        z = false;
        final int i2 = 1;
        wef wefVar = wef.a;
        cb9 cb9Var = this.b;
        switch (i) {
            case 0:
                ka9.e(cb9Var, new SkinNavigationRoute$SkinGraphEntryRoute(true, false, (TarotSkinIdentify) obj, 2, (rp3) null), null, 6);
                return wefVar;
            case 1:
                ka9.e(cb9Var, new PaywallRoute.Congratulation(((Boolean) obj).booleanValue(), false, 2, (rp3) null), null, 6);
                return wefVar;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ca2.a.getClass();
                if (!ca2.c && zBooleanValue) {
                    z = true;
                }
                cb9Var.d(new xn9(29), new PaywallRoute.Congratulation(z, zBooleanValue));
                return wefVar;
            case 3:
                ((ra4) obj).getClass();
                final int i3 = z ? 1 : 0;
                ja9 ja9Var = new ja9() { // from class: k7b
                    @Override // defpackage.ja9
                    public final void a(ka9 ka9Var, ua9 ua9Var, Bundle bundle) {
                        switch (i3) {
                            case 0:
                                ua9Var.getClass();
                                ir5.d = (String) ua9Var.b.f;
                                break;
                            default:
                                ua9Var.getClass();
                                x1f x1fVar = x1f.a;
                                x1f.g(s05.a, m1f.b, new trd(17, ua9Var));
                                break;
                        }
                    }
                };
                cb9Var.a(ja9Var);
                return new oe0(25, cb9Var, ja9Var);
            case 4:
                GiftCardFixtureScenario giftCardFixtureScenario = (GiftCardFixtureScenario) obj;
                giftCardFixtureScenario.getClass();
                ka9.e(cb9Var, new AppRoute.GiftCardFixture(giftCardFixtureScenario), null, 6);
                return wefVar;
            case 5:
                String str = (String) obj;
                str.getClass();
                cb9Var.d(new zea(27), new AppRoute.GiftCardDetail(str, GiftCardPerspective.Sent, true));
                return wefVar;
            case 6:
                ac4 ac4Var = (ac4) obj;
                ac4Var.getClass();
                ka9.e(cb9Var, new QuickDecisionDetailRoute(ac4Var.a, "chat_history"), null, 6);
                return wefVar;
            default:
                ((ra4) obj).getClass();
                ja9 ja9Var2 = new ja9() { // from class: k7b
                    @Override // defpackage.ja9
                    public final void a(ka9 ka9Var, ua9 ua9Var, Bundle bundle) {
                        switch (i2) {
                            case 0:
                                ua9Var.getClass();
                                ir5.d = (String) ua9Var.b.f;
                                break;
                            default:
                                ua9Var.getClass();
                                x1f x1fVar = x1f.a;
                                x1f.g(s05.a, m1f.b, new trd(17, ua9Var));
                                break;
                        }
                    }
                };
                cb9Var.a(ja9Var2);
                return new ozc(6, cb9Var, ja9Var2);
        }
    }
}
