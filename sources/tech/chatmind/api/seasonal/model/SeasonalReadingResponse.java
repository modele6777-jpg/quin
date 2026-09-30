package tech.chatmind.api.seasonal.model;

import defpackage.ag2;
import defpackage.boc;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.kgc;
import defpackage.lw7;
import defpackage.moc;
import defpackage.msc;
import defpackage.nkc;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zic;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bc\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)Jb\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010)J\u0010\u0010-\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\"R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010&R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b;\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\b=\u0010)¨\u0006A"}, d2 = {"Ltech/chatmind/api/seasonal/model/SeasonalReadingResponse;", "", "Ltech/chatmind/api/seasonal/model/SeasonalStatus;", "status", "Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;", "userInfo", "", "Ltech/chatmind/api/seasonal/model/SeasonalCard;", "cards", "Ltech/chatmind/api/seasonal/model/SeasonalReading;", "reading", "Ltech/chatmind/api/seasonal/model/SeasonalFollowUp;", "followUps", "", "errorMessage", "<init>", "(Ltech/chatmind/api/seasonal/model/SeasonalStatus;Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;Ljava/util/List;Ltech/chatmind/api/seasonal/model/SeasonalReading;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/seasonal/model/SeasonalStatus;Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;Ljava/util/List;Ltech/chatmind/api/seasonal/model/SeasonalReading;Ljava/util/List;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/seasonal/model/SeasonalReadingResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/seasonal/model/SeasonalStatus;", "component2", "()Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;", "component3", "()Ljava/util/List;", "component4", "()Ltech/chatmind/api/seasonal/model/SeasonalReading;", "component5", "component6", "()Ljava/lang/String;", "copy", "(Ltech/chatmind/api/seasonal/model/SeasonalStatus;Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;Ljava/util/List;Ltech/chatmind/api/seasonal/model/SeasonalReading;Ljava/util/List;Ljava/lang/String;)Ltech/chatmind/api/seasonal/model/SeasonalReadingResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/seasonal/model/SeasonalStatus;", "getStatus", "Ltech/chatmind/api/seasonal/model/SeasonalUserInfo;", "getUserInfo", "Ljava/util/List;", "getCards", "Ltech/chatmind/api/seasonal/model/SeasonalReading;", "getReading", "getFollowUps", "Ljava/lang/String;", "getErrorMessage", "Companion", "loc", "moc", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class SeasonalReadingResponse {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final moc Companion = new moc();
    private final List<SeasonalCard> cards;
    private final String errorMessage;
    private final List<SeasonalFollowUp> followUps;
    private final SeasonalReading reading;
    private final SeasonalStatus status;
    private final SeasonalUserInfo userInfo;

    static {
        kgc kgcVar = new kgc(25);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, kgcVar), null, eb3.N(z18Var, new kgc(26)), null, eb3.N(z18Var, new kgc(27)), null};
    }

    public /* synthetic */ SeasonalReadingResponse(int i, SeasonalStatus seasonalStatus, SeasonalUserInfo seasonalUserInfo, List list, SeasonalReading seasonalReading, List list2, String str, xyc xycVar) {
        this.status = (i & 1) == 0 ? SeasonalStatus.UNKNOWN : seasonalStatus;
        if ((i & 2) == 0) {
            this.userInfo = null;
        } else {
            this.userInfo = seasonalUserInfo;
        }
        if ((i & 4) == 0) {
            this.cards = null;
        } else {
            this.cards = list;
        }
        if ((i & 8) == 0) {
            this.reading = null;
        } else {
            this.reading = seasonalReading;
        }
        if ((i & 16) == 0) {
            this.followUps = null;
        } else {
            this.followUps = list2;
        }
        if ((i & 32) == 0) {
            this.errorMessage = null;
        } else {
            this.errorMessage = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return SeasonalStatus.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(zic.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(nkc.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SeasonalReadingResponse copy$default(SeasonalReadingResponse seasonalReadingResponse, SeasonalStatus seasonalStatus, SeasonalUserInfo seasonalUserInfo, List list, SeasonalReading seasonalReading, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            seasonalStatus = seasonalReadingResponse.status;
        }
        if ((i & 2) != 0) {
            seasonalUserInfo = seasonalReadingResponse.userInfo;
        }
        if ((i & 4) != 0) {
            list = seasonalReadingResponse.cards;
        }
        if ((i & 8) != 0) {
            seasonalReading = seasonalReadingResponse.reading;
        }
        if ((i & 16) != 0) {
            list2 = seasonalReadingResponse.followUps;
        }
        if ((i & 32) != 0) {
            str = seasonalReadingResponse.errorMessage;
        }
        List list3 = list2;
        String str2 = str;
        return seasonalReadingResponse.copy(seasonalStatus, seasonalUserInfo, list, seasonalReading, list3, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(SeasonalReadingResponse self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.status != SeasonalStatus.UNKNOWN) {
            output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.status);
        }
        if (output.g(serialDesc) || self.userInfo != null) {
            output.A(serialDesc, 1, msc.a, self.userInfo);
        }
        if (output.g(serialDesc) || self.cards != null) {
            output.A(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.cards);
        }
        if (output.g(serialDesc) || self.reading != null) {
            output.A(serialDesc, 3, boc.a, self.reading);
        }
        if (output.g(serialDesc) || self.followUps != null) {
            output.A(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.followUps);
        }
        if (!output.g(serialDesc) && self.errorMessage == null) {
            return;
        }
        output.A(serialDesc, 5, p4e.a, self.errorMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SeasonalStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SeasonalUserInfo getUserInfo() {
        return this.userInfo;
    }

    public final List<SeasonalCard> component3() {
        return this.cards;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SeasonalReading getReading() {
        return this.reading;
    }

    public final List<SeasonalFollowUp> component5() {
        return this.followUps;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final SeasonalReadingResponse copy(SeasonalStatus status, SeasonalUserInfo userInfo, List<SeasonalCard> cards, SeasonalReading reading, List<SeasonalFollowUp> followUps, String errorMessage) {
        status.getClass();
        return new SeasonalReadingResponse(status, userInfo, cards, reading, followUps, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonalReadingResponse)) {
            return false;
        }
        SeasonalReadingResponse seasonalReadingResponse = (SeasonalReadingResponse) other;
        return this.status == seasonalReadingResponse.status && pa7.t(this.userInfo, seasonalReadingResponse.userInfo) && pa7.t(this.cards, seasonalReadingResponse.cards) && pa7.t(this.reading, seasonalReadingResponse.reading) && pa7.t(this.followUps, seasonalReadingResponse.followUps) && pa7.t(this.errorMessage, seasonalReadingResponse.errorMessage);
    }

    public final List<SeasonalCard> getCards() {
        return this.cards;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final List<SeasonalFollowUp> getFollowUps() {
        return this.followUps;
    }

    public final SeasonalReading getReading() {
        return this.reading;
    }

    public final SeasonalStatus getStatus() {
        return this.status;
    }

    public final SeasonalUserInfo getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        SeasonalUserInfo seasonalUserInfo = this.userInfo;
        int iHashCode2 = (iHashCode + (seasonalUserInfo == null ? 0 : seasonalUserInfo.hashCode())) * 31;
        List<SeasonalCard> list = this.cards;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        SeasonalReading seasonalReading = this.reading;
        int iHashCode4 = (iHashCode3 + (seasonalReading == null ? 0 : seasonalReading.hashCode())) * 31;
        List<SeasonalFollowUp> list2 = this.followUps;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.errorMessage;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SeasonalReadingResponse(status=" + this.status + ", userInfo=" + this.userInfo + ", cards=" + this.cards + ", reading=" + this.reading + ", followUps=" + this.followUps + ", errorMessage=" + this.errorMessage + ")";
    }

    public SeasonalReadingResponse() {
        this((SeasonalStatus) null, (SeasonalUserInfo) null, (List) null, (SeasonalReading) null, (List) null, (String) null, 63, (rp3) null);
    }

    public SeasonalReadingResponse(SeasonalStatus seasonalStatus, SeasonalUserInfo seasonalUserInfo, List<SeasonalCard> list, SeasonalReading seasonalReading, List<SeasonalFollowUp> list2, String str) {
        seasonalStatus.getClass();
        this.status = seasonalStatus;
        this.userInfo = seasonalUserInfo;
        this.cards = list;
        this.reading = seasonalReading;
        this.followUps = list2;
        this.errorMessage = str;
    }

    public /* synthetic */ SeasonalReadingResponse(SeasonalStatus seasonalStatus, SeasonalUserInfo seasonalUserInfo, List list, SeasonalReading seasonalReading, List list2, String str, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? SeasonalStatus.UNKNOWN : seasonalStatus, (i & 2) != 0 ? null : seasonalUserInfo, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : seasonalReading, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : str);
    }
}
