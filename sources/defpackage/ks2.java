package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.navhost.CardPickerRoute;
import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.view.View;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.firebase.crashlytics.KeyValueBuilder;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ks2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        List list;
        cod codVar;
        Object value;
        Object objA;
        lld lldVar;
        ycc yccVarA;
        xc4 xc4Var = null;
        switch (this.a) {
            case 0:
                r0 r0Var = (r0) this.b;
                e89 e89Var = (e89) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (!r0Var.h0()) {
                    e89Var.setValue(bool);
                }
                return wef.a;
            case 1:
                r38 r38Var = (r38) this.b;
                b41 b41Var = (b41) this.c;
                vv7 vv7Var = (vv7) ((im2) obj);
                vv7Var.a();
                if (((Boolean) r38Var.s.getValue()).booleanValue() || ((Boolean) r38Var.t.getValue()).booleanValue()) {
                    sn4.O0(vv7Var, b41Var, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return wef.a;
            case 2:
                nu3 nu3Var = (nu3) this.b;
                dg7 dg7Var = (ya2) this.c;
                Throwable th = (Throwable) obj;
                nu3Var.getClass();
                dg7Var.getClass();
                if (th == null) {
                    ((za2) dg7Var).R(nu3Var.l());
                } else if (th instanceof CancellationException) {
                    ((rg7) dg7Var).v((CancellationException) th);
                } else {
                    ((za2) dg7Var).i0(th);
                }
                return wef.a;
            case 3:
                la1 la1Var = (la1) this.b;
                za2 za2Var = (za2) this.c;
                Throwable th2 = (Throwable) obj;
                if (th2 == null) {
                    la1Var.b(za2Var.D());
                } else if (th2 instanceof CancellationException) {
                    la1Var.c();
                } else {
                    la1Var.d(th2);
                }
                return wef.a;
            case 4:
                a26 a26Var = (a26) this.b;
                Exception exc = (Exception) this.c;
                KeyValueBuilder keyValueBuilder = (KeyValueBuilder) obj;
                keyValueBuilder.getClass();
                try {
                    Signature[] signatureArrJ = s.J(cn1.z());
                    if (signatureArrJ != null) {
                        keyValueBuilder.key("signatures", qd0.t0(signatureArrJ, null, null, null, new cz1(24), 31));
                    }
                    break;
                } catch (Throwable unused) {
                }
                a26Var.d(keyValueBuilder);
                for (iy9 iy9Var : rs0.s(exc)) {
                    keyValueBuilder.key((String) iy9Var.a(), (String) iy9Var.b());
                }
                return wef.a;
            case 5:
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                qy2 qy2Var = (qy2) this.c;
                Context context = qy2Var.d;
                fx0 fx0Var = (fx0) obj;
                wef wefVar = wef.a;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!yy2.a(cancellationSignal)) {
                    Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                    ry2.a(qy2Var.h, intent, "BEGIN_SIGN_IN");
                    intent.putExtra("EXTRA_FLOW_PENDING_INTENT", fx0Var.a);
                    try {
                        context.startActivity(intent);
                    } catch (Exception unused2) {
                        CredentialProviderPlayServicesImpl.Companion.getClass();
                        if (!yy2.a(cancellationSignal)) {
                            qy2Var.e().execute(new j1(19, qy2Var));
                        }
                    }
                    break;
                }
                return wefVar;
            case 6:
                y63 y63Var = (y63) this.b;
                Context context2 = (Context) this.c;
                ((ra4) obj).getClass();
                return new oe0(10, y63Var, context2);
            case 7:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.b;
                d63 d63Var = (d63) this.c;
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "playcard_tap_card", "pathway", "daily_card");
                l1fVar.a(urg.r(tarotSkinIdentify), "deck_id");
                l1fVar.a(d63Var.c.getCard().getCardKey(), "card_id");
                return wef.a;
            case 8:
                v33 v33Var = v33.a;
                y63 y63Var2 = (y63) this.b;
                e89 e89Var2 = (e89) this.c;
                int iIntValue = ((Integer) obj).intValue();
                e63 e63Var = (e63) e89Var2.getValue();
                d63 d63Var2 = e63Var instanceof d63 ? (d63) e63Var : null;
                lld lldVar2 = d63Var2 != null ? d63Var2.g : null;
                if ((lldVar2 == null || lldVar2.b != iIntValue) && lldVar2 != null && (list = lldVar2.a) != null && (codVar = (cod) s72.y0(iIntValue, list)) != null) {
                    a63.b(codVar);
                }
                y63Var2.n(iIntValue);
                s0e s0eVar = y63Var2.x;
                AtomicReference atomicReference = y63Var2.z;
                v33 v33Var2 = v33.b;
                while (!atomicReference.compareAndSet(v33Var, v33Var2)) {
                    if (atomicReference.get() != v33Var) {
                        return wef.a;
                    }
                }
                Object value2 = s0eVar.getValue();
                d63 d63Var3 = value2 instanceof d63 ? (d63) value2 : null;
                cod codVar2 = (d63Var3 == null || (lldVar = d63Var3.g) == null) ? null : (cod) s72.y0(lldVar.b, lldVar.a);
                if (d63Var3 == null || codVar2 == null || !qd0.I0(new omd[]{omd.a, omd.b}).contains(codVar2.b)) {
                    atomicReference.set(v33Var);
                } else {
                    TarotSkinIdentify tarotSkinIdentify2 = codVar2.a;
                    do {
                        value = s0eVar.getValue();
                        objA = (e63) value;
                        d63 d63Var4 = objA instanceof d63 ? (d63) objA : null;
                        if (d63Var4 != null) {
                            objA = d63.a(d63Var4, lld.a(d63Var4.g, null, 0, null, true, false, 23));
                        }
                    } while (!s0eVar.l(value, objA));
                    ynb.V(hwf.a(y63Var2), null, null, new q63(null, d63Var3, y63Var2, tarotSkinIdentify2), 3);
                }
                return wef.a;
            case 9:
                cod codVar3 = (cod) this.b;
                String str = (String) this.c;
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "btn", "switch_deck", "pathway", "daily_card");
                l1fVar2.a(urg.r(codVar3.a), "deck_id");
                l1fVar2.a(str, "locked");
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                String str2 = (String) this.b;
                DailyFortuneGuideTrigger dailyFortuneGuideTrigger = (DailyFortuneGuideTrigger) this.c;
                l1f l1fVar3 = (l1f) obj;
                kv2.y(l1fVar3, "btn", str2, "pathway", "daily_fortune_guide");
                l1fVar3.a(dailyFortuneGuideTrigger.getAnalyticsValue(), "triggered_by");
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                euc eucVar = (euc) this.b;
                Locale locale = (Locale) this.c;
                List list2 = (List) obj;
                Long l = (Long) list2.get(0);
                Long l2 = (Long) list2.get(1);
                Object obj2 = list2.get(2);
                obj2.getClass();
                int iIntValue2 = ((Integer) obj2).intValue();
                Object obj3 = list2.get(3);
                obj3.getClass();
                z67 z67Var = new z67(iIntValue2, ((Integer) obj3).intValue(), 1);
                Object obj4 = list2.get(4);
                obj4.getClass();
                return new xf3(l, l2, z67Var, ((Integer) obj4).intValue(), eucVar, locale);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                Locale locale2 = (Locale) this.b;
                ma8 ma8Var = (ma8) this.c;
                cg3 cg3Var = (cg3) obj;
                cg3Var.getClass();
                if (pa7.t(locale2.getLanguage(), "zh")) {
                    cg3Var.a(ma8Var.h() + "月");
                    cg3Var.a(ma8Var.c() + "日");
                } else {
                    j19 j19Var = j19.b;
                    j19Var.getClass();
                    cg3Var.c(new ru0(new h19(j19Var)));
                    z7f.u(cg3Var, ' ');
                    cg3Var.c(new ru0(new zg3(uw9.a)));
                }
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                jx jxVar = (jx) this.b;
                h0e h0eVar = (h0e) this.c;
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.b((1.0f - ((Number) jxVar.e()).floatValue()) * xj3.g(h0eVar));
                return wef.a;
            case 14:
                TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) this.b;
                String str3 = (String) this.c;
                l1f l1fVar4 = (l1f) obj;
                kv2.y(l1fVar4, "action", "swipe_up_detail", "pathway", "card_zoom");
                l1fVar4.a(urg.r(tarotSkinIdentify3), "deck_id");
                l1fVar4.a(str3, "card_id");
                return wef.a;
            case 15:
                TarotSkinIdentify tarotSkinIdentify4 = (TarotSkinIdentify) this.b;
                pl3 pl3Var = (pl3) this.c;
                l1f l1fVar5 = (l1f) obj;
                kv2.y(l1fVar5, "action", "rotate_box", "pathway", "box_view");
                l1fVar5.a(urg.r(tarotSkinIdentify4), "deck_id");
                l1fVar5.a(pl3Var == pl3.c ? "1" : "0", "locked");
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ol3 ol3Var = (ol3) this.b;
                a26 a26Var2 = (a26) this.c;
                TarotSkinIdentify tarotSkinIdentify5 = (TarotSkinIdentify) obj;
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new i73(26), 2);
                if (tarotSkinIdentify5 != null) {
                    ol3Var.getClass();
                    ol3Var.G0 = false;
                    s0e s0eVar2 = ol3Var.x;
                    s0eVar2.getClass();
                    s0eVar2.n(null, tarotSkinIdentify5);
                    s0e s0eVar3 = ol3Var.Y;
                    Boolean bool2 = Boolean.FALSE;
                    s0eVar3.getClass();
                    s0eVar3.n(null, bool2);
                }
                a26Var2.d(tarotSkinIdentify5);
                return wef.a;
            case 17:
                bx3 bx3Var = (bx3) this.b;
                yw3 yw3Var = (yw3) this.c;
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                bx3Var.b.Q(q8cVar, yw3Var);
                return wef.a;
            case 18:
                w94 w94Var = (w94) this.b;
                zi0 zi0Var = (zi0) this.c;
                ((IOException) obj).getClass();
                synchronized (w94Var) {
                    zi0Var.k();
                }
                return wef.a;
            case 19:
                vb4 vb4Var = (vb4) this.b;
                yc4 yc4Var = (yc4) this.c;
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                w84 w84Var = vb4Var.c;
                w84Var.getClass();
                try {
                    ((qb4) w84Var.b).Q(q8cVar2, yc4Var);
                    break;
                } catch (SQLException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        throw e;
                    }
                    if (!v4e.F(message, "unique", true) && !v4e.F(message, "2067", false) && !v4e.F(message, "1555", false)) {
                        throw e;
                    }
                    ((rb4) w84Var.c).U(q8cVar2, yc4Var);
                }
                return wef.a;
            case 20:
                String str4 = (String) this.b;
                vc4 vc4Var = (vc4) this.c;
                q8c q8cVar3 = (q8c) obj;
                q8cVar3.getClass();
                x8c x8cVarW0 = q8cVar3.W0("SELECT * FROM DIVINATION_SUMMARY WHERE divinationId = ? LIMIT 1");
                try {
                    x8cVarW0.Q(1, str4);
                    int iK = y8c.k(x8cVarW0, "divinationId");
                    int iK2 = y8c.k(x8cVarW0, "theme");
                    int iK3 = y8c.k(x8cVarW0, "summary");
                    int iK4 = y8c.k(x8cVarW0, "advice");
                    if (x8cVarW0.R0()) {
                        String strT0 = x8cVarW0.t0(iK);
                        String strT1 = x8cVarW0.t0(iK2);
                        eu4 eu4Var = vc4Var.c;
                        xc4Var = new xc4(strT0, eu4.l(strT1), x8cVarW0.t0(iK3), x8cVarW0.t0(iK4));
                        break;
                    }
                    return xc4Var;
                } finally {
                    x8cVarW0.close();
                }
            case 21:
                vc4 vc4Var2 = (vc4) this.b;
                xc4 xc4Var2 = (xc4) this.c;
                q8c q8cVar4 = (q8c) obj;
                q8cVar4.getClass();
                vc4Var2.b.Q(q8cVar4, xc4Var2);
                return wef.a;
            case 22:
                sd4 sd4Var = (sd4) this.c;
                r0 r0Var2 = (r0) this.b;
                j97 j97Var = (j97) obj;
                j97Var.getClass();
                sd4Var.d(j97Var.a);
                r0Var2.X1 = Instant.now();
                r0Var2.h1();
                return wef.a;
            case 23:
                el elVar = (el) this.c;
                r0 r0Var3 = (r0) this.b;
                op5 op5Var = (op5) obj;
                op5Var.getClass();
                if (op5Var instanceof np5) {
                    elVar.d(((np5) op5Var).a);
                } else if (op5Var instanceof mp5) {
                    m8b m8bVar = cp5.a;
                    ot8 ot8VarB = cp5.b(((mp5) op5Var).a);
                    if (ot8VarB != null) {
                        r0Var3.X0(ot8VarB);
                    }
                } else if (!(op5Var instanceof lp5)) {
                    ap.c();
                    return null;
                }
                return wef.a;
            case 24:
                cm4 cm4Var = (cm4) this.c;
                r0 r0Var4 = (r0) this.b;
                l1f l1fVar6 = (l1f) obj;
                l1fVar6.getClass();
                String str5 = cm4Var.b;
                if (str5 != null) {
                    l1fVar6.a(str5, "spread");
                }
                l1fVar6.a(Integer.valueOf(cm4Var.d.size()), "card_count");
                l1fVar6.a(r0Var4.j0() ? "history" : "draw_done", "source");
                Instant instant = cm4Var.e;
                if (instant != null) {
                    double millis = Duration.between(instant, Instant.now()).toMillis() / 3600000.0d;
                    if (millis < 0.0d) {
                        millis = 0.0d;
                    }
                    l1fVar6.a(Double.valueOf(millis), "hours_since_draw");
                }
                return wef.a;
            case 25:
                a26 a26Var3 = (a26) this.b;
                mj4 mj4Var = (mj4) this.c;
                if (((Boolean) a26Var3.d((fj4) obj)).booleanValue()) {
                    return mj4Var;
                }
                return null;
            case 26:
                ka9 ka9Var = (ka9) this.b;
                CardPickerRoute cardPickerRoute = (CardPickerRoute) this.c;
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                tarotCardChoice.getClass();
                da9 da9VarC = ka9Var.c();
                if (da9VarC != null && (yccVarA = da9VarC.a()) != null) {
                    yccVarA.d("single_select_card", tarotCardChoice.getCard().name());
                    yccVarA.d("single_select_reversed", Boolean.valueOf(tarotCardChoice.isReversed()));
                    yccVarA.d("single_select_slot_index", Integer.valueOf(cardPickerRoute.getTargetSlotIndex()));
                }
                ka9Var.g();
                return wef.a;
            case 27:
                ((yy4) this.b).b.b((xy4) this.c);
                return wef.a;
            case 28:
                ynb.V(lw2.a, null, null, new c65((l65) this.b, (pu3) this.c, null), 3);
                return wef.a;
            default:
                return new lf(12, new a85((View) this.b, (x16) this.c));
        }
    }

    public /* synthetic */ ks2(Object obj, r0 r0Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = r0Var;
    }
}
