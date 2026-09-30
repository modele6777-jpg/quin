package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.ClarifyingCardSkipActionState;
import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.draw.navhost.ClarifyingCardDrawingRoute;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.paywall.d;
import ai.askquin.ui.paywall.g;
import android.content.Context;
import android.net.Uri;
import android.os.Trace;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m8(aw2 aw2Var, e89 e89Var, Context context, Uri uri, e89 e89Var2) {
        this.a = 12;
        this.c = aw2Var;
        this.f = e89Var;
        this.b = context;
        this.d = uri;
        this.e = e89Var2;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0290 A[LOOP:0: B:104:0x028a->B:106:0x0290, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x02af  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:118:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:203:0x02bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:? A[LOOP:1: B:108:0x02a9->B:204:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.x16
    public final Object invoke() {
        ArrayList arrayList;
        Iterator it;
        DayOfWeek dayOfWeek;
        LocalDate localDate;
        LocalDate localDate2;
        t12 t12Var;
        int i = this.a;
        s12 s12Var = s12.a;
        int i2 = 1;
        int i3 = 3;
        Object objB = null;
        wef wefVar = wef.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                ynb.N((Context) obj5, (q9b) obj4, (t7) obj3, new l8((dc9) obj2, i2));
                ((e89) obj).setValue(Boolean.FALSE);
                return wefVar;
            case 1:
                ((ila) obj5).o((x16) obj4, (nma) obj3, (String) obj2, (cv7) obj);
                return wefVar;
            case 2:
                tr2 tr2Var = (tr2) obj4;
                y41.M((t7) obj3, (Context) obj5, tr2Var.c.m0(), new w6(tr2Var, (a26) obj2, (use) obj, 17));
                return wefVar;
            case 3:
                wq2.g((nua) obj4, (aw2) obj3, (e89) obj, (mma) obj2, "enter_reading", new ro2((q7b) obj5, i3));
                return wefVar;
            case 4:
                Context context = (Context) obj5;
                r0 r0Var = (r0) obj4;
                aw2 aw2Var = (aw2) obj3;
                e89 e89Var = (e89) obj;
                String str = (String) obj2;
                vb2 vb2VarH = kn2.H(context);
                if (vb2VarH != null) {
                    r0Var.T0(new kf(aw2Var, e89Var, vb2VarH, context, str));
                }
                return wefVar;
            case 5:
                Locale locale = (Locale) obj2;
                e89 e89Var2 = (e89) obj;
                return q1c.f(((zse) e89Var2.getValue()).a.b.length() > 0 ? ((ie3) obj5).a(((j91) obj4).c(((zse) e89Var2.getValue()).a.b, ((be3) obj3).c, locale), locale) : "");
            case 6:
                return new xf3((Long) obj5, (Long) obj4, (z67) obj3, 0, (euc) obj2, (Locale) obj);
            case 7:
                List list = (List) obj5;
                cs3 cs3Var = (cs3) obj4;
                List list2 = (List) obj3;
                Map map = (Map) obj2;
                n26 n26Var = (n26) obj;
                if (!list.isEmpty()) {
                    TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) list.get(((sz9) cs3Var.d.c).j() % list.size());
                    n26Var.m(tarotSkinIdentify, "tap_expand", Boolean.valueOf(xj3.s(tarotSkinIdentify, list2, map) == pl3.c));
                }
                return wefVar;
            case 8:
                bk3 bk3Var = (bk3) obj5;
                a26 a26Var = (a26) obj4;
                a26 a26Var2 = (a26) obj3;
                x16 x16Var = (x16) obj2;
                x16 x16Var2 = (x16) obj;
                if (bk3Var instanceof ak3) {
                    ak3 ak3Var = (ak3) bk3Var;
                    boolean z = ak3Var.b;
                    TarotSkinIdentify tarotSkinIdentify2 = ak3Var.a;
                    if (z) {
                        a26Var.d(tarotSkinIdentify2);
                    } else {
                        a26Var2.d(tarotSkinIdentify2);
                    }
                } else if (bk3Var instanceof zj3) {
                    if (((zj3) bk3Var).a) {
                        x16Var.invoke();
                    } else {
                        x16Var2.invoke();
                    }
                } else if (bk3Var != null) {
                    ap.c();
                    return null;
                }
                return wefVar;
            case 9:
                ynb.V((aw2) obj4, null, null, new g54((String) obj5, (ht6) obj3, (p5a) obj2, (fab) obj, null), 3);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                r0 r0Var2 = (r0) obj5;
                List list3 = (List) obj3;
                ConcurrentHashMap concurrentHashMap = xfb.a;
                String str2 = r0Var2.I0;
                str2.getClass();
                xfb.a.remove(str2);
                xfb.b.remove(str2);
                r0Var2.k("scene", "shuffle");
                r0Var2.h2.setValue(new wd4((String) obj4, list3, (String) obj2));
                r0Var2.x1 = (String) obj;
                nm4 nm4Var = DrawCardSaves.Companion;
                fc4 fc4Var = r0Var2.H0;
                if (fc4Var == null) {
                    pa7.g0("divinationKey");
                    throw null;
                }
                String str3 = fc4Var.a;
                nm4Var.getClass();
                str3.getClass();
                pu4 pu4Var = pu4.a;
                return new DrawCardSaves(str3, list3, pu4Var, pu4Var, null, null);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                w12 w12Var = (w12) obj4;
                r0 r0Var3 = (r0) obj3;
                ClarifyingCardDrawingRoute clarifyingCardDrawingRoute = (ClarifyingCardDrawingRoute) obj2;
                ka9 ka9Var = (ka9) obj;
                g95 g95Var = ((u12) ((r12) obj5).v.getValue()) == null ? g95.Pre : g95.Post;
                if (w12Var != null) {
                    cgg.x(new rp5("button_click", bm8.H((iy9[]) Arrays.copyOf(new iy9[]{new iy9("btn", "back"), new iy9("pathway", "extra_wheel"), new iy9("triggered_by", "extra"), new iy9("parent_session_id", w12Var.a.b), new iy9("exit", g95Var.a())}, 5))));
                }
                String requestMessageId = clarifyingCardDrawingRoute.getRequestMessageId();
                lsd lsdVar = r0Var3.U0;
                requestMessageId.getClass();
                if (!r0Var3.V0.containsKey(requestMessageId) && lsdVar.get(requestMessageId) == s12Var) {
                    lsdVar.remove(requestMessageId);
                }
                ka9Var.g();
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                e89 e89Var3 = (e89) obj;
                e89Var3.setValue(Boolean.TRUE);
                ynb.V((aw2) obj4, null, null, new y35((Context) obj5, (Uri) obj3, (e89) obj2, e89Var3, null), 3);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                LocalDate localDate3 = (LocalDate) obj4;
                LocalDate localDate4 = (LocalDate) obj3;
                h0e h0eVar = (h0e) obj;
                YearMonth yearMonthB = ((m91) ((r91) obj5).e.getValue()).b();
                LocalDate localDate5 = (LocalDate) ((h0e) obj2).getValue();
                if (!tq.B(localDate5).equals(yearMonthB)) {
                    if (!pa7.t(yearMonthB, tq.B(localDate3))) {
                        yearMonthB.getClass();
                        LocalDate localDateAtDay = yearMonthB.atDay(1);
                        localDateAtDay.getClass();
                        localDate3 = (LocalDate) mh3.s(localDateAtDay, localDate4, localDate3);
                    }
                    if (!localDate5.equals(localDate3)) {
                        ((a26) h0eVar.getValue()).d(localDate3);
                    }
                }
                return wefVar;
            case 14:
                LocalDate localDate6 = (LocalDate) obj4;
                LocalDate localDate7 = (LocalDate) obj3;
                h0e h0eVar2 = (h0e) obj;
                r2g r2gVar = (r2g) ((t2g) obj5).f.getValue();
                LocalDate localDate8 = (LocalDate) ((h0e) obj2).getValue();
                List listA = r2gVar.a();
                if (listA == null || !listA.isEmpty()) {
                    Iterator it2 = listA.iterator();
                    while (it2.hasNext()) {
                        if (pa7.t(((v2g) it2.next()).a(), localDate8)) {
                        }
                    }
                    List listA2 = r2gVar.a();
                    arrayList = new ArrayList(t72.u(listA2, 10));
                    it = listA2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((v2g) it.next()).a());
                    }
                    dayOfWeek = localDate8.getDayOfWeek();
                    dayOfWeek.getClass();
                    for (Object obj6 : arrayList) {
                        if (((LocalDate) obj6).getDayOfWeek() == dayOfWeek) {
                            objB = obj6;
                            localDate = (LocalDate) objB;
                            if (localDate == null) {
                                localDate = (LocalDate) s72.v0(arrayList);
                            }
                            localDate2 = (LocalDate) mh3.s(localDate, localDate6, localDate7);
                            if (!localDate8.equals(localDate2)) {
                                ((a26) h0eVar2.getValue()).d(localDate2);
                            }
                        }
                    }
                    localDate = (LocalDate) objB;
                    if (localDate == null) {
                        localDate = (LocalDate) s72.v0(arrayList);
                    }
                    localDate2 = (LocalDate) mh3.s(localDate, localDate6, localDate7);
                    if (!localDate8.equals(localDate2)) {
                        ((a26) h0eVar2.getValue()).d(localDate2);
                    }
                } else {
                    List listA3 = r2gVar.a();
                    arrayList = new ArrayList(t72.u(listA3, 10));
                    it = listA3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((v2g) it.next()).a());
                    }
                    dayOfWeek = localDate8.getDayOfWeek();
                    dayOfWeek.getClass();
                    while (r3.hasNext()) {
                        if (((LocalDate) obj6).getDayOfWeek() == dayOfWeek) {
                            objB = obj6;
                            localDate = (LocalDate) objB;
                            if (localDate == null) {
                                localDate = (LocalDate) s72.v0(arrayList);
                            }
                            localDate2 = (LocalDate) mh3.s(localDate, localDate6, localDate7);
                            if (!localDate8.equals(localDate2)) {
                                ((a26) h0eVar2.getValue()).d(localDate2);
                            }
                        }
                    }
                    localDate = (LocalDate) objB;
                    if (localDate == null) {
                        localDate = (LocalDate) s72.v0(arrayList);
                    }
                    localDate2 = (LocalDate) mh3.s(localDate, localDate6, localDate7);
                    if (!localDate8.equals(localDate2)) {
                        ((a26) h0eVar2.getValue()).d(localDate2);
                    }
                }
                return wefVar;
            case 15:
                g87 g87Var = (g87) obj5;
                x16 x16Var3 = (x16) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                p5a p5aVar = (p5a) obj;
                if (!g87Var.Y0) {
                    g87Var.Y0 = true;
                    x16Var3.invoke();
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("popup_view"), new vg(str4, str5, p5aVar, i3), 2);
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                r0 r0Var4 = (r0) obj5;
                String str6 = (String) obj2;
                t7 t7Var = (t7) obj3;
                tr2 tr2Var2 = (tr2) obj;
                QuotaBlockReason quotaBlockReason = (QuotaBlockReason) r0Var4.l1.getValue();
                QuotaUsage quotaUsageB = ((eab) ((q9b) obj4)).b();
                boolean z2 = quotaUsageB != null && quotaUsageB.getHasSubscription();
                String strA = ((mo3) t7Var).a();
                String strE = r0Var4.E();
                boolean z3 = (str6.equals("conversation") || str6.equals("camera_divination")) && (quotaBlockReason == QuotaBlockReason.InsufficientBalance || quotaBlockReason == QuotaBlockReason.CountInsufficient);
                int i4 = quotaBlockReason == null ? -1 : cw9.b[quotaBlockReason.ordinal()];
                if (i4 == 1) {
                    objB = g.b(PaywallRoute.Companion, z3, 1);
                } else if (i4 != 2) {
                    objB = i4 != 3 ? z2 ? new PaywallRoute.AddonPaywall(str6, (String) null, (String) null, z3, 6, (rp3) null) : new PaywallRoute.InterceptPaywall(str6, (String) null, (String) null, (String) null, (String) null, 30, (rp3) null) : g.a(PaywallRoute.Companion, strA, strE);
                }
                if (objB != null) {
                    d.b(tr2Var2.a, objB);
                }
                return wefVar;
            case 17:
                OverviewItem.ClarifyingCardItem clarifyingCardItem = (OverviewItem.ClarifyingCardItem) obj4;
                r0 r0Var5 = (r0) obj3;
                tr2 tr2Var3 = (tr2) obj2;
                shb shbVar = (shb) obj;
                x12 x12Var = (x12) ((LinkedHashMap) obj5).get(clarifyingCardItem.getMessageId());
                if (x12Var != null) {
                    cgg.x(hkg.n0(cgg.S(x12Var, shbVar), "button_click", new iy9("btn", "extra_open")));
                }
                String messageId = clarifyingCardItem.getMessageId();
                r0Var5.getClass();
                messageId.getClass();
                if (pa7.t(r0Var5.P().e, messageId) && (t12Var = (t12) r0Var5.P().b.get(messageId)) != null && t12Var.d == ClarifyingCardState.PendingDecision && !r0Var5.V0.containsKey(messageId) && !pa7.t(r0Var5.o(messageId), ClarifyingCardSkipActionState.Loading.INSTANCE)) {
                    r0Var5.U0.put(messageId, s12Var);
                    ka9.e(tr2Var3.b, new ClarifyingCardDrawingRoute(clarifyingCardItem.getMessageId(), clarifyingCardItem.getLabel(), r0Var5.D()), null, 6);
                }
                return wefVar;
            case 18:
                ((x16) obj5).invoke();
                rs0.h((ufb) obj4, (qwc) obj3, (e89) obj, (e89) obj2);
                return wefVar;
            case 19:
                ynb.V((aw2) obj5, null, null, new hfb((ted) obj4, (use) obj3, (l26) obj2, (jsd) obj, null), 3);
                return wefVar;
            case 20:
                x16 x16Var4 = (x16) obj4;
                x16 x16Var5 = (x16) obj3;
                x16 x16Var6 = (x16) obj2;
                TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) obj;
                int iOrdinal = ((hmd) obj5).a.ordinal();
                p05 p05Var = p05.a;
                if (iOrdinal == 0 || iOrdinal == 1) {
                    x1f x1fVar2 = x1f.a;
                    x1f.k(p05Var, new ri3(8, tarotSkinIdentify3), 2);
                    x16Var4.invoke();
                } else if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        x1f x1fVar3 = x1f.a;
                        x1f.k(p05Var, new ri3(9, tarotSkinIdentify3), 2);
                        x16Var5.invoke();
                    } else {
                        if (iOrdinal != 4) {
                            ap.c();
                            return null;
                        }
                        x1f x1fVar4 = x1f.a;
                        x1f.k(p05Var, new ri3(7, tarotSkinIdentify3), 2);
                        x16Var6.invoke();
                    }
                }
                return wefVar;
            default:
                z5e z5eVar = (z5e) obj5;
                sw3 sw3Var = (sw3) obj4;
                a6e a6eVar = (a6e) obj3;
                a6e a6eVar2 = (a6e) obj2;
                kmb kmbVar = (kmb) obj;
                rxb rxbVar = z5eVar.H0;
                p5e p5eVar = z5eVar.G0;
                rxbVar.getClass();
                Trace.beginSection("Compose:Styles:build");
                try {
                    rxbVar.b = z5eVar;
                    rxbVar.a = sw3Var.getDensity();
                    a6e a6eVar3 = rxbVar.c;
                    a6e a6eVar4 = rxbVar.d;
                    if (a6eVar4 != null) {
                        b6e.n.f(a6eVar4);
                    } else {
                        a6eVar4 = new a6e();
                    }
                    rxbVar.c = a6eVar4;
                    rxbVar.d = a6eVar3;
                    rxbVar.w = null;
                    p5eVar.a(rxbVar);
                    rxbVar.c();
                    Trace.endSection();
                    rxbVar.h(0, a6eVar);
                    z5eVar.I0 = a6eVar;
                    z5eVar.J0 = a6eVar2;
                    kmbVar.element = rxbVar.d();
                    return wefVar;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
        }
    }

    public /* synthetic */ m8(t7 t7Var, Context context, tr2 tr2Var, a26 a26Var, use useVar) {
        this.a = 2;
        this.d = t7Var;
        this.b = context;
        this.c = tr2Var;
        this.e = a26Var;
        this.f = useVar;
    }

    public /* synthetic */ m8(int i, e89 e89Var, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.f = e89Var;
        this.e = obj4;
    }

    public /* synthetic */ m8(r0 r0Var, q9b q9bVar, String str, t7 t7Var, tr2 tr2Var) {
        this.a = 16;
        this.b = r0Var;
        this.c = q9bVar;
        this.e = str;
        this.d = t7Var;
        this.f = tr2Var;
    }

    public /* synthetic */ m8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
