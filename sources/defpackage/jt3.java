package defpackage;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.annual.c;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.draw.navhost.ClarifyingCardDrawingRoute;
import ai.askquin.ui.draw.navhost.PhotoPatternRoute;
import ai.askquin.ui.fourseasons.FourSeasonsShareURLRoute;
import ai.askquin.ui.seasonal.SeasonalReadingRoute;
import ai.askquin.ui.web.WebViewActivity;
import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import java.util.Map;
import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.GooglePay;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jt3 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jt3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01c6  */
    @Override // defpackage.x16
    public final Object invoke() {
        SubscriptionInfo subscription;
        u7e u7eVarM35getSubscriptionType;
        Object value;
        int i = 1;
        switch (this.a) {
            case 0:
                ((bne) this.b).d.d((hne) this.c);
                return wef.a;
            case 1:
                orc orcVar = (orc) this.b;
                ka9 ka9Var = (ka9) this.c;
                SolarTerm solarTerm = yqc.a;
                orcVar.k(solarTerm, yqc.b);
                ka9.e(ka9Var, new SeasonalReadingRoute(2026, solarTerm.getWireValue(), true, false), null, 6);
                return wef.a;
            case 2:
                ynb.V((aw2) this.b, null, null, new b64((xof) this.c, null), 3);
                return wef.a;
            case 3:
                use useVar = (use) this.b;
                Context context = (Context) this.c;
                wef wefVar = wef.a;
                String string = useVar.d().c.toString();
                if (!v4e.Q(string)) {
                    int i2 = WebViewActivity.T0;
                    pzd.i(context, string, (8 & 4) != 0 ? ozd.a : ozd.b, null);
                }
                return wefVar;
            case 4:
                eab eabVar = (eab) this.b;
                fab fabVar = (fab) this.c;
                if (eabVar.c) {
                    eabVar.l(eabVar.d, false);
                } else {
                    eabVar.b = null;
                }
                ((rab) fabVar).f();
                jcc.k(0, "已清除 Usage mock");
                return wef.a;
            case 5:
                ynb.V(lw2.a, null, null, new t44((Context) this.b, (gpf) this.c, null), 3);
                return wef.a;
            case 6:
                ynb.V((aw2) this.b, null, null, new y14((c) this.c, null), 3);
                return wef.a;
            case 7:
                ynb.V((aw2) this.b, null, null, new b24((tc4) this.c, null), 3);
                return wef.a;
            case 8:
                ((q84) this.b).e((da9) this.c, false);
                return wef.a;
            case 9:
                r0 r0Var = (r0) this.b;
                zc4 zc4Var = (zc4) this.c;
                r0Var.h2.setValue(new ud4(zc4Var));
                nm4 nm4Var = DrawCardSaves.Companion;
                fc4 fc4Var = r0Var.H0;
                if (fc4Var == null) {
                    pa7.g0("divinationKey");
                    throw null;
                }
                String str = fc4Var.a;
                List list = zc4Var.c;
                MixedDeckSnapshot mixedDeckSnapshotR = r0Var.R();
                nm4Var.getClass();
                str.getClass();
                list.getClass();
                pu4 pu4Var = pu4.a;
                return new DrawCardSaves(str, list, pu4Var, pu4Var, mixedDeckSnapshotR, null);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return Boolean.valueOf(((g7g) this.b).c((sw3) this.c) > 0);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return db6.A0(((PhotoPatternRoute) this.b).getSelectedTarotCards(), (List) this.c);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ClarifyingCardDrawingRoute clarifyingCardDrawingRoute = (ClarifyingCardDrawingRoute) this.b;
                return db6.A0(clarifyingCardDrawingRoute.getRequestMessageId(), clarifyingCardDrawingRoute.getLabel(), clarifyingCardDrawingRoute.getExcludedCards(), ((r0) this.c).R());
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((e89) this.c).setValue((DrawCardSaves) this.b);
                return wef.a;
            case 14:
                ((e89) this.c).setValue(((rcf) this.b).o());
                return wef.a;
            case 15:
                wn2 wn2Var = (wn2) this.b;
                String str2 = (String) this.c;
                kx4 kx4Var = (kx4) wn2Var.c;
                if (kx4Var == null) {
                    Enum[] enumArr = (Enum[]) wn2Var.b;
                    kx4Var = new kx4(str2, enumArr.length);
                    for (Enum r0 : enumArr) {
                        kx4Var.k(r0.name(), false);
                    }
                }
                return kx4Var;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((a26) this.b).d((wm6) this.c);
                return wef.a;
            case 17:
                kc5 kc5Var = (kc5) this.b;
                Context context2 = (Context) this.c;
                kc5Var.getClass();
                context2.getClass();
                ynb.V(hwf.a(kc5Var), null, null, new jc5(kc5Var, context2, null), 3);
                return wef.a;
            case 18:
                ((mmb) this.b).element = eb3.H((mo5) this.c, tda.a);
                return wef.a;
            case 19:
                ((mmb) this.b).element = ((oo5) this.c).n1();
                return wef.a;
            case 20:
                ((mmb) this.b).element = eb3.H((vo5) this.c, tda.a);
                return wef.a;
            case 21:
                ((a26) this.b).d((QuotaBlockReason) this.c);
                return wef.a;
            case 22:
                e89 e89Var = (e89) this.b;
                vu5 vu5Var = (vu5) this.c;
                z6e z6eVar = ((ju5) e89Var.getValue()).c;
                if (z6eVar != null) {
                    t7 t7Var = vu5Var.Q0;
                    vu5Var.W0 = true;
                    ca2.a.getClass();
                    if (ca2.c) {
                        QuotaUsage quotaUsageB = ((eab) vu5Var.R0.b).b();
                        if (((quotaUsageB == null || (subscription = quotaUsageB.getSubscription()) == null || (u7eVarM35getSubscriptionType = subscription.m35getSubscriptionType()) == null) ? null : u7eVarM35getSubscriptionType.e()) == g7e.b) {
                            String strA = ((mo3) t7Var).a();
                            strA.getClass();
                            vu5Var.f(new f4(vu5Var, z6eVar, strA, null));
                        } else {
                            vu5Var.H(z6eVar, ((mo3) t7Var).a());
                        }
                    } else {
                        vu5Var.H(z6eVar, ((mo3) t7Var).a());
                    }
                } else {
                    jcc.k(1, Integer.valueOf(R.string.chat_mind_pricing_loading_failed));
                }
                return wef.a;
            case 23:
                FourSeasonsShareURLRoute fourSeasonsShareURLRoute = (FourSeasonsShareURLRoute) this.b;
                SolarTerm solarTerm2 = (SolarTerm) this.c;
                if (fourSeasonsShareURLRoute.getAnalyticsEnabled()) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05.a, new ft5(2, solarTerm2), 2);
                }
                return wef.a;
            case 24:
                a16 a16Var = (a16) this.b;
                e89 e89Var2 = (e89) this.c;
                wef wefVar2 = wef.a;
                a16Var.getClass();
                y06 y06Var = a16Var.a;
                if (y06Var.a == v06.b) {
                    y06Var.a = v06.d;
                    k16.a(t06.CancelSheet);
                    e89Var2.setValue(null);
                }
                return wefVar2;
            case 25:
                ((a26) this.b).d((u06) this.c);
                return wef.a;
            case 26:
                l46 l46Var = (l46) this.b;
                g49 g49Var = (g49) this.c;
                l46Var.H(g49Var.a, g49Var.g, g49Var.b, true);
                return wef.a;
            case 27:
                ((a26) this.b).d((GiftCardItem) this.c);
                return wef.a;
            case 28:
                Context context3 = (Context) this.b;
                j96 j96Var = (j96) this.c;
                vb2 vb2VarH = kn2.H(context3);
                if (vb2VarH != null) {
                    s0e s0eVar = j96Var.U0;
                    m8b m8bVar = j96Var.T0;
                    if (y41.N(j96Var.P0, vb2VarH, null, 6)) {
                        f96 f96Var = (f96) s0eVar.getValue();
                        Map map = f96Var.d;
                        GiftCardSku giftCardSku = f96Var.a;
                        n07 n07Var = (n07) map.get(giftCardSku);
                        if (n07Var == null) {
                            m8bVar.b("Gift card purchase blocked: missing product for sku=" + giftCardSku);
                        } else {
                            e96 e96Var = f96Var.e;
                            if (e96Var instanceof b96) {
                                p07 p07VarG = n07Var.g();
                                m86 m86Var = p07VarG instanceof m86 ? (m86) p07VarG : null;
                                if (m86Var == null) {
                                    m8bVar.b("Gift card purchase blocked: unexpected productType=" + n07Var.g());
                                } else {
                                    ca2.a.getClass();
                                    m8bVar.e("Gift card purchase started: sku=" + giftCardSku + ", productId=" + (ca2.c ? m86Var.b() : m86Var.d()));
                                    n26 n26Var = j96Var.S0;
                                    n26Var.getClass();
                                    db6.b1("purchase_gift_card", n26Var, new za6(i, m86Var));
                                    j96Var.W0 = m86Var;
                                    do {
                                        value = s0eVar.getValue();
                                    } while (!s0eVar.l(value, f96.a((f96) value, null, null, null, null, d96.a, null, null, 47)));
                                    ynb.V(hwf.a(j96Var), null, null, new i96(j96Var, f96Var, n07Var, null), 3);
                                }
                            } else {
                                m8bVar.g("Gift card purchase blocked: phase=".concat(cgg.I(e96Var)));
                            }
                        }
                    } else {
                        m8bVar.g("Gift card purchase blocked: signedIn=false");
                    }
                }
                return wef.a;
            default:
                return Boolean.valueOf(((GooglePay) this.b).e.b((BillingSession) this.c));
        }
    }
}
