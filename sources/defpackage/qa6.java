package defpackage;

import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qa6 {
    public static final m8b a;

    static {
        hf8.Q.getClass();
        a = ef8.a("GiftCardShare");
    }

    public static final String a(GiftCardItem giftCardItem, x16 x16Var) {
        String shareUrl = giftCardItem.getShareUrl();
        if (shareUrl == null || v4e.Q(shareUrl)) {
            shareUrl = null;
        }
        m8b m8bVar = a;
        if (shareUrl == null) {
            m8bVar.g("Gift card share blocked: cardId=" + giftCardItem.getCardId() + ", sku=" + giftCardItem.getSku() + ", status=" + giftCardItem.getStatus() + ", reason=missingShareUrl");
            return null;
        }
        m8bVar.e("Gift card share validated: cardId=" + giftCardItem.getCardId() + ", sku=" + giftCardItem.getSku() + ", status=" + giftCardItem.getStatus());
        x16Var.invoke();
        return shareUrl;
    }
}
