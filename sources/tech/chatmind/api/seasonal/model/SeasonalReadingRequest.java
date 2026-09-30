package tech.chatmind.api.seasonal.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.joc;
import defpackage.kgc;
import defpackage.koc;
import defpackage.lw7;
import defpackage.msc;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zic;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001bJ\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010!¨\u00067"}, d2 = {"Ltech/chatmind/api/seasonal/model/SeasonalReadingRequest;", "", "", "year", "Ltech/chatmind/api/seasonal/model/SolarTerm;", "solarTerm", "Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;", "userInfo", "", "Ltech/chatmind/api/seasonal/model/SeasonalCard;", "cards", "<init>", "(ILtech/chatmind/api/seasonal/model/SolarTerm;Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;Ljava/util/List;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IILtech/chatmind/api/seasonal/model/SolarTerm;Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;Ljava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/seasonal/model/SeasonalReadingRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()I", "component2", "()Ltech/chatmind/api/seasonal/model/SolarTerm;", "component3", "()Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;", "component4", "()Ljava/util/List;", "copy", "(ILtech/chatmind/api/seasonal/model/SolarTerm;Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;Ljava/util/List;)Ltech/chatmind/api/seasonal/model/SeasonalReadingRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getYear", "Ltech/chatmind/api/seasonal/model/SolarTerm;", "getSolarTerm", "Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;", "getUserInfo", "Ljava/util/List;", "getCards", "Companion", "joc", "koc", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SeasonalReadingRequest {
    private static final lw7[] $childSerializers;
    public static final int $stable = 8;
    public static final koc Companion = new koc();
    private final List<SeasonalCard> cards;
    private final SolarTerm solarTerm;
    private final SeasonalUserInfo userInfo;
    private final int year;

    static {
        kgc kgcVar = new kgc(23);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, eb3.N(z18Var, kgcVar), null, eb3.N(z18Var, new kgc(24))};
    }

    public /* synthetic */ SeasonalReadingRequest(int i, int i2, SolarTerm solarTerm, SeasonalUserInfo seasonalUserInfo, List list, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, joc.a.e());
            throw null;
        }
        this.year = i2;
        this.solarTerm = solarTerm;
        this.userInfo = seasonalUserInfo;
        this.cards = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return SolarTerm.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(zic.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeasonalReadingRequest copy$default(SeasonalReadingRequest seasonalReadingRequest, int i, SolarTerm solarTerm, SeasonalUserInfo seasonalUserInfo, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = seasonalReadingRequest.year;
        }
        if ((i2 & 2) != 0) {
            solarTerm = seasonalReadingRequest.solarTerm;
        }
        if ((i2 & 4) != 0) {
            seasonalUserInfo = seasonalReadingRequest.userInfo;
        }
        if ((i2 & 8) != 0) {
            list = seasonalReadingRequest.cards;
        }
        return seasonalReadingRequest.copy(i, solarTerm, seasonalUserInfo, list);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SeasonalReadingRequest self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.v(0, self.year, serialDesc);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.solarTerm);
        output.p(serialDesc, 2, msc.a, self.userInfo);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.cards);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SolarTerm getSolarTerm() {
        return this.solarTerm;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SeasonalUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final List<SeasonalCard> component4() {
        return this.cards;
    }

    public final SeasonalReadingRequest copy(int year, SolarTerm solarTerm, SeasonalUserInfo userInfo, List<SeasonalCard> cards) {
        solarTerm.getClass();
        userInfo.getClass();
        cards.getClass();
        return new SeasonalReadingRequest(year, solarTerm, userInfo, cards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonalReadingRequest)) {
            return false;
        }
        SeasonalReadingRequest seasonalReadingRequest = (SeasonalReadingRequest) other;
        return this.year == seasonalReadingRequest.year && this.solarTerm == seasonalReadingRequest.solarTerm && pa7.t(this.userInfo, seasonalReadingRequest.userInfo) && pa7.t(this.cards, seasonalReadingRequest.cards);
    }

    public final List<SeasonalCard> getCards() {
        return this.cards;
    }

    public final SolarTerm getSolarTerm() {
        return this.solarTerm;
    }

    public final SeasonalUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.cards.hashCode() + ((this.userInfo.hashCode() + ((this.solarTerm.hashCode() + (Integer.hashCode(this.year) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SeasonalReadingRequest(year=" + this.year + ", solarTerm=" + this.solarTerm + ", userInfo=" + this.userInfo + ", cards=" + this.cards + ")";
    }

    public SeasonalReadingRequest(int i, SolarTerm solarTerm, SeasonalUserInfo seasonalUserInfo, List<SeasonalCard> list) {
        solarTerm.getClass();
        seasonalUserInfo.getClass();
        list.getClass();
        this.year = i;
        this.solarTerm = solarTerm;
        this.userInfo = seasonalUserInfo;
        this.cards = list;
    }
}
