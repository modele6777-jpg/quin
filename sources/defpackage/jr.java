package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.feedback.FeedbackReason;
import ai.askquin.ui.onboard.OnboardNotificationRoute;
import ai.askquin.ui.onboard.OnboardOverviewRoute;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;
import ai.askquin.ui.paywall.upgrade.s;
import ai.askquin.ui.popup.dailyfortune.v;
import ai.askquin.ui.router.AppRoute;
import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Window;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.DayOfWeek;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.events.model.PopupActionType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jr implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jr(r0 r0Var, tr2 tr2Var, x16 x16Var, e89 e89Var) {
        this.a = 8;
        this.b = r0Var;
        this.d = tr2Var;
        this.c = x16Var;
        this.e = e89Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0347  */
    @Override // defpackage.x16
    public final Object invoke() {
        b18 b18VarH;
        int i;
        c18 c18Var;
        String strB;
        int i2 = 15;
        int i3 = 26;
        int i4 = 6;
        int i5 = 1;
        switch (this.a) {
            case 0:
                ((u84) this.b).g((x16) this.c, (s84) this.d, (cv7) this.e);
                return wef.a;
            case 1:
                aw2 aw2Var = (aw2) this.b;
                sn0 sn0Var = (sn0) this.c;
                Context context = (Context) this.d;
                e89 e89Var = (e89) this.e;
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new zv(i3), 2);
                ynb.V(aw2Var, null, null, new bn0(sn0Var, context, e89Var, null), 3);
                return wef.a;
            case 2:
                return new r91((YearMonth) this.b, (YearMonth) this.c, (DayOfWeek) this.d, (YearMonth) this.e, ps9.a, null);
            case 3:
                Context context2 = (Context) this.b;
                jo0 jo0Var = (jo0) this.c;
                wo0 wo0Var = (wo0) this.d;
                k47 k47Var = (k47) this.e;
                Trace.beginSection("CameraFactoryAdapter#appComponent");
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                hh1 hh1Var = (hh1) ((ace) wo0Var.b).getValue();
                if1 if1Var = (if1) wo0Var.f;
                uk1 uk1Var = (uk1) wo0Var.e;
                hh1Var.getClass();
                if1Var.getClass();
                hbc hbcVar = new hbc();
                hbcVar.a = context2;
                hbcVar.b = jo0Var;
                hbcVar.c = hh1Var;
                hbcVar.d = k47Var;
                hbcVar.e = if1Var;
                hbcVar.f = uk1Var;
                n23 n23Var = new n23(hbcVar);
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Created CameraFactoryAdapter in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1))));
                }
                Trace.endSection();
                return n23Var;
            case 4:
                tf1 tf1Var = (tf1) this.b;
                Context context3 = (Context) this.c;
                jo0 jo0Var2 = (jo0) this.d;
                er4 er4Var = (er4) this.e;
                try {
                    Trace.beginSection("Create CameraPipe");
                    long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    Context contextA = sn2.a(context3);
                    contextA.getClass();
                    fh1 fh1Var = new fh1(new lyc(jo0Var2.a), 119);
                    k47 k47Var2 = tf1Var.a;
                    hh1 hh1VarA = jh1.a(new dh1(contextA, fh1Var, new ch1((vg1) k47Var2.b, (a90) k47Var2.c, er4Var)));
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "Created CameraPipe in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2) / 1000000.0d)}, 1))));
                        break;
                    }
                    return hh1VarA;
                } finally {
                    Trace.endSection();
                }
            case 5:
                x16 x16Var = (x16) this.c;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.b;
                TarotCardType tarotCardType = (TarotCardType) this.d;
                bod bodVar = (bod) this.e;
                x1f x1fVar2 = x1f.a;
                x1f.k(p05.a, new w6(tarotSkinIdentify, tarotCardType, bodVar, i2), 2);
                x16Var.invoke();
                return wef.a;
            case 6:
                aw2 aw2Var2 = (aw2) this.b;
                String str = (String) this.c;
                c52 c52Var = (c52) this.d;
                String str2 = (String) this.e;
                x1f x1fVar3 = x1f.a;
                x1f.g(p05.a, m1f.a, new cz1(9));
                ynb.V(aw2Var2, null, null, new qc2(str, c52Var, null), 3).E(new ia(str2, i4));
                return wef.a;
            case 7:
                wq2.g((nua) this.b, (aw2) this.c, (e89) this.d, (mma) this.e, "close", new pg2(i3));
                return wef.a;
            case 8:
                r0 r0Var = (r0) this.b;
                tr2 tr2Var = (tr2) this.d;
                x16 x16Var2 = (x16) this.c;
                ((e89) this.e).setValue(Boolean.FALSE);
                int i6 = r0.j2;
                r0Var.g1(null);
                if (r0Var.p0()) {
                    ka9.h(tr2Var.a, AppRoute.Main.INSTANCE, false);
                } else {
                    x16Var2.invoke();
                }
                return wef.a;
            case 9:
                aw2 aw2Var3 = (aw2) this.b;
                e89 e89Var2 = (e89) this.d;
                r0 r0Var2 = (r0) this.e;
                x16 x16Var3 = (x16) this.c;
                wef wefVar = wef.a;
                if (!((Boolean) e89Var2.getValue()).booleanValue()) {
                    e89Var2.setValue(Boolean.TRUE);
                    ynb.V(aw2Var3, null, null, new uk3(r0Var2, x16Var3, e89Var2, null), 3);
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Context context4 = (Context) this.b;
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) this.d;
                r0 r0Var3 = (r0) this.e;
                x16 x16Var4 = (x16) this.c;
                List list = g6g.a;
                Context applicationContext = context4.getApplicationContext();
                applicationContext.getClass();
                g6g.h(applicationContext, tarotSkinIdentify2);
                x1f x1fVar4 = x1f.a;
                x1f.k(p05.a, new ri3(i4, tarotSkinIdentify2), 2);
                if (r0Var3 != null) {
                    zk3.j(r0Var3);
                }
                if (r0Var3 != null) {
                    String strName = tarotSkinIdentify2.getKey().name();
                    strName.getClass();
                    DrawCardSaves drawCardSavesJ = r0Var3.J();
                    List<TarotCardChoice> choices = drawCardSavesJ != null ? drawCardSavesJ.getChoices() : null;
                    if (choices == null || choices.isEmpty()) {
                        boolean z = r0Var3.R() != null;
                        r0Var3.D1(null);
                        DrawCardSaves drawCardSavesJ2 = r0Var3.J();
                        if (drawCardSavesJ2 != null) {
                            r0Var3.z1(nm4.b(DrawCardSaves.Companion, drawCardSavesJ2.getChatId(), drawCardSavesJ2.getPatterns(), drawCardSavesJ2.getChoices(), drawCardSavesJ2.getDrawnIndexes()));
                        }
                        r0Var3.d1(strName);
                        if (z) {
                            r0Var3.q1();
                        }
                    }
                }
                x16Var4.invoke();
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ynb.V((aw2) this.b, null, null, new g54("", (ht6) this.c, (p5a) this.d, (fab) this.e, null), 3);
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ynb.V((aw2) this.b, null, null, new g64((t7) this.c, (s) this.d, (e89) this.e, null), 3);
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                cs3 cs3Var = (cs3) this.b;
                aw2 aw2Var4 = (aw2) this.c;
                a26 a26Var = (a26) this.d;
                e89 e89Var3 = (e89) this.e;
                if (((sz9) cs3Var.d.c).j() == 0) {
                    ynb.V(aw2Var4, null, null, new jn4(cs3Var, null), 3);
                } else {
                    Boolean bool = (Boolean) e89Var3.getValue();
                    bool.booleanValue();
                    a26Var.d(bool);
                }
                return wef.a;
            case 14:
                n26 n26Var = (n26) this.b;
                jsd jsdVar = (jsd) this.c;
                use useVar = (use) this.d;
                Integer numValueOf = Integer.valueOf(((sz9) ((s69) this.e)).j());
                ArrayList arrayList = new ArrayList(t72.u(jsdVar, 10));
                ListIterator listIterator = jsdVar.listIterator();
                while (true) {
                    ql6 ql6Var = (ql6) listIterator;
                    if (!ql6Var.hasNext()) {
                        n26Var.m(numValueOf, arrayList, useVar.d().c.toString());
                        return wef.a;
                    }
                    arrayList.add(((FeedbackReason) ql6Var.next()).name());
                }
                break;
            case 15:
                l46 l46Var = (l46) this.b;
                uv1 uv1Var = (uv1) this.c;
                kpd kpdVar = (kpd) this.d;
                g49 g49Var = (g49) this.e;
                tf2 tf2Var = l46Var.M;
                uv1 uv1Var2 = tf2Var.b;
                try {
                    tf2Var.b = uv1Var;
                    kpd kpdVar2 = l46Var.G;
                    int[] iArr = l46Var.o;
                    q69 q69Var = l46Var.v;
                    l46Var.o = null;
                    l46Var.v = null;
                    try {
                        l46Var.G = kpdVar;
                        boolean z2 = tf2Var.e;
                        try {
                            tf2Var.e = false;
                            l46Var.H(g49Var.a, g49Var.g, g49Var.b, true);
                            tf2Var.e = z2;
                            l46Var.G = kpdVar2;
                            l46Var.o = iArr;
                            l46Var.v = q69Var;
                            tf2Var.b = uv1Var2;
                            return wef.a;
                        } catch (Throwable th) {
                            tf2Var.e = z2;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        l46Var.G = kpdVar2;
                        l46Var.o = iArr;
                        l46Var.v = q69Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    tf2Var.b = uv1Var2;
                    throw th3;
                }
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                Float f = (Float) this.b;
                m27 m27Var = (m27) this.c;
                Float f2 = (Float) this.d;
                l27 l27Var = (l27) this.e;
                if (!f.equals(m27Var.a) || !f2.equals(m27Var.b)) {
                    m27Var.a = f;
                    m27Var.b = f2;
                    m27Var.d = new jfe(l27Var, xo1.g, f, f2, null);
                    m27Var.v.b.setValue(Boolean.TRUE);
                    m27Var.e = false;
                    m27Var.f = true;
                }
                return wef.a;
            case 17:
                a26 a26Var2 = (a26) this.b;
                e89 e89Var4 = (e89) this.c;
                e89 e89Var5 = (e89) this.d;
                a26 a26Var3 = (a26) this.e;
                e89Var4.setValue(Boolean.FALSE);
                a26Var2.d(Boolean.TRUE);
                puc pucVar = (puc) e89Var5.getValue();
                if (pucVar != null) {
                    a26Var3.d(pucVar.a());
                }
                return wef.a;
            case 18:
                ted tedVar = (ted) this.b;
                fxd fxdVar = (fxd) this.c;
                fxd fxdVar2 = (fxd) this.d;
                fxd fxdVar3 = (fxd) this.e;
                tedVar.e = fxdVar;
                tedVar.f = fxdVar2;
                tedVar.c = fxdVar3;
                return wef.a;
            case 19:
                ted tedVar2 = (ted) this.b;
                aw2 aw2Var5 = (aw2) this.d;
                jx jxVar = (jx) this.e;
                x16 x16Var5 = (x16) this.c;
                if (tedVar2.c() != ued.b) {
                    ynb.V(aw2Var5, null, null, new nz8(tedVar2, null), 3).E(new p9(21, x16Var5));
                } else if (tedVar2.d.d().a.containsKey(ued.c)) {
                    ynb.V(aw2Var5, null, null, new lz8(jxVar, null), 3);
                    ynb.V(aw2Var5, null, null, new mz8(tedVar2, null), 3);
                } else {
                    ynb.V(aw2Var5, null, null, new nz8(tedVar2, null), 3).E(new p9(21, x16Var5));
                }
                return wef.a;
            case 20:
                a26 a26Var4 = (a26) this.b;
                ynb.V((aw2) this.c, null, null, new c39((ted) this.d, (e89) this.e, null), 3);
                a26Var4.d(PopupActionType.CLOSE);
                return wef.a;
            case 21:
                wef wefVar2 = wef.a;
                vp9 vp9Var = (vp9) this.b;
                OnboardNotificationRoute onboardNotificationRoute = (OnboardNotificationRoute) this.c;
                cb9 cb9Var = (cb9) this.d;
                Context context5 = (Context) this.e;
                boolean zIsNewUser = onboardNotificationRoute.isNewUser();
                vp9Var.getClass();
                if (!vp9Var.a) {
                    vp9Var.a = true;
                    if (zIsNewUser) {
                        cb9Var.d(new xn9(i4), OnboardOverviewRoute.INSTANCE);
                    } else {
                        ap9.b(context5, (3 & 1) == 0, true);
                    }
                }
                return wefVar2;
            case 22:
                OverviewItem.NewReadingItem newReadingItem = (OverviewItem.NewReadingItem) this.b;
                shb shbVar = (shb) this.c;
                String str3 = shbVar.b;
                tr2 tr2Var2 = (tr2) this.d;
                r0 r0Var4 = (r0) this.e;
                int i7 = cw9.a[newReadingItem.getState().ordinal()];
                if (i7 == 1) {
                    mx mxVar = new mx(2);
                    mxVar.b(new iy9("btn", "new_reading_open"));
                    mxVar.c(new iy9[]{new iy9("pathway", "reading_general"), new iy9("divination_type", shbVar.a), new iy9("parent_session_id", str3)});
                    ArrayList arrayList2 = mxVar.a;
                    iy9[] iy9VarArr = (iy9[]) arrayList2.toArray(new iy9[arrayList2.size()]);
                    cgg.x(new rp5("button_click", bm8.H((iy9[]) Arrays.copyOf(iy9VarArr, iy9VarArr.length))));
                } else {
                    if (i7 != 2 && i7 != 3) {
                        ap.c();
                        return null;
                    }
                    String childReadingId = newReadingItem.getChildReadingId();
                    if (childReadingId != null) {
                        cgg.x(new rp5("button_click", bm8.H((iy9[]) Arrays.copyOf(new iy9[]{new iy9("btn", "new_reading_enter"), new iy9("pathway", "reading_general"), new iy9("parent_session_id", str3), new iy9("session_id", childReadingId)}, 4))));
                    }
                }
                ka9.e(tr2Var2.a, new AppRoute.FollowUpConversation(r0Var4.E(), newReadingItem.getMessageId(), newReadingItem.getQuestion(), newReadingItem.getChildReadingId()), null, 6);
                return wef.a;
            case 23:
                ru9 ru9Var = (ru9) this.b;
                j18 j18Var = (j18) this.c;
                h0e h0eVar = (h0e) this.d;
                h0e h0eVar2 = (h0e) this.e;
                boolean zBooleanValue = ((Boolean) h0eVar.getValue()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) h0eVar2.getValue()).booleanValue();
                int i8 = -1;
                if (ru9Var.a() && ((zBooleanValue || zBooleanValue2) && (i = (b18VarH = j18Var.h()).o) != 0 && (c18Var = (c18) s72.H0(b18VarH.l)) != null)) {
                    i8 = c18Var.a != i - 1 ? -2 : c18Var.o + c18Var.p;
                }
                return Integer.valueOf(i8);
            case 24:
                k4a k4aVar = (k4a) this.b;
                cb9 cb9Var2 = (cb9) this.c;
                dc9 dc9Var = (dc9) this.d;
                PaywallRoute.Congratulation congratulation = (PaywallRoute.Congratulation) this.e;
                if (k4aVar.a.compareAndSet(false, true)) {
                    cb9Var2.g();
                    if (((Boolean) dc9Var.f.getValue()).booleanValue()) {
                        dc9Var.i(false);
                        ka9.e(cb9Var2, AppRoute.FreeCountDialog.INSTANCE, null, 6);
                    }
                    if (congratulation.getWasSubscription()) {
                        dc9Var.g.setValue(Boolean.TRUE);
                    }
                }
                return wef.a;
            case 25:
                PaywallRoute.AddonPaywall addonPaywall = (PaywallRoute.AddonPaywall) this.b;
                aw2 aw2Var6 = (aw2) this.c;
                cb9 cb9Var3 = (cb9) this.d;
                v vVar = (v) this.e;
                if (addonPaywall.getArmDailyFortuneGuideOnDismiss()) {
                    ynb.V(aw2Var6, null, null, new x4a(vVar, cb9Var3, null), 3);
                } else {
                    cb9Var3.g();
                }
                return wef.a;
            case 26:
                k4a k4aVar2 = (k4a) this.b;
                FiveCardUpgradePending fiveCardUpgradePending = (FiveCardUpgradePending) this.c;
                mma mmaVar = (mma) this.d;
                cb9 cb9Var4 = (cb9) this.e;
                if (k4aVar2.a.compareAndSet(false, true)) {
                    if (fiveCardUpgradePending != null) {
                        mmaVar.getClass();
                        synchronized (mmaVar.S0) {
                            if (pa7.t(mmaVar.e1, fiveCardUpgradePending)) {
                                mmaVar.e1 = null;
                                s0e s0eVar = mmaVar.c1;
                                Boolean bool2 = Boolean.FALSE;
                                s0eVar.getClass();
                                s0eVar.n(null, bool2);
                                mmaVar.f1 = pa7.t(mmaVar.g1, bool2);
                                mmaVar.a1 = true;
                                s0e s0eVar2 = mmaVar.H0;
                                s0eVar2.getClass();
                                s0eVar2.n(null, bool2);
                                mmaVar.n1 = false;
                                mmaVar.S();
                            }
                        }
                    }
                    cb9Var4.g();
                    break;
                }
                return wef.a;
            case 27:
                String str4 = (String) this.b;
                x16 x16Var6 = (x16) this.c;
                e89 e89Var6 = (e89) this.d;
                p5a p5aVar = (p5a) this.e;
                String str5 = "close";
                bwa bwaVar = (bwa) e89Var6.getValue();
                String strP = bwaVar != null ? ym8.P(bwaVar) : null;
                x1f x1fVar5 = x1f.a;
                x1f.k(new r05("paywall_action"), new wg(str5, str4, (Object) strP, (Object) p5aVar, 29), 2);
                if (pa7.t(str4, "onboarding_finish")) {
                    bwa bwaVar2 = (bwa) e89Var6.getValue();
                    if (bwaVar2 == null || (strB = z3a.b(bwaVar2)) == null) {
                        strB = "limited-monthly";
                    }
                    bt5 bt5Var = new bt5(strB, i2);
                    ca2.a.getClass();
                    if (ca2.c) {
                        x1f x1fVar6 = x1f.a;
                        x1f.k(new r05("paywall_close"), bt5Var, 2);
                    }
                }
                x16Var6.invoke();
                return wef.a;
            case 28:
                tt1 tt1Var = (tt1) this.b;
                TarotCardChoice tarotCardChoice = (TarotCardChoice) this.c;
                TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) this.d;
                l26 l26Var = (l26) this.e;
                x1f x1fVar7 = x1f.a;
                x1f.k(p05.a, new h6b(i5, tarotSkinIdentify3, tarotCardChoice), 2);
                if (tt1Var != null) {
                    tt1.c(tt1Var, tarotCardChoice.getCard(), tarotSkinIdentify3, 0, true, new n25(l26Var, tarotSkinIdentify3, tarotCardChoice, i3), null, null, false, 352);
                }
                return wef.a;
            default:
                mmb mmbVar = (mmb) this.b;
                Window window = (Window) this.c;
                web webVar = (web) this.d;
                Window.Callback callback = (Window.Callback) this.e;
                mmbVar.element = null;
                if (window.getCallback() == webVar) {
                    window.setCallback(callback);
                }
                return wef.a;
        }
    }

    public /* synthetic */ jr(x16 x16Var, TarotSkinIdentify tarotSkinIdentify, TarotCardType tarotCardType, bod bodVar) {
        this.a = 5;
        this.c = x16Var;
        this.b = tarotSkinIdentify;
        this.d = tarotCardType;
        this.e = bodVar;
    }

    public /* synthetic */ jr(int i, x16 x16Var, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = x16Var;
    }

    public /* synthetic */ jr(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ jr(YearMonth yearMonth, YearMonth yearMonth2, DayOfWeek dayOfWeek, YearMonth yearMonth3) {
        this.a = 2;
        this.b = yearMonth;
        this.c = yearMonth2;
        this.d = dayOfWeek;
        this.e = yearMonth3;
    }
}
