package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import tech.chatmind.api.payment.InAppSku;
import tech.chatmind.api.payment.PaywallSkus;
import tech.chatmind.api.payment.SubscriptionSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v5a implements xn7 {
    public static final v5a a = new v5a();
    public static final nyc b = ti7.Companion.serializer().e();

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        PaywallSkus paywallSkus = (PaywallSkus) obj;
        paywallSkus.getClass();
        if (!(ev4Var instanceof sh7)) {
            qc0.j("Failed requirement.");
            return;
        }
        sh7 sh7Var = (sh7) ev4Var;
        List<SubscriptionSku> listC1 = s72.c1(paywallSkus.getSubscriptions(), 64);
        ArrayList arrayList = new ArrayList(t72.u(listC1, 10));
        for (SubscriptionSku subscriptionSku : listC1) {
            wg7 wg7VarD = sh7Var.d();
            wg7VarD.getClass();
            arrayList.add(wg7VarD.c(SubscriptionSku.Companion.serializer(), subscriptionSku));
        }
        iy9 iy9Var = new iy9("subscriptions", new yg7(arrayList));
        List<InAppSku> listC2 = s72.c1(paywallSkus.getInApps(), 64);
        ArrayList arrayList2 = new ArrayList(t72.u(listC2, 10));
        for (InAppSku inAppSku : listC2) {
            wg7 wg7VarD2 = sh7Var.d();
            wg7VarD2.getClass();
            arrayList2.add(wg7VarD2.c(InAppSku.Companion.serializer(), inAppSku));
        }
        sh7Var.z(new ti7(bm8.H(iy9Var, new iy9("inApps", new yg7(arrayList2)))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [pu4] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        ?? arrayList;
        Object objA;
        String formattedOriginPrice;
        int iIntValue;
        Object objA2;
        String formattedOriginPrice2;
        List list = null;
        ?? r0 = 0;
        ?? r1 = 0;
        if (!(om3Var instanceof jh7)) {
            qc0.j("Failed requirement.");
            return null;
        }
        jh7 jh7Var = (jh7) om3Var;
        nh7 nh7VarM = jh7Var.m();
        ti7 ti7Var = nh7VarM instanceof ti7 ? (ti7) nh7VarM : null;
        if (ti7Var == null) {
            return new PaywallSkus(list, r1 == true ? 1 : 0, 3, r0 == true ? 1 : 0);
        }
        nh7 nh7Var = (nh7) ti7Var.get("subscriptions");
        yg7 yg7Var = nh7Var instanceof yg7 ? (yg7) nh7Var : null;
        ?? arrayList2 = pu4.a;
        if (yg7Var == null) {
            arrayList = arrayList2;
        } else {
            List<nh7> listC1 = s72.c1(yg7Var, 64);
            arrayList = new ArrayList();
            for (nh7 nh7Var2 : listC1) {
                if (nh7Var2 instanceof ti7) {
                    try {
                        wg7 wg7VarD = jh7Var.d();
                        wg7VarD.getClass();
                        objA = wg7VarD.a(SubscriptionSku.Companion.serializer(), nh7Var2);
                    } catch (yyc unused) {
                        objA = null;
                    }
                } else {
                    objA = null;
                }
                if (objA != null) {
                    arrayList.add(objA);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            SubscriptionSku subscriptionSku = (SubscriptionSku) obj;
            if (abg.L(subscriptionSku.getPlanKey()) && abg.L(subscriptionSku.getDuration()) && abg.L(subscriptionSku.getFormattedPrice()) && abg.K(subscriptionSku.getTotalPrice()) && abg.L(subscriptionSku.getPriceSymbol()) && ((formattedOriginPrice2 = subscriptionSku.getFormattedOriginPrice()) == null || abg.L(formattedOriginPrice2))) {
                String priceDescription = subscriptionSku.getPriceDescription();
                if (priceDescription == null || abg.L(priceDescription)) {
                    arrayList3.add(obj);
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (hashSet.add(((SubscriptionSku) obj2).getPlanKey())) {
                arrayList4.add(obj2);
            }
        }
        nh7 nh7Var3 = (nh7) ti7Var.get("inApps");
        yg7 yg7Var2 = nh7Var3 instanceof yg7 ? (yg7) nh7Var3 : null;
        if (yg7Var2 != null) {
            List<nh7> listC2 = s72.c1(yg7Var2, 64);
            arrayList2 = new ArrayList();
            for (nh7 nh7Var4 : listC2) {
                if (nh7Var4 instanceof ti7) {
                    try {
                        wg7 wg7VarD2 = jh7Var.d();
                        wg7VarD2.getClass();
                        objA2 = wg7VarD2.a(InAppSku.Companion.serializer(), nh7Var4);
                    } catch (yyc unused2) {
                        objA2 = null;
                    }
                } else {
                    objA2 = null;
                }
                if (objA2 != null) {
                    arrayList2.add(objA2);
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList2) {
            InAppSku inAppSku = (InAppSku) obj3;
            if (abg.L(inAppSku.getPlanKey()) && abg.L(inAppSku.getFormattedPrice()) && abg.K(inAppSku.getTotalPrice()) && abg.L(inAppSku.getPriceSymbol()) && ((formattedOriginPrice = inAppSku.getFormattedOriginPrice()) == null || abg.L(formattedOriginPrice))) {
                if (inAppSku.getCount() == null || (1 <= (iIntValue = inAppSku.getCount().intValue()) && iIntValue < 10001)) {
                    arrayList5.add(obj3);
                }
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            if (hashSet2.add(((InAppSku) obj4).getPlanKey())) {
                arrayList6.add(obj4);
            }
        }
        return new PaywallSkus(arrayList4, arrayList6);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
