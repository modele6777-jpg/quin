package defpackage;

import androidx.compose.ui.platform.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la6 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ GiftCardItem b;

    public /* synthetic */ la6(GiftCardItem giftCardItem, int i) {
        this.a = i;
        this.b = giftCardItem;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        GiftCardItem giftCardItem = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(1 & iIntValue, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    x76.a(giftCardItem.getStatus(), l46Var, 0);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    GiftCardSku sku = giftCardItem.getSku();
                    String nickname = giftCardItem.getNickname();
                    String fromNickname = giftCardItem.getFromNickname();
                    String blessing = giftCardItem.getBlessing();
                    if (blessing == null) {
                        blessing = "";
                    }
                    x76.c(sku, nickname, fromNickname, blessing, null, true, b.a(androidx.compose.foundation.layout.b.c(g09.a, 1.0f), "gift_card_share_preview"), false, l46Var2, 1794048, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
                }
                break;
        }
        return wefVar;
    }
}
