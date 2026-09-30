package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.AndroidJsonPayload;
import ai.askquin.ui.AppLinkActivity;
import ai.askquin.ui.UrlData;
import ai.askquin.ui.account.component.AuthOption;
import ai.askquin.ui.account.navigation.AuthNavigation$AuthRoute;
import ai.askquin.ui.account.navigation.AuthNavigation$BindPhoneRoute;
import ai.askquin.ui.account.navigation.AuthNavigation$BindPhoneVerifyCodeRoute;
import ai.askquin.ui.conversation.ConversationRoute;
import ai.askquin.ui.conversation.r0;
import android.app.Activity;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.User;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0124  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        String url;
        boolean z;
        int i = this.a;
        int i2 = 3;
        int i3 = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        wef wefVar = wef.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((u69) ((t69) obj3)).b((ota) obj2);
                return wefVar;
            case 1:
                z88 z88Var = (z88) obj3;
                AccessibilityManager accessibilityManager = (AccessibilityManager) obj2;
                if (((f48) obj) == f48.ON_RESUME) {
                    z88Var.f(accessibilityManager);
                }
                return wefVar;
            case 2:
                owa owaVar = (owa) obj3;
                a26 a26Var = (a26) obj2;
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    jcc.k(0, owaVar);
                }
                a26Var.d(bool);
                return wefVar;
            case 3:
                fh fhVar = (fh) obj3;
                ((t7) obj).getClass();
                fhVar.H((n07) obj2, ((mo3) fhVar.P0).a());
                return wefVar;
            case 4:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "product_id", (String) obj3, "pathway", "paywall_a");
                l1fVar.a(((fh) obj2).S0, "triggered_by");
                return wefVar;
            case 5:
                List list = (List) obj3;
                sw7 sw7Var = (sw7) obj;
                sw7Var.getClass();
                sw7Var.W(list.size(), null, new gj(b2 == true ? 1 : 0, list, b == true ? 1 : 0), new dd2(new a07(list, (TarotSkinIdentify) obj2, 4), true, -1117249557));
                return wefVar;
            case 6:
                r0 r0Var = (r0) obj2;
                ale aleVar = (ale) obj;
                hf8.Q.getClass();
                ef8.a("SpreadDeskListScreen").e("onSpreadClick: " + aleVar);
                if (((List) obj3).isEmpty() || aleVar == null) {
                    r0Var.x1(aleVar);
                    r0Var.J1(null);
                } else {
                    r0Var.getClass();
                    r0Var.d2.setValue(new ruc(aleVar));
                    r0Var.x1(aleVar);
                    r0Var.J1(null);
                    lyd lydVar = r0Var.g2;
                    if (lydVar != null) {
                        lydVar.h(null);
                    }
                    r0Var.f2 = null;
                    r0Var.v1(d.a);
                    r0Var.q1();
                }
                return wefVar;
            case 7:
                return new l47((bga) obj3, new p(i2, (iu) obj2));
            case 8:
                ila ilaVar = (ila) obj3;
                ilaVar.setPositionProvider((lla) obj2);
                ilaVar.r();
                return new ou(b3 == true ? 1 : 0);
            case 9:
                ((LayoutNode) obj3).C0(((j09) obj).D((j09) obj2));
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                AndroidJsonPayload androidJsonPayload = (AndroidJsonPayload) obj2;
                l1f l1fVar2 = (l1f) obj;
                int i4 = AppLinkActivity.Q0;
                l1fVar2.getClass();
                l1fVar2.a((String) obj3, "triggered_by");
                UrlData quinData = androidJsonPayload.getQuinData();
                if (quinData != null && (url = quinData.getUrl()) != null) {
                    l1fVar2.a(url, "url");
                }
                Map<String, String> reportParameters = androidJsonPayload.getReportParameters();
                if (reportParameters != null) {
                    for (Map.Entry<String, String> entry : reportParameters.entrySet()) {
                        l1fVar2.a(entry.getValue(), entry.getKey());
                    }
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((ra4) obj).getClass();
                return new oe0(i3, (je0) obj3, (String) obj2);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                String str = (String) obj;
                str.getClass();
                ka9.e((cb9) obj3, new AuthNavigation$BindPhoneVerifyCodeRoute(str, ((AuthNavigation$BindPhoneRoute) obj2).getSignOption()), null, 6);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                String str2 = (String) obj;
                str2.getClass();
                ((qmf) obj3).n(str2, AuthOption.Phone);
                ka9.h((cb9) obj2, AuthNavigation$AuthRoute.INSTANCE, false);
                return wefVar;
            case 14:
                qmf qmfVar = (qmf) obj3;
                User user = (User) obj;
                user.getClass();
                AuthOption signOption = ((AuthNavigation$BindPhoneVerifyCodeRoute) obj2).getSignOption();
                signOption.getClass();
                ynb.V(hwf.a(qmfVar), null, null, new tlf(qmfVar, user, signOption, null), 3);
                return wefVar;
            case 15:
                qr0 qr0Var = (qr0) obj3;
                rr0 rr0Var = (rr0) obj2;
                rwe rweVar = qr0Var.Z;
                if (rweVar != null) {
                    rweVar.b();
                }
                qr0Var.Z = null;
                za2 za2Var = rr0Var.b;
                if (za2Var != null) {
                    za2Var.R(wefVar);
                }
                rr0Var.b = null;
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                zr0 zr0Var = (zr0) obj3;
                je2 je2Var = (je2) obj2;
                zr0Var.a(je2Var);
                return new oe0(2, zr0Var, je2Var);
            case 17:
                a26 a26Var2 = (a26) obj2;
                zse zseVar = (zse) obj;
                if (!pa7.t((zse) obj3, zseVar)) {
                    a26Var2.d(zseVar);
                }
                return wefVar;
            case 18:
                ynb.V((aw2) obj3, null, null, new qw0((jo5) obj, (d0f) obj2, null), 3);
                return wefVar;
            case 19:
                String str3 = (String) obj;
                str3.getClass();
                vz9 vz9Var = ((gy0) obj3).c;
                vz9Var.setValue(jy0.a((jy0) vz9Var.getValue(), false));
                ((a26) obj2).d(str3);
                return wefVar;
            case 20:
                Activity activity = (Activity) obj3;
                View view = (View) obj2;
                if (((Integer) obj).intValue() == 0) {
                    z = xo1.F(activity, view.isAttachedToWindow(), view.getWindowToken() != null);
                }
                return Boolean.valueOf(z);
            case 21:
                bea.q((bea) obj, (cea) obj3, 0, 0, ((c01) obj2).Z, 4);
                return wefVar;
            case 22:
                li6 li6Var = (li6) obj3;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                sn4.O0(sn4Var, li6Var.c, 0L, 0L, 0.0f, null, null, li6Var.b, 62);
                sn4.O0(sn4Var, (b41) obj2, 0L, 0L, 0.0f, null, null, 6, 62);
                return wefVar;
            case 23:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                ((wf8) obj3).z(sn4Var2, (ke6) obj2);
                return wefVar;
            case 24:
                vv7 vv7Var = (vv7) ((im2) obj);
                vv7Var.a();
                sn4.s(vv7Var, (zt) obj3, (b41) obj2, 0.0f, null, null, 0, 60);
                return wefVar;
            case 25:
                vv7 vv7Var2 = (vv7) ((im2) obj);
                vv7Var2.a();
                sn4.s(vv7Var2, ((ss9) obj3).a, (b41) obj2, 0.0f, null, null, 0, 60);
                return wefVar;
            case 26:
                ((p89) ((m6c) obj3).b).j((mm2) obj2);
                return wefVar;
            case 27:
                TarotCardType tarotCardType = (TarotCardType) obj2;
                l1f l1fVar3 = (l1f) obj;
                kv2.y(l1fVar3, "btn", "playcard_tap_card", "pathway", "card_detail");
                l1fVar3.a(urg.r((TarotSkinIdentify) obj3), "deck_id");
                if (tarotCardType != null) {
                    l1fVar3.a(tarotCardType.getCardKey(), "card_id");
                }
                return wefVar;
            case 28:
                ((Boolean) obj).getClass();
                ((a26) obj3).d(((zhe) obj2).a);
                return wefVar;
            default:
                x16 x16Var = (x16) obj3;
                cb9 cb9Var = (cb9) obj2;
                if (((Boolean) obj).booleanValue()) {
                    x16Var.invoke();
                } else {
                    cb9Var.f(job.a.b(ConversationRoute.Conversation.class), false);
                }
                return wefVar;
        }
    }
}
