package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.router.AppRoute;
import android.content.pm.Signature;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.KeyValueBuilder;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.w1;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz1 implements a26 {
    public final /* synthetic */ int a;

    public /* synthetic */ cz1(int i) {
        this.a = i;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        switch (this.a) {
            case 0:
                i4f i4fVar = (i4f) obj;
                i4fVar.getClass();
                yz9 yz9Var = (yz9) i4fVar;
                yz9Var.E0 = false;
                scc.k(yz9Var);
                return Boolean.FALSE;
            case 1:
                exc.m((hxc) obj, 1);
                return wef.a;
            case 2:
                ((ra4) obj).getClass();
                String str = ir5.d;
                ir5.d = "ai.askquin.ui.draw.CardWheel";
                return new o02(str, 0);
            case 3:
                UsageBillingBalance usageBillingBalance = (UsageBillingBalance) obj;
                usageBillingBalance.getClass();
                return usageBillingBalance.getSource();
            case 4:
                return wef.a;
            case 5:
                q22 q22Var = (q22) obj;
                q22Var.getClass();
                c77 c77Var = c77.a;
                q22Var.a("version", c77.b, false);
                p4e p4eVar = p4e.a;
                hua huaVar = p4e.b;
                huaVar.getClass();
                huaVar.getClass();
                q22Var.a("deckIDsByCardKey", new ph6("kotlin.collections.LinkedHashMap", huaVar, huaVar), false);
                return wef.a;
            case 6:
                PatternData patternData = (PatternData) obj;
                patternData.getClass();
                return patternData.getName();
            case 7:
                PatternData patternData2 = (PatternData) obj;
                patternData2.getClass();
                return patternData2.getName();
            case 8:
                PatternData patternData3 = (PatternData) obj;
                patternData3.getClass();
                return patternData3.getName();
            case 9:
                kv2.y((l1f) obj, "btn", "copy_invite_code", "pathway", "invite_friends_page");
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Long) obj).getClass();
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                lf2 lf2Var = (lf2) obj;
                LayoutNode layoutNode = lf2Var instanceof LayoutNode ? (LayoutNode) lf2Var : null;
                if (layoutNode != null && layoutNode.f1) {
                    i37.c("Apply is called on deactivated node " + lf2Var);
                }
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Boolean.valueOf(!(((h09) obj) instanceof rf2));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                View view = ((ywf) ((tg2) obj).s0(uq6.a)).a;
                while (view != null) {
                    Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
                    if (tag != null) {
                        return tag;
                    }
                    Object objG = jcc.g(view);
                    view = objG instanceof View ? (View) objG : null;
                }
                return null;
            case 14:
                String str2 = (String) obj;
                str2.getClass();
                p05 p05Var = p05.a;
                m1f m1fVar = m1f.a;
                bt5 bt5Var = new bt5(str2, 4);
                x1f x1fVar = x1f.a;
                x1f.g(p05Var, m1fVar, bt5Var);
                return wef.a;
            case 15:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "expand_tap", "pathway", "quick_decision");
                l1fVar.a("widget", "source");
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "btn", "enter_reading", "pathway", "daily_card");
                l1fVar2.a("widget", "source");
                return wef.a;
            case 17:
                qb9 qb9Var = (qb9) obj;
                qb9Var.getClass();
                qb9Var.b = true;
                return wef.a;
            case 18:
                qb9 qb9Var2 = (qb9) obj;
                qb9Var2.getClass();
                qb9Var2.g = job.a.b(AppRoute.Conversation.class);
                qb9Var2.e = false;
                qb9Var2.a(-1);
                wef wefVar = wef.a;
                qb9Var2.e = true;
                qb9Var2.f = false;
                qb9Var2.c = false;
                return wefVar;
            case 19:
                return wef.a;
            case 20:
                nv2 nv2Var = (nv2) obj;
                if (nv2Var instanceof sv2) {
                    return (sv2) nv2Var;
                }
                return null;
            case 21:
                Throwable th = (Throwable) obj;
                th.getClass();
                return Boolean.valueOf(kj0.m0(th));
            case 22:
                return Boolean.valueOf(((w1) obj).getClass().getName().equals("io.sentry.android.timber.SentryTimberIntegration"));
            case 23:
                ((KeyValueBuilder) obj).getClass();
                return wef.a;
            case 24:
                Signature signature = (Signature) obj;
                signature.getClass();
                byte[] byteArray = signature.toByteArray();
                byteArray.getClass();
                return if9.E(byteArray);
            case 25:
                Signature signature2 = (Signature) obj;
                signature2.getClass();
                byte[] byteArray2 = signature2.toByteArray();
                byteArray2.getClass();
                return if9.E(byteArray2);
            case 26:
                kv2.y((l1f) obj, "btn", "guided_question", "pathway", "daily_card");
                return wef.a;
            case 27:
                ((sn4) obj).getClass();
                return wef.a;
            case 28:
                ((TarotSkinIdentify) obj).getClass();
                return wef.a;
            default:
                ((TarotSkinIdentify) obj).getClass();
                return wef.a;
        }
    }
}
