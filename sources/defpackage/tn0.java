package defpackage;

import java.util.Set;
import tech.chatmind.api.payment.SubscriptionSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tn0 {
    public static final Set a = qd0.I0(new String[]{"wechat-app-pay", "wechat-mini-program-pay", "wechat"});
    public static final rob b = new rob("[¥$€£₩]\\s*[0-9]+(?:[.,][0-9]+)?");

    public static final String a(SubscriptionSku subscriptionSku) {
        um8 um8VarB;
        String priceDescription = subscriptionSku.getPriceDescription();
        if (priceDescription != null) {
            if (!c5e.C(priceDescription, "次月", false)) {
                priceDescription = null;
            }
            if (priceDescription != null && (um8VarB = rob.b(b, priceDescription)) != null) {
                String strGroup = um8VarB.a.group();
                strGroup.getClass();
                return strGroup;
            }
        }
        return subscriptionSku.getFormattedPrice();
    }
}
