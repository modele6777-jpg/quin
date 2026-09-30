package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.annual.h;
import ai.askquin.ui.annual.model.AnnualActionFor;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.photo.homepage.CardLayoutConfig;
import ai.askquin.ui.draw.photo.homepage.CardPositionConfig;
import ai.askquin.ui.paywall.PaywallRoute;
import ai.askquin.ui.paywall.d;
import ai.askquin.ui.paywall.g;
import android.graphics.Canvas;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.Gender;
import tech.chatmind.api.RecommendQuestion;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.events.model.PopupAction;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w6 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w6(oy0 oy0Var, String str, a26 a26Var) {
        this.a = 11;
        this.c = oy0Var;
        this.d = str;
        this.b = a26Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Throwable {
        long jFloatToRawIntBits;
        String str;
        int i = 2;
        int i2 = 0;
        switch (this.a) {
            case 0:
                x48 x48Var = (x48) this.c;
                a26 a26Var = (a26) this.b;
                x16 x16Var = (x16) this.d;
                y6 y6Var = new y6(i2, a26Var);
                x48Var.k().a(y6Var);
                return new z6(x16Var, x48Var, y6Var, i2);
            case 1:
                Gender gender = (Gender) this.c;
                a26 a26Var2 = (a26) this.b;
                e89 e89Var = (e89) this.d;
                ((Boolean) obj).getClass();
                e89Var.setValue(gender);
                a26Var2.d(gender);
                return wef.a;
            case 2:
                ynb.V(lw2.a, null, null, new h9((o9) this.c, (String) this.b, (pu3) this.d, null), 3);
                return wef.a;
            case 3:
                x16 x16Var2 = (x16) this.d;
                x16 x16Var3 = (x16) this.c;
                h48 h48Var = (h48) this.b;
                yj yjVar = (yj) obj;
                yjVar.getClass();
                yjVar.b = x16Var2;
                yjVar.c = x16Var3;
                y6 y6Var2 = yjVar.y;
                h48Var.getClass();
                h48 h48Var2 = yjVar.g;
                if (h48Var2 != h48Var && !yjVar.v) {
                    if (h48Var2 != null) {
                        h48Var2.b(y6Var2);
                    }
                    yjVar.g = h48Var;
                    h48Var.a(y6Var2);
                    boolean z = ((a58) h48Var).i.compareTo(g48.d) >= 0;
                    if (!yjVar.v) {
                        yjVar.f.post(new tj(yjVar, z, i2));
                    }
                }
                return wef.a;
            case 4:
                vk vkVar = (vk) this.c;
                a26 a26Var3 = (a26) this.b;
                a26 a26Var4 = (a26) this.d;
                String str2 = (String) obj;
                str2.getClass();
                a26Var3.getClass();
                a26Var4.getClass();
                QuotaUsage quotaUsageB = ((eab) vkVar.c).b();
                if (quotaUsageB == null || quotaUsageB.getTestReportCount() <= 0) {
                    vkVar.e.setValue(Boolean.TRUE);
                    ynb.V(hwf.a(vkVar), null, null, new qk(vkVar, str2, a26Var4, a26Var3, null), 3);
                } else {
                    a26Var4.d(str2);
                }
                return wef.a;
            case 5:
                ik ikVar = (ik) this.c;
                a26 a26Var5 = (a26) this.b;
                a26 a26Var6 = (a26) this.d;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                List list = ((hk) ikVar).a;
                v08Var.X(list.size(), null, new gj(1, list, false), new dd2(new fk(list, a26Var5, a26Var6, i2), true, 802480018));
                v08.W(v08Var, null, cgg.b, 3);
                return wef.a;
            case 6:
                uvf uvfVar = (uvf) this.c;
                LayoutNode layoutNode = (LayoutNode) this.b;
                uvf uvfVar2 = (uvf) this.d;
                vl1 vl1VarP = ((sn4) obj).v0().p();
                if (uvfVar.b.getVisibility() != 8) {
                    uvfVar.Q0 = true;
                    Owner owner = layoutNode.Z;
                    AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                    if (androidComposeView != null) {
                        Canvas canvasB = mp.b(vl1VarP);
                        androidComposeView.getAndroidViewsHandler$ui().getClass();
                        uvfVar2.draw(canvasB);
                    }
                    uvfVar.Q0 = false;
                }
                return wef.a;
            case 7:
                n69 n69Var = (n69) this.c;
                n69 n69Var2 = (n69) this.b;
                h0e h0eVar = (h0e) this.d;
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                qz9 qz9Var = (qz9) n69Var;
                if (qz9Var.j() > 0.0f && ((qz9) n69Var2).j() > 0.0f) {
                    g0cVar.E(qz9Var.j() - ((Number) h0eVar.getValue()).floatValue());
                }
                return wef.a;
            case 8:
                h hVar = (h) this.c;
                AnnualActionFor annualActionFor = (AnnualActionFor) this.b;
                ka9 ka9Var = (ka9) this.d;
                List list2 = (List) obj;
                list2.getClass();
                ynb.V(hwf.a(hVar), null, null, new d40(hVar, annualActionFor, list2, ka9Var, null), 3);
                return wef.a;
            case 9:
                x48 x48Var2 = (x48) this.c;
                aw2 aw2Var = (aw2) this.b;
                sn0 sn0Var = (sn0) this.d;
                ((ra4) obj).getClass();
                xm0 xm0Var = new xm0(i2, aw2Var, sn0Var);
                x48Var2.k().a(xm0Var);
                return new oe0(true ? 1 : 0, x48Var2, xm0Var);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                String str3 = (String) this.c;
                v6 v6Var = new v6(22, (aw2) this.b, (d0f) this.d);
                wn7[] wn7VarArr = exc.a;
                ((hxc) obj).c(swc.c, new f6(str3, v6Var));
                return wef.a;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                oy0 oy0Var = (oy0) this.c;
                String str4 = (String) this.d;
                a26 a26Var7 = (a26) this.b;
                String str5 = (String) obj;
                str5.getClass();
                str4.getClass();
                a26Var7.getClass();
                oy0Var.f.setValue(Boolean.TRUE);
                ynb.V(hwf.a(oy0Var), null, null, new ky0(oy0Var, str4, str5, a26Var7, null), 3).E(new c1(23, oy0Var));
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                a82 a82Var = (a82) this.c;
                v6c v6cVar = (v6c) this.b;
                b41 b41Var = (b41) this.d;
                sn4 sn4Var = (sn4) obj;
                dxe dxeVar = (dxe) a82Var.d;
                dxeVar.getClass();
                float fFloatValue = Float.valueOf(dxeVar.a).floatValue();
                float f = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                float f2 = f / 2.0f;
                float f3 = f * 2.0f;
                float fMin = Math.min(Math.abs(v6cVar.b()), Math.abs(v6cVar.a()));
                float f4 = v6cVar.a;
                float f5 = v6cVar.b;
                boolean z2 = f3 > fMin;
                long j = v6cVar.e;
                d5e d5eVar = new d5e(f, 0.0f, 0, 0, null, 30);
                if (z2) {
                    sn4.T(sn4Var, b41Var, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(v6cVar.b())) << 32) | (((long) Float.floatToRawIntBits(v6cVar.a())) & 4294967295L), j, 0.0f, null, null, 0, 240);
                } else if (Float.intBitsToFloat((int) (j >> 32)) < f2) {
                    float f6 = f4 + f;
                    float f7 = f5 + f;
                    float f8 = v6cVar.c - f;
                    float f9 = v6cVar.d - f;
                    ta0 ta0VarV0 = sn4Var.v0();
                    long jZ = ta0VarV0.z();
                    ta0VarV0.p().g();
                    try {
                        ((vd9) ta0VarV0.c).l(f6, f7, f8, f9, 0);
                        sn4.T(sn4Var, b41Var, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(v6cVar.b())) << 32) | (((long) Float.floatToRawIntBits(v6cVar.a())) & 4294967295L), j, 0.0f, null, null, 0, 240);
                    } finally {
                        ks0.t(ta0VarV0, jZ);
                    }
                } else {
                    sn4.T(sn4Var, b41Var, (((long) Float.floatToRawIntBits(f4 + f2)) << 32) | (((long) Float.floatToRawIntBits(f5 + f2)) & 4294967295L), (((long) Float.floatToRawIntBits(v6cVar.b() - f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(v6cVar.a() - f))), dj6.X(j, f2), 0.0f, d5eVar, null, 0, 208);
                }
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                a82 a82Var2 = (a82) this.c;
                hkb hkbVar = (hkb) this.b;
                float f10 = hkbVar.b;
                float f11 = hkbVar.d;
                float f12 = hkbVar.a;
                float f13 = hkbVar.c;
                b41 b41Var2 = (b41) this.d;
                sn4 sn4Var2 = (sn4) obj;
                dxe dxeVar2 = (dxe) a82Var2.d;
                dxeVar2.getClass();
                float fFloatValue2 = Float.valueOf(dxeVar2.a).floatValue();
                float f14 = fFloatValue2 < 0.0f ? 0.0f : fFloatValue2;
                boolean z3 = f14 * 2.0f > Math.min(Math.abs(f13 - f12), Math.abs(f11 - f10));
                if (z3) {
                    jFloatToRawIntBits = hkbVar.f();
                } else {
                    float f15 = f14 / 2.0f;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15 + f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(f12 + f15)) << 32);
                }
                sn4.O0(sn4Var2, b41Var2, jFloatToRawIntBits, z3 ? hkbVar.e() : (((long) Float.floatToRawIntBits((f11 - f10) - f14)) & 4294967295L) | (((long) Float.floatToRawIntBits((f13 - f12) - f14)) << 32), 0.0f, z3 ? oe5.a : new d5e(f14, 0.0f, 0, 0, null, 30), null, 0, 104);
                return wef.a;
            case 14:
                r91 r91Var = (r91) this.c;
                lm2 lm2Var = (lm2) this.b;
                dd2 dd2Var = (dd2) this.d;
                v08 v08Var2 = (v08) obj;
                v08Var2.getClass();
                int i3 = 0;
                int i4 = 1;
                b21.c(v08Var2, ((f91) r91Var.h.getValue()).a, new w(i4, r91Var.i, ec3.class, "get", "get(I)Ljava/lang/Object;", i3, 11), lm2Var, dd2Var, new w(i4, r91Var.g, id7.class, "onItemPlaced", "onItemPlaced(Lcom/kizitonwose/calendar/compose/ItemCoordinates;)V", i3, 12));
                return wef.a;
            case 15:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) this.c;
                TarotCardType tarotCardType = (TarotCardType) this.b;
                bod bodVar = (bod) this.d;
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "playcard_tap_locked", "pathway", "card_detail");
                l1fVar.a(urg.r(tarotSkinIdentify), "deck_id");
                if (tarotCardType != null) {
                    l1fVar.a(tarotCardType.getCardKey(), "card_id");
                }
                l1fVar.a(urg.r(bodVar.a), "target_deck");
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                e89 e89Var2 = (e89) this.c;
                s69 s69Var = (s69) this.b;
                e89 e89Var3 = (e89) this.d;
                CardPositionConfig cardPositionConfig = (CardPositionConfig) obj;
                cardPositionConfig.getClass();
                ArrayList arrayListL1 = s72.l1(((CardLayoutConfig) e89Var2.getValue()).getPositions());
                arrayListL1.set(((sz9) s69Var).j(), cardPositionConfig);
                e89Var2.setValue(CardLayoutConfig.copy$default((CardLayoutConfig) e89Var2.getValue(), 0, 0.0f, 0.0f, arrayListL1, 7, null));
                xh7 xh7Var = gs1.a;
                CardLayoutConfig cardLayoutConfig = (CardLayoutConfig) e89Var2.getValue();
                xh7Var.getClass();
                e89Var3.setValue(xh7Var.d(CardLayoutConfig.Companion.serializer(), cardLayoutConfig));
                return wef.a;
            case 17:
                tr2 tr2Var = (tr2) this.c;
                a26 a26Var8 = (a26) this.b;
                use useVar = (use) this.d;
                ((t7) obj).getClass();
                ynb.V(hwf.a(tr2Var.c), null, null, new vx1(null, a26Var8, useVar), 3);
                return wef.a;
            case 18:
                v02 v02Var = (v02) this.c;
                n69 n69Var3 = (n69) this.b;
                e89 e89Var4 = (e89) this.d;
                g0c g0cVar2 = (g0c) obj;
                g0cVar2.getClass();
                qz9 qz9Var2 = (qz9) n69Var3;
                g0cVar2.q(qz9Var2.j());
                g0cVar2.r(qz9Var2.j());
                g0cVar2.D(v02Var == v02.b ? sfc.d(1.0f, 0.5f) : ((r2f) e89Var4.getValue()).a);
                return wef.a;
            case 19:
                pm2 pm2Var = (pm2) this.c;
                dg7 dg7Var = (dg7) this.b;
                dic dicVar = (dic) this.d;
                float fFloatValue3 = ((Float) obj).floatValue();
                float f16 = pm2Var.F0 ? 1.0f : -1.0f;
                gic gicVar = pm2Var.E0;
                long jF = gicVar.f(gicVar.i(f16 * fFloatValue3));
                gic gicVar2 = dicVar.a;
                float fH = gicVar.h(gicVar.f(gicVar2.d(gicVar2.k, jF, 1))) * f16;
                if (Math.abs(fH) < Math.abs(fFloatValue3)) {
                    CancellationException cancellationException = new CancellationException(kv2.k("Scroll animation cancelled because scroll was not consumed (", fH, " < ", fFloatValue3, ")"));
                    cancellationException.initCause(null);
                    dg7Var.h(cancellationException);
                }
                return wef.a;
            case 20:
                mma mmaVar = (mma) this.c;
                a26 a26Var9 = (a26) this.b;
                e89 e89Var5 = (e89) this.d;
                PopupAction popupAction = (PopupAction) obj;
                popupAction.getClass();
                if (((Boolean) e89Var5.getValue()).booleanValue()) {
                    rfc.q(rfc.s(popupAction.getTracking()));
                    mmaVar.G();
                    String url = popupAction.getUrl();
                    if (url != null) {
                        Object obj2 = v4e.Q(url) ? null : url;
                        if (obj2 != null) {
                            a26Var9.d(obj2);
                        }
                    }
                }
                return wef.a;
            case 21:
                r0 r0Var = (r0) this.c;
                ka9 ka9Var2 = ((tr2) this.b).a;
                t7 t7Var = (t7) this.d;
                RecommendQuestion recommendQuestion = (RecommendQuestion) obj;
                recommendQuestion.getClass();
                QuotaBlockReason quotaBlockReasonN = r0Var.N();
                int i5 = quotaBlockReasonN == null ? -1 : kt2.a[quotaBlockReasonN.ordinal()];
                if (i5 == -1) {
                    r0Var.u1(recommendQuestion.getText());
                } else if (i5 == 1) {
                    d.b(ka9Var2, g.b(PaywallRoute.Companion, false, 3));
                } else if (i5 == 2) {
                    d.b(ka9Var2, g.a(PaywallRoute.Companion, ((mo3) t7Var).a(), r0Var.E()));
                } else if (i5 == 3) {
                    r0Var.R1.setValue(Boolean.TRUE);
                }
                return wef.a;
            case 22:
                r38 r38Var = (r38) this.c;
                zse zseVar = (zse) this.b;
                sl9 sl9Var = (sl9) this.d;
                sn4 sn4Var3 = (sn4) obj;
                tte tteVarD = r38Var.d();
                if (tteVarD != null) {
                    vl1 vl1VarP2 = sn4Var3.v0().p();
                    long j2 = ((eue) r38Var.A.getValue()).a;
                    long j3 = ((eue) r38Var.B.getValue()).a;
                    ste steVar = tteVarD.a;
                    rt rtVar = r38Var.y;
                    long j4 = r38Var.z;
                    if (!eue.d(j2)) {
                        rtVar.f(j4);
                        int iV = sl9Var.v(eue.g(j2));
                        int iV2 = sl9Var.v(eue.f(j2));
                        if (iV != iV2) {
                            vl1VarP2.d(steVar.l(iV, iV2), rtVar);
                        }
                    } else if (!eue.d(j3)) {
                        long jC = steVar.a.b.c();
                        y72 y72Var = jC != 16 ? new y72(jC) : null;
                        long j5 = y72Var != null ? y72Var.a : y72.b;
                        rtVar.f(y72.b(j5, y72.c(j5) * 0.2f));
                        int iV3 = sl9Var.v(eue.g(j3));
                        int iV4 = sl9Var.v(eue.f(j3));
                        if (iV3 != iV4) {
                            vl1VarP2.d(steVar.l(iV3, iV4), rtVar);
                        }
                    } else if (!eue.d(zseVar.b)) {
                        rtVar.f(j4);
                        long j6 = zseVar.b;
                        int iV5 = sl9Var.v(eue.g(j6));
                        int iV6 = sl9Var.v(eue.f(j6));
                        if (iV5 != iV6) {
                            vl1VarP2.d(steVar.l(iV5, iV6), rtVar);
                        }
                    }
                    q1c.g(vl1VarP2, steVar);
                }
                return wef.a;
            case 23:
                wef wefVar = wef.a;
                nu3 nu3Var = (nu3) this.c;
                za2 za2Var = (za2) this.b;
                ule uleVar = (ule) this.d;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    uleVar.d(nu3Var.l());
                    za2Var.R(wefVar);
                } else if (th instanceof CancellationException) {
                    za2Var.v((CancellationException) th);
                } else {
                    za2Var.i0(th);
                }
                return wefVar;
            case 24:
                jx jxVar = (jx) this.c;
                jx jxVar2 = (jx) this.b;
                h0e h0eVar2 = (h0e) this.d;
                g0c g0cVar3 = (g0c) obj;
                g0cVar3.getClass();
                g0cVar3.b((1.0f - ((Number) jxVar.e()).floatValue()) * xj3.g(h0eVar2));
                g0cVar3.G(((Number) jxVar2.e()).floatValue());
                return wef.a;
            case 25:
                String str6 = (String) this.c;
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) this.b;
                String str7 = (String) this.d;
                l1f l1fVar2 = (l1f) obj;
                kv2.y(l1fVar2, "btn", "playcard_tap_card", "pathway", str6);
                l1fVar2.a(urg.r(tarotSkinIdentify2), "deck_id");
                l1fVar2.a(str7, "card_id");
                return wef.a;
            case 26:
                ArcanaGroup arcanaGroup = (ArcanaGroup) this.c;
                String str8 = (String) this.b;
                TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) this.d;
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                int i6 = u65.b[arcanaGroup.ordinal()];
                if (i6 == 1) {
                    str = "playcard_major";
                } else if (i6 == 2) {
                    str = "playcard_wands";
                } else if (i6 == 3) {
                    str = "playcard_cups";
                } else if (i6 == 4) {
                    str = "playcard_pents";
                } else {
                    if (i6 != 5) {
                        ap.c();
                        return null;
                    }
                    str = "playcard_swords";
                }
                l1fVar3.a(str, "btn");
                l1fVar3.a(str8, "pathway");
                l1fVar3.a(urg.r(tarotSkinIdentify3), "deck_id");
                return wef.a;
            case 27:
                List list3 = (List) this.c;
                l26 l26Var = (l26) this.b;
                TarotSkinIdentify tarotSkinIdentify4 = (TarotSkinIdentify) this.d;
                sw7 sw7Var = (sw7) obj;
                sw7Var.getClass();
                sw7Var.W(list3.size(), new d5(9, new i73(24), list3), new gj(4, list3, false), new dd2(new yj3(list3, l26Var, tarotSkinIdentify4, i2), true, -1117249557));
                return wef.a;
            case 28:
                ol3 ol3Var = (ol3) this.c;
                r0 r0Var2 = (r0) this.b;
                x16 x16Var4 = (x16) this.d;
                ((ra4) obj).getClass();
                Object obj3 = new Object();
                xk3 xk3Var = new xk3(ol3Var, r0Var2, x16Var4, null);
                od4.Z = obj3;
                od4.a0 = xk3Var;
                return new jt2(i, obj3);
            default:
                ((l26) ((e89) this.c).getValue()).z(((TarotCardType) ((List) this.b).get(((Number) ((e89) this.d).getValue()).intValue())).getCardKey(), 1);
                return wef.a;
        }
    }

    public /* synthetic */ w6(pm2 pm2Var, lgf lgfVar, dg7 dg7Var, dic dicVar) {
        this.a = 19;
        this.c = pm2Var;
        this.b = dg7Var;
        this.d = dicVar;
    }

    public /* synthetic */ w6(x16 x16Var, x16 x16Var2, h48 h48Var) {
        this.a = 3;
        this.d = x16Var;
        this.c = x16Var2;
        this.b = h48Var;
    }

    public /* synthetic */ w6(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }
}
