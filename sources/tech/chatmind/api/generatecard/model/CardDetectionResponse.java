package tech.chatmind.api.generatecard.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.eb3;
import defpackage.jl0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.syc;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.yq1;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zq1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Ltech/chatmind/api/generatecard/model/CardDetectionResponse;", "", "", "tarotCardKey", "Ltech/chatmind/api/generatecard/model/CardPosition;", "position", "<init>", "(Ljava/lang/String;Ltech/chatmind/api/generatecard/model/CardPosition;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ltech/chatmind/api/generatecard/model/CardPosition;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/generatecard/model/CardDetectionResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ltech/chatmind/api/generatecard/model/CardPosition;", "copy", "(Ljava/lang/String;Ltech/chatmind/api/generatecard/model/CardPosition;)Ltech/chatmind/api/generatecard/model/CardDetectionResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTarotCardKey", "getTarotCardKey$annotations", "()V", "Ltech/chatmind/api/generatecard/model/CardPosition;", "getPosition", "Companion", "yq1", "zq1", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class CardDetectionResponse {
    public static final int $stable = 0;
    private final CardPosition position;
    private final String tarotCardKey;
    public static final zq1 Companion = new zq1();
    private static final lw7[] $childSerializers = {null, eb3.N(z18.b, new jl0(20))};

    public /* synthetic */ CardDetectionResponse(int i, String str, CardPosition cardPosition, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, yq1.a.e());
            throw null;
        }
        this.tarotCardKey = str;
        this.position = cardPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return CardPosition.Companion.serializer();
    }

    public static /* synthetic */ CardDetectionResponse copy$default(CardDetectionResponse cardDetectionResponse, String str, CardPosition cardPosition, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cardDetectionResponse.tarotCardKey;
        }
        if ((i & 2) != 0) {
            cardPosition = cardDetectionResponse.position;
        }
        return cardDetectionResponse.copy(str, cardPosition);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(CardDetectionResponse self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.tarotCardKey);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.position);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTarotCardKey() {
        return this.tarotCardKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CardPosition getPosition() {
        return this.position;
    }

    public final CardDetectionResponse copy(String tarotCardKey, CardPosition position) {
        tarotCardKey.getClass();
        position.getClass();
        return new CardDetectionResponse(tarotCardKey, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDetectionResponse)) {
            return false;
        }
        CardDetectionResponse cardDetectionResponse = (CardDetectionResponse) other;
        return pa7.t(this.tarotCardKey, cardDetectionResponse.tarotCardKey) && this.position == cardDetectionResponse.position;
    }

    public final CardPosition getPosition() {
        return this.position;
    }

    public final String getTarotCardKey() {
        return this.tarotCardKey;
    }

    public int hashCode() {
        return this.position.hashCode() + (this.tarotCardKey.hashCode() * 31);
    }

    public String toString() {
        return "CardDetectionResponse(tarotCardKey=" + this.tarotCardKey + ", position=" + this.position + ")";
    }

    @syc("card")
    public static /* synthetic */ void getTarotCardKey$annotations() {
    }

    public CardDetectionResponse(String str, CardPosition cardPosition) {
        str.getClass();
        cardPosition.getClass();
        this.tarotCardKey = str;
        this.position = cardPosition;
    }
}
