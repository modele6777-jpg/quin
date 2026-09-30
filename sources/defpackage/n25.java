package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.explore.skin.navigation.ExploreTarotRoute$Detail;
import ai.askquin.ui.feedback.FeedbackReason;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.paywall.d;
import ai.askquin.ui.paywall.g;
import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;
import ai.askquin.ui.paywall.upgrade.s;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$Report;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n25 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n25(Object obj, Object obj2, x16 x16Var, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = x16Var;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0386  */
    /* JADX WARN: Code duplicated, block: B:145:0x0393  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x16
    public final Object invoke() {
        hkb hkbVarA;
        hkb hkbVarA2;
        ngc ngcVar;
        n25 n25Var;
        int i = this.a;
        p05 p05Var = p05.a;
        boolean z = true;
        z = true;
        String strB = null;
        wef wefVar = wef.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                x16 x16Var = (x16) obj2;
                x16 x16Var2 = (x16) obj;
                if (((jaa) obj3).f) {
                    x16Var.invoke();
                } else {
                    x16Var2.invoke();
                }
                return wefVar;
            case 1:
                jsd jsdVar = (jsd) obj3;
                FeedbackReason feedbackReason = (FeedbackReason) obj2;
                aw2 aw2Var = (aw2) obj;
                if (jsdVar.contains(feedbackReason)) {
                    jsdVar.remove(feedbackReason);
                } else if (jsdVar.size() >= 5) {
                    ynb.V(aw2Var, null, null, new ub5(2, null), 3);
                } else {
                    jsdVar.add(feedbackReason);
                }
                return wefVar;
            case 2:
                jsd jsdVar2 = (jsd) obj3;
                use useVar = (use) obj2;
                s69 s69Var = (s69) obj;
                if (!jsdVar2.contains(FeedbackReason.Other) ? ((sz9) s69Var).j() == 0 || jsdVar2.size() <= 0 : v4e.Q(useVar.d().c)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                ((a26) obj3).d(new j20((n07) obj2, (a26) obj, z ? 1 : 0));
                return wefVar;
            case 4:
                uo uoVar = (uo) obj3;
                Context context = (Context) obj;
                x16 x16Var3 = (x16) obj2;
                if (uoVar != null) {
                    uoVar.a();
                } else {
                    context.getClass();
                    try {
                        Intent intentJ = uyb.j(context);
                        intentJ.addFlags(268435456);
                        context.startActivity(intentJ);
                        break;
                    } catch (Exception unused) {
                    }
                }
                x16Var3.invoke();
                return wefVar;
            case 5:
                ((l26) obj3).z((String) obj2, ((GiftCardItem) obj).getSku());
                return wefVar;
            case 6:
                jr2.a(((q7b) obj3).b);
                ynb.V((aw2) obj2, null, null, new im6((jx) obj, null), 3);
                return wefVar;
            case 7:
                ConnectivityManager connectivityManager = (ConnectivityManager) obj2;
                k27 k27Var = (k27) obj;
                if (((imb) obj3).element) {
                    ff8.h().e(kag.a, "NetworkRequestConstraintController unregister callback");
                    connectivityManager.unregisterNetworkCallback(k27Var);
                }
                return wefVar;
            case 8:
                n07 n07Var = (n07) obj3;
                a26 a26Var = (a26) obj2;
                e89 e89Var = (e89) obj;
                if (n07Var != null) {
                    e89Var.setValue(new ouc(n07Var));
                    a26Var.d(n07Var);
                }
                return wefVar;
            case 9:
                x16 x16Var4 = (x16) obj2;
                ((yc7) obj3).z.setValue(l8e.a);
                if (!((Boolean) ((e89) obj).getValue()).booleanValue()) {
                    x16Var4.invoke();
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                yc7 yc7Var = (yc7) obj3;
                x16 x16Var5 = (x16) obj2;
                String string = ((use) obj).d().c.toString();
                string.getClass();
                x16Var5.getClass();
                int i2 = hmb.b;
                String strY = v4e.Y("'", v4e.o0(string).toString());
                if (!v4e.Q(strY) && ((dg7) yc7Var.b.getValue()) == null) {
                    yc7Var.y.setValue(null);
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String upperCase = strY.toUpperCase(locale);
                    upperCase.getClass();
                    boolean zC = c5e.C(upperCase, "GIFT", false);
                    if (!zC || !yc7.i(strY).equals((String) yc7Var.Y.getValue())) {
                        if (zC) {
                            yc7Var.X.setValue(r96.a);
                            yc7Var.x.z(p05Var, new tb7(3));
                        } else {
                            yc7Var.w.z(p05Var, new tb7(4));
                        }
                        if (strY.length() >= 15) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= strY.length()) {
                                    yc7Var.f(new vc7(yc7Var, strY, null));
                                } else if (Character.isDigit(strY.charAt(i3))) {
                                    i3++;
                                }
                            }
                            String str = zC ? "gift-card" : null;
                            QuotaUsage quotaUsageB = ((eab) yc7Var.g).b();
                            yc7Var.f(new xc7(yc7Var, strY, str, quotaUsageB != null ? quotaUsageB.getHasSubscription() : false, x16Var5, null));
                        } else {
                            String str2 = zC ? "gift-card" : null;
                            QuotaUsage quotaUsageB2 = ((eab) yc7Var.g).b();
                            yc7Var.f(new xc7(yc7Var, strY, str2, quotaUsageB2 != null ? quotaUsageB2.getHasSubscription() : false, x16Var5, null));
                        }
                    }
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                j18 j18Var = (j18) obj2;
                v08 v08Var = (v08) ((mx3) obj3).getValue();
                return new w08(j18Var, v08Var, (mx7) obj, new os((z67) j18Var.e.f.getValue(), v08Var));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((gh6) obj3).c();
                ((a26) obj2).d(((iwa) obj).b);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l26 l26Var = (l26) obj3;
                Object obj4 = (rq6) obj;
                lg8 lg8Var = (lg8) ((mmb) obj2).element;
                w79 w79Var = lg8Var.X;
                if (w79Var == null) {
                    long[] jArr = jec.a;
                    w79Var = new w79();
                    lg8Var.X = w79Var;
                }
                Object objG = w79Var.g(obj4);
                if (objG == null) {
                    objG = new kg8(lg8Var);
                    w79Var.m(obj4, objG);
                }
                kg8 kg8Var = (kg8) objG;
                kg8Var.a = false;
                l26Var.z(kg8Var, obj4);
                return wefVar;
            case 14:
                aw2 aw2Var2 = (aw2) obj2;
                ted tedVar = (ted) obj;
                if (((Boolean) ((ted) obj3).d.d.d(ued.b)).booleanValue()) {
                    ynb.V(aw2Var2, null, null, new wz8(tedVar, null), 3);
                }
                return Boolean.TRUE;
            case 15:
                yf9 yf9Var = (yf9) obj2;
                imb imbVar = (imb) obj;
                g0c g0cVar = yf9.o1;
                ((a26) obj3).d(g0cVar);
                boolean zT = pa7.t(yf9Var.a1, g0cVar.Z);
                boolean z2 = yf9Var.d1 != g0cVar.E0;
                vs9 vs9VarA = g0cVar.Z.a(g0cVar.G0, g0cVar.J0, g0cVar.I0);
                g0cVar.N0 = vs9VarA;
                boolean zT2 = pa7.t(yf9Var.c1, vs9VarA != null ? vs9VarA.a() : null);
                imbVar.element = !zT2;
                if (!zT || z2 || !zT2) {
                    yf9Var.a1 = g0cVar.Z;
                    yf9Var.d1 = g0cVar.E0;
                    vs9 vs9Var = g0cVar.N0;
                    hkb hkbVar = hkb.e;
                    if (vs9Var == null || (hkbVarA = vs9Var.a()) == null) {
                        hkbVarA = hkbVar;
                    }
                    yf9Var.c1 = hkbVarA;
                    vs9 vs9Var2 = g0cVar.N0;
                    if (vs9Var2 != null && (hkbVarA2 = vs9Var2.a()) != null) {
                        a77 a77VarU = n16.U(hkbVarA2);
                        hkbVar = new hkb(a77VarU.a, a77VarU.b, a77VarU.c, a77VarU.d);
                    }
                    yf9Var.b1 = hkbVar;
                    if (yf9Var.e1 && (z2 || (yf9Var.d1 && !zT))) {
                        yf9Var.J0.U();
                    }
                }
                yf9Var.e1 = true;
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                f46 f46Var = (f46) obj3;
                opd opdVar = (opd) obj2;
                qr9 qr9Var = (qr9) obj;
                if (f46Var != null) {
                    opdVar.a(opdVar.c(f46Var) - opdVar.t);
                }
                List listP = cn1.p(opdVar, null, opdVar.t, null);
                kf2 kf2Var = (kf2) s72.H0(listP);
                Integer num = kf2Var != null ? kf2Var.b : null;
                List listE = qr9Var.e(num);
                if (num != null && !listE.isEmpty()) {
                    listE = s72.Q0(t72.H(new kf2(((kf2) s72.v0(listE)).a, null, num)), s72.r0(listE, 1));
                }
                return new if2(s72.Q0(listP, listE), qr9Var.g());
            case 17:
                ka9.e(((tr2) obj3).a, new ExploreTarotRoute$Detail((TarotSkinIdentify) obj2, ((TarotCardChoice) obj).getCard().getCardKey(), 1, 0), null, 6);
                return wefVar;
            case 18:
                r0 r0Var = (r0) obj3;
                tr2 tr2Var = (tr2) obj2;
                t7 t7Var = (t7) obj;
                r0Var.M1.setValue(Boolean.TRUE);
                r0Var.I1(false);
                if (r0Var.N() == QuotaBlockReason.NoFollowUpPermission) {
                    d.b(tr2Var.a, g.a(PaywallRoute.Companion, ((mo3) t7Var).a(), r0Var.E()));
                }
                return wefVar;
            case 19:
                ((e89) obj).setValue(Boolean.FALSE);
                ((a26) obj3).d(Boolean.TRUE);
                ((x16) obj2).invoke();
                return wefVar;
            case 20:
                PaywallRoute.InterceptPaywall interceptPaywall = (PaywallRoute.InterceptPaywall) obj3;
                aw2 aw2Var3 = (aw2) obj2;
                s sVar = (s) obj;
                String accountId = interceptPaywall.getAccountId();
                String readingId = interceptPaywall.getReadingId();
                if (interceptPaywall.isFollowUpRestricted() && accountId != null && readingId != null) {
                    ynb.V(aw2Var3, null, null, new b5a(sVar, accountId, readingId, null), 3);
                }
                return wefVar;
            case 21:
                FiveCardUpgradePending fiveCardUpgradePending = (FiveCardUpgradePending) obj3;
                aw2 aw2Var4 = (aw2) obj2;
                s sVar2 = (s) obj;
                if (fiveCardUpgradePending != null) {
                    ynb.V(aw2Var4, null, null, new v4a(sVar2, fiveCardUpgradePending, null), 3);
                }
                return wefVar;
            case 22:
                ((e89) obj).setValue(Boolean.FALSE);
                x1f x1fVar = x1f.a;
                x1f.k(new r05("report_start"), null, 4);
                ((a26) obj3).d((String) obj2);
                return wefVar;
            case 23:
                String str3 = (String) obj3;
                jca jcaVar = (jca) obj2;
                ka9 ka9Var = (ka9) obj;
                if (!pa7.t(str3, "dev-report")) {
                    jcaVar.b.setValue(Boolean.FALSE);
                    ka9Var.d(new q4a(10), new PersonalityRoutes$Report(str3));
                }
                return wefVar;
            case 24:
                ((e89) obj2).setValue((String) obj3);
                ((e89) obj).setValue(Boolean.FALSE);
                return wefVar;
            case 25:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new zea(22), 2);
                ((l26) obj3).z(((use) obj2).d().c.toString(), (List) obj);
                return wefVar;
            case 26:
                ((l26) obj3).z((TarotSkinIdentify) obj2, ((TarotCardChoice) obj).getCard().getCardKey());
                return wefVar;
            case 27:
                l26 l26Var2 = (l26) obj3;
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj2;
                bv7 bv7Var = ((cxe) obj).a[0];
                if (bv7Var != null) {
                    if (!bv7Var.h()) {
                        bv7Var = null;
                    }
                    if (bv7Var != null) {
                        strB = vt1.b(bv7Var, false);
                    }
                }
                l26Var2.z(tarotCardChoice, strB);
                return wefVar;
            case 28:
                ((h48) obj3).b((xm0) obj);
                ((x16) obj2).invoke();
                return wefVar;
            default:
                vb2 vb2Var = (vb2) obj;
                LinkedHashMap linkedHashMap = ((ngc) obj3).d;
                linkedHashMap.remove(obj2);
                if (!lgc.b && linkedHashMap.isEmpty() && (ngcVar = (ngc) lgc.d.remove(vb2Var)) != null && (n25Var = ngcVar.e) != null) {
                    n25Var.invoke();
                }
                return wefVar;
        }
    }

    public /* synthetic */ n25(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
