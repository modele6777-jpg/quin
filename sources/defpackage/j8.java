package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.qa.bridge.QaResult;
import ai.askquin.ui.annual.h;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.SpreadRecommendationResult;
import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.credits.SubscriptionKind;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j8(e89 e89Var, TarotSkinIdentify tarotSkinIdentify, pl3 pl3Var) {
        this.a = 20;
        this.d = e89Var;
        this.b = tarotSkinIdentify;
        this.c = pl3Var;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0408  */
    /* JADX WARN: Code duplicated, block: B:177:0x040e  */
    /* JADX WARN: Instruction removed from duplicated block: B:177:0x040e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x16
    public final Object invoke() {
        String strA;
        jhb jhbVar;
        z6e z6eVar;
        LevelAndKind levelAndKind;
        int i;
        hkb hkbVar;
        r0c r0cVar;
        hs3 hs3Var;
        int i2 = this.a;
        int i3 = 4;
        int i4 = 15;
        p05 p05Var = p05.a;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        Object obj = null;
        wef wefVar = wef.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                ((e89) obj3).setValue(Boolean.FALSE);
                ((a26) obj4).d(((use) obj2).d().c.toString());
                return wefVar;
            case 1:
                r0 r0Var = (r0) obj4;
                List list = (List) obj2;
                kzd kzdVar = (kzd) obj3;
                suc sucVarX = r0Var.X();
                if (sucVarX instanceof quc) {
                    strA = ywd.a((SpreadRecommendationResult) list.get(((quc) sucVarX).a)).a();
                } else {
                    if (!(sucVarX instanceof ruc)) {
                        ap.c();
                        return null;
                    }
                    strA = "preset";
                }
                List listA = r0Var.A();
                int iIntValue = ((Number) r0Var.c2.getValue()).intValue();
                suc sucVarX2 = r0Var.X();
                z67 z67Var = ywd.a;
                listA.getClass();
                sucVarX2.getClass();
                SpreadRecommendationResult spreadRecommendationResult = (SpreadRecommendationResult) s72.x0(listA);
                String strA2 = spreadRecommendationResult != null ? ywd.a(spreadRecommendationResult).a() : null;
                Integer numValueOf = Integer.valueOf(iIntValue);
                if (iIntValue < 0 || iIntValue >= listA.size()) {
                    numValueOf = null;
                }
                int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 0;
                SpreadRecommendationResult spreadRecommendationResult2 = (SpreadRecommendationResult) s72.y0(iIntValue2, listA);
                String strA3 = spreadRecommendationResult2 != null ? ywd.a(spreadRecommendationResult2).a() : null;
                if (sucVarX2 instanceof quc) {
                    int i5 = ((quc) sucVarX2).a;
                    SpreadRecommendationResult spreadRecommendationResult3 = (SpreadRecommendationResult) s72.y0(i5, listA);
                    jhbVar = spreadRecommendationResult3 == null ? null : new jhb(ywd.a(spreadRecommendationResult3).a(), Boolean.valueOf(i5 == iIntValue2), strA2, strA3);
                } else {
                    if (!(sucVarX2 instanceof ruc)) {
                        ap.c();
                        return null;
                    }
                    jhbVar = new jhb("preset", Boolean.FALSE, strA2, strA3);
                }
                if (jhbVar != null) {
                    ConcurrentHashMap concurrentHashMap = xfb.a;
                    xfb.h(r0Var.I0, jhbVar);
                }
                byte b4 = r0Var.U() != null;
                boolean z = r0Var.C() != null;
                if (b4 == false || z) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("button_click"), new el(strA, r0Var, b == true ? 1 : 0), 2);
                }
                ynb.V(hwf.a(kzdVar.b), null, null, new izd(kzdVar, null), 3);
                return wefVar;
            case 2:
                h hVar = (h) obj4;
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new pg((e89) obj3, i3), 2);
                ynb.V(hwf.a(hVar), null, null, new g40(hVar, (ka9) obj2, null), 3);
                return wefVar;
            case 3:
                x16 x16Var = (x16) obj2;
                x16 x16Var2 = (x16) obj3;
                if (((en0) obj4).a()) {
                    x16Var.invoke();
                } else {
                    x16Var2.invoke();
                }
                return wefVar;
            case 4:
                Context context = (Context) obj4;
                sn0 sn0Var = (sn0) obj2;
                e89 e89Var = (e89) obj3;
                x1f x1fVar3 = x1f.a;
                x1f.k(p05Var, new pg(e89Var, 6), 2);
                en0 en0Var = (en0) e89Var.getValue();
                if (en0Var.e && en0Var.a != null && s72.o0(tn0.a, en0Var.b)) {
                    QuinSubscription quinSubscription = ((en0) e89Var.getValue()).a;
                    SubscriptionKind kind = (quinSubscription == null || (levelAndKind = quinSubscription.getLevelAndKind()) == null) ? null : levelAndKind.getKind();
                    if (kind == SubscriptionKind.Count) {
                        kind = null;
                    }
                    if (kind == null) {
                        hkg.N0(context, R.string.unknown_error);
                    } else {
                        en0 en0Var2 = (en0) e89Var.getValue();
                        String str = en0Var2.b;
                        if (pa7.t(str, "wechat-app-pay") || pa7.t(str, "wechat")) {
                            en0Var2.a();
                        }
                        for (Object obj5 : sn0Var.X0) {
                            z6e z6eVar2 = (z6e) obj5;
                            int i6 = hn0.a[kind.ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 != 3) {
                                        if (i6 != 4) {
                                            ap.c();
                                            return null;
                                        }
                                    } else if (z6eVar2.h() == u7e.c) {
                                        obj = obj5;
                                    }
                                } else if (z6eVar2.h() == u7e.d) {
                                    obj = obj5;
                                }
                            } else if (z6eVar2.h() == u7e.b) {
                                obj = obj5;
                            }
                            z6eVar = (z6e) obj;
                            if (z6eVar != null) {
                                sn0Var.H(z6eVar, "");
                            } else {
                                sn0Var.d().b("Subscription product not found for: " + kind);
                            }
                        }
                        z6eVar = (z6e) obj;
                        if (z6eVar != null) {
                            sn0Var.H(z6eVar, "");
                        } else {
                            sn0Var.d().b("Subscription product not found for: " + kind);
                        }
                    }
                } else {
                    hkg.N0(context, R.string.auto_renew_not_supported);
                }
                return wefVar;
            case 5:
                ((ur0) obj4).a();
                xh0 xh0Var = (xh0) ((a82) obj2).b;
                int i7 = ((kmb) obj3).element;
                do {
                    i = xh0Var.get();
                } while (!xh0Var.compareAndSet(i, ((i >>> 27) & 15) == i7 ? i - 1 : i));
                return wefVar;
            case 6:
                aw2 aw2Var = (aw2) obj2;
                e89 e89Var2 = (e89) obj3;
                h0f h0fVar = (h0f) ((d0f) obj4);
                if (h0fVar.b()) {
                    ynb.V(aw2Var, null, null, new ew0(h0fVar, null), 3);
                    e89Var2.setValue(Boolean.FALSE);
                }
                return wefVar;
            case 7:
                t31 t31Var = (t31) obj4;
                hkb hkbVarL1 = t31.l1(t31Var, (yf9) obj2, (v6) obj3);
                if (hkbVarL1 == null) {
                    return null;
                }
                pm2 pm2Var = t31Var.Z;
                if (e77.b(pm2Var.K0, -1L)) {
                    l37.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return hkbVarL1.k(pm2Var.p1(hkbVarL1, pm2Var.m1(), 0L) ^ (-9223372034707292160L));
            case 8:
                ((l26) obj4).z((Bitmap) obj2, Float.valueOf(((qz9) ((n69) obj3)).j()));
                return wefVar;
            case 9:
                y41.N((t7) obj4, (Context) obj2, new pg((e89) obj3, 17), 2);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                hkg hkgVar = ((rv1) obj4).b;
                hkgVar.getClass();
                return hkgVar.c0(((hh) obj3).h.d, ((bh6) obj2).a());
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                pm2 pm2Var2 = (pm2) obj4;
                lgf lgfVar = (lgf) obj2;
                w31 w31Var = (w31) obj3;
                m6c m6cVar = pm2Var2.I0;
                while (true) {
                    p89 p89Var = (p89) m6cVar.b;
                    int i8 = p89Var.c;
                    if (i8 != 0) {
                        if (i8 == 0) {
                            r3.n("MutableVector is empty.");
                            return null;
                        }
                        hkb hkbVar2 = (hkb) ((mm2) p89Var.a[i8 - 1]).a.invoke();
                        if (hkbVar2 == null ? true : pm2.n1(pm2Var2, hkbVar2, 0L, 0L, 3)) {
                            p89 p89Var2 = (p89) m6cVar.b;
                            ((mm2) p89Var2.k(p89Var2.c - 1)).b.g(wefVar);
                        }
                    }
                }
                if (pm2Var2.J0 && (hkbVar = (hkb) pm2Var2.H0.invoke()) != null && pm2.n1(pm2Var2, hkbVar, 0L, 0L, 3)) {
                    pm2Var2.J0 = false;
                }
                lgfVar.e = pm2Var2.l1(w31Var, 0L);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                lt2.b((e89) obj3, (e89) obj2);
                db6.y0((Context) obj4);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                p3c p3cVar = (p3c) obj4;
                ct2 ct2Var = new ct2((za0) obj2, (Context) obj3, null);
                os2 os2Var = new os2(b2 == true ? 1 : 0);
                p3cVar.getClass();
                p3cVar.f();
                o2c o2cVar = p3cVar.w;
                if (o2cVar != null) {
                    r0c r0cVar2 = o2cVar.a;
                    if (p3cVar.n(o2cVar) && ((r0cVar = p3cVar.y) == null || !p3cVar.m(r0cVar))) {
                        p3cVar.y = r0cVar2;
                        if (o2cVar.c) {
                            x1f x1fVar4 = x1f.a;
                            x1f.g(p05Var, m1f.a, new z8b(27));
                        }
                        ynb.V(hwf.a(p3cVar), null, null, new k3c(o2cVar, p3cVar, r0cVar2, os2Var, ct2Var, null), 3);
                    }
                }
                return wefVar;
            case 14:
                r0 r0Var2 = (r0) obj4;
                t7 t7Var = (t7) obj2;
                Context context2 = (Context) obj3;
                tj7 tj7Var = tj7.L0;
                ca2.a.getClass();
                if (ca2.c) {
                    x1f x1fVar5 = x1f.a;
                    x1f.k(new r05("onboarding_divination_result_continue"), tj7Var, 2);
                }
                ynb.V(hwf.a(r0Var2), null, null, new ws2(t7Var, context2, null), 3);
                return wefVar;
            case 15:
                x16 x16Var3 = (x16) obj2;
                e89 e89Var3 = (e89) obj3;
                int iOrdinal = ((u4g) obj4).g().ordinal();
                if (iOrdinal == 0) {
                    hs3Var = xqa.E0;
                } else {
                    if (iOrdinal != 1) {
                        ap.c();
                        return null;
                    }
                    hs3Var = xqa.G0;
                }
                ynb.V(lw2.a, null, null, new n5g(hs3Var.a, Boolean.TRUE, null), 3);
                e89Var3.setValue(null);
                x16Var3.invoke();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((e89) obj3).setValue(null);
                ((x16) obj4).invoke();
                db6.y0((Context) obj2);
                return wefVar;
            case 17:
                ((l26) obj4).z((TarotSkinIdentify) obj2, ((d63) obj3).c.getCard().getCardKey());
                return wefVar;
            case 18:
                ((y63) obj4).h((Context) obj2, (String) obj3, false, null);
                return wefVar;
            case 19:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj2;
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) obj3;
                a26 a26Var = (a26) obj4;
                if (tarotSkinIdentify == null) {
                    tarotSkinIdentify = tarotSkinIdentify2;
                }
                x1f x1fVar6 = x1f.a;
                x1f.k(p05Var, new ij3(tarotSkinIdentify2, tarotSkinIdentify, b3 == true ? 1 : 0), 2);
                a26Var.d(tarotSkinIdentify2);
                return wefVar;
            case 20:
                e89 e89Var4 = (e89) obj3;
                TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) obj4;
                pl3 pl3Var = (pl3) obj2;
                if (!((Boolean) e89Var4.getValue()).booleanValue()) {
                    e89Var4.setValue(Boolean.TRUE);
                    x1f x1fVar7 = x1f.a;
                    x1f.k(new r05("playcard_gesture"), new ks2(i4, tarotSkinIdentify3, pl3Var), 2);
                }
                return wefVar;
            case 21:
                List list2 = (List) obj4;
                return Boolean.valueOf(list2.isEmpty() || ((bhe) obj3).f((TarotSkinIdentify) list2.get(((sz9) ((cs3) obj2).d.c).j() % list2.size())) != null);
            case 22:
                ak3 ak3Var = (ak3) obj2;
                a26 a26Var2 = (a26) obj4;
                a26 a26Var3 = (a26) obj3;
                boolean z2 = ak3Var.b;
                TarotSkinIdentify tarotSkinIdentify4 = ak3Var.a;
                if (z2) {
                    a26Var2.d(tarotSkinIdentify4);
                } else {
                    a26Var3.d(tarotSkinIdentify4);
                }
                return wefVar;
            case 23:
                x16 x16Var4 = (x16) obj2;
                x16 x16Var5 = (x16) obj3;
                if (((zj3) obj4).a) {
                    x16Var4.invoke();
                } else {
                    x16Var5.invoke();
                }
                return wefVar;
            case 24:
                String str2 = (String) obj3;
                try {
                    ((v04) obj4).a.startActivity((Intent) obj2);
                    return new QaResult.Ok(new ti7(bm8.G(new iy9("dest", oh7.c(str2)))));
                } catch (Exception e) {
                    return new QaResult.Err(ub3.i("preview launch failed: ", e.getMessage()), "nav_error");
                }
            case 25:
                ynb.V((aw2) obj4, null, null, new z14((nb4) obj2, (s7) obj3, null), 3);
                return wefVar;
            case 26:
                r0 r0Var3 = (r0) obj4;
                int i9 = r0.j2;
                r0Var3.B1((Operation) obj2, (FailReason) obj3);
                r0Var3.q1();
                return wefVar;
            case 27:
                ynb.V((aw2) obj4, null, null, new to4((r0) obj2, (ka9) obj3, null), 3);
                return wefVar;
            case 28:
                ((x16) obj2).invoke();
                ((a26) obj4).d((DrawCardSaves) obj3);
                return wefVar;
            default:
                Integer num = (Integer) obj4;
                e89 e89Var5 = (e89) obj3;
                e89 e89Var6 = (e89) obj2;
                if (((Integer) e89Var5.getValue()) == null && num != null) {
                    e89Var5.setValue(Integer.valueOf(num.intValue()));
                    e89Var6.setValue(et1.a);
                }
                return wefVar;
        }
    }

    public /* synthetic */ j8(TarotSkinIdentify tarotSkinIdentify, TarotSkinIdentify tarotSkinIdentify2, a26 a26Var) {
        this.a = 19;
        this.c = tarotSkinIdentify;
        this.d = tarotSkinIdentify2;
        this.b = a26Var;
    }

    public /* synthetic */ j8(Context context, aw2 aw2Var, sn0 sn0Var, e89 e89Var, e89 e89Var2) {
        this.a = 4;
        this.b = context;
        this.c = sn0Var;
        this.d = e89Var;
    }

    public /* synthetic */ j8(Object obj, a26 a26Var, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = a26Var;
        this.d = obj2;
    }

    public /* synthetic */ j8(Object obj, e89 e89Var, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.d = e89Var;
        this.c = obj2;
    }

    public /* synthetic */ j8(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
