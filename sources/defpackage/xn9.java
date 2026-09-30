package defpackage;

import ai.askquin.ui.onboard.OnboardAuthRoute;
import ai.askquin.ui.onboard.OnboardNotificationRoute;
import ai.askquin.ui.onboard.OnboardProfileSyncRoute;
import ai.askquin.ui.onboard.OnboardRealTarotRoute;
import ai.askquin.ui.onboard.OnboardWelcomeRoute;
import ai.askquin.ui.router.AppRoute;
import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import net.xmind.donut.gp.GooglePay;
import net.xmind.donut.gp.SocialShareManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xn9 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ xn9(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        int i2 = 2;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((l1f) obj).a("onboarding_age_restriction", "popup");
                return wefVar;
            case 1:
                my myVar = (my) obj;
                myVar.getClass();
                int i3 = ua9.e;
                if (kj0.k0(((da9) myVar.b()).b, job.a.b(OnboardWelcomeRoute.class))) {
                    return rw4.f(ap9.a, 2);
                }
                return null;
            case 2:
                String str = (String) obj;
                str.getClass();
                bt5 bt5Var = new bt5(str, 19);
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("onboarding_welcome_login"), bt5Var, 2);
                }
                return wefVar;
            case 3:
                my myVar2 = (my) obj;
                myVar2.getClass();
                int i4 = ua9.e;
                if (kj0.k0(((da9) myVar2.d()).b, job.a.b(OnboardRealTarotRoute.class))) {
                    return rw4.g(ap9.a, 2);
                }
                return null;
            case 4:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                qb9Var.g = job.a.b(OnboardAuthRoute.class);
                qb9Var.e = false;
                qb9Var.a(-1);
                qb9Var.e = true;
                qb9Var.f = false;
                return wefVar;
            case 5:
                kv2.y((l1f) obj, "btn", "first_page_start", "pathway", "onboarding");
                return wefVar;
            case 6:
                qb9 qb9Var2 = (qb9) obj;
                qb9Var2.getClass();
                qb9Var2.g = job.a.b(OnboardNotificationRoute.class);
                qb9Var2.e = false;
                qb9Var2.a(-1);
                qb9Var2.e = true;
                qb9Var2.f = false;
                qb9Var2.b = true;
                return wefVar;
            case 7:
                qb9 qb9Var3 = (qb9) obj;
                em7 em7VarB = job.a.b(OnboardProfileSyncRoute.class);
                qb9Var3.getClass();
                qb9Var3.g = em7VarB;
                qb9Var3.e = false;
                qb9Var3.a(-1);
                qb9Var3.e = true;
                qb9Var3.f = false;
                return wefVar;
            case 8:
                kv2.y((l1f) obj, "btn", "next_step", "pathway", "onboarding_social_proof");
                return wefVar;
            case 9:
                kv2.y((l1f) obj, "btn", "start_tarot_journey", "pathway", "onboarding");
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                t09 t09Var = (t09) obj;
                t09Var.getClass();
                kob kobVar = job.a;
                oa7.o(oa7.q(t09Var, kv2.c(kobVar, za0.class, oa7.r(t09Var, kv2.c(kobVar, wt6.class, oa7.r(t09Var, kv2.c(kobVar, njd.class, oa7.q(t09Var, kobVar.b(GooglePay.class), null, new db9(i2)), SocialShareManager.class), new db9(3)), lc6.class), new db9(4)), jh.class), new o4e("adjust"), new db9(5)), kobVar.b(o05.class));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                tg2 tg2Var = (tg2) obj;
                int i5 = pt.a;
                Context context = (Context) tg2Var.s0(uq.b);
                sw3 sw3Var = (sw3) tg2Var.s0(zg2.h);
                ju9 ju9Var = (ju9) tg2Var.s0(ku9.a);
                if (ju9Var == null) {
                    return null;
                }
                return new ur(context, sw3Var, ju9Var.a, ju9Var.b);
            case 14:
                ((Long) obj).getClass();
                return wefVar;
            case 15:
                ((Long) obj).getClass();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Long) obj).getClass();
                return wefVar;
            case 17:
                LayoutNode layoutNode = (LayoutNode) obj;
                if (layoutNode.W()) {
                    LayoutNode.s0(layoutNode, false, 7);
                }
                return wefVar;
            case 18:
                LayoutNode layoutNode2 = (LayoutNode) obj;
                if (layoutNode2.W()) {
                    LayoutNode.u0(layoutNode2, false, 7);
                }
                return wefVar;
            case 19:
                LayoutNode layoutNode3 = (LayoutNode) obj;
                if (layoutNode3.W()) {
                    layoutNode3.U();
                }
                return wefVar;
            case 20:
                LayoutNode layoutNode4 = (LayoutNode) obj;
                if (layoutNode4.W()) {
                    layoutNode4.t0(false);
                }
                return wefVar;
            case 21:
                LayoutNode layoutNode5 = (LayoutNode) obj;
                if (layoutNode5.W()) {
                    layoutNode5.t0(false);
                }
                return wefVar;
            case 22:
                LayoutNode layoutNode6 = (LayoutNode) obj;
                if (layoutNode6.W()) {
                    layoutNode6.r0(false);
                }
                return wefVar;
            case 23:
                LayoutNode layoutNode7 = (LayoutNode) obj;
                if (layoutNode7.W()) {
                    layoutNode7.r0(false);
                }
                return wefVar;
            case 24:
                obj.getClass();
                return Boolean.valueOf(!((fw9) obj).w());
            case 25:
                return wefVar;
            case 26:
                e0a e0aVar = (e0a) obj;
                e0aVar.getClass();
                StringBuilder sb = new StringBuilder("position ");
                sb.append(e0aVar.a);
                sb.append(": '");
                return ub3.l(sb, (String) e0aVar.b.invoke(), '\'');
            case 27:
                ((hxc) obj).getClass();
                return wefVar;
            case 28:
                ((Long) obj).getClass();
                return wefVar;
            default:
                qb9 qb9Var4 = (qb9) obj;
                qb9Var4.getClass();
                qb9Var4.g = job.a.b(AppRoute.Main.class);
                qb9Var4.e = false;
                qb9Var4.a(-1);
                qb9Var4.e = false;
                qb9Var4.f = false;
                return wefVar;
        }
    }
}
