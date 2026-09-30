package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.annual.AnnualEntry;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.photo.homepage.CardLayoutConfig;
import ai.askquin.ui.fourseasons.FourSeasonsEntry;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.personality.navigation.PersonalityRoutes$PersonalityIntroRoute;
import ai.askquin.ui.router.AppRoute;
import ai.askquin.ui.share.SharedDivination;
import ai.askquin.ui.skin.navigation.SkinNavigationRoute$SkinMallRoute;
import ai.askquin.ui.web.WebViewActivity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.util.Patterns;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.personality.model.PersonalityAnalysisQuestion;
import tech.chatmind.api.personality.model.UserDecision;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kf(aw2 aw2Var, gpf gpfVar, xof xofVar, e89 e89Var, e89 e89Var2) {
        this.a = 23;
        this.c = aw2Var;
        this.d = gpfVar;
        this.b = xofVar;
        this.f = e89Var;
        this.e = e89Var2;
    }

    private final Object a(Object obj) {
        e89 e89Var = (e89) this.f;
        x48 x48Var = (x48) this.c;
        e89 e89Var2 = (e89) this.d;
        e89 e89Var3 = (e89) this.b;
        e89 e89Var4 = (e89) this.e;
        ((ra4) obj).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zT = pa7.t(e89Var.getValue(), "page_view");
        h48 h48VarK = x48Var.k();
        c85 c85Var = new c85(h48VarK, zT, new yr2(e89Var, e89Var2, 3), new v7b(jCurrentTimeMillis, e89Var3, e89Var4, 1));
        if (zT) {
            h48VarK.a(c85Var);
            if (((a58) h48VarK).i.compareTo(g48.e) >= 0) {
                c85Var.a();
            }
        } else {
            c85Var.a();
        }
        return new lf(23, c85Var);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x04bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v19, types: [dw2, java.util.List, pv2, xn2] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [dw2, pv2] */
    /* JADX WARN: Type inference failed for: r14v0, types: [ai.askquin.model.TarotSkinIdentify, rp3] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r34v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r34v6 */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        ?? r11;
        pu3 pu3VarY;
        List listSubList;
        Object dzbVar;
        FourSeasonsEntry fourSeasonsEntry;
        yic yicVarL;
        String queryParameter;
        String str;
        UserDecision userDecision;
        x16 n25Var;
        int rate = -1;
        int i = 6;
        float f = 0.0f;
        boolean z = false;
        z = false;
        boolean z2 = false;
        z = false;
        int i2 = 3;
        final int i3 = 1;
        ?? r14 = 0;
        switch (this.a) {
            case 0:
                ef efVar = (ef) this.c;
                efVar.a = ((tb2) this.d).c((String) this.b, (mh3) this.e, new jv2(i3, (e89) this.f));
                return new lf(0, efVar);
            case 1:
                Context context = (Context) this.c;
                String str2 = (String) this.b;
                String str3 = (String) this.d;
                p5a p5aVar = (p5a) this.e;
                fh fhVar = (fh) this.f;
                n07 n07Var = (n07) obj;
                n07Var.getClass();
                x1f x1fVar = x1f.a;
                x1f.k(new r05("paywall_action"), new wg(n07Var, str2, str3, p5aVar, 0), 2);
                vb2 vb2VarH = kn2.H(context);
                if (vb2VarH != null) {
                    y41.N(fhVar.P0, vb2VarH, new l0(i2, fhVar, n07Var), 2);
                }
                return wef.a;
            case 2:
                zse zseVar = (zse) this.c;
                ys ysVar = (ys) this.d;
                rx6 rx6Var = (rx6) this.b;
                bv9 bv9Var = (bv9) this.e;
                a26 a26Var = (a26) this.f;
                s38 s38Var = (s38) obj;
                h28 h28Var = ysVar.a;
                s38Var.h = zseVar;
                s38Var.i = rx6Var;
                s38Var.c = bv9Var;
                s38Var.d = a26Var;
                s38Var.e = h28Var != null ? h28Var.E0 : null;
                s38Var.f = h28Var != null ? h28Var.F0 : null;
                s38Var.g = h28Var != null ? (rvf) eb3.H(h28Var, zg2.t) : null;
                return wef.a;
            case 3:
                ila ilaVar = (ila) this.c;
                x16 x16Var = (x16) this.d;
                nma nmaVar = (nma) this.e;
                String str4 = (String) this.b;
                cv7 cv7Var = (cv7) this.f;
                ilaVar.H0.addView(ilaVar, ilaVar.I0);
                ilaVar.o(x16Var, nmaVar, str4, cv7Var);
                return new lf(2, ilaVar);
            case 4:
                s69 s69Var = (s69) this.c;
                e89 e89Var = (e89) this.f;
                s69 s69Var2 = (s69) this.d;
                e89 e89Var2 = (e89) this.b;
                e89 e89Var3 = (e89) this.e;
                int iIntValue = ((Integer) obj).intValue();
                ((sz9) s69Var).k(iIntValue);
                e89Var.setValue(jr1.a(iIntValue));
                int i4 = iIntValue - 1;
                ((sz9) s69Var2).k(i4 < 0 ? i4 : 0);
                xh7 xh7Var = gs1.a;
                CardLayoutConfig cardLayoutConfig = (CardLayoutConfig) e89Var.getValue();
                xh7Var.getClass();
                e89Var2.setValue(xh7Var.d(CardLayoutConfig.Companion.serializer(), cardLayoutConfig));
                e89Var3.setValue(null);
                return wef.a;
            case 5:
                final vb2 vb2Var = (vb2) this.c;
                final aw2 aw2Var = (aw2) this.d;
                final q7b q7bVar = (q7b) this.b;
                final gd8 gd8Var = (gd8) this.e;
                final e3b e3bVar = (e3b) this.f;
                ((ra4) obj).getClass();
                yl2 yl2Var = new yl2() { // from class: xo2
                    @Override // defpackage.yl2
                    public final void accept(Object obj2) {
                        Intent intent = (Intent) obj2;
                        intent.getClass();
                        vb2 vb2Var2 = vb2Var;
                        vb2Var2.setIntent(intent);
                        ynb.V(aw2Var, null, null, new pp2(vb2Var2, q7bVar, gd8Var, e3bVar, null), 3);
                    }
                };
                vb2Var.z.add(yl2Var);
                return new oe0(4, vb2Var, yl2Var);
            case 6:
                aw2 aw2Var2 = (aw2) this.c;
                e89 e89Var4 = (e89) this.f;
                vb2 vb2Var2 = (vb2) this.d;
                Context context2 = (Context) this.e;
                String str5 = (String) this.b;
                SharedDivination sharedDivination = (SharedDivination) obj;
                wef wefVar = wef.a;
                sharedDivination.getClass();
                if (!((Boolean) e89Var4.getValue()).booleanValue()) {
                    e89Var4.setValue(Boolean.TRUE);
                    ynb.V(aw2Var2, null, null, new et2(vb2Var2, context2, sharedDivination, str5, e89Var4, null), 3);
                }
                return wefVar;
            case 7:
                aw2 aw2Var3 = (aw2) this.c;
                e89 e89Var5 = (e89) this.f;
                j18 j18Var = (j18) this.d;
                z67 z67Var = (z67) this.b;
                n91 n91Var = (n91) this.e;
                int iIntValue2 = ((Integer) obj).intValue();
                bx9 bx9Var = vf3.a;
                e89Var5.setValue(Boolean.valueOf(!((Boolean) e89Var5.getValue()).booleanValue()));
                ynb.V(aw2Var3, null, null, new gf3(j18Var, iIntValue2, z67Var, n91Var, null), 3);
                return wef.a;
            case 8:
                ol3 ol3Var = (ol3) this.c;
                aw2 aw2Var4 = (aw2) this.d;
                Context context3 = (Context) this.b;
                r0 r0Var = (r0) this.e;
                x16 x16Var2 = (x16) this.f;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj;
                wef wefVar2 = wef.a;
                tarotSkinIdentify.getClass();
                ol3Var.getClass();
                if (ol3Var.g.l(Boolean.FALSE, Boolean.TRUE)) {
                    r11 = 0;
                    ol3Var.x.m(null);
                    pu3VarY = ynb.y(hwf.a(ol3Var), lw2.b, new jl3(ol3Var, tarotSkinIdentify, null), 2);
                } else {
                    pu3VarY = null;
                    r11 = 0;
                }
                if (pu3VarY != null) {
                    ynb.V(aw2Var4, r11, r11, new tk3(pu3VarY, context3, tarotSkinIdentify, r0Var, x16Var2, null), 3);
                }
                return wefVar2;
            case 9:
                yl3 yl3Var = (yl3) this.c;
                ctf ctfVar = (ctf) this.d;
                jmb jmbVar = (jmb) this.b;
                jmb jmbVar2 = (jmb) this.e;
                n69 n69Var = (n69) this.f;
                lyd lydVar = yl3Var.a;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                xj0 xj0Var = ctfVar.a;
                btf btfVar = (btf) xj0Var.b;
                qb3[] qb3VarArr = btfVar.d;
                qd0.h0(0, qb3VarArr.length, null, qb3VarArr);
                btfVar.e = 0;
                btf btfVar2 = (btf) xj0Var.c;
                qb3[] qb3VarArr2 = btfVar2.d;
                qd0.h0(0, qb3VarArr2.length, null, qb3VarArr2);
                btfVar2.e = 0;
                xj0Var.a = 0L;
                q03 q03Var = am3.a;
                jmbVar.element = ((qz9) n69Var).j();
                jmbVar2.element = 0.0f;
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                xn5 xn5Var = (xn5) this.c;
                r0 r0Var2 = (r0) this.d;
                Context context4 = (Context) this.b;
                tr2 tr2Var = (tr2) this.e;
                m25 m25Var = (m25) this.f;
                zc4 zc4Var = (zc4) obj;
                zc4Var.getClass();
                xn5.a(xn5Var);
                ynb.V(hwf.a(r0Var2), null, null, new ej4(r0Var2, context4, zc4Var, tr2Var, m25Var, null), 3);
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                final f96 f96Var = (f96) this.c;
                v86 v86Var = (v86) this.d;
                a26 a26Var2 = (a26) this.b;
                final a26 a26Var3 = (a26) this.e;
                final a26 a26Var4 = (a26) this.f;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                v08.W(v08Var, null, new dd2(new g20(15, f96Var), true, -288126602), 3);
                v08.W(v08Var, null, new dd2(new j41(f96Var, v86Var, a26Var2, 8), true, 1319367647), 3);
                Throwable th = f96Var.g;
                e96 e96Var = f96Var.e;
                if (th != null && !(e96Var instanceof y86)) {
                    v08.W(v08Var, null, lmg.d, 3);
                }
                final int i5 = 0;
                v08.W(v08Var, null, new dd2(new n26() { // from class: ja6
                    @Override // defpackage.n26
                    public final Object m(Object obj2, Object obj3, Object obj4) {
                        int i6 = i5;
                        wef wefVar3 = wef.a;
                        f96 f96Var2 = f96Var;
                        switch (i6) {
                            case 0:
                                l46 l46Var = (l46) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                ((mx7) obj2).getClass();
                                if (!l46Var.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    l46Var.Z();
                                } else {
                                    pa6.i(afc.q(R.string.gift_card_blessing_label, l46Var), f96Var2.c, afc.q(R.string.gift_card_blessing_hint, l46Var), a26Var3, f96Var2.e instanceof b96, "gift_card_blessing_input", t72.I(afc.q(R.string.gift_card_blessing_1, l46Var), afc.q(R.string.gift_card_blessing_2, l46Var), afc.q(R.string.gift_card_blessing_3, l46Var), afc.q(R.string.gift_card_blessing_4, l46Var)), l46Var, 196608);
                                }
                                break;
                            default:
                                l46 l46Var2 = (l46) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                ((mx7) obj2).getClass();
                                if (!l46Var2.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    l46Var2.Z();
                                } else {
                                    pa6.i(afc.q(R.string.gift_card_nickname_label, l46Var2), f96Var2.b, afc.q(R.string.gift_card_nickname_hint, l46Var2), a26Var3, f96Var2.e instanceof b96, "gift_card_nickname_input", pu4.a, l46Var2, 1769472);
                                }
                                break;
                        }
                        return wefVar3;
                    }
                }, true, 28715838), 3);
                v08.W(v08Var, null, new dd2(new n26() { // from class: ja6
                    @Override // defpackage.n26
                    public final Object m(Object obj2, Object obj3, Object obj4) {
                        int i6 = i3;
                        wef wefVar3 = wef.a;
                        f96 f96Var2 = f96Var;
                        switch (i6) {
                            case 0:
                                l46 l46Var = (l46) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                ((mx7) obj2).getClass();
                                if (!l46Var.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    l46Var.Z();
                                } else {
                                    pa6.i(afc.q(R.string.gift_card_blessing_label, l46Var), f96Var2.c, afc.q(R.string.gift_card_blessing_hint, l46Var), a26Var4, f96Var2.e instanceof b96, "gift_card_blessing_input", t72.I(afc.q(R.string.gift_card_blessing_1, l46Var), afc.q(R.string.gift_card_blessing_2, l46Var), afc.q(R.string.gift_card_blessing_3, l46Var), afc.q(R.string.gift_card_blessing_4, l46Var)), l46Var, 196608);
                                }
                                break;
                            default:
                                l46 l46Var2 = (l46) obj3;
                                int iIntValue4 = ((Integer) obj4).intValue();
                                ((mx7) obj2).getClass();
                                if (!l46Var2.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    l46Var2.Z();
                                } else {
                                    pa6.i(afc.q(R.string.gift_card_nickname_label, l46Var2), f96Var2.b, afc.q(R.string.gift_card_nickname_hint, l46Var2), a26Var4, f96Var2.e instanceof b96, "gift_card_nickname_input", pu4.a, l46Var2, 1769472);
                                }
                                break;
                        }
                        return wefVar3;
                    }
                }, true, -1261935971), 3);
                v08.W(v08Var, null, lmg.e, 3);
                if (e96Var instanceof a96) {
                    v08.W(v08Var, null, lmg.f, 3);
                }
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                bwa bwaVar = (bwa) this.c;
                String str6 = (String) this.b;
                String str7 = (String) this.d;
                String str8 = (String) this.e;
                p5a p5aVar2 = (p5a) this.f;
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a(ym8.I(bwaVar), "action");
                l1fVar.a("paywall_intercept", "pathway");
                l1fVar.a(str6, "triggered_by");
                l1fVar.a(str7, "product_id");
                if (str8 != null) {
                    l1fVar.a(str8, "blocked_reason");
                }
                if9.o(l1fVar, p5aVar2);
                if9.p(l1fVar, p5aVar2);
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                x16 x16Var3 = (x16) this.c;
                qlb qlbVar = ((m8e) this.d).c;
                x16 x16Var4 = (x16) this.b;
                l26 l26Var = (l26) this.e;
                e89 e89Var6 = (e89) this.f;
                String str9 = (String) obj;
                str9.getClass();
                e89Var6.setValue(Boolean.TRUE);
                x16Var3.invoke();
                if (v4e.Q(str9) && qlbVar == null) {
                    x16Var4.invoke();
                } else {
                    l26Var.z(str9, qlbVar);
                }
                return wef.a;
            case 14:
                d49 d49Var = (d49) this.c;
                mmb mmbVar = (mmb) this.d;
                jmb jmbVar3 = (jmb) this.b;
                gic gicVar = (gic) this.e;
                imb imbVar = (imb) this.f;
                float fFloatValue = ((Float) obj).floatValue();
                x39 x39VarG = d49.g(d49Var.g);
                if (x39VarG != null) {
                    w84 w84Var = d49Var.e;
                    long j = x39VarG.b;
                    long j2 = x39VarG.a;
                    ((btf) w84Var.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((btf) w84Var.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
                    x39 x39VarA = ((x39) mmbVar.element).a(x39VarG);
                    mmbVar.element = x39VarA;
                    float fJ = gicVar.j(gicVar.f(x39VarA.a));
                    jmbVar3.element = fJ;
                    imbVar.element = !abg.I(fJ - fFloatValue);
                }
                return Boolean.valueOf(x39VarG != null);
            case 15:
                imb imbVar2 = (imb) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                kmb kmbVar = (kmb) this.b;
                ma9 ma9Var = (ma9) this.e;
                Bundle bundle = (Bundle) this.f;
                da9 da9Var = (da9) obj;
                da9Var.getClass();
                imbVar2.element = true;
                int iIndexOf = arrayList.indexOf(da9Var);
                if (iIndexOf != -1) {
                    int i6 = iIndexOf + 1;
                    listSubList = arrayList.subList(kmbVar.element, i6);
                    kmbVar.element = i6;
                } else {
                    listSubList = pu4.a;
                }
                ma9Var.a(da9Var.b, bundle, da9Var, listSubList);
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                Context context5 = (Context) this.c;
                q9b q9bVar = (q9b) this.d;
                t7 t7Var = (t7) this.b;
                x16 x16Var5 = (x16) this.e;
                e89 e89Var7 = (e89) this.f;
                ((Integer) obj).getClass();
                if (!ynb.N(context5, q9bVar, t7Var, x16Var5)) {
                    e89Var7.setValue(Boolean.TRUE);
                }
                return wef.a;
            case 17:
                ?? r34 = 0;
                eda edaVar = (eda) this.c;
                s69 s69Var3 = (s69) this.d;
                aw2 aw2Var5 = (aw2) this.b;
                ted tedVar = (ted) this.e;
                e89 e89Var8 = (e89) this.f;
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                tarotCardChoice.getClass();
                int iJ = ((sz9) s69Var3).j();
                s0e s0eVar = edaVar.b;
                while (true) {
                    Object value = s0eVar.getValue();
                    dda ddaVar = (dda) value;
                    ArrayList arrayListL1 = s72.l1(ddaVar.b);
                    arrayListL1.set(iJ, tarotCardChoice);
                    ?? r12 = r34;
                    if (s0eVar.l(value, dda.a(ddaVar, r12, arrayListL1, false, 5))) {
                        ynb.V(aw2Var5, r12, r12, new cda(tedVar, e89Var8, r12), 3);
                        return wef.a;
                    }
                    r34 = r12;
                }
                break;
            case 18:
                ArrayList arrayList2 = (ArrayList) this.c;
                Paint paint = (Paint) this.d;
                Paint paint2 = (Paint) this.b;
                aue aueVar = (aue) this.e;
                mue mueVar = (mue) this.f;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) / 2.0f)) & 4294967295L);
                float fC = ald.c(sn4Var.f()) / 2.0f;
                float fP0 = sn4Var.p0(1.5f);
                float size = 360.0f / arrayList2.size();
                float f2 = size / 2.0f;
                float f3 = (-90.0f) - f2;
                float fP1 = sn4Var.p0(12.0f);
                vl1 vl1VarP = sn4Var.v0().p();
                int i7 = 0;
                for (Object obj2 : arrayList2) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        ?? r35 = r14;
                        t72.Z();
                        throw r35;
                    }
                    float f4 = f;
                    ng4 ng4Var = (ng4) obj2;
                    float f5 = (i7 * size) + f3;
                    ?? r36 = r14;
                    aue aueVar2 = aueVar;
                    double d = f5 + f2;
                    vl1 vl1Var = vl1VarP;
                    float fCos = ((float) Math.cos(Math.toRadians(d))) * fP0;
                    float fSin = ((float) Math.sin(Math.toRadians(d))) * fP0;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) + fCos;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) + fSin;
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                    float f6 = fP0;
                    float f7 = f2;
                    long jFloatToRawIntBits3 = (jFloatToRawIntBits2 << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                    vl1Var.d(jgb.P(f5, size, fC, fP1, jFloatToRawIntBits3), new rt(paint));
                    float f8 = ng4Var.b;
                    if (f8 > f4) {
                        vl1Var.d(jgb.P(f5, size, fC * f8, fP1, jFloatToRawIntBits3), new rt(paint2));
                    }
                    fP0 = f6;
                    vl1VarP = vl1Var;
                    f2 = f7;
                    aueVar = aueVar2;
                    i7 = i8;
                    f = f4;
                    r14 = r36;
                }
                float f9 = fP0;
                ?? r37 = r14;
                aue aueVar3 = aueVar;
                float f10 = f2;
                int i9 = 0;
                for (Object obj3 : arrayList2) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        t72.Z();
                        throw r37;
                    }
                    float f11 = 0.75f * fC;
                    double d2 = (i9 * size) + f3 + f10;
                    float fCos2 = ((float) Math.cos(Math.toRadians(d2))) * f9;
                    float fSin2 = ((float) Math.sin(Math.toRadians(d2))) * f9;
                    float fCos3 = (((float) Math.cos(Math.toRadians(d2))) * f11) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) + fCos2;
                    float fSin3 = (f11 * ((float) Math.sin(Math.toRadians(d2)))) + Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) + fSin2;
                    aue aueVar4 = aueVar3;
                    ste steVarA = aue.a(aueVar4, ((ng4) obj3).a, mueVar, 0L, 1020);
                    long j3 = steVarA.c;
                    v2c.r(sn4Var, steVarA, (((long) Float.floatToRawIntBits(fCos3 - (((int) (j3 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(fSin3 - (((int) (j3 & 4294967295L)) / 2))) & 4294967295L), 250);
                    i9 = i10;
                    aueVar3 = aueVar4;
                }
                return wef.a;
            case 19:
                dc9 dc9Var = (dc9) this.c;
                hc9 hc9Var = (hc9) this.d;
                Context context6 = (Context) this.b;
                cb9 cb9Var = ((q7b) this.e).a;
                jr2 jr2Var = (jr2) this.f;
                String strConcat = (String) obj;
                p05 p05Var = p05.a;
                wef wefVar3 = wef.a;
                strConcat.getClass();
                hf8.Q.getClass();
                ef8.a("Quin.EventNavigator").e("Event clicked: ".concat(strConcat));
                if (!qka.e(strConcat)) {
                    ef8.a("Quin.EventNavigator").b("Failed to open event url: ".concat(strConcat));
                } else if (v4e.F(strConcat, "test-report", false)) {
                    int iOrdinal = hc9Var.ordinal();
                    if (iOrdinal == 0) {
                        str = "report_entry_popup";
                    } else if (iOrdinal == 1) {
                        str = "report_entry_event";
                    } else {
                        if (iOrdinal != 2) {
                            ap.c();
                            return null;
                        }
                        str = "report_entry_notification";
                    }
                    x1f x1fVar2 = x1f.a;
                    x1f.k(p05Var, new bt5(str, 21), 2);
                    dc9Var.g(PersonalityRoutes$PersonalityIntroRoute.INSTANCE);
                } else if (v4e.F(strConcat, "/invite", false)) {
                    x1f x1fVar3 = x1f.a;
                    x1f.k(p05Var, new zea(i3), 2);
                    dc9Var.g(AppRoute.Invitation.INSTANCE);
                } else if (v4e.F(strConcat, "/new-tarot-card", false)) {
                    dc9Var.g(new SkinNavigationRoute$SkinMallRoute(z, (TarotSkinIdentify) r14, i2, (rp3) r14));
                } else if (strConcat.equals("qixi2025")) {
                    dc9Var.g(PaywallRoute.Paywall520.INSTANCE);
                } else if (v4e.F(strConcat, "/app", false)) {
                    if (v4e.F(strConcat, "/app/new-tarot-card", false)) {
                        dc9Var.g(new SkinNavigationRoute$SkinMallRoute(z, (TarotSkinIdentify) r14, i2, (rp3) r14));
                    } else if (v4e.F(strConcat, "/app/settings", false)) {
                        dc9Var.g(AppRoute.MyAccount.INSTANCE);
                    } else if (v4e.F(strConcat, "/app/themes", false)) {
                        dc9Var.g(AppRoute.ThemeSelection.INSTANCE);
                    } else if (v4e.F(strConcat, "/app/invite", false)) {
                        dc9Var.g(AppRoute.Invitation.INSTANCE);
                    } else if (v4e.F(strConcat, "/app/annual-report-2025", false)) {
                        int i11 = WebViewActivity.T0;
                        pzd.i(context6, ib8.j("https://quin.love/annual-report/2025?lang=", vd8.d(), "&ap=android&av=5.23.0"), ozd.b, x0g.a);
                    } else if (v4e.F(strConcat, "/app/fortune-report-2026", false)) {
                        ka9.e(cb9Var, AnnualEntry.INSTANCE, null, 6);
                    } else if (v4e.F(strConcat, "/app/seasonal-fortune-entry", false)) {
                        try {
                            dzbVar = Uri.parse(strConcat);
                        } catch (Throwable th2) {
                            dzbVar = new dzb(th2);
                        }
                        boolean z3 = dzbVar instanceof dzb;
                        Object obj4 = dzbVar;
                        if (z3) {
                            obj4 = null;
                        }
                        Uri uri = (Uri) obj4;
                        if (uri == null) {
                            fourSeasonsEntry = null;
                        } else {
                            if (!uri.isHierarchical()) {
                                uri = null;
                            }
                            if (uri == null) {
                                fourSeasonsEntry = null;
                            } else {
                                String queryParameter2 = uri.getQueryParameter("year");
                                String queryParameter3 = uri.getQueryParameter("solarTerm");
                                if (queryParameter2 == null && queryParameter3 == null) {
                                    yicVarL = yic.c;
                                } else {
                                    if (queryParameter2 != null && queryParameter3 != null) {
                                        yic yicVar = yic.c;
                                        Integer numD = c5e.D(queryParameter2);
                                        if (numD == null || (yicVarL = drb.l(queryParameter3, numD)) == null) {
                                        }
                                    }
                                    fourSeasonsEntry = null;
                                }
                                fourSeasonsEntry = new FourSeasonsEntry(yicVarL.a, yicVarL.b.getWireValue(), pa7.t(uri.getQueryParameter("entry"), "share_icon") ? "share" : hc9Var == hc9.c ? Constants.PUSH : "unknown");
                            }
                        }
                        if (fourSeasonsEntry != null) {
                            ka9.e(cb9Var, fourSeasonsEntry, null, 6);
                        }
                        break;
                    } else if (v4e.F(strConcat, "/app/test-report", false)) {
                        dc9Var.g(PersonalityRoutes$PersonalityIntroRoute.INSTANCE);
                    } else if (v4e.F(strConcat, "/app/index", false)) {
                        dc9Var.g(AppRoute.Main.INSTANCE);
                    } else if (v4e.F(strConcat, "/app/chat", false)) {
                        try {
                            queryParameter = Uri.parse(strConcat).getQueryParameter("question");
                        } catch (Exception e) {
                            hf8.Q.getClass();
                            ef8.a("Quin.EventNavigator").c("Failed to parse URI: ".concat(strConcat), e);
                            queryParameter = null;
                        }
                        dc9 dc9Var2 = jr2Var.b;
                        if (queryParameter == null || v4e.Q(queryParameter)) {
                            queryParameter = null;
                        }
                        dc9Var2.c.setValue(queryParameter);
                        dc9Var2.d = Constants.NORMAL;
                        dc9Var2.h(null);
                        jr2Var.b();
                        break;
                    } else if (v4e.F(strConcat, "/app/paywall/2510", false)) {
                        dc9Var.g(new AppRoute.Paywall("others", false, false, false, 14, (rp3) null));
                    } else if (v4e.F(strConcat, "/app/paywall", false)) {
                        dc9Var.g(new AppRoute.Paywall("others", false, false, true, 6, (rp3) null));
                    } else {
                        ef8.a("Quin.EventNavigator").b("Failed to open event url: ".concat(strConcat));
                    }
                } else if (Patterns.WEB_URL.matcher(strConcat).matches()) {
                    String path = Uri.parse(strConcat).getPath();
                    if (path != null && path.hashCode() == 756433172 && path.equals("/challenge")) {
                        kn2.z(context6, strConcat);
                    } else {
                        int i12 = WebViewActivity.T0;
                        if (pka.a[hc9Var.ordinal()] == 2) {
                            strConcat = v4e.F(strConcat, "?", false) ? strConcat.concat("&pagename=homepage") : strConcat.concat("?pagename=homepage");
                        }
                        pzd.i(context6, strConcat, (8 & 4) != 0 ? ozd.a : ozd.b, null);
                    }
                } else {
                    ef8.a("Quin.EventNavigator").b("Failed to open event url: ".concat(strConcat));
                }
                return wefVar3;
            case 20:
                wef wefVar4 = wef.a;
                mma mmaVar = (mma) this.c;
                ad1 ad1Var = (ad1) this.d;
                String str10 = (String) this.b;
                String str11 = (String) this.e;
                anf anfVar = (anf) this.f;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Object obj5 = mmaVar.S0;
                if (zBooleanValue) {
                    synchronized (obj5) {
                        try {
                            Object value2 = mmaVar.F0.getValue();
                            wua wuaVar = value2 instanceof wua ? (wua) value2 : null;
                            if (pa7.t(wuaVar != null ? wuaVar.a : null, str10) && db6.N(wuaVar.b).equals(str11)) {
                                mmaVar.m1 = anfVar;
                                mmaVar.k1 = null;
                                mmaVar.l1 = null;
                                mmaVar.Y0 = jr5.a;
                                mmaVar.Z0 = false;
                                mmaVar.a1 = true;
                                mmaVar.b1 = true;
                                z = true;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (z) {
                        ad1Var.invoke();
                    }
                } else {
                    synchronized (obj5) {
                        try {
                            Object value3 = mmaVar.F0.getValue();
                            wua wuaVar2 = value3 instanceof wua ? (wua) value3 : null;
                            if (pa7.t(wuaVar2 != null ? wuaVar2.a : null, str10) && db6.N(wuaVar2.b).equals(str11)) {
                                z2 = true;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    if (z2) {
                        mmaVar.G();
                    }
                }
                return wefVar4;
            case 21:
                a26 a26Var5 = (a26) this.c;
                String str12 = (String) this.b;
                a6b a6bVar = (a6b) this.d;
                s0e s0eVar2 = a6bVar.d;
                x16 x16Var6 = (x16) this.e;
                x16 x16Var7 = (x16) this.f;
                t4b t4bVar = (t4b) obj;
                t4bVar.getClass();
                if (t4bVar instanceof o4b) {
                    a26Var5.d(str12);
                } else if (t4bVar instanceof p4b) {
                    int i13 = ((p4b) t4bVar).a;
                    if (i13 >= 0) {
                        Integer numValueOf = Integer.valueOf(i13);
                        s0eVar2.getClass();
                        s0eVar2.n(null, numValueOf);
                    }
                } else if (t4bVar.equals(s4b.a)) {
                    x16Var6.invoke();
                } else if (t4bVar.equals(q4b.a)) {
                    x16Var7.invoke();
                } else {
                    if (!(t4bVar instanceof r4b)) {
                        ap.c();
                        return null;
                    }
                    int i14 = ((r4b) t4bVar).a;
                    whb whbVar = a6bVar.f;
                    if (!(whbVar.a.getValue() instanceof s5b)) {
                        Object value4 = whbVar.a.getValue();
                        value4.getClass();
                        t5b t5bVar = (t5b) value4;
                        List list = t5bVar.a;
                        PersonalityAnalysisQuestion personalityAnalysisQuestion = (PersonalityAnalysisQuestion) s72.y0(t5bVar.b, list);
                        if (personalityAnalysisQuestion != null && (userDecision = personalityAnalysisQuestion.getUserDecision()) != null) {
                            rate = userDecision.getRate();
                        }
                        iy9 iy9Var = new iy9(list, Integer.valueOf(rate));
                        List list2 = (List) iy9Var.a();
                        if (i14 != ((Number) iy9Var.b()).intValue()) {
                            int iIntValue3 = ((Number) s0eVar2.getValue()).intValue();
                            lyd lydVar2 = a6bVar.g;
                            if (lydVar2 != null) {
                                lydVar2.h(null);
                            }
                            a6bVar.g = ynb.V(hwf.a(a6bVar), null, null, new y5b(list2, a6bVar, iIntValue3, i14, null), 3);
                        }
                    }
                }
                return wef.a;
            case 22:
                Context context7 = (Context) this.c;
                x48 x48Var = (x48) this.d;
                String str13 = (String) this.b;
                String str14 = (String) this.e;
                e89 e89Var9 = (e89) this.f;
                ((ra4) obj).getClass();
                vb2 vb2VarH2 = kn2.H(context7);
                if (vb2VarH2 == null) {
                    return new ou(i);
                }
                lgc lgcVar = lgc.a;
                xfc xfcVar = new xfc(e89Var9, z ? 1 : 0);
                x48Var.getClass();
                Application application = vb2VarH2.getApplication();
                application.getClass();
                if (!lgc.c) {
                    lgc.c = true;
                    application.registerActivityLifecycleCallbacks(lgcVar);
                }
                ngc ngcVarA = lgc.a(vb2VarH2);
                if (ngcVarA == null) {
                    n25Var = new kgc(z ? 1 : 0);
                } else {
                    Object obj6 = new Object();
                    ngcVarA.d.put(obj6, new jgc(x48Var, str13, str14, xfcVar));
                    n25Var = new n25(ngcVarA, obj6, vb2VarH2, 29);
                }
                return new seb(1, n25Var);
            case 23:
                aw2 aw2Var6 = (aw2) this.c;
                gpf gpfVar = (gpf) this.d;
                xof xofVar = (xof) this.b;
                e89 e89Var10 = (e89) this.f;
                e89 e89Var11 = (e89) this.e;
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) obj;
                tarotSkinIdentify2.getClass();
                ynb.V(aw2Var6, null, null, new bmd(gpfVar, tarotSkinIdentify2, xofVar, e89Var10, e89Var11, null), 3);
                return wef.a;
            case 24:
                g13 g13Var = (g13) this.c;
                sl9 sl9Var = (sl9) this.d;
                zse zseVar2 = (zse) this.b;
                r38 r38Var = (r38) this.e;
                dtd dtdVar = (dtd) this.f;
                vv7 vv7Var = (vv7) ((im2) obj);
                vv7Var.a();
                float fJ2 = g13Var.c.j();
                if (fJ2 != 0.0f) {
                    long j4 = zseVar2.b;
                    int i15 = eue.c;
                    int iV = sl9Var.v((int) (j4 >> 32));
                    tte tteVarD = r38Var.d();
                    hkb hkbVarC = tteVarD != null ? tteVarD.a.c(iV) : new hkb(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(vv7Var.p0(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f12 = fFloor / 2.0f;
                    float f13 = hkbVarC.a + f12;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (vv7Var.a.f() >> 32)) - f12;
                    if (f13 > fIntBitsToFloat3) {
                        f13 = fIntBitsToFloat3;
                    }
                    if (f13 >= f12) {
                        f12 = f13;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f12)) + 0.5f : (float) Math.rint(f12);
                    sn4.L0(vv7Var, dtdVar, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(hkbVarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(hkbVarC.d)) & 4294967295L), fFloor, fJ2);
                }
                return wef.a;
            case 25:
                return a(obj);
            case 26:
                aw2 aw2Var7 = (aw2) this.c;
                wt6 wt6Var = (wt6) this.d;
                Context context8 = (Context) this.b;
                w6d w6dVar = (w6d) this.e;
                x16 x16Var8 = (x16) this.f;
                gbd gbdVar = (gbd) obj;
                gbdVar.getClass();
                ynb.V(aw2Var7, null, null, new laf(wt6Var, context8, gbdVar, w6dVar, x16Var8, null), 3);
                return wef.a;
            default:
                j18 j18Var2 = (j18) this.c;
                e89 e89Var12 = (e89) this.f;
                s69 s69Var4 = (s69) this.d;
                s69 s69Var5 = (s69) this.b;
                e89 e89Var13 = (e89) this.e;
                if (!((Boolean) e89Var12.getValue()).booleanValue()) {
                    ((sz9) s69Var4).k(j18Var2.e.b.j());
                    ((sz9) s69Var5).k(j18Var2.e.c.j());
                }
                ((x16) e89Var13.getValue()).invoke();
                return wef.a;
        }
    }

    public /* synthetic */ kf(aw2 aw2Var, e89 e89Var, vb2 vb2Var, Context context, String str) {
        this.a = 6;
        this.c = aw2Var;
        this.f = e89Var;
        this.d = vb2Var;
        this.e = context;
        this.b = str;
    }

    public /* synthetic */ kf(int i, e89 e89Var, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.c = obj;
        this.f = e89Var;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    public /* synthetic */ kf(e89 e89Var, x48 x48Var, e89 e89Var2, e89 e89Var3, e89 e89Var4) {
        this.a = 25;
        this.f = e89Var;
        this.c = x48Var;
        this.d = e89Var2;
        this.b = e89Var3;
        this.e = e89Var4;
    }

    public /* synthetic */ kf(ila ilaVar, x16 x16Var, nma nmaVar, String str, cv7 cv7Var) {
        this.a = 3;
        this.c = ilaVar;
        this.d = x16Var;
        this.e = nmaVar;
        this.b = str;
        this.f = cv7Var;
    }

    public /* synthetic */ kf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public /* synthetic */ kf(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.b = str;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
