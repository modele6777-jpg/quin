package tech.chatmind.api.generatecard.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.c77;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.wq1;
import defpackage.xq1;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006)"}, d2 = {"Ltech/chatmind/api/generatecard/model/CardDetectionRequest;", "", "", "image", "", "cardCount", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/generatecard/model/CardDetectionRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Ltech/chatmind/api/generatecard/model/CardDetectionRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Ljava/lang/Integer;", "getCardCount", "Companion", "wq1", "xq1", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class CardDetectionRequest {
    public static final int $stable = 0;
    public static final xq1 Companion = new xq1();
    private final Integer cardCount;
    private final String image;

    public /* synthetic */ CardDetectionRequest(int i, String str, Integer num, xyc xycVar) {
        if (1 != (i & 1)) {
            an1.R(i, 1, wq1.a.e());
            throw null;
        }
        this.image = str;
        if ((i & 2) == 0) {
            this.cardCount = null;
        } else {
            this.cardCount = num;
        }
    }

    public static /* synthetic */ CardDetectionRequest copy$default(CardDetectionRequest cardDetectionRequest, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardDetectionRequest.image;
        }
        if ((i & 2) != 0) {
            num = cardDetectionRequest.cardCount;
        }
        return cardDetectionRequest.copy(str, num);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(CardDetectionRequest self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.image);
        if (!output.g(serialDesc) && self.cardCount == null) {
            return;
        }
        output.A(serialDesc, 1, c77.a, self.cardCount);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCardCount() {
        return this.cardCount;
    }

    public final CardDetectionRequest copy(String image, Integer cardCount) {
        image.getClass();
        return new CardDetectionRequest(image, cardCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetectionRequest)) {
            return false;
        }
        CardDetectionRequest cardDetectionRequest = (CardDetectionRequest) other;
        return pa7.t(this.image, cardDetectionRequest.image) && pa7.t(this.cardCount, cardDetectionRequest.cardCount);
    }

    public final Integer getCardCount() {
        return this.cardCount;
    }

    public final String getImage() {
        return this.image;
    }

    public int hashCode() {
        int iHashCode = this.image.hashCode() * 31;
        Integer num = this.cardCount;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "CardDetectionRequest(image=" + this.image + ", cardCount=" + this.cardCount + ")";
    }

    public CardDetectionRequest(String str, Integer num) {
        str.getClass();
        this.image = str;
        this.cardCount = num;
    }

    public /* synthetic */ CardDetectionRequest(String str, Integer num, int i, rp3 rp3Var) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
