package ai.askquin.data;

import defpackage.ag2;
import defpackage.an1;
import defpackage.boc;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.kgc;
import defpackage.lw7;
import defpackage.msc;
import defpackage.nkc;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.yoc;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zic;
import defpackage.zoc;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.seasonal.model.SeasonalCard;
import tech.chatmind.api.seasonal.model.SeasonalFollowUp;
import tech.chatmind.api.seasonal.model.SeasonalReading;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJH\u0010#\u001a\u00020\u00122\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b4\u0010\u001d¨\u00068"}, d2 = {"ai/askquin/data/SeasonalReadingStore$Snapshot", "", "", "Ltech/chatmind/api/seasonal/model/SeasonalCard;", "cards", "Ltech/chatmind/api/seasonal/model/SeasonalReading;", "reading", "Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;", "userInfo", "Ltech/chatmind/api/seasonal/model/SeasonalFollowUp;", "followUps", "<init>", "(Ljava/util/List;Ltech/chatmind/api/seasonal/model/SeasonalReading;Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;Ljava/util/List;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ltech/chatmind/api/seasonal/model/SeasonalReading;Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;Ljava/util/List;Lxyc;)V", "Lai/askquin/data/SeasonalReadingStore$Snapshot;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/data/SeasonalReadingStore$Snapshot;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ltech/chatmind/api/seasonal/model/SeasonalReading;", "component3", "()Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;", "component4", "copy", "(Ljava/util/List;Ltech/chatmind/api/seasonal/model/SeasonalReading;Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;Ljava/util/List;)Lai/askquin/data/SeasonalReadingStore$Snapshot;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCards", "Ltech/chatmind/api/seasonal/model/SeasonalReading;", "getReading", "Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;", "getUserInfo", "getFollowUps", "Companion", "yoc", "zoc", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SeasonalReadingStore$Snapshot {
    private static final lw7[] $childSerializers;
    private final List<SeasonalCard> cards;
    private final List<SeasonalFollowUp> followUps;
    private final SeasonalReading reading;
    private final SeasonalUserInfo userInfo;
    public static final zoc Companion = new zoc();
    public static final int $stable = SeasonalUserInfo.$stable | SeasonalReading.$stable;

    static {
        kgc kgcVar = new kgc(28);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, kgcVar), null, null, eb3.N(z18Var, new kgc(29))};
    }

    public /* synthetic */ SeasonalReadingStore$Snapshot(int i, List list, SeasonalReading seasonalReading, SeasonalUserInfo seasonalUserInfo, List list2, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, yoc.a.e());
            throw null;
        }
        this.cards = list;
        this.reading = seasonalReading;
        if ((i & 4) == 0) {
            this.userInfo = null;
        } else {
            this.userInfo = seasonalUserInfo;
        }
        if ((i & 8) == 0) {
            this.followUps = null;
        } else {
            this.followUps = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(zic.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(nkc.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeasonalReadingStore$Snapshot copy$default(SeasonalReadingStore$Snapshot seasonalReadingStore$Snapshot, List list, SeasonalReading seasonalReading, SeasonalUserInfo seasonalUserInfo, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = seasonalReadingStore$Snapshot.cards;
        }
        if ((i & 2) != 0) {
            seasonalReading = seasonalReadingStore$Snapshot.reading;
        }
        if ((i & 4) != 0) {
            seasonalUserInfo = seasonalReadingStore$Snapshot.userInfo;
        }
        if ((i & 8) != 0) {
            list2 = seasonalReadingStore$Snapshot.followUps;
        }
        return seasonalReadingStore$Snapshot.copy(list, seasonalReading, seasonalUserInfo, list2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(SeasonalReadingStore$Snapshot self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.cards);
        output.p(serialDesc, 1, boc.a, self.reading);
        if (output.g(serialDesc) || self.userInfo != null) {
            output.A(serialDesc, 2, msc.a, self.userInfo);
        }
        if (!output.g(serialDesc) && self.followUps == null) {
            return;
        }
        output.A(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.followUps);
    }

    public final List<SeasonalCard> component1() {
        return this.cards;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SeasonalReading getReading() {
        return this.reading;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SeasonalUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final List<SeasonalFollowUp> component4() {
        return this.followUps;
    }

    public final SeasonalReadingStore$Snapshot copy(List<SeasonalCard> cards, SeasonalReading reading, SeasonalUserInfo userInfo, List<SeasonalFollowUp> followUps) {
        cards.getClass();
        reading.getClass();
        return new SeasonalReadingStore$Snapshot(cards, reading, userInfo, followUps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonalReadingStore$Snapshot)) {
            return false;
        }
        SeasonalReadingStore$Snapshot seasonalReadingStore$Snapshot = (SeasonalReadingStore$Snapshot) other;
        return pa7.t(this.cards, seasonalReadingStore$Snapshot.cards) && pa7.t(this.reading, seasonalReadingStore$Snapshot.reading) && pa7.t(this.userInfo, seasonalReadingStore$Snapshot.userInfo) && pa7.t(this.followUps, seasonalReadingStore$Snapshot.followUps);
    }

    public final List<SeasonalCard> getCards() {
        return this.cards;
    }

    public final List<SeasonalFollowUp> getFollowUps() {
        return this.followUps;
    }

    public final SeasonalReading getReading() {
        return this.reading;
    }

    public final SeasonalUserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int iHashCode = (this.reading.hashCode() + (this.cards.hashCode() * 31)) * 31;
        SeasonalUserInfo seasonalUserInfo = this.userInfo;
        int iHashCode2 = (iHashCode + (seasonalUserInfo == null ? 0 : seasonalUserInfo.hashCode())) * 31;
        List<SeasonalFollowUp> list = this.followUps;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "Snapshot(cards=" + this.cards + ", reading=" + this.reading + ", userInfo=" + this.userInfo + ", followUps=" + this.followUps + ")";
    }

    public SeasonalReadingStore$Snapshot(List<SeasonalCard> list, SeasonalReading seasonalReading, SeasonalUserInfo seasonalUserInfo, List<SeasonalFollowUp> list2) {
        list.getClass();
        seasonalReading.getClass();
        this.cards = list;
        this.reading = seasonalReading;
        this.userInfo = seasonalUserInfo;
        this.followUps = list2;
    }

    public /* synthetic */ SeasonalReadingStore$Snapshot(List list, SeasonalReading seasonalReading, SeasonalUserInfo seasonalUserInfo, List list2, int i, rp3 rp3Var) {
        this(list, seasonalReading, (i & 4) != 0 ? null : seasonalUserInfo, (i & 8) != 0 ? null : list2);
    }
}
