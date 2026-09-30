package ai.askquin.ui.paywall;

import defpackage.em7;
import defpackage.iif;
import defpackage.job;
import defpackage.kic;
import defpackage.kob;
import defpackage.wn2;
import defpackage.xn7;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final /* synthetic */ g a = new g();

    public static PaywallRoute.InterceptPaywall a(g gVar, String str, String str2) {
        gVar.getClass();
        return new PaywallRoute.InterceptPaywall("followup_restricted", iif.NoSubscription.a(), "paywall_unlock_reading", str, str2);
    }

    public static PaywallRoute.AddonPaywall b(g gVar, boolean z, int i) {
        String str = (i & 1) != 0 ? "paywall_unlock_reading" : "followup_action_paywall";
        if ((i & 2) != 0) {
            z = false;
        }
        gVar.getClass();
        return new PaywallRoute.AddonPaywall("usage_exhausted", iif.InsufficientBalance.a(), str, z);
    }

    public final xn7 serializer() {
        kob kobVar = job.a;
        return new kic("ai.askquin.ui.paywall.PaywallRoute", kobVar.b(PaywallRoute.class), new em7[]{kobVar.b(PaywallRoute.AddonPaywall.class), kobVar.b(PaywallRoute.Congratulation.class), kobVar.b(PaywallRoute.InterceptPaywall.class), kobVar.b(PaywallRoute.Paywall520.class), kobVar.b(PaywallRoute.UpgradePaywall.class), kobVar.b(PaywallRoute.UpgradeWaring.class)}, new xn7[]{e.a, h.a, j.a, new wn2("ai.askquin.ui.paywall.PaywallRoute.Paywall520", PaywallRoute.Paywall520.INSTANCE, new Annotation[0]), l.a, n.a}, new Annotation[0]);
    }
}
