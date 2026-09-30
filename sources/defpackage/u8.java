package defpackage;

import ai.askquin.ui.conversation.ConversationActivity;
import ai.askquin.ui.onboard.OnboardingActivity;
import ai.askquin.ui.web.WebViewActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ u8(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        Context context = this.b;
        switch (i) {
            case 0:
                Intent intent = new Intent(context, (Class<?>) OnboardingActivity.class);
                intent.setFlags(268468224);
                context.startActivity(intent);
                return wefVar;
            case 1:
                hkg.O0(context);
                return wefVar;
            case 2:
                return new u6c(context);
            case 3:
                kn2.z(context, "https://discord.gg/RdDubptjQ9");
                return wefVar;
            case 4:
                if (!v4e.Q("askquinai")) {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("fb://group/askquinai"));
                    Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/groups/askquinai"));
                    if (intent2.resolveActivity(context.getPackageManager()) == null) {
                        intent2 = intent3;
                    }
                    context.startActivity(intent2);
                }
                return wefVar;
            case 5:
                Set set = r1c.a;
                context.getClass();
                int i2 = WebViewActivity.T0;
                pzd.i(context, "https://quin.love".concat("/cn/event/app-review"), (8 & 4) != 0 ? ozd.a : ozd.b, null);
                return wefVar;
            case 6:
                int i3 = dhf.Q0;
                context.startActivity(w1e.h(context, 1, false));
                return wefVar;
            case 7:
                int i4 = dhf.Q0;
                context.startActivity(w1e.h(context, 0, false));
                return wefVar;
            case 8:
                ynb.V(lw2.a, null, null, new n24(ua3.a(), context, null), 3);
                jcc.k(0, "13 条依次发送");
                return wefVar;
            case 9:
                y93 y93Var = y93.a;
                y93.k(context, false);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                y93 y93Var2 = y93.a;
                y93.k(context, true);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ym8.O(context);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Intent intent4 = new Intent(context, (Class<?>) OnboardingActivity.class);
                intent4.setFlags(268435456);
                context.startActivity(intent4);
                jcc.k(0, "从 Welcome 走到第3步可见");
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                int i5 = dhf.Q0;
                context.startActivity(w1e.h(context, 1, true));
                return wefVar;
            case 14:
                int i6 = dhf.Q0;
                context.startActivity(w1e.h(context, 0, true));
                return wefVar;
            case 15:
                isa isaVar = xqa.H0.a;
                qn2 qn2Var = lw2.a;
                ynb.V(qn2Var, null, null, new p64(isaVar, "", null), 3);
                hs3 hs3Var = xqa.E0;
                Boolean bool = Boolean.FALSE;
                ynb.V(qn2Var, null, null, new s64(hs3Var.a, bool, null), 3);
                ynb.V(qn2Var, null, null, new v64(xqa.G0.a, bool, null), 3);
                List list = g6g.a;
                jcc.k(0, "已重置半拉框配额；系统检测 今日=" + g6g.b(context) + " 快决=" + g6g.a(context, "ai.askquin.widget.QuickDecisionWidgetReceiver"));
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                x57.V(context, OnboardingActivity.class, new iy9[0]);
                return wefVar;
            case 17:
                x57.V(context, OnboardingActivity.class, new iy9[]{new iy9("KEY_START_DESTINATION", "welcome")});
                return wefVar;
            case 18:
                x57.V(context, OnboardingActivity.class, new iy9[]{new iy9("KEY_START_DESTINATION", "welcome_back")});
                return wefVar;
            case 19:
                x57.V(context, OnboardingActivity.class, new iy9[]{new iy9("KEY_START_DESTINATION", "welcome_back_upgrade")});
                return wefVar;
            case 20:
                x57.V(context, OnboardingActivity.class, new iy9[]{new iy9("KEY_SIGN_IN", Boolean.TRUE)});
                return wefVar;
            case 21:
                Intent intent5 = new Intent(context, (Class<?>) ConversationActivity.class);
                intent5.setFlags(268468224);
                intent5.putExtra("isNewUser", true);
                intent5.putExtra("paywallSource", "onboarding_finish");
                context.startActivity(intent5);
                return wefVar;
            case 22:
                w28.a(context);
                jcc.k(0, "Legacy import triggered");
                return wefVar;
            case 23:
                File fileP = bzd.p(context, "firebaseSessions/sessionConfigsDataStore.data");
                hj6.C(fileP);
                return fileP;
            case 24:
                File fileP2 = bzd.p(context, "firebaseSessions/sessionDataStore.data");
                hj6.C(fileP2);
                return fileP2;
            case 25:
                return af1.N(context);
            case 26:
                hs3 hs3Var2 = xqa.A0;
                Boolean bool2 = Boolean.TRUE;
                isa isaVar2 = hs3Var2.a;
                qn2 qn2Var2 = lw2.a;
                ynb.V(qn2Var2, null, null, new qo9(isaVar2, bool2, null), 3);
                tj7 tj7Var = tj7.L0;
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("onboarding_change_theme_tap"), tj7Var, 2);
                }
                if (ca2.c) {
                    Intent intent6 = new Intent(context, (Class<?>) ConversationActivity.class);
                    intent6.setFlags(268468224);
                    intent6.putExtra("isNewUser", true);
                    intent6.putExtra("paywallSource", "onboarding_finish");
                    intent6.putExtra("directToFirstReading", true);
                    ynb.V(qn2Var2, null, null, new wo9(context, intent6, null), 3);
                } else {
                    ap9.b(context, (3 & 1) == 0, true);
                }
                return wefVar;
            case 27:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05.a, new q4a(4), 2);
                int i7 = WebViewActivity.T0;
                String strD = vd8.d();
                ii4 ii4Var = ii4.b;
                StringBuilder sbO = ib8.o("https://quin.love", ub3.i("/api/activity/entry?position=", ii4Var.a()), "&pagename=", ii4Var.b(), "&lang=");
                sbO.append(strD);
                sbO.append("&ap=android&av=5.23.0");
                pzd.i(context, sbO.toString(), (8 & 4) != 0 ? ozd.a : ozd.b, null);
                return wefVar;
            case 28:
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                defaultSharedPreferences.getClass();
                return defaultSharedPreferences;
            default:
                int i8 = WebViewActivity.T0;
                String strD2 = vd8.d();
                ii4 ii4Var2 = ii4.c;
                StringBuilder sbO2 = ib8.o("https://quin.love", ub3.i("/api/activity/entry?position=", ii4Var2.a()), "&pagename=", ii4Var2.b(), "&lang=");
                sbO2.append(strD2);
                sbO2.append("&ap=android&av=5.23.0");
                pzd.i(context, sbO2.toString(), (8 & 4) != 0 ? ozd.a : ozd.b, null);
                return wefVar;
        }
    }
}
