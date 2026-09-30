package defpackage;

import ai.askquin.ui.router.GiftCardPerspective;
import java.util.List;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;
import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l96 {
    public static final List a;
    public static final List b;

    static {
        GiftCardSku giftCardSku = GiftCardSku.OneYear;
        GiftCardItem giftCardItem = new GiftCardItem("qa-sent-unclaimed", giftCardSku, GiftCardStatus.Unclaimed, "2026-08-25T08:00:00.000Z", "GIFT-QA01-OPEN", "https://staging.quinlove.cn/gift/GIFT-QA01-OPEN", "Kevin", "Kevin", "愿好运一直陪着你", (String) null, (String) null, (String) null, 3584, (rp3) null);
        GiftCardSku giftCardSku2 = GiftCardSku.OneMonth;
        GiftCardItem giftCardItem2 = new GiftCardItem("qa-sent-claimed", giftCardSku2, GiftCardStatus.Claimed, "2026-08-20T08:00:00.000Z", (String) null, (String) null, "Kevin", "Kevin", "给你一份小惊喜", "2026-08-21T08:00:00.000Z", (String) null, (String) null, 3120, (rp3) null);
        GiftCardStatus giftCardStatus = GiftCardStatus.Invalidated;
        a = t72.I(giftCardItem, giftCardItem2, new GiftCardItem("qa-sent-invalidated", giftCardSku, giftCardStatus, "2026-08-15T08:00:00.000Z", (String) null, (String) null, "Kevin", "Kevin", "把好牌送给你", (String) null, (String) null, (String) null, 3632, (rp3) null));
        b = t72.I(c("qa-received-active", giftCardSku, GiftCardStatus.Active, "2026-08-25T09:00:00.000Z", "2026-08-25T09:00:00.000Z", "2027-08-25T09:00:00.000Z"), c("qa-received-pending", giftCardSku2, GiftCardStatus.Pending, "2026-08-24T09:00:00.000Z", "2027-08-25T09:00:00.000Z", "2027-09-25T09:00:00.000Z"), c("qa-received-used-up", giftCardSku2, GiftCardStatus.UsedUp, "2026-07-01T09:00:00.000Z", "2026-07-01T09:00:00.000Z", "2026-08-01T09:00:00.000Z"), c("qa-received-expired", giftCardSku, GiftCardStatus.Expired, "2025-08-01T09:00:00.000Z", "2025-08-01T09:00:00.000Z", "2026-08-01T09:00:00.000Z"), c("qa-received-invalidated", giftCardSku2, giftCardStatus, "2026-06-01T09:00:00.000Z", "2026-06-01T09:00:00.000Z", "2026-07-01T09:00:00.000Z"));
    }

    public static iy9 a(GiftCardItem giftCardItem) {
        return new iy9(new y76(null, giftCardItem, false), GiftCardPerspective.Received);
    }

    public static iy9 b(GiftCardItem giftCardItem) {
        return new iy9(new y76(giftCardItem, null, false), GiftCardPerspective.Sent);
    }

    public static GiftCardItem c(String str, GiftCardSku giftCardSku, GiftCardStatus giftCardStatus, String str2, String str3, String str4) {
        return new GiftCardItem(str, giftCardSku, giftCardStatus, (String) null, (String) null, (String) null, (String) null, "Quin QA", "愿你抽到想要的好牌", str2, str3, str4, 120, (rp3) null);
    }
}
