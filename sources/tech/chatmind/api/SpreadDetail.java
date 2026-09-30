package tech.chatmind.api;

import defpackage.ag2;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.svd;
import defpackage.tvd;
import defpackage.tyc;
import defpackage.vvd;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Ltech/chatmind/api/SpreadDetail;", "", "Ltech/chatmind/api/SpreadDetailCard;", "card", "Ltech/chatmind/api/SpreadDetailPattern;", "pattern", "<init>", "(Ltech/chatmind/api/SpreadDetailCard;Ltech/chatmind/api/SpreadDetailPattern;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/SpreadDetailCard;Ltech/chatmind/api/SpreadDetailPattern;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/SpreadDetail;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/SpreadDetailCard;", "component2", "()Ltech/chatmind/api/SpreadDetailPattern;", "copy", "(Ltech/chatmind/api/SpreadDetailCard;Ltech/chatmind/api/SpreadDetailPattern;)Ltech/chatmind/api/SpreadDetail;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/SpreadDetailCard;", "getCard", "Ltech/chatmind/api/SpreadDetailPattern;", "getPattern", "Companion", "rvd", "svd", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SpreadDetail {
    public static final int $stable = 0;
    public static final svd Companion = new svd();
    private final SpreadDetailCard card;
    private final SpreadDetailPattern pattern;

    public /* synthetic */ SpreadDetail(int i, SpreadDetailCard spreadDetailCard, SpreadDetailPattern spreadDetailPattern, xyc xycVar) {
        if ((i & 1) == 0) {
            this.card = null;
        } else {
            this.card = spreadDetailCard;
        }
        if ((i & 2) == 0) {
            this.pattern = null;
        } else {
            this.pattern = spreadDetailPattern;
        }
    }

    public static /* synthetic */ SpreadDetail copy$default(SpreadDetail spreadDetail, SpreadDetailCard spreadDetailCard, SpreadDetailPattern spreadDetailPattern, int i, Object obj) {
        if ((i & 1) != 0) {
            spreadDetailCard = spreadDetail.card;
        }
        if ((i & 2) != 0) {
            spreadDetailPattern = spreadDetail.pattern;
        }
        return spreadDetail.copy(spreadDetailCard, spreadDetailPattern);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SpreadDetail self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.card != null) {
            output.A(serialDesc, 0, tvd.a, self.card);
        }
        if (!output.g(serialDesc) && self.pattern == null) {
            return;
        }
        output.A(serialDesc, 1, vvd.a, self.pattern);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SpreadDetailCard getCard() {
        return this.card;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SpreadDetailPattern getPattern() {
        return this.pattern;
    }

    public final SpreadDetail copy(SpreadDetailCard card, SpreadDetailPattern pattern) {
        return new SpreadDetail(card, pattern);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpreadDetail)) {
            return false;
        }
        SpreadDetail spreadDetail = (SpreadDetail) other;
        return pa7.t(this.card, spreadDetail.card) && pa7.t(this.pattern, spreadDetail.pattern);
    }

    public final SpreadDetailCard getCard() {
        return this.card;
    }

    public final SpreadDetailPattern getPattern() {
        return this.pattern;
    }

    public int hashCode() {
        SpreadDetailCard spreadDetailCard = this.card;
        int iHashCode = (spreadDetailCard == null ? 0 : spreadDetailCard.hashCode()) * 31;
        SpreadDetailPattern spreadDetailPattern = this.pattern;
        return iHashCode + (spreadDetailPattern != null ? spreadDetailPattern.hashCode() : 0);
    }

    public String toString() {
        return "SpreadDetail(card=" + this.card + ", pattern=" + this.pattern + ")";
    }

    public SpreadDetail() {
        this((SpreadDetailCard) null, (SpreadDetailPattern) (0 == true ? 1 : 0), 3, (rp3) (0 == true ? 1 : 0));
    }

    public SpreadDetail(SpreadDetailCard spreadDetailCard, SpreadDetailPattern spreadDetailPattern) {
        this.card = spreadDetailCard;
        this.pattern = spreadDetailPattern;
    }

    public /* synthetic */ SpreadDetail(SpreadDetailCard spreadDetailCard, SpreadDetailPattern spreadDetailPattern, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : spreadDetailCard, (i & 2) != 0 ? null : spreadDetailPattern);
    }
}
