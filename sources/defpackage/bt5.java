package defpackage;

import ai.askquin.widget.QuickDecisionWidgetReceiver;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.time.Instant;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt5 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ bt5(String str, n6b n6bVar) {
        this.a = 26;
        this.b = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        int i = this.a;
        Long lValueOf = null;
        String strT0 = null;
        x6b x6bVar = null;
        lValueOf = null;
        wef wefVar = wef.a;
        String str = this.b;
        switch (i) {
            case 0:
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "SR_enableNotification", "pathway", "SR_notificationPopup");
                l1fVar.a(str, "seasonal_period");
                return wefVar;
            case 1:
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "btn", "seasonal_reading_start", "pathway", "seasonal_reading_intro");
                l1fVar2.a(str, "seasonal_period");
                return wefVar;
            case 2:
                l1f l1fVar3 = (l1f) obj;
                kv2.y(l1fVar3, "pathway", "SR_notificationPopup", "triggered_by", "SR_intro_close");
                l1fVar3.a(str, "seasonal_period");
                return wefVar;
            case 3:
                hxc hxcVar = (hxc) obj;
                hxcVar.getClass();
                gxc gxcVar = x76.c;
                wn7 wn7Var = x76.a[0];
                gxcVar.getClass();
                hxcVar.c(gxcVar, str);
                return wefVar;
            case 4:
                kv2.y((l1f) obj, "btn", str, "pathway", "gift_card_guide_popup");
                return wefVar;
            case 5:
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                l1fVar4.a(str, "product_id");
                return wefVar;
            case 6:
                p79 p79Var = (p79) obj;
                p79Var.e(lj6.d, str);
                lj6.d(p79Var, str);
                return null;
            case 7:
                hxc hxcVar2 = (hxc) obj;
                exc.f(hxcVar2, str);
                exc.m(hxcVar2, 5);
                return wefVar;
            case 8:
                hxc hxcVar3 = (hxc) obj;
                exc.f(hxcVar3, str);
                exc.m(hxcVar3, 5);
                return wefVar;
            case 9:
                l1f l1fVar5 = (l1f) obj;
                kv2.y(l1fVar5, "product_id", str, "trigger_by", "personality_report");
                l1fVar5.a("personality_report", "triggered_by");
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                hxc hxcVar4 = (hxc) obj;
                exc.k(hxcVar4, str);
                gxc gxcVar2 = cxc.u;
                wn7 wn7Var2 = exc.a[11];
                Float fValueOf = Float.valueOf(0.0f);
                gxcVar2.getClass();
                hxcVar4.c(gxcVar2, fValueOf);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l1f l1fVar6 = (l1f) obj;
                kv2.y(l1fVar6, "btn", "choose_theme", "choice", str);
                l1fVar6.a("onboarding", "pathway");
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                l1f l1fVar7 = (l1f) obj;
                l1fVar7.getClass();
                l1fVar7.a(str, "theme");
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                l1f l1fVar8 = (l1f) obj;
                l1fVar8.getClass();
                l1fVar8.a(str, "purpose_value");
                return wefVar;
            case 14:
                l1f l1fVar9 = (l1f) obj;
                l1fVar9.getClass();
                l1fVar9.a(str, "method");
                return wefVar;
            case 15:
                l1f l1fVar10 = (l1f) obj;
                l1fVar10.getClass();
                l1fVar10.a(v4e.Q(str) ? "limited-monthly" : str, "plan_shown");
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                l1f l1fVar11 = (l1f) obj;
                l1fVar11.getClass();
                l1fVar11.a(str, "channel_value");
                return wefVar;
            case 17:
                l1f l1fVar12 = (l1f) obj;
                l1fVar12.getClass();
                l1fVar12.a(str, "plan");
                return wefVar;
            case 18:
                l1f l1fVar13 = (l1f) obj;
                l1fVar13.getClass();
                l1fVar13.a(v4e.Q(str) ? "limited-monthly" : str, "plan_shown");
                return wefVar;
            case 19:
                l1f l1fVar14 = (l1f) obj;
                l1fVar14.getClass();
                l1fVar14.a(str, "login_method");
                return wefVar;
            case 20:
                l1f l1fVar15 = (l1f) obj;
                l1fVar15.getClass();
                l1fVar15.a(str, "product_id");
                return wefVar;
            case 21:
                kv2.y((l1f) obj, "btn", "report_entry", "pathway", str);
                return wefVar;
            case 22:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("SELECT long_value FROM Preference where `key`=?");
                try {
                    x8cVarW0.Q(1, str);
                    if (x8cVarW0.R0() && !x8cVarW0.isNull(0)) {
                        lValueOf = Long.valueOf(x8cVarW0.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                    x8cVarW0.close();
                }
            case 23:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW1 = q8cVar2.W0("SELECT chatId FROM quick_decision WHERE syncedAt IS NOT NULL AND accountId = ?");
                try {
                    x8cVarW1.Q(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (x8cVarW1.R0()) {
                        arrayList.add(x8cVarW1.t0(0));
                    }
                    x8cVarW1.close();
                    return arrayList;
                } catch (Throwable th) {
                    x8cVarW1.close();
                    throw th;
                }
            case 24:
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW2 = q8cVar3.W0("UPDATE quick_decision SET accountId = ? WHERE accountId = ''");
                try {
                    x8cVarW2.Q(1, str);
                    x8cVarW2.R0();
                    return Integer.valueOf(r8c.h(q8cVar3));
                } finally {
                    x8cVarW2.close();
                }
            case 25:
                q8c q8cVar4 = (q8c) obj;
                q8cVar4.getClass();
                x8c x8cVarW3 = q8cVar4.W0("SELECT chatId FROM quick_decision WHERE syncedAt IS NULL AND accountId = ?");
                try {
                    x8cVarW3.Q(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (x8cVarW3.R0()) {
                        arrayList2.add(x8cVarW3.t0(0));
                    }
                    x8cVarW3.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    x8cVarW3.close();
                    throw th2;
                }
            case 26:
                q8c q8cVar5 = (q8c) obj;
                q8cVar5.getClass();
                x8c x8cVarW4 = q8cVar5.W0("SELECT * FROM quick_decision WHERE chatId = ? LIMIT 1");
                try {
                    x8cVarW4.Q(1, str);
                    int iK = y8c.k(x8cVarW4, "id");
                    int iK2 = y8c.k(x8cVarW4, "cardKey");
                    int iK3 = y8c.k(x8cVarW4, "isReversed");
                    int iK4 = y8c.k(x8cVarW4, "answer");
                    int iK5 = y8c.k(x8cVarW4, "tagline");
                    int iK6 = y8c.k(x8cVarW4, "reading");
                    int iK7 = y8c.k(x8cVarW4, "drawnAt");
                    int iK8 = y8c.k(x8cVarW4, "chatId");
                    int iK9 = y8c.k(x8cVarW4, "syncedAt");
                    int iK10 = y8c.k(x8cVarW4, "accountId");
                    if (x8cVarW4.R0()) {
                        long j = x8cVarW4.getLong(iK);
                        String strT1 = x8cVarW4.t0(iK2);
                        boolean z = ((int) x8cVarW4.getLong(iK3)) != 0;
                        String strT2 = x8cVarW4.t0(iK4);
                        String strT3 = x8cVarW4.t0(iK5);
                        String strT4 = x8cVarW4.t0(iK6);
                        Instant instantI = yx4.i(x8cVarW4.isNull(iK7) ? null : x8cVarW4.t0(iK7));
                        if (instantI == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        String strT5 = x8cVarW4.t0(iK8);
                        if (!x8cVarW4.isNull(iK9)) {
                            strT0 = x8cVarW4.t0(iK9);
                        }
                        x6bVar = new x6b(j, strT1, z, strT2, strT3, strT4, instantI, strT5, yx4.i(strT0), x8cVarW4.t0(iK10));
                    }
                    x8cVarW4.close();
                    return x6bVar;
                } catch (Throwable th3) {
                    x8cVarW4.close();
                    throw th3;
                }
            case 27:
                l1f l1fVar16 = (l1f) obj;
                kv2.y(l1fVar16, "page_name", "quick_decision_detail", "pathway", "quick_decision");
                if (str != null) {
                    l1fVar16.a(str, "source");
                }
                return wefVar;
            case 28:
                l1f l1fVar17 = (l1f) obj;
                int i2 = QuickDecisionWidgetReceiver.a;
                kv2.y(l1fVar17, "btn", str, "pathway", "quick_decision");
                l1fVar17.a("widget", "source");
                return wefVar;
            default:
                kv2.y((l1f) obj, "btn", str, "pathway", "reading_long_press");
                return wefVar;
        }
    }

    public /* synthetic */ bt5(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public /* synthetic */ bt5(lj6 lj6Var, String str) {
        this.a = 6;
        this.b = str;
    }
}
