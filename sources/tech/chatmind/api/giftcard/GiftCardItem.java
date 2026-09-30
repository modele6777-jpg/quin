package tech.chatmind.api.giftcard;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.eb3;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.o86;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.w66;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IJB\u0091\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B\u0093\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u009a\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b?\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bA\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\bB\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bC\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bD\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bE\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bF\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bG\u0010\u0019¨\u0006K"}, d2 = {"Ltech/chatmind/api/giftcard/GiftCardItem;", "", "", "cardId", "Ltech/chatmind/api/giftcard/GiftCardSku;", "sku", "Ltech/chatmind/api/giftcard/GiftCardStatus;", "status", "purchasedAt", "redeemCode", "shareUrl", "nickname", "fromNickname", "blessing", "claimedAt", "effectiveFrom", "expireAt", "<init>", "(Ljava/lang/String;Ltech/chatmind/api/giftcard/GiftCardSku;Ltech/chatmind/api/giftcard/GiftCardStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ltech/chatmind/api/giftcard/GiftCardSku;Ltech/chatmind/api/giftcard/GiftCardStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "()Ltech/chatmind/api/giftcard/GiftCardSku;", "component3", "()Ltech/chatmind/api/giftcard/GiftCardStatus;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ltech/chatmind/api/giftcard/GiftCardSku;Ltech/chatmind/api/giftcard/GiftCardStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/giftcard/GiftCardItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/giftcard/GiftCardItem;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getCardId", "Ltech/chatmind/api/giftcard/GiftCardSku;", "getSku", "Ltech/chatmind/api/giftcard/GiftCardStatus;", "getStatus", "getPurchasedAt", "getRedeemCode", "getShareUrl", "getNickname", "getFromNickname", "getBlessing", "getClaimedAt", "getEffectiveFrom", "getExpireAt", "Companion", "n86", "o86", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class GiftCardItem {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final o86 Companion = new o86();
    private final String blessing;
    private final String cardId;
    private final String claimedAt;
    private final String effectiveFrom;
    private final String expireAt;
    private final String fromNickname;
    private final String nickname;
    private final String purchasedAt;
    private final String redeemCode;
    private final String shareUrl;
    private final GiftCardSku sku;
    private final GiftCardStatus status;

    static {
        w66 w66Var = new w66(2);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, eb3.N(z18Var, w66Var), eb3.N(z18Var, new w66(3)), null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ GiftCardItem(int i, String str, GiftCardSku giftCardSku, GiftCardStatus giftCardStatus, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, xyc xycVar) {
        this.cardId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.sku = GiftCardSku.Unknown;
        } else {
            this.sku = giftCardSku;
        }
        if ((i & 4) == 0) {
            this.status = GiftCardStatus.Unknown;
        } else {
            this.status = giftCardStatus;
        }
        if ((i & 8) == 0) {
            this.purchasedAt = null;
        } else {
            this.purchasedAt = str2;
        }
        if ((i & 16) == 0) {
            this.redeemCode = null;
        } else {
            this.redeemCode = str3;
        }
        if ((i & 32) == 0) {
            this.shareUrl = null;
        } else {
            this.shareUrl = str4;
        }
        if ((i & 64) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str5;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.fromNickname = null;
        } else {
            this.fromNickname = str6;
        }
        if ((i & 256) == 0) {
            this.blessing = null;
        } else {
            this.blessing = str7;
        }
        if ((i & 512) == 0) {
            this.claimedAt = null;
        } else {
            this.claimedAt = str8;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.effectiveFrom = null;
        } else {
            this.effectiveFrom = str9;
        }
        if ((i & 2048) == 0) {
            this.expireAt = null;
        } else {
            this.expireAt = str10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return GiftCardSku.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return GiftCardStatus.Companion.serializer();
    }

    public static /* synthetic */ GiftCardItem copy$default(GiftCardItem giftCardItem, String str, GiftCardSku giftCardSku, GiftCardStatus giftCardStatus, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftCardItem.cardId;
        }
        if ((i & 2) != 0) {
            giftCardSku = giftCardItem.sku;
        }
        if ((i & 4) != 0) {
            giftCardStatus = giftCardItem.status;
        }
        if ((i & 8) != 0) {
            str2 = giftCardItem.purchasedAt;
        }
        if ((i & 16) != 0) {
            str3 = giftCardItem.redeemCode;
        }
        if ((i & 32) != 0) {
            str4 = giftCardItem.shareUrl;
        }
        if ((i & 64) != 0) {
            str5 = giftCardItem.nickname;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str6 = giftCardItem.fromNickname;
        }
        if ((i & 256) != 0) {
            str7 = giftCardItem.blessing;
        }
        if ((i & 512) != 0) {
            str8 = giftCardItem.claimedAt;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str9 = giftCardItem.effectiveFrom;
        }
        if ((i & 2048) != 0) {
            str10 = giftCardItem.expireAt;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        String str17 = str3;
        String str18 = str4;
        return giftCardItem.copy(str, giftCardSku, giftCardStatus, str2, str17, str18, str15, str16, str13, str14, str11, str12);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(GiftCardItem self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || !pa7.t(self.cardId, "")) {
            output.w(serialDesc, 0, self.cardId);
        }
        if (output.g(serialDesc) || self.sku != GiftCardSku.Unknown) {
            output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.sku);
        }
        if (output.g(serialDesc) || self.status != GiftCardStatus.Unknown) {
            output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.status);
        }
        if (output.g(serialDesc) || self.purchasedAt != null) {
            output.A(serialDesc, 3, p4e.a, self.purchasedAt);
        }
        if (output.g(serialDesc) || self.redeemCode != null) {
            output.A(serialDesc, 4, p4e.a, self.redeemCode);
        }
        if (output.g(serialDesc) || self.shareUrl != null) {
            output.A(serialDesc, 5, p4e.a, self.shareUrl);
        }
        if (output.g(serialDesc) || self.nickname != null) {
            output.A(serialDesc, 6, p4e.a, self.nickname);
        }
        if (output.g(serialDesc) || self.fromNickname != null) {
            output.A(serialDesc, 7, p4e.a, self.fromNickname);
        }
        if (output.g(serialDesc) || self.blessing != null) {
            output.A(serialDesc, 8, p4e.a, self.blessing);
        }
        if (output.g(serialDesc) || self.claimedAt != null) {
            output.A(serialDesc, 9, p4e.a, self.claimedAt);
        }
        if (output.g(serialDesc) || self.effectiveFrom != null) {
            output.A(serialDesc, 10, p4e.a, self.effectiveFrom);
        }
        if (!output.g(serialDesc) && self.expireAt == null) {
            return;
        }
        output.A(serialDesc, 11, p4e.a, self.expireAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getClaimedAt() {
        return this.claimedAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEffectiveFrom() {
        return this.effectiveFrom;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getExpireAt() {
        return this.expireAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GiftCardSku getSku() {
        return this.sku;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GiftCardStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPurchasedAt() {
        return this.purchasedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRedeemCode() {
        return this.redeemCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFromNickname() {
        return this.fromNickname;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBlessing() {
        return this.blessing;
    }

    public final GiftCardItem copy(String cardId, GiftCardSku sku, GiftCardStatus status, String purchasedAt, String redeemCode, String shareUrl, String nickname, String fromNickname, String blessing, String claimedAt, String effectiveFrom, String expireAt) {
        cardId.getClass();
        sku.getClass();
        status.getClass();
        return new GiftCardItem(cardId, sku, status, purchasedAt, redeemCode, shareUrl, nickname, fromNickname, blessing, claimedAt, effectiveFrom, expireAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftCardItem)) {
            return false;
        }
        GiftCardItem giftCardItem = (GiftCardItem) other;
        return pa7.t(this.cardId, giftCardItem.cardId) && this.sku == giftCardItem.sku && this.status == giftCardItem.status && pa7.t(this.purchasedAt, giftCardItem.purchasedAt) && pa7.t(this.redeemCode, giftCardItem.redeemCode) && pa7.t(this.shareUrl, giftCardItem.shareUrl) && pa7.t(this.nickname, giftCardItem.nickname) && pa7.t(this.fromNickname, giftCardItem.fromNickname) && pa7.t(this.blessing, giftCardItem.blessing) && pa7.t(this.claimedAt, giftCardItem.claimedAt) && pa7.t(this.effectiveFrom, giftCardItem.effectiveFrom) && pa7.t(this.expireAt, giftCardItem.expireAt);
    }

    public final String getBlessing() {
        return this.blessing;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getClaimedAt() {
        return this.claimedAt;
    }

    public final String getEffectiveFrom() {
        return this.effectiveFrom;
    }

    public final String getExpireAt() {
        return this.expireAt;
    }

    public final String getFromNickname() {
        return this.fromNickname;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getPurchasedAt() {
        return this.purchasedAt;
    }

    public final String getRedeemCode() {
        return this.redeemCode;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final GiftCardSku getSku() {
        return this.sku;
    }

    public final GiftCardStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + ((this.sku.hashCode() + (this.cardId.hashCode() * 31)) * 31)) * 31;
        String str = this.purchasedAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.redeemCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shareUrl;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickname;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.fromNickname;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.blessing;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.claimedAt;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.effectiveFrom;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.expireAt;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String str = this.cardId;
        GiftCardSku giftCardSku = this.sku;
        GiftCardStatus giftCardStatus = this.status;
        String str2 = this.purchasedAt;
        String str3 = this.redeemCode;
        String str4 = this.shareUrl;
        String str5 = this.nickname;
        String str6 = this.fromNickname;
        String str7 = this.blessing;
        String str8 = this.claimedAt;
        String str9 = this.effectiveFrom;
        String str10 = this.expireAt;
        StringBuilder sb = new StringBuilder("GiftCardItem(cardId=");
        sb.append(str);
        sb.append(", sku=");
        sb.append(giftCardSku);
        sb.append(", status=");
        sb.append(giftCardStatus);
        sb.append(", purchasedAt=");
        sb.append(str2);
        sb.append(", redeemCode=");
        ub3.v(sb, str3, ", shareUrl=", str4, ", nickname=");
        ub3.v(sb, str5, ", fromNickname=", str6, ", blessing=");
        ub3.v(sb, str7, ", claimedAt=", str8, ", effectiveFrom=");
        return ks0.m(sb, str9, ", expireAt=", str10, ")");
    }

    public GiftCardItem() {
        this((String) null, (GiftCardSku) null, (GiftCardStatus) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (rp3) null);
    }

    public GiftCardItem(String str, GiftCardSku giftCardSku, GiftCardStatus giftCardStatus, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        str.getClass();
        giftCardSku.getClass();
        giftCardStatus.getClass();
        this.cardId = str;
        this.sku = giftCardSku;
        this.status = giftCardStatus;
        this.purchasedAt = str2;
        this.redeemCode = str3;
        this.shareUrl = str4;
        this.nickname = str5;
        this.fromNickname = str6;
        this.blessing = str7;
        this.claimedAt = str8;
        this.effectiveFrom = str9;
        this.expireAt = str10;
    }

    public /* synthetic */ GiftCardItem(String str, GiftCardSku giftCardSku, GiftCardStatus giftCardStatus, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? GiftCardSku.Unknown : giftCardSku, (i & 4) != 0 ? GiftCardStatus.Unknown : giftCardStatus, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : str9, (i & 2048) != 0 ? null : str10);
    }
}
